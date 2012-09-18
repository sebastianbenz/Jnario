package org.jnario.report

import org.jnario.Specification
import org.jnario.report.SpecExecution
import java.util.List
import com.google.inject.Inject

class Spec2ResultMapping implements SpecExecutionAcceptor{

	val List<SpecExecution> results = newLinkedList
	val IsMatchingSpec matcher

	@Inject	new(IsMatchingSpec matcher){
		this.matcher = matcher
	}

	def SpecExecution getResult(Specification specification){
		val result = results.filter[matcher.matches(specification, it)].head
		if(result == null){
			return SpecExecution::NO_EXECUTION
		}
		return result
	}

	override accept(SpecExecution result) {
		results += result
	}
	
} 