/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.jvmmodel

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder
import org.jnario.jvmmodel.JnarioJvmModelInferrer
import org.jnario.runner.Named
import org.jnario.suite.suite.Suite
import org.jnario.suite.suite.SuiteFile
import org.eclipse.xtext.common.types.JvmGenericTypeimport org.eclipse.xtext.linking.impl.ImportedNamesAdapter
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.xtype.XtypeFactory
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xtype.XComputedTypeReference
import java.util.List

class SuiteJvmModelInferrer extends JnarioJvmModelInferrer {

	@Inject extension ExtendedJvmTypesBuilder
	@Inject extension SuiteClassNameProvider
	@Inject extension SpecResolver
	@Inject extension TypeReferences
	@Inject extension SuiteNodeBuilder
	
	@Inject(optional = true)
	private XtypeFactory xtypesFactory = XtypeFactory.eINSTANCE;
	
	override doInfer(EObject e, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
		if (!(e instanceof SuiteFile)){
			return
		}
		val suiteFile = e as SuiteFile
		val nodes = suiteFile.buildNodeModel
		val doLater = <Runnable>newArrayList
		nodes.forEach[
			infer(it, acceptor, doLater, preIndexingPhase)
		]
		if(preIndexingPhase) return;
		doLater.forEach[run]
	}

   	def JvmGenericType infer(SuiteNode node, IJvmDeclaredTypeAcceptor acceptor, List<Runnable> doLater, boolean preIndexingPhase) {
   		val suite = node.suite
   		val suiteClass = suite.toClass(suite.toQualifiedJavaClassName)
   		if(suiteClass == null) return null;
   		acceptor.accept(suiteClass)
        val subSuites = node.children.map[infer(acceptor, doLater, preIndexingPhase) ].filterNull.toSet
   		if (!preIndexingPhase) {
 	 		val subSuiteReferences = subSuites.map[createTypeRef as JvmTypeReference]
	   		doLater.add([|
				suiteClass.annotations += suite.toAnnotation(typeof(Named), suite.describe)
				val children = suite.children + subSuiteReferences
				if(!children.empty){
					testRuntime.addChildren(suite, suiteClass, children.toSet)
				}
   				suite.initialize(suiteClass)
   				testRuntime.updateSuite(suite, suiteClass)
   			])
   		}
   		suiteClass
   	}

   	def Iterable<JvmTypeReference> children(Suite suite){ 
   		val specs = suite.resolveSpecs.filter[it.toJavaClassName != null]
   		val types = specs.map[it.toQualifiedJavaClassName]
//		println("Resolved specs: " + types)

   		types.map[inferredType(suite)]
   	}
   	
   	def JvmTypeReference inferredType(String name, EObject context) {
		val result = xtypesFactory.createXComputedTypeReference();
		result.setTypeProvider([
			getTypeForName(name, context)
		]);
		return result;
	}
}

