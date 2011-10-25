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
		}
		return super.calculateId(tokenName, tokenType);
	}

}
