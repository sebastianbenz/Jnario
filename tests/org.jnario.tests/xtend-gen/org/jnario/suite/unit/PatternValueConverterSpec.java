package org.jnario.suite.unit;

import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.suite.unit.PatternValueConverterToStringStringSpec;
import org.jnario.suite.unit.PatternValueConverterToValueStringINodeSpec;
import org.junit.runner.RunWith;

@Contains({ PatternValueConverterToStringStringSpec.class, PatternValueConverterToValueStringINodeSpec.class })
@SuppressWarnings("all")
@Named("PatternValueConverter")
@RunWith(ExampleGroupRunner.class)
public class PatternValueConverterSpec {
}
