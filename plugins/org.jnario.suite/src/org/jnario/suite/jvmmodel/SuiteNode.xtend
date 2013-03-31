/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.jvmmodel

import org.jnario.suite.suite.Suite
import com.google.inject.Inject
import org.jnario.suite.suite.SuiteFile
import java.util.List
import org.jnario.Specification
import org.eclipse.emf.ecore.EObject

@Data class SuiteNode {
	Suite suite
	List<SuiteNode> children = newArrayList
	Iterable<Specification> specs
	
	def void setParent(SuiteNode parent){
		if(parent == null) return;
		parent.children += this
	}
} 

class SuiteNodeBuilder{
	
	static val char PREFIX = "#".charAt(0)
	 
	@Inject extension SpecResolver
	
	def Iterable<SuiteNode> buildNodeModel(SuiteFile suiteFile){
		val suites = suiteFile.xtendTypes.filter(typeof(Suite)).toList
		val result = <SuiteNode>newArrayList
		if(suites.empty) return result
		val mapping = <EObject, SuiteNode>newHashMap
		for(i : 0..suites.size-1){
			val current = suites.get(i)
			val parentNode = mapping.get(suites.parent(i))
			val currentNode = createNode(current, parentNode)
			mapping.put(current, currentNode)
			if(parentNode == null){
				result += currentNode
			}
		}	
		result
	}
	
	def createNode(Suite current, SuiteNode parent){
		val specs = current.elements.map[resolveSpecs].flatten
		val node =  new SuiteNode(current, specs)
		node.parent = parent
		return node
	}
	
	def parent(List<Suite> suites, int i){
		if(i == 0) return null
		val current = suites.get(i).level
		for(j : i-1..0){
			val candidate = suites.get(j)
			if(current > candidate.level){
				return candidate
			}
		}
		return null
	}
	
	def level(Suite suite){
		val name = suite.name
		var i = 0
		while (i < name.length){
			if(name.charAt(i) != PREFIX){
				return i
			}
			i = i + 1
		}
		return i
	}
	
}