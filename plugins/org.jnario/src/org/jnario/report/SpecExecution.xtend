package org.jnario.report

import java.util.List

@Data
class SpecExecution {
	
	public static val NO_EXECUTION = new SpecExecution("", "", 0.0, emptyList)

	def static passingSpec(String className, String name, double executionTimeInSeconds){
		new SpecExecution(className, name, executionTimeInSeconds, emptyList)
	}
	
	def static failingSpec(String className, String name, double executionTimeInSeconds, SpecFailure... failures){
		new SpecExecution(className, name, executionTimeInSeconds, failures)
	}
	
	String className
	String name
	double executionTimeInSeconds 
	List<SpecFailure> failures
	
	def hasPassed(){
		return failures.empty
	}
}