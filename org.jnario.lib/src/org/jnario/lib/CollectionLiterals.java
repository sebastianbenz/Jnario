/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.lib;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class CollectionLiterals {

	public static <T> List<T> list(T... elements){
		return new ArrayList<T>(asList(elements));
	}
	
	public static <T> Set<T> set(T... elements){
		return new HashSet<T>(asList(elements));
	}
	
}
