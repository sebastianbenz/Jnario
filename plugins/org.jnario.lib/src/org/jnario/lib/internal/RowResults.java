/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.lib.internal;

import static com.google.common.collect.Lists.newArrayList;

import java.util.Iterator;
import java.util.List;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class RowResults implements Iterable<RowResult>{

	private RowFailed firstFailure = null;
	private List<RowResult> results = newArrayList();

	public boolean hasFailed() {
		return firstFailure != null;
	}

	public void add(RowResult result) {
		if (firstFailure == null && result instanceof RowFailed) {
			firstFailure = (RowFailed) result;
		}
		this.results .add(result);
	}

	public StackTraceElement[] getStackTrace() {
		return firstFailure.getCause().getStackTrace();
	}

	public Iterator<RowResult> iterator() {
		return results.iterator();
	}

}
