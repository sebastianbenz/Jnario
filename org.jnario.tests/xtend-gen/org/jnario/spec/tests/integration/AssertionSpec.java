package org.jnario.spec.tests.integration;

import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ AssertionIntroductionSpec.class, AssertionNoMoreDebuggingSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Assertion")
public class AssertionSpec {
}
