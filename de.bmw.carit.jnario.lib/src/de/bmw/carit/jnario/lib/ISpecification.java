package de.bmw.carit.jnario.lib;

import org.hamcrest.Matcher;

public interface ISpecification<T> {

	public abstract ISpecification<T> append(Step step);

	public abstract void evaluate(Matcher<? super T> matcher);
	
	public abstract boolean evaluate(boolean input);

}