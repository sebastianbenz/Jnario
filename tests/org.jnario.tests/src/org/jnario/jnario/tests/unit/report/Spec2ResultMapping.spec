package org.jnario.jnario.tests.unit.report

import org.jnario.Specification
import org.jnario.report.Executable2ResultMatcher
import org.jnario.report.Spec2ResultMapping
import org.jnario.report.SpecExecution

import static org.jnario.report.SpecExecution.*
import static org.mockito.Mockito.*

import static extension org.jnario.lib.Should.*

describe Spec2ResultMapping {

	val isSpecPredicate = mock(typeof(Executable2ResultMatcher))
	val matchingResult = mock(typeof(SpecExecution))
	val notMatchingResult = mock(typeof(SpecExecution))
	val aSpec = mock(typeof(Specification))
	
	before subject = new Spec2ResultMapping(isSpecPredicate)
	
	fact "returns empty execution if no matching spec exists"{
		subject.getResult(aSpec) => NO_EXECUTION
	}
	
	fact "returns execution result matching to spec"{
		when(isSpecPredicate.matches(aSpec, matchingResult)).thenReturn(true)
		when(isSpecPredicate.matches(aSpec, notMatchingResult)).thenReturn(false)

		subject.accept(notMatchingResult)
		subject.accept(matchingResult)
		
		subject.getResult(aSpec) => matchingResult
	}

}