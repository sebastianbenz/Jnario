package org.jnario.report

import com.google.inject.Inject
import java.util.List
import org.jnario.Executable

class Spec2ResultMapping implements SpecExecutionAcceptor{

	val List<SpecExecution> results = newLinkedList
	val Executable2ResultMatcher matcher

	@Inject	new(Executable2ResultMatcher matcher){
		this.matcher = matcher
	}

	def SpecExecution getResult(Executable executable){
		val result = results.filter[matcher.matches(executable, it)].head
		if(result == null){
			return SpecExecution::NO_EXECUTION
		}
		return result
	}

	override accept(SpecExecution result) {
		results += result
	}
	
} 