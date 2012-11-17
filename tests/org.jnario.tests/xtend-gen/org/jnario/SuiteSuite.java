package org.jnario;

import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.suite.documentation.IntroducingJnarioSuitesSpec;
import org.jnario.suite.unit.PatternValueConverterSpec;
import org.jnario.suite.unit.SpecResolverSpec;
import org.jnario.suite.unit.SuiteClassNameProviderSpec;
import org.jnario.suite.unit.SuiteDocGeneratorSpec;
import org.jnario.suite.unit.SuiteExecutableProviderSpec;
import org.jnario.suite.unit.SuiteJavaValidatorSpec;
import org.jnario.suite.unit.SuiteNodeBuilderSpec;
import org.jnario.suite.unit.SuiteQualifiedNameProviderSpec;
import org.jnario.suite.unit.SuiteScopeProviderSpec;
import org.jnario.suite.unit.SuiteSpecFilterSpec;
import org.jnario.suite.unit.SuiteValueConverterSpec;
import org.jnario.suite.unit.TextValueConverterSpec;
import org.junit.runner.RunWith;

@Named("Suite")
@Contains({ IntroducingJnarioSuitesSpec.class, PatternValueConverterSpec.class, SpecResolverSpec.class, SuiteClassNameProviderSpec.class, SuiteDocGeneratorSpec.class, SuiteExecutableProviderSpec.class, SuiteJavaValidatorSpec.class, SuiteNodeBuilderSpec.class, SuiteQualifiedNameProviderSpec.class, SuiteScopeProviderSpec.class, SuiteSpecFilterSpec.class, SuiteValueConverterSpec.class, TextValueConverterSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
public class SuiteSuite {
}
