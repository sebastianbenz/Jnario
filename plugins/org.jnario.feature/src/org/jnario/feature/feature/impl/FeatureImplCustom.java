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
