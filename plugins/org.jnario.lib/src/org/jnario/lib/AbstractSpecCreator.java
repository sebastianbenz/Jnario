/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.lib;

import org.jnario.runner.SpecCreator;

public abstract class AbstractSpecCreator implements SpecCreator{

	public <T> T createSpec(Class<T> klass) {
		return create(klass);
	}
	
	public <T> T createSubject(Class<T> klass) {
		return create(klass);
	}
	
	protected abstract <T> T create(Class<T> klass);
	
	public void beforeSpecRun() {
	}

	public void afterSpecRun() {
	}

}