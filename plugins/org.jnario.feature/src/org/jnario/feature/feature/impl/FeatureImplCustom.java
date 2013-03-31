/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.feature.impl;

import org.jnario.feature.feature.Scenario;

public class FeatureImplCustom extends FeatureImpl {

	@Override
	public boolean isPending() {
		if(background != null && background.isPending()){
			return true;
		}
		if(getScenarios().isEmpty()){
			return true;
		}
		for (Scenario scenario : getScenarios()) {
			if(scenario.isPending()){
				return true;
			}
		}
		return false;
	}
	
}
