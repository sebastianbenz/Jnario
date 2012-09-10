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

import static extension com.google.common.base.Strings.*

class SpecResolver {
	
	@Inject extension IScopeProvider scopeProvider
	@Inject extension IQualifiedNameConverter 
	@Inject extension SuiteClassNameProvider
	
	def dispatch List<Specification> resolveSpecs(Suite suite){
		suite.elements.map[resolveSpecs].flatten.filter[it != null].sort
	}
	
	def dispatch List<Specification> resolveSpecs(SpecReference specRef){
		singletonList(specRef.spec)
	}
	
	def dispatch List<Specification> resolveSpecs(PatternReference specRef){
		if(specRef.pattern.isNullOrEmpty) return emptyList
		val scope = getScope(specRef, SPEC_REFERENCE__SPEC)
		val pattern = Pattern::compile(specRef.pattern)
		val allElements = scope.allElements.filter[
			pattern.matcher(toString(it.qualifiedName)).matches
		]
		val specs = allElements.map[resolve(EObjectOrProxy, specRef)].filter(typeof(Specification)).filter[
			it.eResource.URI != specRef.eResource.URI
		]
		specs.toMap[qualifiedClassName].values.sort
	}
	
	def private sort(Iterable<Specification> specs){
		specs.sort[left, right|
			left.describe?.compareToIgnoreCase(right?.describe)
		]
	}
	
}