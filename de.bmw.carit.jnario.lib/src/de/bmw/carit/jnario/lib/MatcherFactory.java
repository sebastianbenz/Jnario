package de.bmw.carit.jnario.lib;

import org.hamcrest.Matcher;

public interface MatcherFactory<T> {
	Matcher<T> create(Matcher<T> nestedMatcher);
}
