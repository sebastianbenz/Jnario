package org.jnario.standalone.tests;

import org.hamcrest.Matcher;
import org.jnario.jnario.test.util.SuiteTestCreator;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.standalone.tests.JnarioDocCompilerSpec;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("SuiteDocCompiler")
@CreateWith(value = SuiteTestCreator.class)
public class JnarioDocCompilerSuiteDocCompilerSpec extends JnarioDocCompilerSpec {
  @Test
  @Named("\\\"test/ExampleSuite.html\\\" should be generated")
  @Order(99)
  public void testExampleSuiteHtmlShouldBeGenerated() throws Exception {
    Matcher<String> _generated = this.generated();
    boolean _should_be = Should.<String>should_be("test/ExampleSuite.html", _generated);
    Assert.assertTrue("\nExpected \"test/ExampleSuite.html\" should be generated but"
     + "\n     generated is " + _generated + "\n", _should_be);
    
  }
}
