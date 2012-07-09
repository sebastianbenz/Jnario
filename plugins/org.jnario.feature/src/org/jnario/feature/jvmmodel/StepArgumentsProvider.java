/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.jvmmodel;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jnario.feature.feature.Step;
import org.jnario.feature.naming.StepNameProvider;

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
	
	public static final Pattern ARG_PATTERN = Pattern.compile("(\"([^\"]*)\"|'([^\']*)')");
	private static final int[] GROUPS = {2, 3};
	
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
		String string = stepName.substring(offset + MULTILINE_STRING.length(), end - MULTILINE_STRING.length());
		int length = end - offset;
		acceptor.accept(string, offset, length);
	}

	private void findArgsInFirstLine(ArgumentAcceptor acceptor, String name, int end) {
		String firstLine = end == -1 ? name : name.substring(0, end);
		Matcher matcher = ARG_PATTERN.matcher(firstLine);
		while(matcher.find()){
			for (int i : GROUPS) {
				if(matcher.group(i) != null){
					acceptor.accept(matcher.group(i), matcher.start(), matcher.end() - matcher.start());
				}
			}
		}
	}
	
	public List<String> findStepArguments(Step step) {
		StringArgumentsAcceptor acceptor = new StringArgumentsAcceptor();
		findStepArguments(step, acceptor);
		return acceptor.arguments;
	}
	
	

}
