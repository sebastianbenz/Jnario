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
import java.util.Arrays
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.core.jvmmodel.SyntheticNameClashResolver
import org.eclipse.xtend.core.xtend.XtendClass
import org.eclipse.xtend.core.xtend.XtendConstructor
import org.eclipse.xtend.core.xtend.XtendField
import org.eclipse.xtend.core.xtend.XtendFile
import org.eclipse.xtend.core.xtend.XtendFunction
import org.eclipse.xtend.core.xtend.XtendMember
import org.eclipse.xtext.common.types.JvmAnnotationType
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.util.Strings
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XbaseFactory
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.eclipse.xtext.xbase.lib.Procedures$Procedure2
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
import org.jnario.spec.spec.TestFunction

import static extension org.eclipse.xtext.util.Strings.*
import org.jnario.ExampleCellimport org.eclipse.xtext.xbase.XNullLiteral
import org.eclipse.xtend.core.jvmmodel.XtendJvmModelInferrer
import org.eclipse.xtend.core.xtend.AnonymousClass

/**
 * @author Sebastian Benz - Initial contribution and API
 */
class SpecJvmModelInferrer extends JnarioJvmModelInferrer {
	var exampleIndex = 0
	
	@Inject extension ExtendedJvmTypesBuilder
	
	@Inject extension TypeReferences

	@Inject extension ExampleNameProvider
	
	@Inject extension ImplicitSubject 
	
	@Inject extension SyntheticNameClashResolver
	
	@Inject TypesFactory typesFactory
	
	@Inject extension IJvmModelAssociations
	
	@Inject SpecIgnoringXtendJvmModelInferrer xtendJvmModelInferrer
	
	var index = 0
	
	override doInfer(EObject object, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
		if (!(object instanceof XtendFile))
			return;
		val xtendFile = object as XtendFile
		xtendJvmModelInferrer.infer(object, acceptor, preIndexingPhase)
		val doLater = <Runnable>newArrayList()
		for (declaration: xtendFile.getXtendTypes().filter(typeof(ExampleGroup))) {
			acceptor.infer(declaration, null, doLater, preIndexingPhase)
		}
		exampleIndex = 0
		if (!preIndexingPhase) {
			for (Runnable runnable : doLater) {
				runnable.run();
			}
		}
	}
	
	def JvmGenericType infer(IJvmDeclaredTypeAcceptor acceptor, ExampleGroup exampleGroup, JvmGenericType superType, List<Runnable> doLater, boolean preIndexingPhase){
		if(superType != null){
			exampleGroup.^extends = superType.createTypeRef
		}else{
			exampleGroup.addSuperClass
		}
		val javaType = typesFactory.createJvmGenericType();
		setNameAndAssociate(exampleGroup.xtendFile, exampleGroup, javaType);
		acceptor.accept(javaType);
		if (!preIndexingPhase) {
			doLater.add([|initialize(exampleGroup, javaType)]);
		}
		val children = <JvmGenericType>newArrayList
		exampleGroup.members.filter(typeof(ExampleGroup)).forEach[child |
			children += infer(acceptor, child, javaType, doLater, preIndexingPhase) 
		]
		if(!children.empty){
			testRuntime.addChildren(exampleGroup, javaType, children.map[createTypeRef])
		}
		return javaType
	}

	
	override initialize(XtendClass source, JvmGenericType inferredJvmType) {
		inferredJvmType.setVisibility(JvmVisibility::PUBLIC);
		translateAnnotationsTo(source.getAnnotations(), inferredJvmType);
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
		fixTypeParameters(inferredJvmType);
		exampleIndex = 0
		for (member : source.getMembers()) {
			transformExamples(member, inferredJvmType);
		}
		inferredJvmType.addImplicitSubject(source as ExampleGroup)
		appendSyntheticDispatchMethods(source, inferredJvmType);
		copyDocumentationTo(source, inferredJvmType);
		
		resolveNameClashes(inferredJvmType);
	}
	 
	
	
	override protected transform(XtendMember sourceMember, JvmGenericType container, boolean allowDispatch) {
	  if(sourceMember.eContainer instanceof AnonymousClass){
	    super.transform(sourceMember, container, allowDispatch)
	  }else{
		  // we use transformExamples instead
	  }
	}
	
	def void transformExamples(XtendMember sourceMember, JvmGenericType container) {
		switch sourceMember {
			Example: transform(sourceMember as Example, container)
			Before : transform(sourceMember as Before, container)
			After: transform(sourceMember as After, container)
			ExampleTable: transform(sourceMember as ExampleTable, container)
			XtendFunction case sourceMember.name != null: transform(sourceMember as XtendFunction, container, false)
			XtendField: transform(sourceMember as XtendField, container)
			XtendConstructor: transform(sourceMember as XtendConstructor, container)
		}
	}
	
	def transform(Example element, JvmGenericType container) {
		exampleIndex = exampleIndex + 1
		if(element.expression == null){
			element.expression = XbaseFactory::eINSTANCE.createXBlockExpression
		}
		val method = toMethod(element, container)
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
		val afterMethod = element.toMethod(container)
		if(element.isStatic){
//			container.members += element.addIsExecutedField
			aroundAll.apply(element as XtendMember, afterMethod)
		}else{
			around.apply(element, afterMethod)
		}
	    container.members += afterMethod
	}
	
//	def addIsExecutedField(TestFunction element){
//		element.toField("_" + element.toMethodName + "IsExecuted", getTypeForName(typeof(Boolean), element))[
//			setInitializer[
//				append(" false")
//			]
//			^static = true
//		]
//	}
	
	def toMethod(TestFunction element, JvmGenericType container){
		element.setReturnType(getTypeForName(Void::TYPE, element))
		super.transform(element, container, true)
		val result = element.jvmElements.head as JvmOperation
		result.simpleName = element.toMethodName
		result.exceptions += typeof(Exception).getTypeForName(element)
		result
	}
	
	def void configureWith(JvmGenericType type, EObject source, XtendFile spec){
		spec.eResource.contents += type
		type.packageName = spec.^package
		type.documentation = source.documentation
	}
	 
	def transform(ExampleTable table, JvmGenericType specType){
		associateTableWithSpec(specType, table)
		table.xtendFile.toClass(table.toJavaClassName)[exampleTableType |
			exampleTableType.superTypes += getTypeForName(typeof(ExampleTableRow), table)
			exampleTableType.configureWith(table, table.xtendFile)
			
			val type = getTypeForName(typeof(org.jnario.lib.ExampleTable), table, exampleTableType.createTypeRef)
			
			val initMethodName = "_init" + table.toJavaClassName
			
			specType.members += table.toMethod(initMethodName, type)[
				setBody[ITreeAppendable a |
					declaringType = specType
					generateInitializationMethod(table, a)	
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
			
			index = 0
			table.columns.forEach[column | 
				val columnType = if(column.type != null) column.type else inferredType
				
				exampleTableType.members += column.toField(column.name, columnType.cloneWithProxies)
				
				val param = column.toParameter(column.name, columnType.cloneWithProxies)
				constructor.parameters += param
				
				val getter = column.toGetter(column.name, columnType.cloneWithProxies)
				exampleTableType.members += getter
			
				assignments += "this." + column.name + " = " + column.name + ";" 
			]
			
			table.rows.forEach[
				cells.forEach[
					generateCellInitializerMethod(specType, table.initMethodName(index), it)
					index = index + 1
				]
			]
			 
			constructor.setBody[ITreeAppendable a |
				assignments.forEach[a.append(it).newLine]
			]
			
		]
	} 
	
	def void generateInitializationMethod(ExampleTable exampleTable, ITreeAppendable appendable){
		val arraysType = getTypeForName(typeof(Arrays), exampleTable).type
		appendable.append("return ExampleTable.create(\"" + exampleTable.toFieldName + "\", \n")
		appendable.append('  ').append(arraysType).append('.asList("').append(exampleTable.columnNames.join('", "') + '"), ')
		appendable.increaseIndentation()
		appendable.append("\n")
		index = 0
		for(row : exampleTable.rows){
		 	appendable.append("new ").append(exampleTable.toJavaClassName).append("(")
		 	appendable.append('  ').append(arraysType).append('.asList("' + row.cells.map[serialize.trim.convertToJavaString].join('", "') + '"), ')
		 	for(cell :row.cells){
		 		if(cell.expression instanceof XNullLiteral){
		 			appendable.append("null")
		 		}else{
			 		appendable.append(exampleTable.initMethodName(index) + "()")
		 		}
		 		index = index + 1
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
	
	def associateTableWithSpec(JvmGenericType type, ExampleTable table){
		for(row : table.rows){
			associate(row, type)
		}
	}
	
	def initMethodName(ExampleTable exampleTable, int i){
		"_init" + exampleTable.toJavaClassName + "Cell" + i 
	}
	
	def generateCellInitializerMethod(JvmGenericType specType, String name, ExampleCell cell){
		specType.members += cell.toMethod(name, inferredType)[
			declaringType = specType
			setBody(cell.expression)
		] 
	}

	def columnNames(ExampleTable exampleTable){
		exampleTable.columns.map[it?.name]
	}
	
}
