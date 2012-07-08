/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.conversion;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.jnario.conversion.JnarioValueConverterService;

public class FeatureValueConverterService extends JnarioValueConverterService {
	
	private FeatureValueConverter featureValueConverter = FeatureValueConverter.create("Feature:");
	private FeatureValueConverter givenValueConverter = FeatureValueConverter.create("Given ");
	private FeatureValueConverter whenValueConverter = FeatureValueConverter.create("When ");
	private FeatureValueConverter thenValueConverter = FeatureValueConverter.create("Then ");
	private FeatureValueConverter andValueConverter = FeatureValueConverter.create("And ");
//	
	public String toString(Object value, String lexerRule) {
		if(lexerRule.startsWith("GIVEN_TEXT")){
			return "Given " + value.toString();
		}
		if(lexerRule.startsWith("WHEN_TEXT")){
			return "When " + value.toString();
		}
		if(lexerRule.startsWith("THEN_TEXT")){
			return "Then " + value.toString();
		}
		if(lexerRule.startsWith("AND_TEXT")){
			return "And " + value.toString();
		}
		return super.toString(value, lexerRule);
	}
	
	@ValueConverter(rule = "FEATURE_TEXT")
	public IValueConverter<String> getFeatureConverter() {
		return featureValueConverter;
	}
//	@ValueConverter(rule = "BACKGROUND_TEXT")
//	public IValueConverter<String> geBackgroundConverter() {
//		return backgroundValueConverter;
//	}
//	
//	@ValueConverter(rule = "SCENARIO_TEXT")
//	public IValueConverter<String> getScenarioConverter() {
//		return scenarioValueConverter;
//	}
//	
	@ValueConverter(rule = "GIVEN_TEXT")
	public IValueConverter<String> getGivenConverter() {
		return givenValueConverter;
	}
	
	@ValueConverter(rule = "WHEN_TEXT")
	public IValueConverter<String> getWhenConverter() {
		return whenValueConverter;
	}
	
	@ValueConverter(rule = "THEN_TEXT")
	public IValueConverter<String> getThenConverter() {
		return thenValueConverter;
	}
	
	@ValueConverter(rule = "AND_TEXT")
	public IValueConverter<String> getAndConverter() {
		return andValueConverter;
	}

}
