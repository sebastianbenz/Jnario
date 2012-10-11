/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.jvmmodel;

import static com.google.common.collect.Lists.newArrayList;
import static org.jnario.lib.StringConversions.normalize;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jnario.feature.feature.Step;
import org.jnario.feature.naming.StepNameProvider;
import org.jnario.lib.StringConversions;

import com.google.inject.Inject;

/**
 * @author Birgit Engelmann - Initial contribution and API
 * @author Sebastian Benz
 */
public class StepArgumentsProvider {
	
	public static final String MULTILINE_STRING = "'''";
	
	private final class StringArgumentsAcceptor implements
			ArgumentAcceptor {
		private final List<String> arguments = newArrayList();

		public void accept(String arg, int offset, int length) {
			arguments.add(arg);
		}
	}

	public interface ArgumentAcceptor {
		void accept(String arg, int offset, int length);
	}
	
	public static final Pattern ARG_PATTERN = Pattern.compile(
		    		"\"          # Match a quote\n" +
		    	    "(           # Capture in group number 1:\n" +
		    	    " (?:        # Match either...\n" +
		    	    "  \\\\.     # an escaped character\n" +
		    	    " |          # or\n" +
		    	    "  [^\"\\\\] # any character except quotes or backslashes\n" +
		    	    " )*         # Repeat as needed\n" +
		    	    ")           # End of capturing group\n" +
		    	    "\"          # Match a quote", 
		    	    Pattern.COMMENTS);
	
	private final StepNameProvider stepNameProvider;
	
	@Inject 
	public StepArgumentsProvider(StepNameProvider stepNameProvider) {
		this.stepNameProvider = stepNameProvider;
	}

	public void findStepArguments(Step step, ArgumentAcceptor acceptor) {
		String stepName = stepNameProvider.nameOf(step);
		if(stepName == null){
			return;
		}
		int multiLineBegin = stepName.indexOf("\n");
		findArgsInFirstLine(acceptor, stepName, multiLineBegin);
		addOptionalMultilineString(acceptor, stepName, multiLineBegin);
	}

	private void addOptionalMultilineString(ArgumentAcceptor acceptor,
			String stepName, int multiLineBegin) {
		if(multiLineBegin == -1){
			return;
		}
		
		int offset = stepName.indexOf(MULTILINE_STRING, multiLineBegin);
		int end = stepName.length();
		
		int stringBegin = offset + MULTILINE_STRING.length();
		
		int stringEnd = stepName.lastIndexOf("'''");
		if(stringEnd < stringBegin){
			return;
		}
		
		String string = stepName.substring(stringBegin, stringEnd);
		string = normalize(string);
		int length = end - offset;
		
		acceptor.accept(string, offset, length);
	}

	private void findArgsInFirstLine(ArgumentAcceptor acceptor, String name, int end) {
		String firstLine = end == -1 ? name : name.substring(0, end);
		Matcher matcher = ARG_PATTERN.matcher(firstLine);
		while(matcher.find()){
			String value = matcher.group(1);
			if(value != null){
				value = replaceEscapedQuotes(value);
				acceptor.accept(value, matcher.start(), matcher.end() - matcher.start());
			}
		}
	}

	public String replaceEscapedQuotes(String value) {
		return value.replace("\\\"", "\"");
	}
	
	public List<String> findStepArguments(Step step) {
		StringArgumentsAcceptor acceptor = new StringArgumentsAcceptor();
		findStepArguments(step, acceptor);
		return acceptor.arguments;
	}

}
