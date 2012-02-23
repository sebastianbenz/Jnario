/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.doc;

import java.util.Collections;
import java.util.List;

public class FilteringResult {
	
	public static final FilteringResult EMPTY_RESULT = new FilteringResult("", Collections.<Filter>emptyList());
	
	private final String result;
	private final List<Filter> filters;

	public FilteringResult(String result, List<Filter> filters) {
		this.result = result;
		this.filters = filters;
	}
	
	public String getString() {
		return result;
	}
	
	public List<Filter> getFilters() {
		return filters;
	}

}
