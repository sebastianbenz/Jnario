package org.jnario.lib.tests;

import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

public class TestRule implements MethodRule {

	
	
	private static boolean isExecuted = false;
	
	public Statement apply(Statement base, FrameworkMethod method, Object target) {
		isExecuted = true;
		return base;
	}
	
	public static boolean isExecuted() {
		return isExecuted;
	}

}
