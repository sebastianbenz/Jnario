package org.jnario.feature.feature.impl;

import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;

import org.jnario.feature.feature.Feature;

public class ScenarioImplCustom extends ScenarioImpl {

	@Override
	public String getPackageName() {
		Feature feature = getContainerOfType(this, Feature.class);
		if(feature == null){
			return null;
		}
		return feature.getPackageName();
	}
	
}
