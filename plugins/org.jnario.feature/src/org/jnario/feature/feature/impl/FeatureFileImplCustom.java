/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.feature.impl;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class FeatureFileImplCustom extends FeatureFileImpl {
	
	@Override
	public String getPackage() {
		if(package_ == null){
			return "features";
		}
		return super.getPackage();
	}

}
