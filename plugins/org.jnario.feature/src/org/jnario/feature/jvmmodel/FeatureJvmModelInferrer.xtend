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
import org.eclipse.xtend.core.xtend.XtendFunction
import org.eclipse.xtext.common.types.JvmConstructor
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.XConstructorCall
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
import org.jnario.feature.naming.FeatureClassNameProvider
import org.jnario.feature.naming.StepNameProvider
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder
import org.jnario.jvmmodel.JnarioJvmModelInferrer
import org.jnario.lib.StepArguments
import org.jnario.runner.Extension
import org.jnario.runner.Named
import org.jnario.runner.Order
import org.jnario.util.SourceAdapter

import static com.google.common.collect.Iterators.*
import static org.jnario.feature.jvmmodel.FeatureJvmModelInferrer.*

import static extension com.google.common.base.Strings.*
import static extension org.eclipse.xtext.EcoreUtil2.*
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import java.util.ArrayList

/**
 * @author Birgit Engelmann - Initial contribution and API
 * @author Sebastian Benz
 */
class FeatureJvmModelInferrer extends JnarioJvmModelInferrer {

	public static val STEP_VALUES = "args"
	
	@Inject extension PendingStepsCalculator pendingStepsCalculator

	@Inject extension ExtendedJvmTypesBuilder
	
	@Inject	extension TypeReferences
	
	@Inject extension FeatureClassNameProvider
	
	@Inject extension StepNameProvider
	
	@Inject extension StepExpressionProvider
	
	@Inject extension StepReferenceFieldCreator
	
	@Inject extension StepArgumentsProvider stepArgumentsProvider
	
	@Inject extension IJvmModelAssociator 
	
	@Inject extension IJvmModelAssociations
	
	@Inject extension JvmFieldReferenceUpdater
	
   override doInfer(EObject object, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
		val feature = object.resolveFeature
		if(feature == null || feature.name.isNullOrEmpty){
			return
		}
    	
		val JvmGenericType background = feature.background.toClass(acceptor)
		val scenarios = feature.scenarios.toClass(acceptor, background)
		feature.toClass(acceptor, scenarios, background)
   	}
   	
   	def resolveFeature(EObject root){
   		val featureFile = root as FeatureFile
   		if(featureFile.xtendClasses.empty){
   			return null
   		}
   		val xtendClass = featureFile.xtendClasses.get(0)
		return xtendClass as Feature
   	}
   	
   	def toClass(Background background, IJvmDeclaredTypeAcceptor acceptor){
   		if(background == null) return null
   		val backgroundClass = background.toClass
		backgroundClass.^abstract = true
		register(acceptor, background, backgroundClass, emptyList)
		backgroundClass 
   	}

   	def toClass(List<Scenario> scenarios, IJvmDeclaredTypeAcceptor acceptor, JvmGenericType backgroundType){
   		val result = <JvmGenericType>newArrayList
   		scenarios.forEach[
			val inferredJvmType = it.toClass(backgroundType)
			register(acceptor, it, inferredJvmType, emptyList)
			result += inferredJvmType
		]
		return result
   	}
   	
   	def toClass(Feature feature, IJvmDeclaredTypeAcceptor acceptor, List<JvmGenericType> scenarios, JvmGenericType background){
   		feature.addSuperClass
   		val inferredJvmType = feature.toClass
   		if(background == null){
   			scenarios.forEach[superTypes+=inferredJvmType.createTypeRef()]
   		}else{
   			background.superTypes +=inferredJvmType.createTypeRef()
   			scenarios.forEach[superTypes+=background.createTypeRef()]
   		}
   		
		register(acceptor, feature, inferredJvmType, scenarios)
   	}
   	
   	def register(IJvmDeclaredTypeAcceptor acceptor, XtendClass source, JvmGenericType inferredJvmType, List<JvmGenericType> scenarios){
   		associatePrimary(source, inferredJvmType)
		acceptor.accept(inferredJvmType).initializeLater[initialize(source, inferredJvmType, scenarios)] 
   	} 
   	
	def toClass(XtendClass xtendClass){
		toClass(xtendClass, null)
	}
   	
   	def toClass(XtendClass xtendClass, JvmGenericType superClass){
   		xtendClass.toClass(xtendClass.toJavaClassName)[
			packageName = xtendClass.packageName
   		]	
   	}
   	
   	def initialize(XtendClass source, JvmGenericType inferredJvmType, List<JvmGenericType> scenarios) {
   		init(source, inferredJvmType, scenarios)
   	}
   	
   	def dispatch void init(Feature feature, JvmGenericType inferredJvmType, List<JvmGenericType> scenarios){
   		val annotations = inferredJvmType.annotations
   		if(!scenarios.empty)
   			testRuntime.addChildren(feature, inferredJvmType, scenarios)
   		annotations += feature.toAnnotation(typeof(Named), feature.describe)
   		super.initialize(feature, inferredJvmType)
   		testRuntime.updateFeature(feature, inferredJvmType, scenarios)
   	}
   	
   	def dispatch void init(Scenario scenario, JvmGenericType inferredJvmType, List<JvmGenericType> scenarios){
   		scenario.copyXtendMemberForReferences
		scenario.members.filter(typeof(XtendField)).forEach[
//			initializeName
			it.transform2(inferredJvmType)
		]   		
   		val annotations = inferredJvmType.annotations
   		testRuntime.updateScenario(scenario, inferredJvmType)
   		annotations += scenario.toAnnotation(typeof(Named), scenario.describe)
   		val feature = scenario.feature
		var start = 0
   		
   		feature.annotations.translateAnnotationsTo(inferredJvmType)
   		
   		val background = feature.background
   		
   		var ArrayList<Step> allSteps = newArrayList()
   		if(background != null){
   			allSteps.addAll(background.steps)
   		}
   		allSteps.addAll(scenario.steps)
   		pendingStepsCalculator.setSteps(allSteps)
   		
		if(!(scenario instanceof Background) && background != null){
			start = background.steps.generateBackgroundStepCalls(inferredJvmType)
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
   			val originalType = original.jvmElements.filter(typeof(JvmGenericType)).findFirst[
   				it.primarySourceElement == original
   			]
   			expressionOf(it).updateReferences(originalType, inferredJvmType)
   		]
   	}
   	
   	
	override protected transform(XtendFunction source, JvmGenericType container) {
	}
	
   	override protected transform(XtendField source, JvmGenericType container) {
   	}
   	
   	/*
   	 * We need to transform the fields earlier in order to correctly copy references to
   	 * extension fields when resolving step references.
   	 */
   	def protected transform2(XtendField source, JvmGenericType container) {
		if(source.visibility == JvmVisibility::PRIVATE){
			source.visibility = JvmVisibility::DEFAULT
		}
		super.transform(source, container)
		if (source.isExtension()){
			val field = source.jvmElements.head as JvmField
			field.setVisibility(JvmVisibility::PUBLIC)
			if(field.annotations.filter[typeof(Extension).simpleName == it.annotation.simpleName].empty){
				field.annotations += source.toAnnotation(typeof(Extension))
			}
		}
	}
   	
	override protected computeFieldName(XtendField field, JvmGenericType declaringType) {
		var source = field
		while(NodeModelUtils::getNode(source) == null && source != null){
			source = SourceAdapter::find(source) as XtendField
		}
		super.computeFieldName(source as XtendField, declaringType)
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
		if(typeRef == null){
			return
		}
		variableDec.type = typeRef		
		val type = typeRef.type as JvmGenericType
		var constructor = variableDec.right as XConstructorCall
		constructor.constructor = filter(type.members.iterator, typeof(JvmConstructor)).next
	}


   	def generateBackgroundStepCalls(Iterable<Step> steps, JvmGenericType inferredJvmType){
   		var order = 0
		for (step : steps) {
			order = transformCalls(step, inferredJvmType, order)
		}
		order 
   	}

   	def transformCalls(Step step, JvmGenericType inferredJvmType, int order){
   		val methodName = step.methodName
   		inferredJvmType.members += step.toMethod(methodName, getTypeForName(Void::TYPE, step))[
			body = [ITreeAppendable a |
						a.append("super." + methodName + "();")
			]
			markAsPending(step)
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
			val stepExpression = expressionOf(step)
			associatePrimary(step, it);
			body = stepExpression
			step.generateStepValues
			testRuntime.markAsTestMethod(step, it)
			annotations += step.toAnnotation(typeof(Order), order.intValue)
			var name = step.describe
			associatePrimary(step, it)
			markAsPending(step)
			annotations += step.toAnnotation(typeof(Named), name)
		]	
		order + 1
	}

	def feature(EObject context){
   		getContainerOfType(context, typeof(Feature))
   	}
   	
   	def markAsPending(JvmOperation operation, Step step){
   		if(step.pendingOrAPreviousStepIsPending){
			testRuntime.markAsPending(step, operation)
		}
   	}
}
