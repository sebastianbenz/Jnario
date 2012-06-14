package org.jnario.spec.tests.integration;

import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.spec.tests.integration.UsingXtendSWithOperatorInitializeFixturesSpec;
import org.jnario.spec.tests.integration.UsingXtendSWithOperatorWriteMultipleAssertionsSpec;
import org.junit.runner.RunWith;

@Contains({ UsingXtendSWithOperatorInitializeFixturesSpec.class, UsingXtendSWithOperatorWriteMultipleAssertionsSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Using Xtend\\\'s with Operator")
public class UsingXtendSWithOperatorSpec {
}
