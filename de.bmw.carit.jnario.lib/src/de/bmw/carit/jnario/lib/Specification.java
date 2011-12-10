package de.bmw.carit.jnario.lib;

import static com.google.common.collect.Iterables.addAll;
import static java.util.Collections.singletonList;

import java.util.List;
import java.util.Stack;

import com.google.common.collect.Iterables;

public class Specification<T> {
	
	private final T input;
	private final List<Step> steps;
	
	public Specification(T input, Iterable<Step> steps) {
		super();
		this.input = input;
		this.steps = new Stack<Step>();
		addAll(this.steps, steps);
	}
	
	public Specification<T> append(Step step){
		return new Specification<T>(input, Iterables.concat(steps, singletonList(step)));
	}
	
	public boolean evaluate(boolean input){
		for(int i = steps.size()-1; i >= 0; i--){
			input = steps.get(i).apply(input);
		}
		return input;
	}
	
	public T getInput() {
		return input;
	}
	
	@Override
	public String toString() {
		return input == null ? "null" : input.toString();
	}

}
