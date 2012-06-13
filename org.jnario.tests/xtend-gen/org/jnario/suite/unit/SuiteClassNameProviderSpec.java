package org.jnario.suite.unit;

import org.jnario.jnario.test.util.SuiteTestInstantiator;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.InstantiateWith;
import org.jnario.runner.Named;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuiteFactory;
import org.jnario.suite.unit.SuiteClassNameProviderDescribeSuiteSpec;
import org.jnario.suite.unit.SuiteClassNameProviderGetClassNameSpecificationSpec;
import org.junit.runner.RunWith;

@Contains({ SuiteClassNameProviderGetClassNameSpecificationSpec.class, SuiteClassNameProviderDescribeSuiteSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("SuiteClassNameProvider")
@InstantiateWith(value = SuiteTestInstantiator.class)
public class SuiteClassNameProviderSpec {
  public Suite suite(final String name) {
    Suite _xblockexpression = null;
    {
      final Suite suite = SuiteFactory.eINSTANCE.createSuite();
      suite.setName(name);
      _xblockexpression = (suite);
    }
    return _xblockexpression;
  }
}
