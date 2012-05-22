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
@Named("StaticImports")
public class StaticImportsSpec {
  @Test
  @Named("should resolve static imports")
  @Order(99)
  public void shouldResolveStaticImports() throws Exception {
    final String spec = "\r\n\t\t\tpackage bootstrap\r\n\t\t\t\r\n\t\t\timport static org.junit.Assert.*\r\n\t\r\n\t\t\tdescribe \"Example\" {\r\n\t\t\t\r\n\t\t\t\tfact \"should resolve static imports\"{\r\n\t\t\t\t\tassertTrue(true) \r\n\t\t\t\t} \r\n\t\t\t\t\t\t\r\n\t\t\t}\r\n\t\t";
    final Result result = SpecExecutor.execute(spec);
    Matcher<Result> _isSuccessful = ResultMatchers.isSuccessful();
    Assert.<Result>assertThat(result, _isSuccessful);
  }
}
