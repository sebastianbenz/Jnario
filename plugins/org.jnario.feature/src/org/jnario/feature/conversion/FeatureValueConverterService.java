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
	
	private static final String GIVEN_RULE = "GIVEN_TEXT";
	private static final String WHEN_RULE = "WHEN_TEXT";
	private static final String THEN_RULE = "THEN_TEXT";
	private static final String AND_RULE = "AND_TEXT";
	private static final String BUT_RULE = "BUT_TEXT";

	private FeatureValueConverter featureValueConverter = FeatureValueConverter.create("Feature:");
	private FeatureValueConverter givenValueConverter = FeatureValueConverter.create("Given ");
	private FeatureValueConverter whenValueConverter = FeatureValueConverter.create("When ");
	private FeatureValueConverter thenValueConverter = FeatureValueConverter.create("Then ");
	private FeatureValueConverter andValueConverter = FeatureValueConverter.create("And ");
	private FeatureValueConverter butValueConverter = FeatureValueConverter.create("But ");
//	
	public String toString(Object value, String lexerRule) {
		if(lexerRule.startsWith(GIVEN_RULE)){
			return "Given " + value.toString();
		}
		if(lexerRule.startsWith(WHEN_RULE)){
			return "When " + value.toString();
		}
		if(lexerRule.startsWith(THEN_RULE)){
			return "Then " + value.toString();
		}
		if(lexerRule.startsWith(AND_RULE)){
			return "And " + value.toString();
		}
		if(lexerRule.startsWith(BUT_RULE)){
			return "But " + value.toString();
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
	@ValueConverter(rule = GIVEN_RULE)
	public IValueConverter<String> getGivenConverter() {
		return givenValueConverter;
	}
	
	@ValueConverter(rule = WHEN_RULE)
	public IValueConverter<String> getWhenConverter() {
		return whenValueConverter;
	}
	
	@ValueConverter(rule = THEN_RULE)
	public IValueConverter<String> getThenConverter() {
		return thenValueConverter;
	}
	
	@ValueConverter(rule = AND_RULE)
	public IValueConverter<String> getAndConverter() {
		return andValueConverter;
	}

	@ValueConverter(rule = BUT_RULE)
	public IValueConverter<String> getButConverter() {
		return butValueConverter;
	}

}
