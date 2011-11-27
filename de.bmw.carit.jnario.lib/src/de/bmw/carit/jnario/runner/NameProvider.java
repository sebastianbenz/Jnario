package de.bmw.carit.jnario.runner;

import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.TestClass;

public class NameProvider {
	
	public static NameProvider create(){
		return new NameProvider();
	}

	public String nameOf(FrameworkMethod method) {
		return nameOf(method.getAnnotation(Named.class), method.getName());
	}

	private String nameOf(Named named, String defaultName) {
		return named == null ? defaultName : named.value();
	}

	public String nameOf(TestClass klass) {
		return nameOf(klass.getJavaClass().getAnnotation(Named.class), klass.getName());
	}
}
