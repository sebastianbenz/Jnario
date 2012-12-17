package org.jnario.feature.tests.integration;

import org.hamcrest.StringDescription;
import org.jnario.feature.tests.integration.ParsingSimpleJnarioFilesFeature;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: And stuff.")
@SuppressWarnings("all")
public class ParsingSimpleJnarioFilesFeatureAndStuff extends ParsingSimpleJnarioFilesFeature {
  int x;
  
  int y;
  
  int z;
  
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
    int _plus = (this.x + this.y);
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_plus), Integer.valueOf(this.z));
    Assert.assertTrue("\nExpected (x+y) => z but"
     + "\n     x+y is " + new StringDescription().appendValue(Integer.valueOf(_plus)).toString()
     + "\n     x is " + new StringDescription().appendValue(this.x).toString()
     + "\n     y is " + new StringDescription().appendValue(this.y).toString()
     + "\n     z is " + new StringDescription().appendValue(Integer.valueOf(this.z)).toString() + "\n", _doubleArrow);
    
  }
}
