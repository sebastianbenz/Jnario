/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.feature.impl;

import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;

import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.Step;

public class ScenarioImplCustom extends ScenarioImpl {

	@Override
	public String getPackageName() {
		Feature feature = getContainerOfType(this, Feature.class);
		if(feature == null){
			return null;
		}
		return feature.getPackageName();
	}
	
	@Override
	public boolean isPending() {
		if(getSteps().isEmpty()){
			return true;
		}
		for (Step step : getSteps()) {
			if(step.isPending()){
				return true;
			}
		}
		return false;
	}
}
