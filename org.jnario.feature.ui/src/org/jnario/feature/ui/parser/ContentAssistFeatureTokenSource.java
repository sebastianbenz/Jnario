package org.jnario.feature.ui.parser;

import org.jnario.feature.parser.FeatureTokenSource;

import static org.jnario.feature.ui.contentassist.antlr.internal.InternalFeatureLexer.*;
public class ContentAssistFeatureTokenSource extends FeatureTokenSource {

	protected int ruleScenario() {
		return RULE_SCENARIO_TEXT;
	}

	protected int ruleBackground() {
		return RULE_BACKGROUND_TEXT;
	}

	protected int ruleText() {
		return RULE_TEXT;
	}

	protected int ruleFeatureText() {
		return RULE_FEATURE_TEXT;
	}
	
}
