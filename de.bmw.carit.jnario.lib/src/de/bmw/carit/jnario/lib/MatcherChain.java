package de.bmw.carit.jnario.lib;

import org.hamcrest.Matcher;

public interface MatcherChain<T> {

	MatcherChain<T> append(MatcherFactory<T> factory);

	MatcherChain<T> assertMatches(Matcher<T> expected);

}