package org.jnario.suite.jvmmodel

import org.jnario.suite.suite.SuiteElement
import org.jnario.suite.suite.Suite
import com.google.inject.Inject
import org.jnario.suite.suite.SuiteFile
import java.util.List
import org.jnario.util.Strings
import org.jnario.suite.conversion.SuiteValueConverter
import org.jnario.Specification

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
		val suites = suiteFile.xtendClasses.filter(typeof(Suite)).toList
		val result = <SuiteNode>newArrayList
		if(suites.empty) return result
		val mapping = <SuiteElement, SuiteNode>newHashMap
		for(i : 0..suites.size-1){
			val current = suites.get(i)
			val specs = current.elements.map[resolveSpecs].flatten
			val currentNode = new SuiteNode(current, specs)
			val parent = mapping.get(suites.parent(i))
			currentNode.parent = parent
			mapping.put(current, currentNode)
			if(parent == null){
				result += currentNode
			}
		}	
		result
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
		for (i : 0..name.length){
			if(name.charAt(i) != PREFIX){
				return i
			}
		}
		return -1
	}
	
}