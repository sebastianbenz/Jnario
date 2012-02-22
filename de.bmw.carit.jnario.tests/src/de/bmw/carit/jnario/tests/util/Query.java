/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.tests.util;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class Query {

	private final Iterable<EObject> content;

	public Query(Iterable<EObject> content) {
		this.content = content;
	}

	public static Query query(Iterable<EObject> content) {
		return new Query(content);
	}

	public <T extends EObject> T find(String name, Class<T> type) {
		return Iterables.find(all(type), Predicates2.nameIs(name));
	}

	public <T> T first(Class<T> type) {
		return type.cast(allOf(type).next());
	}

	public <T> Iterator<T> allOf(Class<T> type) {
		return all(type).iterator();
	}
	
	public <T> T second(Class<T> type) {
		Iterator<T> elements = allOf(type);
		elements.next();
		return type.cast(elements.next());
	}

	public EObject find(Predicate<EObject> predicate) {
		return Iterables.find(content, predicate);
	}

	public <T> Iterable<T> all(Class<T> type) {
		return Iterables.filter(content, type);
	}
}
