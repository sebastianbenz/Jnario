package org.jnario.report

import java.util.List
import com.google.common.collect.ImmutableList

@Data
abstract class SpecExecution {
	
	def static passingSpec(String className, String name, double executionTimeInSeconds){
		new Passed(className, name, executionTimeInSeconds)
	}
	
	def static failingSpec(String className, String name, double executionTimeInSeconds, SpecFailure... failures){
		new Failed(className, name, executionTimeInSeconds, failures)
	}
	
	String className
	String name
	double executionTimeInSeconds 
	List<SpecFailure> failures
	
}

class NotRun extends SpecExecution{
	new(String className, String name) {
		super(className, name, 0.0, <SpecFailure>emptyList)
	}
}

class Passed extends SpecExecution{
	new(String className, String name, double executionTimeInSeconds) {
		super(className, name, executionTimeInSeconds, <SpecFailure>emptyList)
	}
	
}

class Failed extends SpecExecution{
	new(String className, String name, double executionTimeInSeconds, Iterable<SpecFailure> failures) {
		super(className, name, executionTimeInSeconds, ImmutableList::of(failures))
	}
	
}