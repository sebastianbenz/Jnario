package de.bmw.carit.jnario.lib;

import java.util.Collections;

import org.hamcrest.Matcher;

import com.google.common.collect.Iterables;


public class Specification<T> extends AbstractSpecification<T>{
	
	final T input;
	public Specification(T input, Iterable<Step> steps) {
		super(steps);
		this.input = input;
	}
	
	public Specification<T> append(Step step){
		return new Specification<T>(input, Iterables.concat(steps, Collections.singletonList(step)));
	}

	@Override
	public void evaluate(Matcher<? super T> matcher) {
		super.evaluate(matcher, input);
	}
	
}
