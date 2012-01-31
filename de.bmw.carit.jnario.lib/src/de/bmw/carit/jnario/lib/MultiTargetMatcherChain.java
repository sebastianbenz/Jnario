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
public class MultiTargetMatcherChain<T> extends BaseMatcherChain<T> {

	private final Iterable<? extends T> inputs;

	public MultiTargetMatcherChain(Iterable<? extends T> inputs) {
		this.inputs = inputs;
	}
	
	public MultiTargetMatcherChain(List<MatcherFactory<T>> newFactories, Iterable<? extends T> inputs) {
		super(newFactories);
		this.inputs = inputs;
	}

	public MatcherChain<T> assertMatches(Matcher<T> expected){
		for (T actual : inputs) {
			matchingFor(expected, actual).doAssert();
		}
		return this;
	}
	
	@Override
	public MatcherChain<T> append(MatcherFactory<T> factory) {
		List<MatcherFactory<T>> newFactories = ImmutableList.<MatcherFactory<T>>builder()
										.addAll(getFactories())
										.add(factory).build();
		return new MultiTargetMatcherChain<T>(newFactories , inputs);
	}

}
