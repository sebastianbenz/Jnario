/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.jvmmodel

import com.google.inject.Inject
import java.util.List
import java.util.regex.Pattern
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.scoping.IScopeProvider
import org.jnario.Specification
import org.jnario.suite.suite.PatternReference
import org.jnario.suite.suite.SpecReference
import org.jnario.suite.suite.Suite

import static java.util.Collections.*
import static org.eclipse.emf.ecore.util.EcoreUtil.*
import static org.jnario.suite.suite.SuitePackage$Literals.*

import static extension com.google.common.base.Strings.*import org.jnario.JnarioPackage

class SpecResolver {
	
	@Inject extension IScopeProvider scopeProvider
	@Inject extension IQualifiedNameConverter 
	@Inject extension SuiteClassNameProvider
	
	def dispatch List<Specification> resolveSpecs(Suite suite){
		suite.elements.map[resolveSpecs].flatten.sort
	}
	
	def dispatch List<Specification> resolveSpecs(SpecReference specRef){
		singletonList(specRef.spec)
	}
	
	def dispatch List<Specification> resolveSpecs(PatternReference specRef){
		if(specRef.pattern.isNullOrEmpty) return emptyList
		val scope = getScope(specRef, SPEC_REFERENCE__SPEC)
		var specs = scope.allElements.filter[
			JnarioPackage$Literals.SPECIFICATION.isSuperTypeOf(EClass)
		]
		val pattern = Pattern::compile(specRef.pattern)
		specs = specs.filter[
			pattern.matcher(toString(it.qualifiedName)).matches
		]
		val suiteResource = specRef.eResource
		val resolvedSpecs = specs.map[resolve(EObjectOrProxy, specRef)]
								 .filter(Specification)
								 .filterNull
		val withoutSuites = resolvedSpecs.filter[eResource != suiteResource]
		val classNames    = withoutSuites.toMap[toQualifiedJavaClassName]
		classNames.values.sort
	}
	
	def private sort(Iterable<Specification> specs){
		specs.filter[it != null].sort[left, right|
			val leftName = left.describe
			val rightName = right.describe
			if(leftName == null || rightName == null){
				return 0
			}
			leftName.compareToIgnoreCase(rightName)
		]
	}
	
}