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
	
	public static final Pattern ARG_PATTERN = Pattern.compile("(\"([^\"]*)\"|'''([^\"]*)''')");
	private final StepNameProvider stepNameProvider;
	
	@Inject 
	public StepArgumentsProvider(StepNameProvider stepNameProvider) {
		this.stepNameProvider = stepNameProvider;
	}

	public List<String> findStepArguments(Step step) {
		List<String> arguments = newArrayList();
		extractStringArguments(step, arguments);
		return arguments;
	}

	private void extractStringArguments(Step step, List<String> arguments) {
		String name = stepNameProvider.nameOf(step);
		Matcher matcher = ARG_PATTERN.matcher(name);
		while(matcher.find()){
			arguments.add(matcher.group(1));
		}
	}

}
