package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.ExamplesFeatureExampleTables;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("[x = 3, y = 6, z = 10]")
public class ExamplesFeatureExampleTablesExamplesRow1 extends ExamplesFeatureExampleTables {
  public ExamplesFeatureExampleTablesExamplesRow1() {
    super.x = 3;
    super.y = 6;
    super.z = 10;
    
  }
}
