package org.jnario.spec.tests.unit.parsing;

import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.tests.unit.parsing.SpecsSyntaxSubContextSpec;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("sub-sub-context 2")
public class SpecsSyntaxSubContextSubSubContext2Spec extends SpecsSyntaxSubContextSpec {
  @Test
  @Ignore
  @Named("context can be nested [PENDING]")
  @Order(0)
  public void contextCanBeNested() throws Exception {
    throw new UnsupportedOperationException("contextCanBeNestedis not implemented");
  }
}
