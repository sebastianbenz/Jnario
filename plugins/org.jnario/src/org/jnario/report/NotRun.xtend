package org.jnario.report

class NotRun extends SpecExecution{
	new(String className, String name) {
		super(className, name, 0.0, <SpecFailure>emptyList)
	}
}

 