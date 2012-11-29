/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.linking;

import static com.google.common.collect.Iterables.concat;
import static com.google.common.collect.Iterables.filter;
import static java.util.Collections.emptyList;
import static java.util.Collections.singleton;

import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeatureFile;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;

public class FeatureQuery {
	
	public Iterable<Step> allSteps(FeatureFile featureFile){
		Iterable<Step> result = emptyList();
		for (Feature feature : filter(featureFile.getXtendClasses(), Feature.class)) {
			if(feature == null){
				return result;
			}
			
			Iterable<Scenario> scenarios = feature.getScenarios();
			if(feature.getBackground() != null){
				scenarios = concat(scenarios, singleton(feature.getBackground()));
			}
			
			for(Scenario scenario : scenarios){
				result = concat(result, scenario.getSteps());
			}
		}
		return result;
	}

}
