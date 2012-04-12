package org.jnario.spec.tests.unit.parsing;

import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.tests.unit.parsing.SpecsSyntaxSpec;
import org.jnario.spec.tests.unit.parsing.SpecsSyntaxSubContextSubSubContext1Spec;
import org.jnario.spec.tests.unit.parsing.SpecsSyntaxSubContextSubSubContext2Spec;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Contexts
 */
@RunWith(ExampleGroupRunner.class)
@Named("sub-context")
@Contains({ SpecsSyntaxSubContextSubSubContext1Spec.class, SpecsSyntaxSubContextSubSubContext2Spec.class })
public class SpecsSyntaxSubContextSpec extends SpecsSyntaxSpec {
  @Test
  @Ignore
  @Named("context can be nested [PENDING]")
  @Order(0)
  public void contextCanBeNested() throws Exception {
    throw new UnsupportedOperationException("contextCanBeNestedis not implemented");
  }
}
