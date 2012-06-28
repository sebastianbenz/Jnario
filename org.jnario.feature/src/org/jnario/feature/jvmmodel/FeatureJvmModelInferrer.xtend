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
import org.eclipse.xtend.core.xtend.XtendMember
import org.eclipse.xtext.common.types.JvmConstructor
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.XConstructorCall
import org.eclipse.xtext.xbase.XFeatureCall
import org.eclipse.xtext.xbase.XMemberFeatureCall
import org.eclipse.xtext.xbase.XStringLiteral
import org.eclipse.xtext.xbase.XVariableDeclaration
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator
import org.jnario.feature.feature.Background
import org.jnario.feature.feature.Feature
import org.jnario.feature.feature.FeatureFile
import org.jnario.feature.feature.Given
import org.jnario.feature.feature.Scenario
import org.jnario.feature.feature.Step
import org.jnario.feature.feature.StepReference
import org.jnario.feature.naming.FeatureClassNameProvider
import org.jnario.feature.naming.StepNameProvider
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder
import org.jnario.jvmmodel.JnarioJvmModelInferrer
import org.jnario.jvmmodel.JunitAnnotationProvider
import org.jnario.lib.StepArguments
import org.jnario.runner.Contains
import org.jnario.runner.Named
import org.jnario.runner.Order
import org.junit.Ignore
import static extension com.google.common.base.Strings.*
import static com.google.common.collect.Iterators.*
import static org.eclipse.xtext.EcoreUtil2.*
import static org.jnario.feature.jvmmodel.FeatureJvmModelInferrer.*

/**
 * @author Birgit Engelmann - Initial contribution and API
 * @author Sebastian Benz
 */
class FeatureJvmModelInferrer extends JnarioJvmModelInferrer {
	
	public static val STEP_VALUES = "args"

	@Inject extension ExtendedJvmTypesBuilder
	
	@Inject	extension TypeReferences
	
	@Inject extension FeatureClassNameProvider
	
	@Inject extension StepNameProvider
	
	@Inject extension StepExpressionProvider
	
	@Inject extension JunitAnnotationProvider annotationProvider
	
	@Inject extension StepReferenceFieldCreator
	
	@Inject extension StepArgumentsProvider stepArgumentsProvider
	
	@Inject extension IJvmModelAssociator 

   override infer(EObject object, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
    	if(!checkClassPath(object, annotationProvider)){
			return
		}
		
		val feature = object.resolveFeature
		if(feature == null || feature.name.isNullOrEmpty){
			return
		}
    	
		val JvmGenericType background = feature.background.toClass(acceptor)
		val scenarios = feature.scenarios.toClass(acceptor, background)
		feature.toClass(acceptor, scenarios)
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
   	
   	def toClass(Feature feature, IJvmDeclaredTypeAcceptor acceptor, List<JvmGenericType> scenarios){
   		val inferredJvmType = feature.toClass
		register(acceptor, feature, inferredJvmType, scenarios)
   	}
   	
   	def register(IJvmDeclaredTypeAcceptor acceptor, XtendClass source, JvmGenericType inferredJvmType, List<JvmGenericType> scenarios){
   		associatePrimary(source, inferredJvmType);
		acceptor.accept(inferredJvmType).initializeLater[initialize(source, inferredJvmType, scenarios)] 
   	} 
   	
	def toClass(XtendClass xtendClass){
		toClass(xtendClass, null)
	}
   	
   	def toClass(XtendClass xtendClass, JvmGenericType superClass){
   		if(superClass != null){
	   		xtendClass.^extends = superClass.createTypeRef()
   		} 
   		xtendClass.toClass(xtendClass.className)[
			packageName = xtendClass.packageName
   		]	
   	}
   	
   	def initialize(XtendClass source, JvmGenericType inferredJvmType, List<JvmGenericType> scenarios) {
   		init(source, inferredJvmType, scenarios)
   		super.initialize(source, inferredJvmType)
   	}
   	
   	def dispatch void init(Feature feature, JvmGenericType inferredJvmType, List<JvmGenericType> scenarios){
   		val annotations = inferredJvmType.annotations
   		annotations += feature.featureRunner
   		if(!scenarios.empty)
   			annotations += feature.toAnnotation(typeof(Contains), scenarios)
   		annotations += feature.toAnnotation(typeof(Named), feature.name?.trim)
   	}
   	
   	def dispatch void init(Scenario scenario, JvmGenericType inferredJvmType, List<JvmGenericType> scenarios){
   		scenario.steps.forEach[it.generateStepValues]
   		scenario.copyXtendMemberForReferences
   		
   		val annotations = inferredJvmType.annotations
   		annotations += scenario.featureRunner
   		annotations += scenario.toAnnotation(typeof(Named), scenario.name?.trim)

   		val feature = scenario.feature
		var start = 0
   		
   		val background = feature.background
		if(!(scenario instanceof Background) && background != null){
			start = background.steps.generateBackgroundStepCalls(inferredJvmType)
		}
		scenario.steps.generateSteps(inferredJvmType, start, scenario)
   	}

   	def generateStepValues(Step step){
		var decs = filter(step.eAllContents, typeof(XVariableDeclaration))
		val arguments = stepArgumentsProvider.findStepArguments(step)
		if(arguments.empty) return;
		decs.forEach[dec | 
			if(dec.name == STEP_VALUES){
				if(!(step instanceof StepReference)){				
					dec.setStepValueType(step as Step)
				}
				var calls = filter(step.eAllContents, typeof(XMemberFeatureCall))
				var int index = 0
				for(call: calls.toIterable){
					if(arguments.size > index && call.memberCallTarget instanceof XFeatureCall){
						var featureCall = call.memberCallTarget as XFeatureCall
						if(featureCall.feature == dec && (step instanceof StepReference ||call.feature == null)){
							addStepValue(call, dec, step, arguments.get(index))
							index = index + 1
						}
					}
				}
			}	
		]
   	}

   	def setStepValueType(XVariableDeclaration variableDec, Step step){
		var typeRef = getTypeForName(typeof(StepArguments), step)
		variableDec.type = typeRef		
		val type = typeRef.type as JvmGenericType
		var constructor = variableDec.right as XConstructorCall
		constructor.constructor = filter(type.members.iterator, typeof(JvmConstructor)).next
	}

	def addStepValue(XMemberFeatureCall featureCall, XVariableDeclaration dec, XtendMember step, String arg){
		var typeRef = getTypeForName(typeof(StepArguments), step)
		var type = typeRef.type as JvmGenericType
		var operations = filter(type.members.iterator, typeof(JvmOperation))
		for(operation: operations.toIterable){
			if(operation.simpleName == "add"){
				if(!(step instanceof StepReference)){
					featureCall.feature = operation				
				}else{
					for(ref: featureCall.memberCallArguments){
						val argument = ref as XStringLiteral
						argument.value = arg
					}
				}
			}
		}
	}

   	def generateBackgroundStepCalls(Iterable<Step> steps, JvmGenericType inferredJvmType){
   		var order = 0
		for (step : steps) {
			order = transformCalls(step, inferredJvmType, order)
			for(and: step.and){
				order = transformCalls(and, inferredJvmType, order)
			}			
		}
		order 
   	}

   	def transformCalls(Step step, JvmGenericType inferredJvmType, int order){
   		val methodName = step.methodName
   		inferredJvmType.members += step.toMethod(methodName, getTypeForName(Void::TYPE, step))[
			body = [ITreeAppendable a |
						a.append("super." + methodName + "();")
			]
			annotations += step.getTestAnnotations(false)
			annotations += step.toAnnotation(typeof(Order), order.intValue)
			annotations += step.toAnnotation(typeof(Named), step.describe)
		]	
		order + 1
   	}

   	def generateSteps(Iterable<Step> steps, JvmGenericType inferredJvmType, int start, Scenario scenario){
		var order = start
		for (step : steps) {
			order = transform(step, inferredJvmType, order, scenario)
			for(and: (step).and){
				order = transform(and, inferredJvmType, order, scenario)
			}
		}
   	}

	def transform(Step step, JvmGenericType inferredJvmType, int order, Scenario scenario) {
		inferredJvmType.members += step.toMethod(step.methodName, getTypeForName(Void::TYPE, step))[
			body = step.expressionOf?.blockExpression
			step.generateStepValues
			annotations += step.getTestAnnotations(false)
			annotations += step.toAnnotation(typeof(Order), order.intValue)
			var name = step.describe
			
			if(!(step instanceof Given) && step.expressionOf== null){
				name = "[PENDING] " + name
				annotations += step.toAnnotation(typeof(Ignore))
			}
			annotations += step.toAnnotation(typeof(Named), name)
		]	
		order + 1
	}

   	def generateSteps(Iterable<Step> steps, JvmGenericType inferredJvmType){
		for (step: steps) {
			transform(step, inferredJvmType)
			for(and: (step).and){
				transform(and, inferredJvmType)
			}
		}
   	}

   	def transform(Step step, JvmGenericType inferredJvmType){
   		inferredJvmType.members += step.toMethod(step.methodName, getTypeForName(Void::TYPE, step))[
			body = step.expressionOf?.blockExpression
			step.generateStepValues
		]
   	}


	def feature(EObject context){
   		getContainerOfType(context, typeof(Feature))
   	}
}
