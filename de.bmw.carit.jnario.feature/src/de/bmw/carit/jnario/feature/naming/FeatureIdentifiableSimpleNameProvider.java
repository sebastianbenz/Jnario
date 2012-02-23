/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.feature.naming;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xtend2.featurecalls.Xtend2IdentifiableSimpleNameProvider;

import de.bmw.carit.jnario.feature.feature.Step;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class FeatureIdentifiableSimpleNameProvider extends Xtend2IdentifiableSimpleNameProvider {
	
	@Override
	public String getSimpleName(JvmIdentifiableElement element) {
		if(element instanceof Step){
			Step step = (Step) element;
			step.getName().trim().replaceAll(" +", " ").replaceAll("\\? *\n", "").replace("\\? *\r", "");
		}
		return super.getSimpleName(element);
	}
	

}
