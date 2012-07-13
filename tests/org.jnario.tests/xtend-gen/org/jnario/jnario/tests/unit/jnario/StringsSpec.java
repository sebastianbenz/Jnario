package org.jnario.jnario.tests.unit.jnario;

import org.jnario.jnario.tests.unit.jnario.StringsMakeJunitConformSpec;
import org.jnario.jnario.tests.unit.jnario.StringsStartsWithWordSpec;
import org.jnario.jnario.tests.unit.jnario.StringsTrimSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ StringsStartsWithWordSpec.class, StringsMakeJunitConformSpec.class, StringsTrimSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Strings")
public class StringsSpec {
}
