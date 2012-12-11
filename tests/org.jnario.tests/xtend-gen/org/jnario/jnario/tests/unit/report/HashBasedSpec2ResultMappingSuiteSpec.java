package org.jnario.jnario.tests.unit.report;

import org.jnario.jnario.tests.unit.report.HashBasedSpec2ResultMappingSpec;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("Suite")
@RunWith(ExampleGroupRunner.class)
public class HashBasedSpec2ResultMappingSuiteSpec extends HashBasedSpec2ResultMappingSpec {
  @Test
  @Ignore
  @Named("matches referenced suites [PENDING]")
  @Order(23)
  public void _matchesReferencedSuites() throws Exception {
    throw new UnsupportedOperationException("_matchesReferencedSuitesis not implemented");
  }
}
