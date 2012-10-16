package org.jnario.report

import com.google.common.collect.ImmutableList

class Failed extends SpecExecution{
	def static failingSpec(String className, String name, double executionTimeInSeconds, SpecFailure... failures){
		new Failed(className, name, executionTimeInSeconds, failures)
	}
	new(String className, String name, double executionTimeInSeconds, Iterable<SpecFailure> failures) {
		super(className, name, executionTimeInSeconds, ImmutableList::of(failures))
	}
}
