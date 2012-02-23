/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.ui.tests.util.builders;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.CoreException;

public abstract class AbstractBuilder<T> {
	
	protected T result;
	
	public T get() {
		return result;
	}
	
	public abstract T build(IContainer container) throws CoreException;

}
