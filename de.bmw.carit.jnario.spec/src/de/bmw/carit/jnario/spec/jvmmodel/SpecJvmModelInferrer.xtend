package de.bmw.carit.jnario.spec.jvmmodel

import com.google.common.base.Joiner
import com.google.inject.Inject
import de.bmw.carit.jnario.common.ExampleTable
import de.bmw.carit.jnario.common.jvmmodel.CommonJvmModelInferrer
import de.bmw.carit.jnario.common.jvmmodel.ExtendedJvmTypesBuilder
import de.bmw.carit.jnario.runner.Contains
import de.bmw.carit.jnario.runner.Extension
import de.bmw.carit.jnario.runner.Named
import de.bmw.carit.jnario.runner.Order
import de.bmw.carit.jnario.spec.naming.ExampleNameProvider
import de.bmw.carit.jnario.spec.spec.After
import de.bmw.carit.jnario.spec.spec.Before
import de.bmw.carit.jnario.spec.spec.Example
import de.bmw.carit.jnario.spec.spec.ExampleGroup
import de.bmw.carit.jnario.spec.spec.SpecFile
import de.bmw.carit.jnario.spec.spec.TestFunction
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmAnnotationReference
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.util.Strings
import org.eclipse.xtext.xbase.compiler.ImportManager
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.eclipse.xtext.xtend2.xtend2.XtendField
import org.eclipse.xtext.xtend2.xtend2.XtendFunction

/**
 * @author Sebastian Benz - Initial contribution and API
 */
class SpecJvmModelInferrer extends CommonJvmModelInferrer {

	@Inject extension ExtendedJvmTypesBuilder
	
	@Inject extension TypeReferences

	@Inject extension ExampleNameProvider
	
	@Inject extension SpecAnnotationProvider annotationProvider
	
	@Inject extension ImplicitSubject 
	
	@Inject extension IJvmModelAssociations 
	
	override void infer(EObject e, IAcceptor<JvmDeclaredType> acceptor, boolean isPrelinkingPhase) {
		if (!(e instanceof SpecFile)){
			return
		}
		val specFile = e as SpecFile
		
		if(specFile.xtendClass == null){
			return
		}
		
		transform(specFile as SpecFile, specFile.xtendClass as ExampleGroup, null, isPrelinkingPhase)
	}
	
	def transform(SpecFile spec, ExampleGroup exampleGroup, JvmGenericType superClass, boolean isPrelinkingPhase) {
		exampleGroup.toClass(exampleGroup.toJavaClassName) [
				configureWith(exampleGroup, spec, superClass)

				if(isPrelinkingPhase){
					return
				}
				addAnnotations(exampleGroup)
				addFields(exampleGroup)
				
				var index = 0
				val List<JvmGenericType> subExamples = newArrayList()
				for (element : exampleGroup.members) {
					switch element {
						ExampleGroup: {
							subExamples += transform(spec, element, it, isPrelinkingPhase)
						}
						ExampleTable: {
							transform(element, spec)
						}
						Example : {
							val annotations = element.getTestAnnotations()
							annotations += element.toAnnotation(typeof(Named), element.describe)
							annotations += element.toAnnotation(typeof(Order), index)
							members += toMethod(element, annotations)
						}
						XtendFunction: {
							element.transform(it)
						}
						Before:{
							val annotationType = element.getBeforeAnnotation()
							members += element.toMethod(annotationType, element.beforeAll)
						}
						After:{
							val annotationType = element.getAfterAnnotation()
							members += element.toMethod(annotationType, element.afterAll)
						}
					}
					index = index + 1
				}
				
				if(!subExamples.empty){
					annotations += exampleGroup.toAnnotation(typeof(Contains), subExamples);
				}
				computeInferredReturnTypes()
			]
						
	}
	
	override protected transform(XtendField source, JvmGenericType container) {
		super.transform(source, container)
		if (source.isExtension()){
			val field = source.jvmElements.head as JvmField
			field.setVisibility(JvmVisibility::PUBLIC)
			field.annotations += source.toAnnotation(typeof(Extension))
		}
	}
	
	def toMethod(TestFunction element, Class<?> annotation, boolean isStatic){
		val result = toMethod(element, newArrayList(element.toAnnotation(annotation)))
		result.setStatic(isStatic)	
		return result
	}
	
	def toMethod(TestFunction element, List<JvmAnnotationReference> annotations){
		element.toMethod(element.toMethodName, getTypeForName(Void::TYPE, element)) [
			documentation = element.documentation
			body = element.body
			element.annotations.translateAnnotationsTo(it)
			exceptions += typeof(Exception).getTypeForName(element)
			it.annotations.addAll(annotations)
		]
	}
	
	def void configureWith(JvmGenericType type, EObject source, SpecFile spec){
		spec.eResource.contents += type
		type.packageName = spec.^package
		type.documentation = source.documentation
	}
	
	def void configureWith(JvmGenericType type, EObject source, SpecFile spec, JvmGenericType superType){
		configureWith(type, source, spec)
		if(superType != null){
			type.superTypes += superType.createTypeRef
		}
	}
	
	def void addFields(JvmGenericType type, ExampleGroup exampleGroup){
		for (field : exampleGroup.members.filter(typeof(XtendField))) {
			field.visibility = JvmVisibility::PROTECTED
			field.transform(type)
		}
		type.addImplicitSubject(exampleGroup)
	}
	
	def void addAnnotations(JvmGenericType type, ExampleGroup exampleGroup){
		type.annotations += exampleGroup.toAnnotation(runnerAnnotation.key, runnerAnnotation.value)
		type.annotations += exampleGroup.toAnnotation(typeof(Named), exampleGroup.describe)
		exampleGroup.annotations.translateAnnotationsTo(type)
	}
	
	def transform(JvmGenericType specType, ExampleTable element, SpecFile spec){
		element.toClass(element.toJavaClassName)[exampleTableType |
			exampleTableType.configureWith(element, spec)
			
			val type = getTypeForName(typeof(de.bmw.carit.jnario.lib.ExampleTable), element, exampleTableType.createTypeRef)
			specType.members += element.toMethod("_init" + element.toJavaClassName, getTypeForName(Void::TYPE, element))[
				annotations += element.toAnnotation(getBeforeAnnotation())
				setBody[ImportManager im |
					exampleTableType.generateInitializationMethod(element)	
				]
			]
			
			specType.members += element.toField(element.toFieldName, type)

			val constructor = element.toConstructor(exampleTableType.simpleName)[]
			exampleTableType.members += constructor
			val assignments = <String>newArrayList()
			
			element.columns.forEach[column |
				exampleTableType.members += column.toField				
				val jvmParam = typesFactory.createJvmFormalParameter();
				jvmParam.name = column.name
				jvmParam.setParameterType(cloneWithProxies(column.type));
				constructor.parameters += jvmParam
				associate(element, jvmParam); 
				assignments += "this." + column.name + " = " + column.name + ";" 
				
				exampleTableType.members += element.toMethod("get" + column.name.toFirstUpper, column.type)[
					setBody[ImportManager im |
						"return " + column.name + ";"
					]
				]
			]
			
			constructor.setBody[ImportManager im |
				Joiner::on(Strings::newLine).join(assignments)
			]
			
			exampleTableType.members += element.toMethod("toString", getTypeForName(typeof(String), element))[
				setBody[ImportManager im |
					'return "| " + ' + element.columns.map[name].join(' + " | " + ') + ' + "|";'
				]
			]
		]
	} 
	
	def generateInitializationMethod(JvmGenericType exampleTableType, ExampleTable exampleTable){
		val result = new StringBuilderBasedAppendable()
		for( row : exampleTable.rows){
			for(cell :row.cells){
				compiler.toJavaStatement(cell, result, true)
			}
		}
		result.append(exampleTable.toFieldName);
		result.append(" = ExampleTable.create(\"" + exampleTable.toFieldName + "\", ")
		result.increaseIndentation()
		result.append("\n")
		for(row : exampleTable.rows){
		 	result.append("new ").append(exampleTableType.simpleName).append("(")
		 	for(cell :row.cells){
		 		compiler.toJavaExpression(cell, result)
		 		if(row.cells.last != cell){
			 		result.append(", ")
		 		}
			}
	 		result.append(")")
			if(exampleTable.rows.last != row){
			 	result.append(",\n")
		 	}
		}
		result.decreaseIndentation()
		result.append("\n);")
		return result.toString
	}
	
}
