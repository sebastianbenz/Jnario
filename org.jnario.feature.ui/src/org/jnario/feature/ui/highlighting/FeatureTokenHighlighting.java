/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.ui.highlighting;

import org.eclipse.xtend.ide.highlighting.TokenToAttributeIdMapper;

import com.google.inject.Singleton;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@Singleton
public class FeatureTokenHighlighting extends TokenToAttributeIdMapper{

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if ("RULE_SCENARIO_TEXT".equals(tokenName)) {
			return FeatureHighlightingConfiguration.SCENARIO_ID;
		}else if("RULE_FEATURE_TEXT".equals(tokenName)) {
			return FeatureHighlightingConfiguration.STEP_TEXT_ID;
		}else if("RULE_GIVEN_TEXT".equals(tokenName)) {
			return FeatureHighlightingConfiguration.STEP_TEXT_ID;
		}else if("RULE_WHEN_TEXT".equals(tokenName)) {
			return FeatureHighlightingConfiguration.STEP_TEXT_ID;
		}else if("RULE_THEN_TEXT".equals(tokenName)) {
			return FeatureHighlightingConfiguration.STEP_TEXT_ID;
		}else if("RULE_AND_TEXT".equals(tokenName)) {
			return FeatureHighlightingConfiguration.STEP_TEXT_ID;
		}else if("RULE_BACKGROUND_TEXT".equals(tokenName)) {
			return FeatureHighlightingConfiguration.SCENARIO_ID;
		}else if("RULE_EXAMPLE_TEXT".equals(tokenName)){
			return FeatureHighlightingConfiguration.EXAMPLE_ID;
		}else if("RULE_TEXT".equals(tokenName)) {
			return FeatureHighlightingConfiguration.STEP_TEXT_ID;
		}
		return super.calculateId(tokenName, tokenType);
	}

}
