package org.jnario.spec.tests.unit.parsing;

import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.tests.unit.parsing.SpecsSyntaxSpec;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Another sub-context")
public class SpecsSyntaxAnotherSubContextSpec extends SpecsSyntaxSpec {
  @Test
  @Ignore
  @Named("multiple sub contexts per file [PENDING]")
  @Order(0)
  public void multipleSubContextsPerFile() throws Exception {
    throw new UnsupportedOperationException("multipleSubContextsPerFileis not implemented");
  }
}
