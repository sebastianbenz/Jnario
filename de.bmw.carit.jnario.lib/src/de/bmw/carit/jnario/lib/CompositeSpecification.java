package de.bmw.carit.jnario.lib;

import java.util.Collections;

import org.hamcrest.Matcher;

import com.google.common.collect.Iterables;

public class CompositeSpecification<T> extends AbstractSpecification<T> {

	private final T[] inputs;

	public CompositeSpecification(T... inputs) {
		this(Collections.<Step>emptyList(), inputs);
	}
	
	public CompositeSpecification(Iterable<Step> steps, T... inputs) {
		super(steps);
		this.inputs = inputs;
	}

	@Override
	public ISpecification<T> append(Step step) {
		return new CompositeSpecification<T>(Iterables.concat(steps, Collections.singletonList(step)), inputs);
	}

	@Override
	public void evaluate(Matcher<? super T> matcher) {
		for (T input : inputs) {
			evaluate(matcher, input);
		}
	}

}
