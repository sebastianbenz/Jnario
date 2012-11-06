package org.jnario.junit3;

import java.lang.reflect.Method;

import junit.framework.TestCase;

import org.eclipse.xtext.xbase.lib.Exceptions;
import org.jnario.runner.Named;

public class ExampleGroupSpec extends TestCase {

	public ExampleGroupSpec(String methodName) {
		super(methodName);
	}

	@Named("Hello world")
	public void testShouldSayHello() throws Exception {
		System.out.println("Hello world");
	}
	
	@Named("Hallo Welt")
	public void testShouldSayHallo() throws Exception {
		System.out.println("Hallo Welt");
	}
	
	@Override
	public String getName() {
		try {
			Method method = getClass().getMethod(super.getName());
			Named nameAnnotation = method.getAnnotation(Named.class);
			return nameAnnotation.value();
		} catch (SecurityException e) {
			Exceptions.sneakyThrow(e);
		} catch (NoSuchMethodException e) {
			Exceptions.sneakyThrow(e);
		}
		return super.getName();
	}
	
}