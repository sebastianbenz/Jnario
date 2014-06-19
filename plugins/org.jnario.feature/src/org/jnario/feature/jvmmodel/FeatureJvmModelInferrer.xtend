/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.jvmmodel

import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.core.xtend.XtendClass
import org.eclipse.xtend.core.xtend.XtendField
import org.eclipse.xtend.core.xtend.XtendFile
import org.eclipse.xtend.core.xtend.XtendFunction
import org.eclipse.xtext.common.types.JvmConstructor
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.xbase.XConstructorCall
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XVariableDeclaration
import org.eclipse.xtext.xbase.XbaseFactory
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator
import org.jnario.feature.feature.Background
import org.jnario.feature.feature.Feature
import org.jnario.feature.feature.FeatureFile
import org.jnario.feature.feature.Scenario
import org.jnario.feature.feature.Step
import org.jnario.feature.feature.StepImplementation
import org.jnario.feature.feature.StepReference
import org.jnario.feature.naming.StepNameProvider
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder
import org.jnario.jvmmodel.JnarioJvmModelInferrer
import org.jnario.lib.StepArguments
import org.jnario.runner.Named
import org.jnario.runner.Order
import org.jnario.util.SourceAdapter

import static com.google.common.collect.Iterators.*

import static extension com.google.common.base.Strings.*
import static extension org.eclipse.xtext.EcoreUtil2.*
import org.eclipse.xtend.core.xtend.AnonymousClass

/**
 * @author Birgit Engelmann - Initial contribution and API
 * @author Sebastian Benz
 */
class FeatureJvmModelInferrer extends JnarioJvmModelInferrer {

	public static val STEP_VALUES = "args"
	
	@Inject extension ExtendedJvmTypesBuilder
	
	@Inject	extension TypeReferences
	
	@Inject extension StepNameProvider
	
	@Inject extension StepExpressionProvider
	
	@Inject extension StepReferenceFieldCreator
	
	@Inject extension StepArgumentsProvider stepArgumentsProvider
	
	@Inject extension IJvmModelAssociator 
	
	@Inject extension IJvmModelAssociations
	
	@Inject extension JvmFieldReferenceUpdater
	
	@Inject TypesFactory typesFactory
	
   override doInfer(EObject object, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
   		if (!(object instanceof XtendFile))
			return;
		val doLater = <Runnable>newArrayList()
		
   	
		val feature = object.resolveFeature
		if(feature == null || feature.name.isNullOrEmpty){
			return
		}
    	
		val JvmGenericType background = feature.background.toClass(acceptor, doLater, preIndexingPhase)
		val scenarios = feature.scenarios.toClass(acceptor, background, doLater, preIndexingPhase)
		feature.toClass(acceptor, scenarios, background, doLater, preIndexingPhase)
		
		if (!preIndexingPhase) {
			for (Runnable runnable : doLater) {
				runnable.run();
			}
		}
   	
   	}
   	
   	def resolveFeature(EObject root){
   		val featureFile = root as FeatureFile
   		if(featureFile.xtendTypes.empty){
   			return null
   		}
   		val xtendClass = featureFile.xtendTypes.get(0)
		return xtendClass as Feature
   	}
   
   	def toClass(Background background, IJvmDeclaredTypeAcceptor acceptor, List<Runnable> doLater, boolean preIndexingPhase){
   		if(background == null) return null
   		background.toClass(emptyList, acceptor, doLater, preIndexingPhase)
   	}

   	def toClass(List<Scenario> scenarios, IJvmDeclaredTypeAcceptor acceptor, JvmGenericType backgroundType, List<Runnable> doLater, boolean preIndexingPhase){
   		val result = <JvmGenericType>newArrayList
   		scenarios.forEach[
			val inferredJvmType = it.toClass(emptyList, acceptor, doLater, preIndexingPhase)
			result += inferredJvmType
		]
		return result
   	}
   	
   	def toClass(Feature feature, IJvmDeclaredTypeAcceptor acceptor, List<JvmGenericType> scenarios, JvmGenericType background, List<Runnable> doLater, boolean preIndexingPhase){
   		feature.addSuperClass
   		val inferredJvmType = feature.toClass(scenarios, acceptor, doLater, preIndexingPhase)
   		if(background == null){
   			scenarios.forEach[superTypes+=inferredJvmType.createTypeRef()]
   		}else{
   			background.superTypes +=inferredJvmType.createTypeRef()
   			scenarios.forEach[superTypes+=background.createTypeRef()]
   		}
   	}
   	
   	def register(IJvmDeclaredTypeAcceptor acceptor, XtendClass source, JvmGenericType inferredJvmType, List<JvmGenericType> scenarios, List<Runnable> doLater, boolean preIndexingPhase){
   		if (!preIndexingPhase) {
			doLater.add([|init(source, inferredJvmType, scenarios)]);
		}
   	} 
   	
	def toClass(XtendClass xtendClass, List<JvmGenericType> scenarios, IJvmDeclaredTypeAcceptor acceptor, List<Runnable> doLater, boolean preIndexingPhase){
   		val javaType = typesFactory.createJvmGenericType
   		setNameAndAssociate(xtendClass.xtendFile, xtendClass, javaType)
   		acceptor.accept(javaType)
   		if (!preIndexingPhase) {
			doLater.add([|init(xtendClass, javaType, scenarios)]);
		}
   		javaType
   	}
   	
   	def dispatch void init(Feature feature, JvmGenericType inferredJvmType, List<JvmGenericType> scenarios){
   		val annotations = inferredJvmType.annotations
   		if(!scenarios.empty)
   			testRuntime.addChildren(feature, inferredJvmType, scenarios.map[createTypeRef])
   		annotations += feature.toAnnotation(typeof(Named), feature.describe)
   		super.initialize(feature, inferredJvmType)
   		testRuntime.updateFeature(feature, inferredJvmType, scenarios.map[createTypeRef])
   	}
   	
   	def dispatch void init(Scenario scenario, JvmGenericType inferredJvmType, List<JvmGenericType> scenarios){
   		scenario.copyXtendMemberForReferences
		scenario.members.filter(typeof(XtendField)).forEach[
//			initializeName
			transform2(it, inferredJvmType)
		]   		
   		val annotations = inferredJvmType.annotations
   		testRuntime.updateScenario(scenario, inferredJvmType)
   		annotations += scenario.toAnnotation(typeof(Named), scenario.describe)
   		val feature = scenario.feature
		var start = 0
   		
   		feature.annotations.translateAnnotationsTo(inferredJvmType)
   		
   		val background = feature.background
   		
		if(!(scenario instanceof Background) && background != null){
			start = background.steps.generateBackgroundStepCalls(inferredJvmType, scenario)
		}
		scenario.steps.generateSteps(inferredJvmType, start, scenario)
   		super.initialize(scenario, inferredJvmType)
   		scenario.steps.filter(typeof(StepReference)).forEach[
   			if(it.reference == null){
   				return
   			}
   			val original = it.reference.getContainerOfType(typeof(Scenario))
   			if(original == null){
   				return
   			}
   			val expr = expressionOf(it)
   			updateReferences(original, expr, inferredJvmType)
   		]
   		scenario.members.filter(typeof(XtendField)).filter[initialValue != null].forEach[
   			val source = SourceAdapter::find(it)
   			if(source == null){
   				return
   			}
   			val original = source.getContainerOfType(typeof(Scenario))
   			original.updateReferences(it.initialValue, inferredJvmType)
   		]
   	}

	def updateReferences(Scenario original, XExpression expr, JvmGenericType inferredJvmType) {
		val originalType = original.jvmElements.filter(typeof(JvmGenericType)).findFirst[
			it.primarySourceElement == original
		]
		expr.updateReferences(originalType, inferredJvmType)
	}
   	
	override protected transform(XtendField source, JvmGenericType container) {
	  if(source.eContainer instanceof AnonymousClass){
      super.transform(source, container)
    }
	}
	
	def protected transform2(XtendField source, JvmGenericType container) {
		super.transform(source, container)
	}
	
	
	override protected transform(XtendFunction source, JvmGenericType container, boolean allowDispatch) {
	  if(source.eContainer instanceof AnonymousClass){
      super.transform(source, container, allowDispatch)
    }
	}
	
   	
	override protected computeFieldName(XtendField field) {
		var source = field
		while(NodeModelUtils::getNode(source) == null && source != null){
			source = SourceAdapter::find(source) as XtendField
		}
		super.computeFieldName(source as XtendField)
	}

   	def generateStepValues(Step step){
		val arguments = stepArgumentsProvider.findStepArguments(step)
		val stepExpression = step.expression
		if(arguments.empty || stepExpression == null) return

		var decs = stepExpression.eAllContents.filter(typeof(XVariableDeclaration)).filter[name == STEP_VALUES]
		if(decs.empty) return
		val dec = decs.head
		dec.setStepValueType(step as Step)
		if(step instanceof StepImplementation){
			return				
		}
		var calls = stepExpression.eAllContents.filter(typeof(XConstructorCall))
		val argsConstructor = calls.head
		argsConstructor.arguments.clear
		arguments.forEach[
			val arg = XbaseFactory::eINSTANCE.createXStringLiteral
			arg.value = it
			argsConstructor.arguments += arg
		]			
   	}

   	def setStepValueType(XVariableDeclaration variableDec, Step step){
		var typeRef = getTypeForName(typeof(StepArguments), step)
		if(typeRef == null || typeRef.eIsProxy){
			return
		}
		variableDec.type = typeRef
		val type = typeRef.type as JvmGenericType
		if(type == null || type.eIsProxy){
			return
		}
		var constructor = variableDec.right as XConstructorCall
		val constructors = filter(type.members.iterator, typeof(JvmConstructor))
		constructor.constructor = constructors.next
	}


   	def generateBackgroundStepCalls(Iterable<Step> steps, JvmGenericType inferredJvmType, Scenario scenario){
   		var order = 0
		for (step : steps) {
			order = transformCalls(step, inferredJvmType, order, scenario)
		}
		order 
   	}

   	def transformCalls(Step step, JvmGenericType inferredJvmType, int order, Scenario scenario){
   		val methodName = step.methodName
   		inferredJvmType.members += step.toMethod(methodName, getTypeForName(Void::TYPE, step))[
			body = [ITreeAppendable a |
						a.append("super." + methodName + "();")
			]
			markAsPending(step, scenario)
			associatePrimary(step, it)
			testRuntime.markAsTestMethod(step, it)
			annotations += step.toAnnotation(typeof(Order), order.intValue)
			annotations += step.toAnnotation(typeof(Named), step.describe)
		]	
		order + 1
   	}
   	
   	def generateSteps(Iterable<Step> steps, JvmGenericType inferredJvmType, int start, Scenario scenario){
		var order = start
		for (step : steps) {
			order = transform(step, inferredJvmType, order, scenario)
		}
   	}

	def transform(Step step, JvmGenericType inferredJvmType, int order, Scenario scenario) {
		inferredJvmType.members += step.toMethod(step.methodName, getTypeForName(Void::TYPE, step))[
			declaringType = inferredJvmType
			val stepExpression = expressionOf(step)
			associatePrimary(step, it);
			step.generateStepValues
			body = stepExpression
			testRuntime.markAsTestMethod(step, it)
			annotations += step.toAnnotation(typeof(Order), order.intValue)
			var name = step.describe
			associatePrimary(step, it)
			markAsPending(step, scenario)
			annotations += step.toAnnotation(typeof(Named), name)
		]	
		order + 1
	}

	def feature(EObject context){
   		getContainerOfType(context, typeof(Feature))
   	}
   	
   	def markAsPending(JvmOperation operation, Step step, Scenario scenario){
   		if(scenario.pendingSteps.contains(step)) {
			testRuntime.markAsPending(step, operation)
		}
   	}
}
