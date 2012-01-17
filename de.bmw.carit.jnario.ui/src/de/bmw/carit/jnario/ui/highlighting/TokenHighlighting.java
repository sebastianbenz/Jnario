/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.ui.highlighting;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

import com.google.inject.Singleton;

@Singleton
public class TokenHighlighting extends DefaultAntlrTokenToAttributeIdMapper {

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if ("RULE_SCENARIO_TEXT".equals(tokenName)) {
			return HighlightingConfiguration.SCENARIO_ID;
		}else if("RULE_FEATURE_TEXT".equals(tokenName)) {
			return HighlightingConfiguration.FEATURE_ID;
		}else if("RULE_GIVEN_TEXT".equals(tokenName)) {
			return HighlightingConfiguration.STEP_TEXT_ID;
		}else if("RULE_WHEN_TEXT".equals(tokenName)) {
			return HighlightingConfiguration.STEP_TEXT_ID;
		}else if("RULE_THEN_TEXT".equals(tokenName)) {
			return HighlightingConfiguration.STEP_TEXT_ID;
		}else if("RULE_AND_TEXT".equals(tokenName)) {
			return HighlightingConfiguration.STEP_TEXT_ID;
		}else if("RULE_BACKGROUND_TEXT".equals(tokenName)) {
			return HighlightingConfiguration.SCENARIO_ID;
		}else if("RULE_EXAMPLE_TEXT".equals(tokenName)){
			return HighlightingConfiguration.EXAMPLE_ID;
		}else if("RULE_IN_ORDER_TEXT".equals(tokenName)) {
			return HighlightingConfiguration.STEP_TEXT_ID;
		}else if("RULE_AS_A_TEXT".equals(tokenName)) {
			return HighlightingConfiguration.STEP_TEXT_ID;
		}else if("RULE_I_WANT_TEXT".equals(tokenName)) {
			return HighlightingConfiguration.STEP_TEXT_ID;
		}
		return super.calculateId(tokenName, tokenType);
	}

}
