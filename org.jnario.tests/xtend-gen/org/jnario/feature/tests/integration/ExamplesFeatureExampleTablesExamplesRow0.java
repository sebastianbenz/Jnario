package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.ExamplesFeatureExampleTables;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("[x = 1, y = 2, z = 4]")
public class ExamplesFeatureExampleTablesExamplesRow0 extends ExamplesFeatureExampleTables {
  public ExamplesFeatureExampleTablesExamplesRow0() {
    super.x = 1;
    super.y = 2;
    super.z = 4;
    
  }
}
