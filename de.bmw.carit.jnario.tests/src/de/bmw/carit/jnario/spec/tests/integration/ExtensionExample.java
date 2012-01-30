package de.bmw.carit.jnario.spec.tests.integration;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class ExtensionExample {
	
	private static List<String> EXECUTED_METHODS = new ArrayList<String>();
	
	@BeforeClass
	public static void beforeClass(){
		run("ExtensionExample#beforeClass");
	}
	
	@Before
	public void before(){
		run("ExtensionExample#before");
	}
	
	@AfterClass
	public static void afterClass(){
		run("ExtensionExample#afterClass");
	}
	
	@After
	public void after(){
		run("ExtensionExample#after");
	}

	private static void run(String name) {
		EXECUTED_METHODS.add(name);
	}
	
	public static List<String> getExecutedMethods() {
		return EXECUTED_METHODS;
	}
	
}