package org.jnario.feature.tests.integration;

import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.jnario.lib.Should;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: And stuff.")
@SuppressWarnings("all")
public class ParsingSimpleJnarioFilesFeatureAndStuff {
  @Test
  @Order(0)
  @Named("Given two numbers.")
  public void givenTwoNumbers() {
      this.x = 3;
      this.y = 5;
  }
  
  @Test
  @Order(1)
  @Named("And their sum.")
  public void andTheirSum() {
    this.z = 8;
  }
  
  @Test
  @Order(2)
  @Named("Then the adding these should be the result.")
  public void thenTheAddingTheseShouldBeTheResult() {
    int _plus = IntegerExtensions.operator_plus(this.x, this.y);
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_plus), Integer.valueOf(this.z));Assert
    .assertTrue("\nExpected (x+y) => z but"
     + "\n     x+y is " + Integer.valueOf(_plus)
     + "\n     x is " + this.x
     + "\n     y is " + this.y
     + "\n     z is " + Integer.valueOf(this.z) + "\n", _doubleArrow);
    
  }
  
  public int x;
  
  public int y;
  
  public int z;
}
