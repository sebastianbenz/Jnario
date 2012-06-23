package org.jnario;

import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.suite.unit.PatternValueConverterSpec;
import org.jnario.suite.unit.SpecResolverSpec;
import org.jnario.suite.unit.SuiteClassNameProviderSpec;
import org.jnario.suite.unit.SuiteNodeBuilderSpec;
import org.jnario.suite.unit.SuiteQualifiedNameProviderSpec;
import org.jnario.suite.unit.SuiteValueConverterSpec;
import org.jnario.suite.unit.TextValueConverterSpec;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Suite")
@Contains({ SuiteValueConverterSpec.class, SuiteQualifiedNameProviderSpec.class, PatternValueConverterSpec.class, SpecResolverSpec.class, SuiteNodeBuilderSpec.class, SuiteClassNameProviderSpec.class, TextValueConverterSpec.class })
@SuppressWarnings("all")
public class SuiteSuite {
}
