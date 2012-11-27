/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.naming;

import static com.google.common.base.Strings.isNullOrEmpty;
import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;
import static org.jnario.util.Strings.toClassName;

import org.eclipse.emf.ecore.EObject;
import org.jnario.ExampleRow;
import org.jnario.ExampleTable;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.jvmmodel.JnarioNameProvider;
import org.jnario.util.Strings;

import com.google.inject.Inject;

/**
 * @author Birgit Engelmann - Initial contribution and API
 * @author Sebastian Benz
 */
public class FeatureClassNameProvider extends JnarioNameProvider{
	
	private static final String FEATURE_KEYWORD = "Feature";
	private StepNameProvider stepNameProvider;
	
	@Inject
	public FeatureClassNameProvider(StepNameProvider stepNameProvider) {
		this.stepNameProvider = stepNameProvider;
	}

	public String toJavaClassName(EObject obj) {
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
		if (obj instanceof Step) {
			return getClassName((Step)obj);
		}
		throw new UnsupportedOperationException("Missing getClassName for " + obj.eClass().getName());
	}
	
	public String getClassName(Feature feature){
		String name = feature.getName();
		if(isNullOrEmpty(name)){
			return null;
		}
		return toClassName(name) + FEATURE_KEYWORD;
	}

	public String getClassName(Scenario scenario){
		return parentFeatureName(scenario) + Strings.toClassName(scenario.getName(), "Scenario");
	}

	public String getClassName(ExampleTable exampleTable){
		Scenario scenario = getContainerOfType(exampleTable, Scenario.class);
		return getClassName(scenario) + Strings.toClassName(exampleTable.getName(), "Examples");
	}
	
	public String getClassName(ExampleRow row){
		ExampleTable table = getContainerOfType(row, ExampleTable.class);
		return getClassName(table) + "Row" + table.getRows().indexOf(row);
	}
	
	public String getClassName(Background background){
		return parentFeatureName(background) + Strings.toClassName(background.getName(), "Background");
	}

	private String parentFeatureName(EObject obj) {
		Feature feature = getContainerOfType(obj, Feature.class);
		if(feature == null){
			return null;
		}
		return getClassName(feature);
	}


	@Override
	public String describe(EObject eObject) {
		if (eObject instanceof Feature) {
			return stepNameProvider.describe((Feature) eObject);
		}
		if (eObject instanceof Scenario) {
			return stepNameProvider.describe((Scenario) eObject);
		}
		if (eObject instanceof Step) {
			return stepNameProvider.describe((Step) eObject);
		}
		throw new UnsupportedOperationException("Cannote describe " + eObject.eClass().getName());
	}
	
	@Override
	public String toQualifiedJavaClassName(EObject eObject) {
		if (eObject instanceof Step) {
			Step step = (Step) eObject;
			String className = getClassName(step);
			if(className == null){
				return null;
			}
			String packageName = getPackageName(eObject);
			if(isNullOrEmpty(packageName)){
				return className;
			}
			return packageName + "." + className;
		}
		return super.toQualifiedJavaClassName(eObject);
	}

	protected String getClassName(Step step) {
		Scenario scenario = getContainerOfType(step, Scenario.class);
		if (scenario instanceof Background) {
			Feature feature = getContainerOfType(scenario, Feature.class);
			if(feature.getScenarios().isEmpty()){
				return null;
			}
			scenario = feature.getScenarios().get(0);
		}
		String className = toJavaClassName(scenario);
		if(isNullOrEmpty(className)){
			return null;
		}
		return className;
	}
}
