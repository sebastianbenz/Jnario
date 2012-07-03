package org.jnario.suite.documentation;

import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Introducing Jnario Suites")
public class IntroducingJnarioSuitesSpec {
  @Test
  @Ignore
  @Named("Coming soon... [PENDING]")
  @Order(99)
  public void comingSoon() throws Exception {
    throw new UnsupportedOperationException("comingSoonis not implemented");
  }
}
