/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.naming;

import org.eclipse.xtext.util.Strings;

import de.bmw.carit.jnario.jnario.Feature;

/**
 * @author Birgit Engelmann
 */
public class JavaNameProvider {
	
	private static final String FEATURE = "Feature: ";
	private static final String SCENARIO = "Scenario: ";
	
	public String toFeatureSuiteJavaClassName(Feature feature){
		return getFeatureClassName(feature.getName());
	}
	
	public String getFeatureClassName(String featureDescription){
		if(featureDescription.indexOf(FEATURE) == 0){
			return "Ft" + getJavaClassName(featureDescription.substring(FEATURE.length()));
		}
		else return "unknown";
	}
	
	public String getScenarioClassName(String scenarioDescription){
		if(scenarioDescription.indexOf(SCENARIO) == 0){
			return "Sc" + getJavaClassName(scenarioDescription.substring(SCENARIO.length()));
		}
		else return "unknown";
	}
	
	public String getJavaClassName(String originalName){
		return Strings.toFirstUpper(getValidName(originalName));
	}
	
	public String getJavaMethodName(String originalName){
		return Strings.toFirstLower(getValidName(originalName));
	}
	
	private String getValidName(String originalName){
		String name = "";
		if(originalName == null){
			return "unknown";
		}else{
			originalName = originalName.trim();
			String[] words = originalName.split(" ");
			for(String word: words){
				if(!word.isEmpty()){
					name = name + Strings.toFirstUpper(word);
				}
			}
			return name.replaceAll("[^A-Za-z0-9]","");
		}
	}
}
