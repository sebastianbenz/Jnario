/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.spec.spec.impl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;

import de.bmw.carit.jnario.spec.spec.ExampleGroup;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class ExampleGroupImplCustom extends de.bmw.carit.jnario.spec.spec.impl.ExampleGroupImpl {

	@SuppressWarnings("restriction")
	@Override
	public String getName() {
		if(name != null && name.length() == 0){
			return null;
		}
		return super.getName();
	}
	
	@Override
	public String getPackageName() {
		String packageName = super.getPackageName();
		if(packageName != null){
			return packageName;
		}
		
		ExampleGroup parent = EcoreUtil2.getContainerOfType(eContainer(), ExampleGroup.class);
		if(parent == null){
			return null;
		}
		return parent.getPackageName();
	}
	
}
