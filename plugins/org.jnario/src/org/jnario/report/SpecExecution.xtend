package org.jnario.report

import java.util.List

@Data
class SpecExecution {
	
	public static val NO_EXECUTION = new SpecExecution("", "", 0.0, emptyList)
	
	String className
	String name
	double executionTimeInSeconds 
	List<SpecFailure> failures
	
	def hasPassed(){
		return true
	}
}