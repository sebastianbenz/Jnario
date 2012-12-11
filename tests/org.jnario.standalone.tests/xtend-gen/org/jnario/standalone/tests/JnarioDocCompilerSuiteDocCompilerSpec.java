package org.jnario.standalone.tests;

import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;
import org.jnario.jnario.test.util.SuiteTestCreator;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.standalone.tests.JnarioDocCompilerSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("SuiteDocCompiler")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = SuiteTestCreator.class)
public class JnarioDocCompilerSuiteDocCompilerSpec extends JnarioDocCompilerSpec {
  @Test
  @Named("\\\"test/ExampleSuite.html\\\" should be generated")
  @Order(3)
  public void _testExampleSuiteHtmlShouldBeGenerated() throws Exception {
    Matcher<String> _generated = this.generated();
    boolean _should_be = Should.<String>should_be("test/ExampleSuite.html", _generated);
    Assert.assertTrue("\nExpected \"test/ExampleSuite.html\" should be generated but"
     + "\n     generated is " + new StringDescription().appendValue(_generated).toString() + "\n", _should_be);
    
  }
}
