package org.jnario;

import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.spec.tests.integration.CollectionLiteralsSpec;
import org.jnario.spec.tests.integration.CustomizingTheSpecCreationSpec;
import org.jnario.spec.tests.integration.UsingShouldSpec;
import org.jnario.spec.tests.integration.UsingXtendSWithOperatorSpec;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Common Concepts")
@Contains({ CollectionLiteralsSpec.class, UsingShouldSpec.class, CustomizingTheSpecCreationSpec.class, UsingXtendSWithOperatorSpec.class })
@SuppressWarnings("all")
public class CommonConceptsSuite {
}
