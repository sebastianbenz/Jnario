package org.jnario.spec.tests.integration;

import org.hamcrest.Matcher;
import org.jnario.jnario.test.util.ResultMatchers;
import org.jnario.jnario.test.util.SpecExecutor;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("SimpleExample")
public class SimpleExampleSpec {
  @Test
  @Named("should pass")
  @Order(99)
  public void shouldPass() throws Exception {
    final String spec = "\r\n\t\t\tpackage bootstrap\r\n\t\r\n\t\t\tdescribe \"Example\" {\r\n\t\t\t\r\n\t\t\t\tfact \"should pass\"{\r\n\t\t\t\t\t\torg::junit::Assert::assertTrue(true) \r\n\t\t\t\t} \r\n\t\t\t\t\t\t\r\n\t\t\t}\r\n\t\t";
    final Result result = SpecExecutor.execute(spec);
    Matcher<Result> _isSuccessful = ResultMatchers.isSuccessful();
    Assert.<Result>assertThat(result, _isSuccessful);
  }
  
  @Test
  @Named("should fail")
  @Order(99)
  public void shouldFail() throws Exception {
    final String spec = "\r\n\t\t\tpackage bootstrap\r\n\r\n\t\t\tdescribe \"Example\" {\r\n\t\t\t\r\n\t\t\t\tfact \"should fail\"{\r\n\t\t\t\t\t\torg::junit::Assert::assertFalse(\"reason of failure\", true)\r\n\t\t\t\t} \r\n\t\t\t\t\t\t\r\n\t\t\t}\r\n\t\t";
    final Result result = SpecExecutor.execute(spec);
    Matcher<Result> _hasSingleFailureContaining = ResultMatchers.hasSingleFailureContaining("reason of failure");
    Assert.<Result>assertThat(result, _hasSingleFailureContaining);
  }
}
