/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.jvmmodel

import com.google.inject.Inject
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.core.xtend.XtendField
import org.eclipse.xtend.core.xtend.XtendMember
import org.eclipse.xtext.common.types.JvmConstructor
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.XConstructorCall
import org.eclipse.xtext.xbase.XFeatureCall
import org.eclipse.xtext.xbase.XMemberFeatureCall
import org.eclipse.xtext.xbase.XStringLiteral
import org.eclipse.xtext.xbase.XVariableDeclaration
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator
import org.jnario.ExampleColumn
import org.jnario.ExampleRow
import org.jnario.feature.feature.Background
import org.jnario.feature.feature.Feature
import org.jnario.feature.feature.FeatureFile
import org.jnario.feature.feature.Scenario
import org.jnario.feature.feature.Step
import org.jnario.feature.feature.StepReference
import org.jnario.feature.naming.JavaNameProvider
import org.jnario.feature.naming.StepNameProvider
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder
import org.jnario.jvmmodel.JnarioJvmModelInferrer
import org.jnario.jvmmodel.JunitAnnotationProvider
import org.jnario.lib.StepArguments
import org.jnario.runner.Contains
import org.jnario.runner.Named
import org.jnario.runner.Order
import org.junit.Ignore

import static com.google.common.collect.Iterators.*
import static org.jnario.feature.jvmmodel.FeatureJvmModelInferrer.*
import org.eclipse.xtend.core.xtend.XtendClass
import org.eclipse.xtext.EcoreUtil2

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
class FeatureJvmModelInferrer extends JnarioJvmModelInferrer {
	
	public static String STEP_VALUES = "args"

	@Inject extension ExtendedJvmTypesBuilder
	
	@Inject	extension TypeReferences
	
	@Inject extension JavaNameProvider
	
	@Inject extension StepNameProvider
	
	@Inject extension StepExpressionProvider
	
	@Inject extension JunitAnnotationProvider annotationProvider
	
	@Inject extension StepReferenceFieldCreator
	
	@Inject extension StepArgumentsProvider stepArgumentsProvider
	
	@Inject extension IJvmModelAssociator 
	
	/**
	 * Is called for each instance of the first argument's type contained in a resource.
	 * 
	 * @param element - the model to create one or more JvmDeclaredTypes from.
	 * @param acceptor - each created JvmDeclaredType without a container should be passed to the acceptor in order get attached to the
	 *                   current resource.
	 * @param isPreLinkingPhase - whether the method is called in a pre linking phase, i.e. when the global index isn't fully updated. You
	 *        must not rely on linking using the index if iPrelinkingPhase is <code>true</code>
	 */
   override infer(EObject object, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
    	if(!checkClassPath(object, annotationProvider)){
			return
		}
		
    	val featureFile = object as FeatureFile
		val feature = featureFile?.xtendClass as Feature
		if(feature == null){
			return
		}
			
		var JvmGenericType backgroundClass = null
		if(feature.background != null){
			backgroundClass = feature.generateBackground(featureFile)
			register(acceptor, feature.background, backgroundClass, emptyList)
		}
		val scenarios = <JvmGenericType>newArrayList
		for(member: feature.scenarios){
			val scenario = member as Scenario
			val className = scenario.className
			val inferredJvmType = scenario.infer(featureFile, className, backgroundClass)
			register(acceptor, scenario, inferredJvmType, emptyList)
			scenarios += inferredJvmType
		}
		
		val inferredJvmType = feature.generateFeatureSuite(featureFile, scenarios)
		register(acceptor, feature, inferredJvmType, scenarios)
   	}
   	
   	def register(IJvmDeclaredTypeAcceptor acceptor, XtendClass source, JvmGenericType inferredJvmType, List<JvmGenericType> scenarios){
   		associatePrimary(source, inferredJvmType);
		acceptor.accept(inferredJvmType).initializeLater[initialize(source, inferredJvmType, scenarios)] 
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
   		annotations += feature.toAnnotation(typeof(Named), feature.name.trim)
   	}
   	
   	def dispatch void init(Scenario scenario, JvmGenericType inferredJvmType, List<JvmGenericType> scenarios){
   		scenario.steps.generateStepValues
   		scenario.copyXtendMemberForReferences
   		val annotations = inferredJvmType.annotations
   		val feature = scenario.feature
   		val background = feature.background
   		inferredJvmType.annotations += scenario.runnerAnnotations
   		annotations += scenario.toAnnotation(typeof(Named), scenario.name.trim)
		var start = 0
		if(background != null){
			start = background.steps.generateBackgroundStepCalls(inferredJvmType)
		}
		scenario.generateVariables(feature, inferredJvmType)
		scenario.steps.generateSteps(inferredJvmType, start, scenario)
		
		if(!scenario.examples.empty){
			val exampleClasses = scenario.generateExampleClasses(feature.eContainer as FeatureFile, inferredJvmType)
			if(!exampleClasses.empty){
				annotations += scenario.toAnnotation(typeof(Contains), exampleClasses)
			}
		}
   	}
   	

   	
   	def dispatch void init(Background background, JvmGenericType inferredJvmType, List<JvmGenericType> scenarios){
   		background.steps.generateStepValues
   		background.copyXtendMemberForReferences
   		background.steps.generateSteps(inferredJvmType)
   	}
   	
   	def generateFeatureSuite(Feature feature, FeatureFile featureFile, List<JvmGenericType> scenarios){
   		feature.toClass(feature.getClassName)[
   			packageName = featureFile.^package
   		]
   	}
   	
   	def runnerAnnotations(Scenario scenario){
		if(scenario.examples.empty){
			scenario.featureRunner
		}else{
			scenario.featureExamplesRunner
		}
   	}
   	
   	def generateBackground(Feature feature, FeatureFile featureFile){
   		val background = feature.background
   		background.toClass(background.getClassName)[
   			packageName = featureFile.^package
   			abstract = true
   		]
   		
   	}
   	
   	def infer(Scenario scenario, FeatureFile featureFile, String className, JvmGenericType superClass){
   		scenario.^extends = superClass?.createTypeRef()
   		return scenario.toClass(className)[
			packageName = featureFile.^package
   		]	
   	}
   	
   	def generateStepValues(Iterable<XtendMember> steps){
   		for(step: steps.filter(typeof(Step))){
			step.generateStepValues
   		}
   	}
   	
   	def generateStepValues(Step step){
		var decs = filter(step.eAllContents, typeof(XVariableDeclaration))
		for(dec: decs.toIterable){
			if(dec.name == STEP_VALUES){
				if(!(step instanceof StepReference)){				
					dec.setStepValueType(step as Step)
				}
				var calls = filter(step.eAllContents, typeof(XMemberFeatureCall))
				for(call: calls.toIterable){
					if(call.memberCallTarget instanceof XFeatureCall){
						var featureCall = call.memberCallTarget as XFeatureCall
						if(featureCall.feature == dec && (step instanceof StepReference ||call.feature == null)){
							addStepValue(call, dec, step)
						}
					}
				}
			}	
		}
   	}
   	
   	def setStepValueType(XVariableDeclaration variableDec, Step step){
		var typeRef = getTypeForName(typeof(StepArguments), step)
		variableDec.type = typeRef		
		val type = typeRef.type as JvmGenericType
		var constructor = variableDec.right as XConstructorCall
		constructor.constructor = filter(type.members.iterator, typeof(JvmConstructor)).next
	}
	
	def addStepValue(XMemberFeatureCall featureCall, XVariableDeclaration dec, XtendMember step){
		var typeRef = getTypeForName(typeof(StepArguments), step)
		var type = typeRef.type as JvmGenericType
		var operations = filter(type.members.iterator, typeof(JvmOperation))
		for(operation: operations.toIterable){
			if(operation.simpleName == "add"){
				if(!(step instanceof StepReference)){
					featureCall.feature = operation				
				}
				else{
					val stepRef = step as StepReference
					val arguments = stepArgumentsProvider.findStepArguments(stepRef)
					var i = 0
					if(!arguments.empty){
						for(ref: featureCall.memberCallArguments){
							val argument = ref as XStringLiteral
							argument.value = arguments.get(i)
							i = i + 1
						}
					}
				}
			}
		}
	}
   	
   	def generateBackgroundStepCalls(EList<XtendMember> steps, JvmGenericType inferredJvmType){
   		var order = 0
		for (step : steps) {
			order = transformCalls(step as Step, inferredJvmType, order)
			for(and: (step as Step).and){
				order = transformCalls(and as Step, inferredJvmType, order)
			}			
		}
		order 
   	}
   	
   	def transformCalls(Step step, JvmGenericType inferredJvmType, int order){
   		val methodName = step.nameOf.javaMethodName
   		inferredJvmType.members += step.toMethod(methodName, getTypeForName(Void::TYPE, step))[
			body = [ITreeAppendable a |
						a.append("super." + methodName + "();")
			]
			annotations += step.getTestAnnotations(false)
			annotations += step.toAnnotation(typeof(Order), order.intValue)
			annotations += step.toAnnotation(typeof(Named),step.nameOf)
		]	
		order + 1
   	}
   	
   	def generateSteps(EList<XtendMember> steps, JvmGenericType inferredJvmType, int start, Scenario scenario){
		var order = start
		for (step : steps) {
			order = transform(step as Step, inferredJvmType, order, scenario)
			for(and: (step as Step).and){
				order = transform(and as Step, inferredJvmType, order, scenario)
			}
		}
   	}
   	
	def transform(Step step, JvmGenericType inferredJvmType, int order, Scenario scenario) {
		inferredJvmType.members += step.toMethod(step.nameOf.javaMethodName, getTypeForName(Void::TYPE, step))[
			body = step.expressionOf(inferredJvmType)?.blockExpression
			step.generateStepValues
			annotations += step.getTestAnnotations(false)
			annotations += step.toAnnotation(typeof(Order), order.intValue)
			var name = step.nameOf
			if(step.expressionOf(inferredJvmType) == null){
				name = "[PENDING] " + name
				annotations += step.toAnnotation(typeof(Ignore))
			}
			annotations += step.toAnnotation(typeof(Named), name)
		]	
		order + 1
	}
	
  	
   	def generateSteps(EList<XtendMember> steps, JvmGenericType inferredJvmType){
		for (step: steps) {
			transform(step as Step, inferredJvmType)
			for(and: (step as Step).and){
				transform(and as Step, inferredJvmType)
			}
		}
   	}
   	
   	def transform(Step step, JvmGenericType inferredJvmType){
   		inferredJvmType.members += step.toMethod(step.nameOf.javaMethodName, getTypeForName(Void::TYPE, step))[
			body = step.expressionOf(inferredJvmType)?.blockExpression
			step.generateStepValues
		]
   	}
   	
 	def generateVariables(Scenario scenario, Feature feature, JvmGenericType inferredJvmType){		
		if(!scenario.examples.empty){
			var fieldNames = new ArrayList<String>()
			for(table: scenario.examples){
				var allFields = filter(table.eAllContents, typeof(ExampleColumn))
				for(field: allFields.toIterable){
					if(!fieldNames.contains(field.name)){
						inferredJvmType.members += field.toField
						fieldNames.add(field.name)
					}
				}
			}
		}		
 	}
   	
	def generateExampleClasses(Scenario scenario, FeatureFile featureFile, JvmGenericType inferredJvmType){
		val List<JvmGenericType> exampleClasses = newArrayList()
		for(example: scenario.examples){
			var fields = example.columns
			if(!example.rows.empty){
				for(row: example.rows){
					exampleClasses += scenario.createExampleClass(featureFile, row, fields, inferredJvmType)
				}
			}
		}
		exampleClasses
	} 
	
	def createExampleClass(Scenario scenario, FeatureFile featureFile, ExampleRow row, EList<ExampleColumn> fields, JvmGenericType inferredJvmType){
		val className = row.className
		row.toClass(className)[
			superTypes += inferredJvmType.createTypeRef
			featureFile.eResource.contents += it
			packageName = featureFile.^package
			members += row.generateExampleConstructor(fields, className)
			annotations += row.featureRunner
			
			var description = "["
			var i = 0
			for(field: fields){
				if(row.cells.size > i){
					description = description + field.name + " = " + row.cells.get(i).serialize + ", "
					i = i + 1
				}
			}
			description = description.substring(0, description.length - 1 - 1) + "]"
			annotations += row.toAnnotation(typeof(Named), description)
		]
	}
	
	def cellToAppendable(ExampleRow row, int i, ITreeAppendable appendable){
		if(row.cells.size > i){
			compiler.toJavaExpression(row.cells.get(i), appendable)
		}
		appendable
	}

	def generateExampleConstructor(ExampleRow row, EList<ExampleColumn> fields, String className){
		row.toConstructor[
			simpleName = className
			body = [ITreeAppendable a |
				var i = 0
				for(field: fields){
					a.append("super.")
					a.append(field.name)
					a.append(" = ")
					cellToAppendable(row, i, a)
					a.append(";\n")
					i = i + 1
				}
			]
		]
	}
	
	override void transform(XtendField source, JvmGenericType container) {
		if(source.visibility == JvmVisibility::PRIVATE){
			source.visibility = JvmVisibility::DEFAULT
		}
		super.transform(source, container)
	}
	
	def feature(EObject context){
   		EcoreUtil2::getContainerOfType(context, typeof(Feature))
   	}
}
