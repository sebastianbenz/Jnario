package org.jnario.suite.unit;

import org.jnario.jnario.test.util.SuiteTestCreator;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuiteFactory;
import org.jnario.suite.unit.SuiteClassNameProviderDescribeSpecificationSpec;
import org.jnario.suite.unit.SuiteClassNameProviderGetClassNameSpecificationSpec;
import org.junit.runner.RunWith;

@Contains({ SuiteClassNameProviderGetClassNameSpecificationSpec.class, SuiteClassNameProviderDescribeSpecificationSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("SuiteClassNameProvider")
@CreateWith(value = SuiteTestCreator.class)
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
