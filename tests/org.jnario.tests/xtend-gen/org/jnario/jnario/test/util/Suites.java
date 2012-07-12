package org.jnario.jnario.test.util;

import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuiteFactory;

@SuppressWarnings("all")
public class Suites {
  private final static SuiteFactory factory = SuiteFactory.eINSTANCE;
  
  public static Suite suite(final String name) {
    Suite _xblockexpression = null;
    {
      final Suite suite = Suites.factory.createSuite();
      suite.setName(name);
      _xblockexpression = (suite);
    }
    return _xblockexpression;
  }
}
