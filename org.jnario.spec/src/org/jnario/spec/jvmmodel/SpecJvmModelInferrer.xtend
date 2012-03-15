/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.jvmmodel

import com.google.common.base.Joiner
import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.core.xtend.XtendField
import org.eclipse.xtend.core.xtend.XtendFunction
import org.eclipse.xtext.common.types.JvmAnnotationReference
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.util.Strings
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.eclipse.xtext.xbase.lib.CollectionLiterals
import org.jnario.CollectionLiteral
import org.jnario.ExampleTable
import org.jnario.ListLiteral
import org.jnario.SetLiteral
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder
import org.jnario.jvmmodel.JnarioJvmModelInferrer
import org.jnario.jvmmodel.JunitAnnotationProvider
import org.jnario.lib.ExampleTableRow
import org.jnario.runner.Contains
import org.jnario.runner.Extension
import org.jnario.runner.Named
import org.jnario.runner.Order
import org.jnario.spec.naming.ExampleNameProvider
import org.jnario.spec.spec.After
import org.jnario.spec.spec.Before
import org.jnario.spec.spec.Example
import org.jnario.spec.spec.ExampleGroup
import org.jnario.spec.spec.SpecFile
import org.jnario.spec.spec.TestFunction

import static extension org.eclipse.xtext.util.Strings.*

/**
 * @author Sebastian Benz - Initial contribution and API
 */
class SpecJvmModelInferrer extends JnarioJvmModelInferrer {

	@Inject extension ExtendedJvmTypesBuilder
	
	@Inject extension TypeReferences

	@Inject extension ExampleNameProvider
	
	@Inject extension JunitAnnotationProvider annotationProvider
	
	@Inject extension ImplicitSubject 
	
	@Inject extension IJvmModelAssociations 
	
	override infer(EObject e, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
		if(!checkClassPath(e, annotationProvider)){
			return
		}
		if (!(e instanceof SpecFile)){
			return
		}
		val specFile = e as SpecFile
		
		if(specFile.xtendClass == null){
			return
		}
		//addListLiterals(e)
		transform(specFile as SpecFile, specFile.xtendClass as ExampleGroup, null, preIndexingPhase)
	}
	
	def addListLiterals(EObject context){
		val literals = context.eAllContents.filter(typeof(CollectionLiteral))
		literals.forEach[setFeature]
	}
	
	def dispatch setFeature(SetLiteral literal){
		literal.setFeature("newHashSet")
	} 
	
	def dispatch setFeature(ListLiteral literal){
		literal.setFeature("newArrayList")
	}
	
	def setFeature(CollectionLiteral literal, String name){
		val collections = getTypeForName(typeof(CollectionLiterals), literal).type as JvmGenericType
		val operations = collections.members.filter(typeof(JvmOperation))
		literal.feature = operations.findFirst[simpleName == name]
	}
	
	def transform(SpecFile spec, ExampleGroup exampleGroup, JvmGenericType superClass, boolean isPrelinkingPhase) {
		exampleGroup.toClass(exampleGroup.toJavaClassName) [
				configureWith(exampleGroup, spec, superClass)

				if(isPrelinkingPhase){
					return
				}
				
				addAnnotations(exampleGroup)
				addFields(exampleGroup)
				exampleGroup.addDefaultConstructor(it);
								
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
							val annotations = element.getTestAnnotations(element.exception, element.pending)
							annotations += element.toAnnotation(typeof(Named), element.describe)
							annotations += element.toAnnotation(typeof(Order), index)
							members += toMethod(element, annotations)
						}
						XtendFunction: {
							element.transform(it)
						}
						Before:{
							val annotationType = getBeforeAnnotation(element.beforeAll)
							members += element.toMethod(annotationType, element.beforeAll)
						}
						After:{
							val annotationType = getAfterAnnotation(element.afterAll)
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
	
	def toMethod(TestFunction element, JvmAnnotationReference annotation, boolean isStatic){
		val result = toMethod(element, newArrayList(annotation))
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
		type.annotations += exampleGroup.exampleGroupRunnerAnnotation
		type.annotations += exampleGroup.toAnnotation(typeof(Named), exampleGroup.describe)
		exampleGroup.annotations.translateAnnotationsTo(type)
	}
	
	def transform(JvmGenericType specType, ExampleTable table, SpecFile spec){
		associateTableWithSpec(specType, table)
		// it is important to not create the class for the table as otherwise the cells cannot resolve members of the spec file
		spec.toClass(table.toJavaClassName)[exampleTableType |
			exampleTableType.superTypes += getTypeForName(typeof(ExampleTableRow), table)
			exampleTableType.configureWith(table, spec)
			
			val type = getTypeForName(typeof(org.jnario.lib.ExampleTable), table, exampleTableType.createTypeRef)
			specType.members += table.toMethod("_init" + table.toJavaClassName, getTypeForName(Void::TYPE, table))[
				annotations += table.getBeforeAnnotation()
				setBody[ITreeAppendable a |
					exampleTableType.generateInitializationMethod(table, a)	
				]
			]
			
			specType.members += table.toField(table.toFieldName, type)[
				visibility = JvmVisibility::PROTECTED
			]

			val constructor = table.toConstructor[simpleName=exampleTableType.simpleName]
			exampleTableType.members += constructor
			val assignments = <String>newArrayList()
			
			val stringType = getTypeForName(typeof(String), table)
			val listType = getTypeForName(typeof(List), table, stringType)
			
			val cellNames = typesFactory.createJvmFormalParameter();
			cellNames.name = "cellNames"
			cellNames.setParameterType(listType);
			constructor.parameters += cellNames
			assignments += "super(cellNames);"
			
			table.columns.forEach[column |
				exampleTableType.members += column.toField
				val jvmParam = typesFactory.createJvmFormalParameter();
				jvmParam.name = column.name
				jvmParam.setParameterType(cloneWithProxies(column.type));
				constructor.parameters += jvmParam
				associate(table, jvmParam); 
				assignments += "this." + column.name + " = " + column.name + ";" 
				
				exampleTableType.members += table.toMethod("get" + column.name.toFirstUpper, column.type)[
					setBody[ITreeAppendable a |
						a.append("return " + column.name + ";")
					]
				]
			]
			
			constructor.setBody[ITreeAppendable a |
				a.append(Joiner::on(Strings::newLine).join(assignments))
			]

			exampleTableType.members += table.toMethod("getCells", listType)[
				setBody[ITreeAppendable a |
					a.append('return java.util.Arrays.asList(String.valueOf(' + table.columnNames.join(') , String.valueOf(') + '));')
				]
			]
		]
	} 
	
	def associateTableWithSpec(JvmGenericType type, ExampleTable table){
		for(row : table.rows){
			associate(row, type)
		}
	}
	
	def generateInitializationMethod(JvmGenericType exampleTableType, ExampleTable exampleTable, ITreeAppendable appendable){
		for( row : exampleTable.rows){
			for(cell :row.cells){
				compiler.toJavaStatement(cell, appendable, true)
			}
		}
		appendable.append(exampleTable.toFieldName)
		appendable.append(" = ExampleTable.create(\"" + exampleTable.toFieldName + "\", \n")
		appendable.append('  java.util.Arrays.asList("' + exampleTable.columnNames.join('", "') + '"), ')
		appendable.increaseIndentation()
		appendable.append("\n")
		for(row : exampleTable.rows){
		 	appendable.append("new ").append(exampleTableType.simpleName).append("(")
		 	appendable.append('  java.util.Arrays.asList("' + row.cells.map[serialize.trim.convertToJavaString].join('", "') + '"), ')
		 	for(cell :row.cells){
		 		compiler.toJavaExpression(cell, appendable)
		 		if(row.cells.last != cell){
			 		appendable.append(", ")
		 		}
			}
	 		appendable.append(")")
			if(exampleTable.rows.last != row){
			 	appendable.append(",\n")
		 	}
		}
		appendable.decreaseIndentation()
		appendable.append("\n);")
	}

	def columnNames(ExampleTable exampleTable){
		exampleTable.columns.map[it?.name]
	}
}
