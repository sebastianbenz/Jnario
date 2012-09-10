package org.jnario;

import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.spec.tests.integration.ImplicitSubjectSpec;
import org.jnario.spec.tests.integration.SpecExtensionsSpec;
import org.jnario.spec.tests.integration.UsingJUnitRulesInSpecsSpec;
import org.jnario.spec.tests.integration.UsingTablesSpec;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Specs")
@Contains({ ImplicitSubjectSpec.class, SpecExtensionsSpec.class, UsingJUnitRulesInSpecsSpec.class, UsingTablesSpec.class })
@SuppressWarnings("all")
public class SpecsSuite {
}
