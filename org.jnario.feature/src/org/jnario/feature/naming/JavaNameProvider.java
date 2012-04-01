/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.naming;

import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;
import static org.eclipse.xtext.util.Strings.isEmpty;
import static org.eclipse.xtext.util.Strings.toFirstLower;
import static org.eclipse.xtext.util.Strings.toFirstUpper;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.util.Strings;
import org.jnario.ExampleRow;
import org.jnario.ExampleTable;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.Scenario;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class JavaNameProvider {
	
	private static final String FEATURE = "Feature: ";
	private static final String SCENARIO = "Scenario: ";
	
	public String getClassName(Feature feature){
		String name = feature.getName();
		if(isEmpty(name)){
			return "unknown";
		}
		if(name.indexOf(FEATURE) != 0){
			return "unknown";
		}
		return getJavaClassName(name.substring(FEATURE.length())) + "Feature";
	}
	
	public String getClassName(Scenario scenario){
		String name = scenario.getName();
		if(name == null){
			return "unknown";
		}
		if(name.indexOf(SCENARIO) == 0){
			String featureName = parentFeatureName(scenario);
			return featureName + getJavaClassName(name.substring(SCENARIO.length()));
		}
		else return "unknown";
	}

	/**
	 * @param scenario
	 * @return
	 */
	private String parentFeatureName(EObject obj) {
		Feature feature = getContainerOfType(obj, Feature.class);
		String featureName = getClassName(feature);
		return featureName;
	}
	
	public String getClassName(ExampleTable exampleTable){
		String name = exampleTable.getName();
		Scenario scenario = getContainerOfType(exampleTable, Scenario.class);
		if(name == null || "".equals(name.trim())){
			name = "Examples" + scenario.getExamples().indexOf(exampleTable);
		}else{
			name = getJavaClassName(name);
		}
		return getClassName(scenario) + name;
	}
	
	public String getJavaClassName(String originalName){
		return toFirstUpper(toValidName(originalName));
	}
	
	public String getJavaMethodName(String originalName){
		return toFirstLower(toValidName(originalName));
	}
	
	private String toValidName(String originalName){
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
	
	public String getClassName(ExampleRow row){
		ExampleTable table = getContainerOfType(row, ExampleTable.class);
		return getClassName(table) + "Row" + table.getRows().indexOf(row);
	}
	
	public String getClassName(Background background){
		return parentFeatureName(background) + "Background";
	}

	public String getClassName(EObject obj) {
		if (obj instanceof Feature) {
			return getClassName((Feature)obj);
		}
		if (obj instanceof Scenario) {
			return getClassName((Scenario)obj);
		}
		if (obj instanceof ExampleTable) {
			return getClassName((ExampleTable)obj);
		}
		if (obj instanceof ExampleRow) {
			return getClassName((ExampleRow)obj);
		}
		if (obj instanceof Background) {
			return getClassName((Background)obj);
		}
		throw new UnsupportedOperationException("Missing getClassName for " + obj.eClass().getName());
	}
}
