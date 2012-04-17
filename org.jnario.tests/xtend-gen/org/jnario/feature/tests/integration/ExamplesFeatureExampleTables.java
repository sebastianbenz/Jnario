package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.ExamplesFeatureExampleTablesExamplesRow0;
import org.jnario.feature.tests.integration.ExamplesFeatureExampleTablesExamplesRow1;
import org.jnario.lib.Should;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureExamplesRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureExamplesRunner.class)
@Named("Scenario: Example tables.")
@Contains({ ExamplesFeatureExampleTablesExamplesRow0.class, ExamplesFeatureExampleTablesExamplesRow1.class })
@SuppressWarnings("all")
public class ExamplesFeatureExampleTables {
  public int x;
  
  public int y;
  
  public int z;
  
  @Test
  @Order(0)
  @Ignore
  @Named("[PENDING] Given some variables.")
  public void givenSomeVariables() {
    throw new UnsupportedOperationException("givenSomeVariablesis not implemented");
  }
  
  @Test
  @Order(1)
  @Ignore
  @Named("[PENDING] When I add them x and y")
  public void whenIAddThemXAndY() {
    throw new UnsupportedOperationException("whenIAddThemXAndYis not implemented");
  }
  
  @Test
  @Order(2)
  @Named("Then the sum should be the result.")
  public void thenTheSumShouldBeTheResult() {
    int _plus = (this.x + this.y);
    int _plus_1 = (_plus + 1);
    boolean _should_be = Should.should_be(_plus_1, this.z);Assert
    .assertTrue("\nExpected (x + y + 1) => z but:"
     + "\n     x + y + 1 is " + _plus_1
     + "\n     x + y is " + _plus
     + "\n     x is " + this.x
     + "\n     y is " + this.y
     + "\n     z is " + this.z + "\n", _should_be);
    
  }
}
