package org.jnario.runner.internal;

import org.eclipse.xtext.xbase.lib.Exceptions;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.NameProvider;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.junit.runners.model.InitializationError;

public class ExampleGroupRunnerBuilder {

	private final Class<?> declaredClass;
	private final NameProvider nameProvider;

	public ExampleGroupRunnerBuilder(Class<?> declaredClass,
			NameProvider nameProvider) {
		this.declaredClass = declaredClass;
		this.nameProvider = nameProvider;
	}

	public Runner build() throws InitializationError {
		RunWith runWith = declaredClass.getAnnotation(RunWith.class);
		if (runWith == null) {
			return new ExampleGroupRunner(declaredClass, nameProvider);
		} else {
			try {
				Class<?> runnerType = runWith.value();
				try {
					return (Runner) runnerType.getConstructor(Class.class,
							NameProvider.class).newInstance(
							new Object[] { declaredClass, nameProvider });
				} catch (NoSuchMethodException e) {
					try {
						return (Runner) runnerType.getConstructor(Class.class)
								.newInstance(new Object[] { declaredClass });
					} catch (NoSuchMethodException e2) {
						throw new InitializationError("Could not instantiate "
								+ runnerType.getName());
					}
				}
			} catch (Exception e) {
				Exceptions.sneakyThrow(e);
				return null; // not reachable
			}
		}
	}

}
