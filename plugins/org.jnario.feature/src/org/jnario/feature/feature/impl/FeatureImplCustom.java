/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.feature.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Scenario;

public class FeatureImplCustom extends FeatureImpl {

	private boolean backgroundInit = false;
	private BasicEList<Scenario> scenarios;
	private Background background;  

	@Override
	public EList<Scenario> getScenarios() {
		if (scenarios == null) {
			scenarios = new BasicEList<Scenario>();
			for (XtendMember member : getMembers()) {
				if (member instanceof Background) {
					setBackground((Background) member);
				}else if (member instanceof Scenario) {
					scenarios.add((Scenario) member);
				}
			}
			backgroundInit = true;
		}
		return scenarios;
	}
	
	@Override
	public Background getBackground() {
		if(!backgroundInit){
			getScenarios();
		}
		return background;
	}

	@Override
	public boolean isPending() {
		if (background != null && background.isPending()) {
			return true;
		}
		if (getScenarios().isEmpty()) {
			return true;
		}
		for (Scenario scenario : getScenarios()) {
			if (scenario.isPending()) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void setBackground(Background newBackground) {
		backgroundInit = true;
		this.background = newBackground;
	}
	
	@Override
	public Background basicGetBackground() {
		return getBackground();
	}

}
