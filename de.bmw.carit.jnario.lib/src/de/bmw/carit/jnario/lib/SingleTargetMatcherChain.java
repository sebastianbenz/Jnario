package de.bmw.carit.jnario.lib;


import java.util.List;

import org.hamcrest.Matcher;

import com.google.common.collect.ImmutableList;


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
