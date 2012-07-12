/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.test.util

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.IScopeProvider
import static extension org.jnario.lib.JnarioIterableExtensions.*
import static org.jnario.jnario.test.util.Resources.*

class ScopeTestExtension implements Iterable{
	
	@Inject ModelStore store 
	@Inject extension IScopeProvider 
	
	def parseSpec(CharSequence content){
		store.parseSpec(content)
	}
	
	def parseSuite(CharSequence content){
		store.parseSuite(content)
	}
	
	def scope(EObject context, EReference ref){
		addContainerStateAdapter(store.resourceSet)
		scope(getScope(context, ref))
	}
	
	def scope(IScope scope){
		scope.allElements.map[toString].toSet
	}
	
	override iterator() {
		store.iterator
	}

	def EObject first(Class<? extends EObject> type){
		return first(this, type);
	}
	
	def EObject second(Class<? extends EObject> type){
		return second(this, type);
	}
}