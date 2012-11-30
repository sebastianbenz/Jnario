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
import org.eclipse.xtext.common.types.JvmGenericType

class SuiteJvmModelInferrer extends JnarioJvmModelInferrer {

	@Inject extension ExtendedJvmTypesBuilder
	@Inject extension SuiteClassNameProvider
	@Inject extension SpecResolver
	@Inject extension TypeReferences types
	@Inject extension SuiteNodeBuilder
	
	override doInfer(EObject e, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
		if (!(e instanceof SuiteFile)){
			return
		}
		val suiteFile = e as SuiteFile
		val nodes = suiteFile.buildNodeModel
		nodes.forEach[
			infer(it, acceptor)
		]
	}

   	def infer(SuiteNode node, IJvmDeclaredTypeAcceptor acceptor) {
   		val suite = node.suite
   		val suiteClass = suite.toClass(suite.toQualifiedJavaClassName)
		val subSuites = node.children.map[infer(acceptor)].toSet
   		acceptor.accept(suiteClass).initializeLater([
				it.annotations += suite.toAnnotation(typeof(Named), suite.describe)
				val children = suite.children + subSuites
				if(!children.empty){
					testRuntime.addChildren(suite, it, children.filter(typeof(JvmGenericType)).toSet)
				}
   				suite.initialize(it)
   				testRuntime.updateSuite(suite, it)
   			])
   		suiteClass
   	}

   	def Iterable<JvmType> children(Suite suite){ 
   		val specs = suite.resolveSpecs.filter[it.toJavaClassName != null]
   		val types = specs.map[it.toQualifiedJavaClassName]
   		types.map[getTypeForName(it, suite)?.type] 
   	}
}

