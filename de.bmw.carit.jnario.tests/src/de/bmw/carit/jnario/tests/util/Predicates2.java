/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.tests.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.util.SimpleAttributeResolver;

import com.google.common.base.Predicate;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class Predicates2 {

	public static <T extends EObject> Predicate<T> nameIs(final String expected) {
		return new Predicate<T>() {
	
			public boolean apply(T input) {
				String name = SimpleAttributeResolver.NAME_RESOLVER.apply(input);
				return name != null && expected.equals(name);
			}
		};
	}

	public static <T> Predicate<T> typeIs(final Class<?> type) {
		return new Predicate<T>() {


			public boolean apply(T input) {
				return type.isInstance(input);
			}
			
			@Override
			public String toString() {
				return "type is " + type.getName();
			}
		};
	}

	public static <T extends EObject> Predicate<T> value(final String featureName, final Object value) {
		return new Predicate<T>() {

			public boolean apply(T input) {
				SimpleAttributeResolver<EObject, ? extends Object> resolver = SimpleAttributeResolver.newResolver(value.getClass(), featureName);
				return value.equals(resolver.apply(input));
			}
			
			@Override
			public String toString() {
				return "value of " + featureName + " is " + value;
			}
		};
	}

}
