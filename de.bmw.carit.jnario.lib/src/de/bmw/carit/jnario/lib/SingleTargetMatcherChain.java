package de.bmw.carit.jnario.lib;


import org.hamcrest.Matcher;


public class SingleTargetMatcherChain<T> extends BaseMatcherChain<T> {

	private final T actual;

	public SingleTargetMatcherChain(T actual) {
		this.actual = actual;
	}
	
	public MatcherChain<T> assertMatches(Matcher<T> expected)  {
		matchingFor(expected, actual).doAssert();
		return this;
	}
	
}
