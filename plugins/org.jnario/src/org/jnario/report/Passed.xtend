package org.jnario.report

class Passed extends SpecExecution{
	def static passingSpec(String className, String name, double executionTimeInSeconds){
		new Passed(className, name, executionTimeInSeconds)
	}
	new(String className, String name, double executionTimeInSeconds) {
		super(className, name, executionTimeInSeconds, <SpecFailure>emptyList)
	}
}