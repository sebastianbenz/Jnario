package org.jnario.feature.tests.integration;

import java.util.List;

public class MyExtension {

	private boolean isCalled = false;
	
	public void myExtensionMethod(List<?> list){
		isCalled = true;
	}
	
	public boolean isCalled() {
		return isCalled;
	}
	
}
