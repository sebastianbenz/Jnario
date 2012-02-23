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
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.XVariableDeclaration
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator
import org.eclipse.xtext.xbase.typing.ITypeProvider
import org.eclipse.xtext.xtend2.xtend2.XtendField
import org.jnario.ExampleColumn
import org.jnario.ExampleRow
import org.jnario.feature.feature.Background
import org.jnario.feature.feature.Feature
import org.jnario.feature.feature.FeatureFile
import org.jnario.feature.feature.Scenario
import org.jnario.feature.feature.Step
import org.jnario.feature.naming.JavaNameProvider
import org.jnario.feature.naming.StepExpressionProvider
import org.jnario.feature.naming.StepNameProvider
import org.jnario.jvmmodel.CommonJvmModelInferrer
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder
import org.jnario.jvmmodel.JunitAnnotationProvider
import org.jnario.runner.Contains
import org.jnario.runner.Named
import org.jnario.runner.Order

import static com.google.common.collect.Iterators.*

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
class FeatureJvmModelInferrer extends CommonJvmModelInferrer {

	@Inject extension ExtendedJvmTypesBuilder
	
	@Inject	extension TypeReferences
	
	@Inject extension JavaNameProvider
	
	@Inject extension StepNameProvider
	
	@Inject extension StepExpressionProvider
	
	@Inject extension ITypeProvider
	
	@Inject extension JunitAnnotationProvider annotationProvider
	
	@Inject
	private IJvmModelAssociator associator
	
	/**
	 * Is called for each instance of the first argument's type contained in a resource.
	 * 
	 * @param element - the model to create one or more JvmDeclaredTypes from.
	 * @param acceptor - each created JvmDeclaredType without a container should be passed to the acceptor in order get attached to the
	 *                   current resource.
	 * @param isPreLinkingPhase - whether the method is called in a pre linking phase, i.e. when the global index isn't fully updated. You
	 *        must not rely on linking using the index if iPrelinkingPhase is <code>true</code>
	 */
    override void infer(EObject object, IAcceptor<JvmDeclaredType> acceptor, boolean isPrelinkingPhase) {
    	if(!checkClassPath(object, annotationProvider)){
			return
		}
		
    	var featureFile = object as FeatureFile
		var feature = featureFile?.xtendClass as Feature
		if(feature == null){
			return
		}
			
		var JvmGenericType backgroundClass = null
		if(feature.background != null){
			backgroundClass = feature.generateBackground(featureFile)
			acceptor.accept(backgroundClass)
		}
		val List<JvmGenericType> scenarios = newArrayList()
		for(member: feature.members){
			val scenario = member as Scenario
			val className = feature.name.featureClassName + scenario.name.scenarioClassName
			val clazz = scenario.infer(featureFile, className, backgroundClass)
			clazz.annotations += scenario.runnerAnnotations
			acceptor.accept(clazz)
			scenarios.add(clazz)
		}
		
		val featureClazz = feature.generateFeatureSuite(featureFile, scenarios)
		acceptor.accept(featureClazz)
   	}
   	
   	def generateFeatureSuite(Feature feature, FeatureFile featureFile, List<JvmGenericType> scenarios){
   		feature.toClass(feature.name.featureClassName)[
   			featureFile.eResource.contents += it
   			packageName = featureFile.^package
   			annotations += feature.featureRunner
   			annotations += feature.toAnnotation(typeof(Contains), scenarios)
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
   		feature.toClass(feature.name.featureClassName + "Background")[
   			featureFile.eResource.contents += it
   			packageName = featureFile.^package
   			abstract = true
   			generateBackgroundVariables(feature.background, it)
   			feature.background.steps.generateSteps(it)
   		]
   	}
   	
   	def infer(Scenario scenario, FeatureFile featureFile, String className, JvmGenericType superClass){
   		scenario.toClass(className)[
   			featureFile.eResource.contents += it
			annotations += scenario.toAnnotation(typeof(Named), scenario.name.trim)
			packageName = featureFile.^package
			documentation = scenario.documentation
			
			var hasBackground = false
			var feature = featureFile.xtendClass as Feature
			var start = 0
			if(feature.background != null){
				hasBackground = true
				superTypes += superClass.createTypeRef
				start = feature.background.steps.generateBackgroundStepCalls(it)
			}

			scenario.generateVariables(feature, it)
			scenario.steps.generateSteps(it, start)
			
			if(!scenario.examples.empty){
				val exampleClasses = scenario.generateExampleClasses(featureFile, it)
				if(!exampleClasses.empty){
					annotations += scenario.toAnnotation(typeof(Contains), exampleClasses)
				}
			}
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
		var variableDeclarations = filter(scenario.eAllContents, typeof(XVariableDeclaration))
		variableDeclarations.toIterable.generateXVariableDeclarations(inferredJvmType, scenario)
  	}
   	
   	def generateBackgroundVariables(Background background, JvmGenericType inferredJvmType){
		var variableDeclarations = filter(background.eAllContents, typeof(XVariableDeclaration))
		variableDeclarations.toIterable.generateXVariableDeclarations(inferredJvmType, background)
   	}
   	
   	def generateXVariableDeclarations(Iterable<XVariableDeclaration> varDecs, JvmGenericType inferredJvmType, EObject scenario){
   		for(variableDec: varDecs){
   			
			var JvmTypeReference type;
			if (variableDec.getType != null) {
				type = variableDec.getType;
			} else {
				type = getType(variableDec.getRight);
			}
			var field = scenario.toField(variableDec.getSimpleName(), type)
			if (!variableDec.isWriteable()) {
				field.setFinal(true)
			}
			field.setVisibility(JvmVisibility::PUBLIC)
			inferredJvmType.members += field
		}
   	}
   	
   	def generateBackgroundStepCalls(EList<Step> steps, JvmGenericType inferredJvmType){
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
   		val methodName = step.nameOf.javaMethodName
   		inferredJvmType.members += step.toMethod(methodName, getTypeForName(Void::TYPE, step))[
			body = [
				'''
				super.«methodName»();
				'''
			]
			annotations += step.getTestAnnotations(null, false)
			annotations += step.toAnnotation(typeof(Order), order.intValue)
			annotations += step.toAnnotation(typeof(Named), step.nameOf)
		]	
		order + 1
   	}
   	
   	def generateSteps(EList<Step> steps, JvmGenericType inferredJvmType, int start){
		var order = start
		for (step : steps) {
			order = transform(step, inferredJvmType, order)
			for(and: step.and){
				order = transform(and, inferredJvmType, order)
			}
		}
   	}
   	
   	def transform(Step step, JvmGenericType inferredJvmType, int order) {

		inferredJvmType.members += step.toMethod(step.nameOf.javaMethodName, getTypeForName(Void::TYPE, step))[
			body = step.expressionOf?.blockExpression
			annotations += step.getTestAnnotations(null, false)
			annotations += step.toAnnotation(typeof(Order), order.intValue)
			annotations += step.toAnnotation(typeof(Named), step.nameOf)
		]	
		order + 1
	}
   	
   	def generateSteps(EList<Step> steps, JvmGenericType inferredJvmType){
		for (step : steps) {
			transform(step, inferredJvmType)
			for(and: step.and){
				transform(and, inferredJvmType)
			}
		}
   	}
   	
   	def transform(Step step, JvmGenericType inferredJvmType){
   		inferredJvmType.members += step.toMethod(step.nameOf.javaMethodName, getTypeForName(Void::TYPE, step))[
			body = step.expressionOf?.blockExpression
		]
   	}
   	
	def generateExampleClasses(Scenario scenario, FeatureFile featureFile, JvmGenericType inferredJvmType){
		var exampleTable = 1
		val List<JvmGenericType> exampleClasses = newArrayList()
		for(example: scenario.examples){
			var fields = example.columns
			var exampleNumber = 1
			if(!example.rows.empty){
				for(row: example.rows){
					exampleClasses += scenario.createExampleClass(featureFile, row, fields, exampleTable, exampleNumber, inferredJvmType)
					exampleNumber = exampleNumber + 1
				}
			}
			exampleTable = exampleTable + 1
		}
		exampleClasses
	} 
	
	def createExampleClass(Scenario scenario, FeatureFile featureFile, ExampleRow row, EList<ExampleColumn> fields, int exampleTable, int exampleNumber, JvmGenericType inferredJvmType){
		val className = featureFile.xtendClass.name.featureClassName + scenario.name.scenarioClassName + "ExampleTable" + exampleTable + "Example" + exampleNumber
		
		row.toClass(className)[
			superTypes += inferredJvmType.createTypeRef
			featureFile.eResource.contents += it
			packageName = featureFile.^package
			members += row.generateExampleConstructor(fields, className)
			annotations += row.featureRunner
			
			var description = "ExampleTable " + exampleTable + ", " + "Example " + exampleNumber + " ["
			var i = 0
			for(field: fields){
				description = description + field.name + " = " + cellToAppendable(row, i) + ", "
				i = i + 1
			}
			description = description.substring(0, description.length - 1 - 1) + "]"
			annotations += row.toAnnotation(typeof(Named), description.replace("\"", "\\\""))
		]
	}

	def generateExampleConstructor(ExampleRow row, EList<ExampleColumn> fields, String className){
		row.toConstructor(className)[
			visibility = JvmVisibility::PUBLIC
			body = [
				var constructor = new StringBuilder()
				var i = 0
				for(field: fields){
					
					constructor.append("super.")
					constructor.append(field.name)
					constructor.append(" = ")
					constructor.append(cellToAppendable(row, i).toString)
					constructor.append(";\n")
					i = i + 1
				}
				constructor.toString
			]
		]
	}
	
	
	// based on Xtend2JvmModelInferrer which does not use source.getAnnotations()
	// which checks if annotationInfos is null
	// but uses source.getAnnotationInfo().getAnnotations()
	override void transform(XtendField source, JvmGenericType container) {
		if ((source.isExtension || source.name != null) && source.type != null) {
			var field = typesFactory.createJvmField
			field.setSimpleName(computeFieldName(source, container))
			container.members += field
			associator.associatePrimary(source, field)
			field.visibility = source.visibility
			field.^static = source.isStatic
			field.type = cloneWithProxies(source.type)
			translateAnnotationsTo(source.annotations, field)
			setDocumentation(field, getDocumentation(source))
			setInitializer(field, source.initialValue)
		}
	}

}
