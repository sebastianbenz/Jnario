package org.jnario.suite.unit;

import org.jnario.jnario.test.util.SuiteTestCreator;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.suite.unit.SuiteClassNameProviderDescribeSpec;
import org.jnario.suite.unit.SuiteClassNameProviderToJavaClassNameSpec;
import org.jnario.suite.unit.SuiteClassNameProviderToQualifiedJavaClassNameSpec;
import org.junit.runner.RunWith;

@Contains({ SuiteClassNameProviderToJavaClassNameSpec.class, SuiteClassNameProviderDescribeSpec.class, SuiteClassNameProviderToQualifiedJavaClassNameSpec.class })
@SuppressWarnings("all")
@Named("SuiteClassNameProvider")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = SuiteTestCreator.class)
public class SuiteClassNameProviderSpec {
}
