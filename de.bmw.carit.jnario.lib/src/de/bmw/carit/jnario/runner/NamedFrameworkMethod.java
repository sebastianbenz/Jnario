package de.bmw.carit.jnario.runner;

import java.lang.reflect.Method;

import org.junit.runners.model.FrameworkMethod;

public class NamedFrameworkMethod extends FrameworkMethod {
		
		private final String name;

		public NamedFrameworkMethod(Method method, String name) {
			super(method);
			this.name = name;
		}

		@Override
		public String getName() {
			return name;
		}
		
	}