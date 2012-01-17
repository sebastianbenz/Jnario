package de.bmw.carit.jnario.jvmmodel

import com.google.inject.Inject
import de.bmw.carit.jnario.common.jvmmodel.ExtendedJvmTypesBuilder
import de.bmw.carit.jnario.generator.JnarioCompiler
import de.bmw.carit.jnario.jnario.ExampleRow
import de.bmw.carit.jnario.jnario.ExampleTable
import de.bmw.carit.jnario.jnario.Feature
import de.bmw.carit.jnario.jnario.Given
import de.bmw.carit.jnario.jnario.Jnario
import de.bmw.carit.jnario.jnario.Scenario
import de.bmw.carit.jnario.jnario.Step
import de.bmw.carit.jnario.jnario.Then
import de.bmw.carit.jnario.jnario.When
import de.bmw.carit.jnario.naming.JavaNameProvider
import de.bmw.carit.jnario.runner.JnarioExamplesRunner
import de.bmw.carit.jnario.runner.JnarioRunner
import de.bmw.carit.jnario.runner.Named
import de.bmw.carit.jnario.runner.Order
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
import java.util.List
import de.bmw.carit.jnario.runner.Contains

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class JnarioJvmModelInferrer extends Xtend2JvmModelInferrer {

    /**
     * conveninence API to build and initialize JvmTypes and their members.
     */
	@Inject extension ExtendedJvmTypesBuilder
	
	@Inject	extension TypeReferences

	@Inject extension ITypeProvider
	
	@Inject extension JavaNameProvider
	
	@Inject extension JnarioCompiler
	
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
    	var jnarioFile = object as Jnario
   		if(jnarioFile != null){
   			var feature = jnarioFile.xtendClass as Feature
   			if(feature != null){
				for(member: feature.members){
					var scenario = member as Scenario
					val className = feature.name.javaClassName + scenario.name.javaClassName
					var clazz = scenario.infer(jnarioFile, className)
					if(!scenario.examples.empty){
						clazz.annotations += scenario.toAnnotation(typeof(RunWith), typeof(JnarioExamplesRunner))
						// add contains for all examples
					}else{
						clazz.annotations += scenario.toAnnotation(typeof(RunWith), typeof(JnarioRunner))
					}
					acceptor.accept(clazz)
				}
			}
		}
   	}
   	
   	def infer(Scenario scenario, Jnario jnario, String className){
   		scenario.toClass(className)[
   			jnario.eResource.contents += it
			annotations += scenario.toAnnotation(typeof(Named), scenario.name.trim)
			packageName = jnario.^package
			documentation = scenario.documentation
			var hasBackground = false
			var feature = jnario.xtendClass as Feature
			if(feature.background != null){
				hasBackground = true
			}
			var allVariables = <String>newArrayList()
			if(hasBackground){
				var backgroundFields = filter(feature.background.members.iterator, typeof(XtendField))
				for(field: backgroundFields.toIterable){
					field.transform(it)
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
					field.transform(it)
					allVariables.add(field.name)
				}
				
			}
			
			var order = 0
			if(hasBackground){
				for (step : feature.background.steps) {
					order = transform(step, it, order)
					for(and: step.and){
						order = transform(and, it, order)
					}			
				}
			}
			
			for (member : scenario.getSteps) {
				var step = member as Step
				order = transform(step, it, order)
				if(step instanceof Given){
					var given = step as Given
					for(and: given.and){
						order = transform(and, it, order)
					}
				}else if(step instanceof When){
					var when = step as When
					for(and: when.and){
						order = transform(and, it, order)
					}
				}else{
					var then = step as Then
					for(and: then.and){
						order = transform(and, it, order)
					}
				}				
			}
			
			if(!scenario.examples.empty){
				val exampleClasses = scenario.generateInnerClasses(jnario, it)
				if(!exampleClasses.empty){
					annotations += scenario.toAnnotation(typeof(Contains), exampleClasses);
				}
			}
   		]	
   	}
   	
	def transform(Step step, JvmGenericType inferredJvmType, int order) {
		if(step.getCode() != null){
			inferredJvmType.members += step.toMethod(step.name.javaMethodName, getTypeForName(Void::TYPE, step))[
				body = step.code.blockExpression
				annotations += step.toAnnotation(typeof(Test))
				annotations += step.toAnnotation(typeof(Order), order.intValue)
				annotations += step.toAnnotation(typeof(Named), step.name.trim)
			]	
		}
		order + 1
	}
	
	def checkIfExampleField(XtendField field){
		var examples = getContainerOfType(field, typeof(ExampleTable))
		if(examples != null){
			var heading = examples.heading
			if(heading.parts.contains(field)){
				var index = heading.parts.indexOf(field)
				if(examples.rows != null && examples.rows.size > 0){
					var exampleRow = examples.rows.get(0)
					if(index < exampleRow.parts.size){
						var exampleCell = exampleRow.parts.get(index)
						field.setType(getType(exampleCell.name))
						field.setVisibility(JvmVisibility::PUBLIC)
					}
				}
			}	
		}
	}
	
	def generateInnerClasses(Scenario scenario, Jnario jnario, JvmGenericType inferredJvmType){
		var exampleTable = 1
		val List<JvmGenericType> exampleClasses = newArrayList()
		for(example: scenario.examples){
			
			var fields = example.heading.parts
			var exampleNumber = 1
			for(row: example.rows){
				exampleClasses += scenario.createInnerClass(jnario, row, fields, exampleTable, exampleNumber, inferredJvmType)
				exampleNumber = exampleNumber + 1
			}
			exampleTable = exampleTable + 1
		}
		exampleClasses
	}
	
	def createInnerClass(Scenario scenario, Jnario jnario, ExampleRow row, EList<XtendField> fields, int exampleTable, int exampleNumber, JvmGenericType inferredJvmType){
		val className = "ExampleTable" + exampleTable + "Example" + exampleNumber
		
		row.toClass(className)[
			superTypes += inferredJvmType.createTypeRef
			jnario.eResource.contents += it
			packageName = jnario.^package
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
		row.parts.get(i).name.toJavaExpression(appendable)
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
