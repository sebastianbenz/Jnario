package org.jnario.feature.parser;

import static org.jnario.feature.parser.antlr.internal.InternalFeatureLexer.RULE_BACKGROUND_TEXT;
import static org.jnario.feature.parser.antlr.internal.InternalFeatureLexer.RULE_FEATURE_TEXT;
import static org.jnario.feature.parser.antlr.internal.InternalFeatureLexer.RULE_SCENARIO_TEXT;
import static org.jnario.feature.parser.antlr.internal.InternalFeatureLexer.RULE_TEXT;
import static org.jnario.util.Strings.startsWithWord;

import java.util.List;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.eclipse.xtext.parser.antlr.AbstractSplittingTokenSource;
import org.eclipse.xtext.parser.antlr.ITokenAcceptor;
import org.eclipse.xtext.util.Strings;

public class FeatureTokenSource extends AbstractSplittingTokenSource {
	
	private static final String SCENARIO_KEYWORD = "Scenario:";
	private static final String BACKGROUND_KEYWORD = "Background:";
	private static final String FEATURE_KEYWORD = "Feature:";

	private static class TokenFactory{

		private final CommonToken source;
		private final ITokenAcceptor acceptor;
		public TokenFactory(ITokenAcceptor acceptor, CommonToken source) {
			this.acceptor = acceptor;
			this.source = source;
		}
		
		public void add(int type, int start, int stop, int line, int charPosInLine){
			if(start > stop){
				return;
			}
			CommonToken result = new CommonToken(input(), type, Token.DEFAULT_CHANNEL, offset() + start, offset() + stop);
			result.setLine(source.getLine() + line);
			result.setCharPositionInLine(charPosInLine);
			acceptor.accept(result);
		}

		private int offset() {
			return source.getStartIndex();
		}

		private CharStream input() {
			return source.getInputStream();
		}

		public void addSource() {
			acceptor.accept(source);
		}
		
	}
	
	@Override
	protected boolean shouldSplitToken(Token candidate) {
		return isFeatureText(candidate) || candidate.getType() == 0 || candidate.getType() == 12;
	}

	private boolean isFeatureText(Token candidate) {
		return candidate.getType() == ruleFeatureText();
	}
	
	/*
	 * public for testing purposes
	 */
	@Override
	public void doSplitToken(final Token splitMe, ITokenAcceptor result) {
		TokenFactory tokens = new TokenFactory(result, (CommonToken) splitMe);
		String featureText = splitMe.getText();
		List<String> lines = Strings.split(featureText, '\n');
		if(lines.isEmpty()){
			tokens.addSource();
			return;
		}
		String firstLine = lines.get(0);
		int index = startsWithWord(firstLine, FEATURE_KEYWORD);
		if(index == -1){
			tokens.addSource();
			return;
		}
		
		int stop = firstLine.length();
		if(lines.size() == 1){
			tokens.add(ruleFeatureText(), 0, featureText.length()-1, 1, index);
			return;
		}
		tokens.add(ruleFeatureText(), 0, stop, 1, index);
		int endOfFeature = stop+1;
		for(int lineNr = 1; lineNr < lines.size(); lineNr++){
			String line = lines.get(lineNr);
			index = startsWithWord(line, BACKGROUND_KEYWORD);
			if(index != -1){
				tokens.add(ruleText(), endOfFeature, stop + index, 2, 0);
				tokens.add(ruleBackground(), stop + index + 1, featureText.length()-1, lineNr + 1, index);
				return;
			}
			index = startsWithWord(line, SCENARIO_KEYWORD);
			if(index != -1){
				tokens.add(ruleText(), endOfFeature, stop + index, 2, 0);
				tokens.add(ruleScenario(), stop + index + 1, featureText.length()-1, lineNr + 1, index);
				return;
			}
			stop += line.length() + 1;
		}
		tokens.add(ruleText(), endOfFeature, featureText.length()-1, 2, 0);
	}

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
