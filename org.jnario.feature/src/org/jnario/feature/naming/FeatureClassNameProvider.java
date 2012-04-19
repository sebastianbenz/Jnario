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
import static org.eclipse.xtext.util.Strings.toFirstUpper;
import static org.jnario.util.Strings.convertToCamelCase;

import org.eclipse.emf.ecore.EObject;
import org.jnario.ExampleRow;
import org.jnario.ExampleTable;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.Scenario;

/**
 * @author Birgit Engelmann - Initial contribution and API
 * @author Sebastian Benz
 */
public class FeatureClassNameProvider {
	
	private static final String FEATURE_KEYWORD = "Feature";

	public String getClassName(EObject obj) {
		if (obj instanceof Feature) {
			return getClassName((Feature)obj);
		}
		if (obj instanceof Background) {
			return getClassName((Background)obj);
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
		throw new UnsupportedOperationException("Missing getClassName for " + obj.eClass().getName());
	}

	public String getClassName(Feature feature){
		return toClassName(feature.getName(), FEATURE_KEYWORD) + FEATURE_KEYWORD;
	}

	public String getClassName(Scenario scenario){
		return parentFeatureName(scenario) + toClassName(scenario.getName(), "Scenario");
	}

	public String getClassName(ExampleTable exampleTable){
		Scenario scenario = getContainerOfType(exampleTable, Scenario.class);
		return getClassName(scenario) + toClassName(exampleTable.getName(), "Examples");
	}
	
	public String getClassName(ExampleRow row){
		ExampleTable table = getContainerOfType(row, ExampleTable.class);
		return getClassName(table) + "Row" + table.getRows().indexOf(row);
	}
	
	public String getClassName(Background background){
		return parentFeatureName(background) + toClassName(background.getName(), "Background");
	}

	private String toClassName(String name, String keyword) {
		if(isEmpty(name)){
			name = "";
		}
		String keyWithSeparator = keyword + ": ";
		if(name.indexOf(keyWithSeparator) == -1){
			name = "";
		}else{
			name = name.substring(keyWithSeparator.length());
		}
		name = name.trim();
		if(name.length() == 0){
			name = keyword;
		}
		return getClassName(name);
	}

	private String parentFeatureName(EObject obj) {
		Feature feature = getContainerOfType(obj, Feature.class);
		return getClassName(feature);
	}

	private String getClassName(String originalName){
		return toFirstUpper(convertToCamelCase(originalName));
	}
}
