package de.bmw.carit.jnario.lib;

import static com.google.common.collect.Iterables.addAll;

import java.util.List;
import java.util.Stack;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;

public abstract class AbstractSpecification<T> implements ISpecification<T> {

	protected final List<Step> steps;

	public AbstractSpecification(Iterable<Step> steps) {
		this.steps = new Stack<Step>();
		addAll(this.steps, steps);
	}

	@SuppressWarnings("unchecked")
	protected void evaluate(Matcher<? super T> matcher, T actual) {
		if (actual instanceof ISpecification<?>) {
			ISpecification<T> spec = (ISpecification<T>) actual;
			spec.evaluate(matcher);
		}else{
			boolean result = matcher.matches(actual);
			result = evaluate(result);
			if (!result) {
				Description description = new StringDescription();
				description.appendText("\nExpected: ");
				description.appendDescriptionOf(matcher);
				description.appendText("\n     got: ");
				description.appendValue(actual);
				description.appendText("\n");
				throw new java.lang.AssertionError(description.toString());
			}
		}
	}

	@Override
	public boolean evaluate(boolean input) {
		for(int i = steps.size()-1; i >= 0; i--){
			input = steps.get(i).apply(input);
		}
		return input;
	}

}
