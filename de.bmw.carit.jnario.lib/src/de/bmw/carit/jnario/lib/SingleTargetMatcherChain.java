/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.lib;


import java.util.List;

import org.hamcrest.Matcher;

import com.google.common.collect.ImmutableList;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class SingleTargetMatcherChain<T> extends BaseMatcherChain<T> {

	private final T actual;

	public SingleTargetMatcherChain(T actual) {
		this.actual = actual;
	}
	
	public SingleTargetMatcherChain(List<MatcherFactory<T>> newFactories, T actual) {
		super(newFactories);
		this.actual = actual;
	}

	public MatcherChain<T> assertMatches(Matcher<T> expected)  {
		matchingFor(expected, actual).doAssert();
		return this;
	}
	
	@Override
	public MatcherChain<T> append(MatcherFactory<T> factory) {
		List<MatcherFactory<T>> newFactories = ImmutableList.<MatcherFactory<T>>builder()
										.addAll(getFactories())
										.add(factory).build();
		return new SingleTargetMatcherChain<T>(newFactories , actual);
	}
}
