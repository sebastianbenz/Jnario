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
 * Shorter versions of the collection literals provided by Xtend.
 * 
 * @author Sebastian Benz - Initial contribution and API
 */
public class JnarioCollectionLiterals {

	/**
	 * Creates a mutable {@link List} instance containing the given initial elements.
	 * 
	 * @param elements
	 *            the initial elements that the list should contain, in order. May not be <code>null</code> but may
	 *            contain <code>null</code> values.
	 * @return a new {@link List} containing those elements
	 */
	public static <T> List<T> list(T... elements){
		return newArrayList(elements);
	}
	
	/**
	 * Creates a mutable {@link Set} instance containing the given initial elements.
	 * 
	 * @param elements
	 *            the initial elements that the set should contain, in order. May not be <code>null</code> but may
	 *            contain <code>null</code> values.
	 * @return a new {@link Set} containing those elements
	 */
	public static <T> Set<T> set(T... elements){
		return newHashSet(elements);
	}
	
	/**
	 * Creates a mutable {@link Map} instance containing the given initial entries. Repeated occurrences of a keys
	 * will cause an {@link IllegalArgumentException}.
	 * 
	 * @param elements
	 *            the entries that should be contained in the map. May not be <code>null</code> but may contain
	 *            <code>null</code> keys or values.
	 * @return a new {@link Map} containing those elements
	 * @throws IllegalArgumentException
	 *             if duplicate keys are contained the {@code elements} entries.
	 */
	public static <K, V> Map<K, V> map(Pair<K, V>... elements){
		return newHashMap(elements);
	}
	
}
