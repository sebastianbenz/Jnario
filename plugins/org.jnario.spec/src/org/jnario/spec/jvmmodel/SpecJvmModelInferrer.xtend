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
import org.eclipse.xtend.core.jvmmodel.SyntheticNameClashResolver
import org.eclipse.xtend.core.xtend.XtendClass
import org.eclipse.xtend.core.xtend.XtendConstructor
import org.eclipse.xtend.core.xtend.XtendField
import org.eclipse.xtend.core.xtend.XtendFunction
import org.eclipse.xtend.core.xtend.XtendMember
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.common.types.JvmAnnotationType
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.util.Strings
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator
import org.jnario.ExampleTable
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder
import org.jnario.jvmmodel.JnarioJvmModelInferrer
import org.jnario.lib.ExampleTableRow
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
import org.eclipse.xtext.xbase.lib.Procedures$Procedure2
import org.eclipse.xtext.common.types.JvmOperation
 
/**
 * @author Sebastian Benz - Initial contribution and API
 */
class SpecJvmModelInferrer extends JnarioJvmModelInferrer {
	var exampleIndex = 0
	
	@Inject extension ExtendedJvmTypesBuilder
	
	@Inject extension TypeReferences

	@Inject extension ExampleNameProvider
	
	@Inject extension ImplicitSubject 
	
	@Inject extension IJvmModelAssociator 
	
	@Inject extension SyntheticNameClashResolver
	
	override doInfer(EObject e, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
		if (!(e instanceof SpecFile)){
			return
		}
		val specFile = e as SpecFile
		
		specFile.xtendClasses.filter(typeof(ExampleGroup)).forEach[
			infer(acceptor, it, null)
		]
		exampleIndex = 0
	}
	
	def infer(IJvmDeclaredTypeAcceptor acceptor, ExampleGroup exampleGroup, JvmGenericType superType){
		if(superType != null){
			exampleGroup.^extends = superType.createTypeRef
		}else{
			exampleGroup.addSuperClass
		}
		val inferredJvmType = exampleGroup.toClass(exampleGroup.toJavaClassName)[
			packageName = exampleGroup.packageName
		]
		register(acceptor, exampleGroup, inferredJvmType)
		val children = <JvmGenericType>newArrayList
		exampleGroup.members.filter(typeof(ExampleGroup)).forEach[child | 
			children += acceptor.infer(child, inferredJvmType)
		]
		if(!children.empty){
			testRuntime.addChildren(exampleGroup, inferredJvmType, children)
		}
		return inferredJvmType
	}

	
	override initialize(XtendClass source, JvmGenericType inferredJvmType) {
		inferredJvmType.setVisibility(JvmVisibility::PUBLIC);
		val annotation = findDeclaredType(typeof(SuppressWarnings), source) as JvmAnnotationType
		if (annotation != null) {
			val suppressWarnings = typesFactory.createJvmAnnotationReference();
			suppressWarnings.setAnnotation(annotation);
			val annotationValue = typesFactory.createJvmStringAnnotationValue();
			annotationValue.getValues() += "all"
			suppressWarnings.getValues().add(annotationValue);
			inferredJvmType.getAnnotations().add(suppressWarnings);
		}
		inferredJvmType.annotations += source.toAnnotation(typeof(Named), source.describe)
		addDefaultConstructor(source, inferredJvmType);
		if (source.getExtends() == null) {
			val typeRefToObject = getTypeForName(typeof(Object), source);
			if (typeRefToObject != null)
				inferredJvmType.getSuperTypes().add(typeRefToObject);
		} else {
			inferredJvmType.getSuperTypes().add(cloneWithProxies(source.getExtends()));
		}
		testRuntime.updateExampleGroup(source, inferredJvmType)
		for (intf : source.getImplements()) {
			inferredJvmType.getSuperTypes().add(cloneWithProxies(intf));
		}
		copyAndFixTypeParameters(source.getTypeParameters(), inferredJvmType);
		
		val functions = <XtendFunction>newArrayList()
		for (member : source.getMembers()) {
			if (member instanceof XtendField
					|| member instanceof XtendConstructor
					|| member instanceof ExampleGroup
					|| member instanceof TestFunction
					|| member instanceof ExampleTable) {
				transformExamples(member, inferredJvmType);
			}else if(member instanceof XtendFunction && (member as XtendFunction).getName() != null){
				functions += member as XtendFunction
			}
			
		}
		// we have to add the implicit subject before the XtendFunctions are transformed
		inferredJvmType.addImplicitSubject(source as ExampleGroup)
		for (function : functions) {
			transform(function, inferredJvmType);
		}
		appendSyntheticDispatchMethods(source, inferredJvmType);
		computeInferredReturnTypes(inferredJvmType);
		translateAnnotationsTo(source.getAnnotations(), inferredJvmType);
		setDocumentation(inferredJvmType, getDocumentation(source));
		resolveNameClashes(inferredJvmType);
	}
	 
	
	def register(IJvmDeclaredTypeAcceptor acceptor, XtendClass source, JvmGenericType inferredJvmType){
   		associatePrimary(source, inferredJvmType); 
		acceptor.accept(inferredJvmType).initializeLater[initialize(source, inferredJvmType)] 
   	}
   	
   	override transform(XtendMember sourceMember, JvmGenericType container) {
   		// we use transformExamples instead
   	}
   	
   	def void transformExamples(XtendMember sourceMember, JvmGenericType container) {
   		switch sourceMember {
   			Example: transform(sourceMember as Example, container)
   			Before : transform(sourceMember as Before, container)
   			After: transform(sourceMember as After, container)
   			ExampleTable: transform(sourceMember as ExampleTable, container)
   			XtendFunction: transform(sourceMember as XtendFunction, container)
   			XtendField: transform(sourceMember as XtendField, container)
   			XtendConstructor: transform(sourceMember as XtendConstructor, container)
   		}
	}
	
	def transform(Example element, JvmGenericType container) {
		exampleIndex = exampleIndex + 1
		val method = toMethod(element)
		testRuntime.markAsTestMethod(element, method)
		if(element.pending){
			testRuntime.markAsPending(element, method) 
		}
		method.annotations += element.toAnnotation(typeof(Named), element.describe)
		method.annotations += element.toAnnotation(typeof(Order), exampleIndex)
		container.members += method
	}
	
	def transform(Before element, JvmGenericType container) {
		transformAround(element, container, 
			[e, m | testRuntime.beforeMethod(e, m)], 
			[e, m | testRuntime.beforeAllMethod(e, m)]
		)
	}
	
	def transform(After element, JvmGenericType container) {
		transformAround(element, container, 
			[e, m | testRuntime.afterMethod(e, m)], 
			[e, m | testRuntime.afterAllMethod(e, m)]
		)
	}
	
	def transformAround(TestFunction element, JvmGenericType container, 
		Procedure2<XtendMember, JvmOperation> around, Procedure2<XtendMember, JvmOperation> aroundAll){
		val afterMethod = element.toMethod
		if(element.isStatic){
			container.members += element.addIsExecutedField
			aroundAll.apply(element as XtendMember, afterMethod)
		}else{
			around.apply(element, afterMethod)
		}
	    container.members += afterMethod
	}
	
	def addIsExecutedField(TestFunction element){
		element.toField("_" + element.toMethodName + "IsExecuted", getTypeForName(typeof(Boolean), element))[
			setInitializer[
				append(" false")
			]
			^static = true
		]
	}
	
	def toMethod(TestFunction element){
		element.toMethod(element.toMethodName, getTypeForName(Void::TYPE, element)) [
			documentation = element.documentation
			body = element.expression
			element.annotations.translateAnnotationsTo(it)
			exceptions += typeof(Exception).getTypeForName(element)
			associatePrimary(element, it);
			^static = element.^static
		]
	}
	
	def void configureWith(JvmGenericType type, EObject source, SpecFile spec){
		spec.eResource.contents += type
		type.packageName = spec.^package
		type.documentation = source.documentation
	}

	 
	def transform(ExampleTable table, JvmGenericType specType){
		associateTableWithSpec(specType, table)
		// it is important to not create the class for the table as otherwise the cells cannot resolve members of the spec file
		val spec = table.specFile
		spec.toClass(table.toJavaClassName)[exampleTableType |
			exampleTableType.superTypes += getTypeForName(typeof(ExampleTableRow), table)
			exampleTableType.configureWith(table, spec)
			
			val type = getTypeForName(typeof(org.jnario.lib.ExampleTable), table, exampleTableType.createTypeRef)
			
			val initMethodName = "_init" + table.toJavaClassName
			
			specType.members += table.toMethod(initMethodName, type)[
				setBody[ITreeAppendable a |
					exampleTableType.generateInitializationMethod(table, a)	
				]
			]
			
			specType.members += table.toField(table.toFieldName, type)[
				visibility = JvmVisibility::PROTECTED
				setInitializer[
					append(initMethodName).append("()")
				]
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
				jvmParam.setParameterType(cloneWithProxies(column.getOrCreateType));
				constructor.parameters += jvmParam
				associate(table, jvmParam); 
				assignments += "this." + column.name + " = " + column.name + ";" 
				
				exampleTableType.members += table.toMethod("get" + column.name.toFirstUpper, column.getOrCreateType)[
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
					a.append('return java.util.Arrays.asList(toString(' + table.columnNames.join(') ,toString(') + '));')
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
		appendable.append("return ExampleTable.create(\"" + exampleTable.toFieldName + "\", \n")
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
	
	def specFile(EObject context){
		EcoreUtil2::getContainerOfType(context, typeof(SpecFile))
	}
}
