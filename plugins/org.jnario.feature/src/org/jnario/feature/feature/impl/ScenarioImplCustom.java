/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.feature.impl;

import static com.google.common.collect.Iterables.addAll;
import static com.google.common.collect.Iterables.filter;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.EcoreUtil2;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.Step;

import com.google.common.collect.Iterables;

public class ScenarioImplCustom extends ScenarioImpl {

	private EList<Step> steps;
	private EList<Step> pendingSteps;
	
	@Override
	public EList<Step> getSteps() {
		if(steps == null){
			steps = new BasicEList<Step>();
			addAll(steps, filter(getMembers(), Step.class));
		}
		return steps;
	}
	
	@Override
	public EList<Step> getPendingSteps() {
		if (pendingSteps == null) {
			pendingSteps = new BasicEList<Step>();
			Feature feature = EcoreUtil2.getContainerOfType(this, Feature.class);
			Background background = feature.getBackground();
			boolean pendingSeen = false;
			Iterable<Step> allSteps;
			if (background == null) {
				allSteps = getSteps();
			} else {
				allSteps = Iterables.concat(background.getSteps(), getSteps());
			}
			for (Step step : allSteps) {
				if (pendingSeen || step.isPending()) {
					pendingSeen = true;
					pendingSteps.add(step);
				}
			}
		}
		return pendingSteps;
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
