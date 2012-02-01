/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.jvmmodel

import com.google.inject.Inject
import de.bmw.carit.jnario.common.jvmmodel.ExtendedJvmTypesBuilder
import de.bmw.carit.jnario.generator.JnarioCompiler
import de.bmw.carit.jnario.jnario.Feature
import de.bmw.carit.jnario.jnario.JnarioFile
import de.bmw.carit.jnario.jnario.Scenario
import de.bmw.carit.jnario.jnario.Step
import de.bmw.carit.jnario.naming.JavaNameProvider
import de.bmw.carit.jnario.naming.StepExpressionProvider
import de.bmw.carit.jnario.naming.StepNameProvider
import de.bmw.carit.jnario.runner.Contains
import de.bmw.carit.jnario.runner.JnarioExamplesRunner
import de.bmw.carit.jnario.runner.JnarioRunner
import de.bmw.carit.jnario.runner.Named
import de.bmw.carit.jnario.runner.Order
import java.util.List
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator
import org.eclipse.xtext.xbase.typing.ITypeProvider
import org.eclipse.xtext.xtend2.jvmmodel.Xtend2JvmModelInferrer
import org.eclipse.xtext.xtend2.xtend2.XtendField
import org.junit.Test
import org.junit.runner.RunWith

import static com.google.common.collect.Iterators.*
import static org.eclipse.xtext.EcoreUtil2.*
import de.bmw.carit.jnario.common.ExampleTable
import de.bmw.carit.jnario.common.ExampleRow

/**
 * @author Birgit Engelmann
 */
class JnarioJvmModelInferrer extends Xtend2JvmModelInferrer {

	@Inject extension ExtendedJvmTypesBuilder
	
	@Inject	extension TypeReferences

	@Inject extension ITypeProvider
	
	@Inject extension JavaNameProvider
	
	@Inject extension JnarioCompiler
	
	@Inject extension StepNameProvider
	
	@Inject extension StepExpressionProvider
	
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
    	var jnarioFile = object as JnarioFile
		var feature = jnarioFile?.xtendClass as Feature
		if(feature == null){
			return
		}
			
		var JvmGenericType backgroundClass = null
		if(feature.background != null){
			backgroundClass = feature.generateBackground(jnarioFile)
			acceptor.accept(backgroundClass)
		}
		val List<JvmGenericType> scenarios = newArrayList()
		for(member: feature.members){
			val scenario = member as Scenario
			val className = feature.name.featureClassName + scenario.name.scenarioClassName
			val clazz = scenario.infer(jnarioFile, className, backgroundClass)
			clazz.annotations += scenario.runnerAnnotations
			acceptor.accept(clazz)
			scenarios.add(clazz)
		}
		
		val featureClazz = feature.generateFeatureSuite(jnarioFile, scenarios)
		acceptor.accept(featureClazz)
   	}
   	
   	def generateFeatureSuite(Feature feature, JnarioFile jnarioFile, List<JvmGenericType> scenarios){
   		feature.toClass(feature.name.featureClassName)[
   			jnarioFile.eResource.contents += it
   			packageName = jnarioFile.^package
   			annotations += feature.toAnnotation(typeof(RunWith), typeof(JnarioRunner))
   			annotations += feature.toAnnotation(typeof(Contains), scenarios)
   		]
   	}
   	
   	def runnerAnnotations(Scenario scenario){
		if(scenario.examples.empty){
			scenario.toAnnotation(typeof(RunWith), typeof(JnarioRunner))
		}else{
			scenario.toAnnotation(typeof(RunWith), typeof(JnarioExamplesRunner))
		}
   	}
   	
   	def generateBackground(Feature feature, JnarioFile jnarioFile){
   		feature.toClass(feature.name.featureClassName + "Background")[
   			jnarioFile.eResource.contents += it
   			packageName = jnarioFile.^package
   			abstract = true
   			feature.background.steps.generateSteps(it)
   		]
   	}
   	
   	def infer(Scenario scenario, JnarioFile jnarioFile, String className, JvmGenericType superClass){
   		scenario.toClass(className)[
   			jnarioFile.eResource.contents += it
			annotations += scenario.toAnnotation(typeof(Named), scenario.name.trim)
			packageName = jnarioFile.^package
			documentation = scenario.documentation
			
			var hasBackground = false
			var feature = jnarioFile.xtendClass as Feature
			var start = 0
			if(feature.background != null){
				hasBackground = true
				superTypes += superClass.createTypeRef
				start = feature.background.steps.generateBackgroundStepCalls(it)
			}

			scenario.generateVariables(feature, hasBackground, it)
			scenario.steps.generateSteps(it, start)
			
			if(!scenario.examples.empty){
				val exampleClasses = scenario.generateExampleClasses(jnarioFile, it)
				if(!exampleClasses.empty){
					annotations += scenario.toAnnotation(typeof(Contains), exampleClasses)
				}
			}
   		]	
   	}
   	
   	def generateVariables(Scenario scenario, Feature feature, boolean hasBackground, JvmGenericType inferredJvmType){
		var allVariables = <String>newArrayList()
		if(hasBackground){
			var backgroundFields = filter(feature.background.members.iterator, typeof(XtendField))
			for(field: backgroundFields.toIterable){
				field.transform(inferredJvmType)
				allVariables.add(field.name)				
			}
		}
		
		var eAllContents = scenario.eAllContents;
		var allFields = filter(eAllContents, typeof(XtendField))
		for(field: allFields.toIterable){
			if(field.type == null || field.type.type == null){
				checkIfExampleField(field)
			}
			if(!allVariables.contains(field.name)){
				field.transform(inferredJvmType)
				allVariables.add(field.name)
			}
			
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
			annotations += step.toAnnotation(typeof(Test))
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
			annotations += step.toAnnotation(typeof(Test))
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
   	

	
	def void checkIfExampleField(XtendField field){
		var examples = getContainerOfType(field, typeof(ExampleTable))
		if(examples == null){
			return
		}
		var heading = examples.heading
		if(!heading.parts.contains(field)){
			return	
		}
		var index = heading.parts.indexOf(field)
		if(examples.rows.empty){
			return
		}
		var exampleRow = examples.rows.get(0)
		if(index < exampleRow.parts.size){
			var exampleCell = exampleRow.parts.get(index)
			field.setType(getType(exampleCell))
			field.setVisibility(JvmVisibility::PUBLIC)
		}
	}
	
	def generateExampleClasses(Scenario scenario, JnarioFile jnarioFile, JvmGenericType inferredJvmType){
		var exampleTable = 1
		val List<JvmGenericType> exampleClasses = newArrayList()
		for(example: scenario.examples){
			var fields = example.heading?.parts
			var exampleNumber = 1
			if(!example.rows.empty){
				for(row: example.rows){
					exampleClasses += scenario.createExampleClass(jnarioFile, row, fields, exampleTable, exampleNumber, inferredJvmType)
					exampleNumber = exampleNumber + 1
				}
			}
			exampleTable = exampleTable + 1
		}
		exampleClasses
	}
	
	def createExampleClass(Scenario scenario, JnarioFile jnarioFile, ExampleRow row, EList<XtendField> fields, int exampleTable, int exampleNumber, JvmGenericType inferredJvmType){
		val className = jnarioFile.xtendClass.name.featureClassName + scenario.name.scenarioClassName + "ExampleTable" + exampleTable + "Example" + exampleNumber
		
		row.toClass(className)[
			superTypes += inferredJvmType.createTypeRef
			jnarioFile.eResource.contents += it
			packageName = jnarioFile.^package
			members += row.generateExampleConstructor(fields, className)
			annotations += row.toAnnotation(typeof(RunWith), typeof(JnarioRunner))
			
			var description = "ExampleTable " + exampleTable + ", " + "Example " + exampleNumber + " ["
			var i = 0
			for(field: fields){
				description = description + field.name + " = " + cellToAppendable(row, i) + ", "
				i = i + 1
			}
			description = description.substring(0, description.length - 1 - 1) + "]"
			annotations += row.toAnnotation(typeof(Named), description)
		]
	}

	def generateExampleConstructor(ExampleRow row, EList<XtendField> fields, String className){
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
	
	def cellToAppendable(ExampleRow row, int i){
		var appendable = new StringBuilderBasedAppendable()
		row.parts.get(i).toJavaExpression(appendable)
		appendable
	}
	
	// copied from Xtend2JvmModelInferrer since it does not use source.getAnnotations()
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
