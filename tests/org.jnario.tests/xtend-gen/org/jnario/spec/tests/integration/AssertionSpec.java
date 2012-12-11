package org.jnario.spec.tests.integration;

import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.spec.tests.integration.AssertionIntroductionSpec;
import org.jnario.spec.tests.integration.AssertionNoMoreDebuggingSpec;
import org.junit.runner.RunWith;

@Contains({ AssertionIntroductionSpec.class, AssertionNoMoreDebuggingSpec.class })
@SuppressWarnings("all")
@Named("Assertion")
@RunWith(ExampleGroupRunner.class)
public class AssertionSpec {
}
