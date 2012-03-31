package org.jnario.feature.conversion;

import org.jnario.conversion.JnarioValueConverterService;

public class FeatureValueConverterService extends JnarioValueConverterService {
	
	public String toString(Object value, String lexerRule) {
		if(lexerRule.contains("GIVEN_TEXT")){
			return super.toString("Given " + value.toString(), lexerRule);
		}
		if(lexerRule.contains("WHEN_TEXT")){
			return super.toString("When " + value.toString(), lexerRule);
		}
		if(lexerRule.contains("THEN_TEXT")){
			return super.toString("Then " + value.toString(), lexerRule);
		}
		if(lexerRule.contains("AND_TEXT")){
			return super.toString("And " + value.toString(), lexerRule);
		}
		return super.toString(value, lexerRule);
	}

}
