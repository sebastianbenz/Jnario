package de.bmw.carit.jnario.lib;

import org.hamcrest.Matcher;

public class MultiTargetMatcherChain<T> extends BaseMatcherChain<T> {

	private final Iterable<? extends T> inputs;

	public MultiTargetMatcherChain(Iterable<? extends T> inputs) {
		this.inputs = inputs;
	}

	public MatcherChain<T> assertMatches(Matcher<T> expected){
		for (T actual : inputs) {
			matchingFor(expected, actual).doAssert();
		}
		return this;
	}

}
