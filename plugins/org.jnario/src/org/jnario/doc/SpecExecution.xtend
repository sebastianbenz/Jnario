package org.jnario.doc

import java.util.List

@Data
class SpecExecution {
	String className
	String name
	double executionTimeInSeconds 
	List<Failure> failures
	def hasPassed(){
		return true
	}
	

}