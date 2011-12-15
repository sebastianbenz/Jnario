package de.bmw.carit.jnario.lib;

import java.util.Arrays;

public class Each {

	public static <T> MatcherChain<T> each(T... inputs) {
		return Each.each(Arrays.asList(inputs));
	}

	public static <T> MatcherChain<T> each(Iterable<? extends T> inputs) {
		return new MultiTargetMatcherChain<T>(inputs);
	}

}
