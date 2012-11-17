package org.jnario;

import org.jnario.jnario.tests.integration.ExtensionLibrarySpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.spec.tests.integration.CustomizingTheSpecCreationSpec;
import org.jnario.spec.tests.integration.UsingShouldSpec;
import org.jnario.spec.tests.integration.UsingXtendSWithOperatorSpec;
import org.junit.runner.RunWith;

@Named("Common Concepts")
@Contains({ CustomizingTheSpecCreationSpec.class, ExtensionLibrarySpec.class, UsingShouldSpec.class, UsingXtendSWithOperatorSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
public class CommonConceptsSuite {
}
