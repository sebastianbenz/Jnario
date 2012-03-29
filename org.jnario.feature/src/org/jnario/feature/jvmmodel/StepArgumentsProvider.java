/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.jvmmodel;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jnario.feature.feature.Step;
import org.jnario.feature.naming.StepNameProvider;

import com.google.inject.Inject;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class StepArgumentsProvider {
	
	@Inject StepNameProvider stepNameProvider;
	
	public static final Pattern ARG_PATTERN = Pattern.compile("\"([^\"]*)\"");
	
	public ArrayList<String> findStepArguments(Step step) {
		ArrayList<String> arguments = new ArrayList<String>();
		String name = stepNameProvider.nameOf(step);
		Matcher matcher = ARG_PATTERN.matcher(name);
		if(matcher.find()){
			do{
				arguments.add(name.substring(matcher.start(1), matcher.end(1)));
			}while(matcher.find());
		}
		return arguments;
	}

}
