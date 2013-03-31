package org.jnario.report

class Pending extends SpecExecution{
	def static pendingSpec(String className, String name, double executionTimeInSeconds){
		new Passed(className, name, executionTimeInSeconds)
	}
	new(String className, String name, double executionTimeInSeconds) {
		super(className, name, executionTimeInSeconds, <SpecFailure>emptyList)
	}
}