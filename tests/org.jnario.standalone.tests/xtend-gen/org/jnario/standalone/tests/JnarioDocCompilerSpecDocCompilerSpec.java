package org.jnario.standalone.tests;

import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;
import org.jnario.jnario.test.util.SpecTestCreator;
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
@Named("SpecDocCompiler")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = SpecTestCreator.class)
public class JnarioDocCompilerSpecDocCompilerSpec extends JnarioDocCompilerSpec {
  @Test
  @Named("\\\"test/SpecExampleSpec.html\\\" should be generated")
  @Order(2)
  public void _testSpecExampleSpecHtmlShouldBeGenerated() throws Exception {
    Matcher<String> _generated = this.generated();
    boolean _should_be = Should.<String>should_be("test/SpecExampleSpec.html", _generated);
    Assert.assertTrue("\nExpected \"test/SpecExampleSpec.html\" should be generated but"
     + "\n     generated is " + new StringDescription().appendValue(_generated).toString() + "\n", _should_be);
    
  }
}
