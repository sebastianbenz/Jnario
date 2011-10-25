package de.bmw.carit.jnario.tests.util;

public class Features {
	
	public static String header(){
		return "Feature: \n" + 
				"Scenario: \n" +
				"Given \n" +
				"When \n" +
				"Then \n";
	}
	
	public static String examples(){
		return "Examples:\n" +
				"|x|y|\n" +
				"|3|\"hallo\"|\n";
	}

}
