/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.lib;

import static org.eclipse.xtext.xbase.lib.CollectionLiterals.newArrayList;
import static org.eclipse.xtext.xbase.lib.CollectionLiterals.newHashMap;
import static org.eclipse.xtext.xbase.lib.CollectionLiterals.newHashSet;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.xtext.xbase.lib.Pair;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class JnarioCollectionLiterals {

	public static <T> List<T> list(T... elements){
		return newArrayList(elements);
	}
	
	public static <T> Set<T> set(T... elements){
		return newHashSet(elements);
	}
	
	public static <K, V> Map<K, V> map(Pair<K, V>... elements){
		return newHashMap(elements);
	}
	
}
