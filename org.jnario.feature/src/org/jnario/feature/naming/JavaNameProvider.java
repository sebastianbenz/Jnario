/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.naming;

import org.eclipse.xtext.util.Strings;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.Scenario;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class JavaNameProvider {
	
	private static final String FEATURE = "Feature: ";
	private static final String SCENARIO = "Scenario: ";
	
	public String getFeatureClassName(Feature feature){
		return getFeatureClassName(feature.getName());
	}
	
	private String getFeatureClassName(String featureDescription){
		if(featureDescription.indexOf(FEATURE) == 0){
			return getJavaClassName(featureDescription.substring(FEATURE.length())) + "Feature";
		}
		else return "unknown";
	}
	
	public String getClassName(Scenario scenario){
		String name = scenario.getName();
		if(name == null){
			return "unknown";
		}
		if(name.indexOf(SCENARIO) == 0){
			return getJavaClassName(name.substring(SCENARIO.length()));
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
