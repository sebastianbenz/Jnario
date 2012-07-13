package org.jnario.suite.unit;

import org.jnario.jnario.test.util.SuiteTestCreator;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.suite.unit.SuiteClassNameProviderDescribeSpec;
import org.jnario.suite.unit.SuiteClassNameProviderGetClassNameSpec;
import org.jnario.suite.unit.SuiteClassNameProviderGetQualifiedClassNameSpec;
import org.junit.runner.RunWith;

@Contains({ SuiteClassNameProviderGetClassNameSpec.class, SuiteClassNameProviderDescribeSpec.class, SuiteClassNameProviderGetQualifiedClassNameSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("SuiteClassNameProvider")
@CreateWith(value = SuiteTestCreator.class)
public class SuiteClassNameProviderSpec {
}
