package org.jnario.suite.unit;

import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.suite.unit.SuiteValueConverterToStringStringSpec;
import org.jnario.suite.unit.SuiteValueConverterToValueStringINodeSpec;
import org.junit.runner.RunWith;

@Contains({ SuiteValueConverterToStringStringSpec.class, SuiteValueConverterToValueStringINodeSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("SuiteValueConverter")
public class SuiteValueConverterSpec {
}
