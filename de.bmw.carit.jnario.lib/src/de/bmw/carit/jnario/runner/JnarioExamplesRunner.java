package de.bmw.carit.jnario.runner;

import static com.google.common.base.Predicates.notNull;
import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import org.junit.runner.Runner;
import org.junit.runners.model.InitializationError;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;

public class JnarioExamplesRunner extends ExampleGroupRunner{

	private List<Runner> children;

	public JnarioExamplesRunner(Class<?> testClass) throws InitializationError {
		super(testClass);

		@SuppressWarnings("unchecked")
		Iterable<Runner> allExamples = (Iterable<Runner>)collectExamples();
		this.children = newArrayList(Iterables.filter(allExamples, notNull()));
		if(children.isEmpty()){
			throw new InitializationError("No examples");
		}
	}

	@Override
	protected Iterable<? extends Runner> collectExamples() {
		return transform(allContainedClasses(),
				new Function<Class<?>, JnarioRunner>() {

			@Override
			public JnarioRunner apply(Class<?> declaredClass) {
				try {
					JnarioRunner childRunner = new JnarioRunner(declaredClass);
					if (childRunner.getChildren().isEmpty()) {
						return null;
					}
					return childRunner;
				} catch (InitializationError e) {
					return null;
				}
			}
		});
	}
}
