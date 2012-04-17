package org.jnario.feature.tests.integration;

import org.hamcrest.Matcher;
import org.hamcrest.core.Is;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Import stuff.")
@SuppressWarnings("all")
public class UsingImportsInAFileFeatureImportStuff {
  @Test
  @Order(0)
  @Named("Given some variables.")
  public void givenSomeVariables() {
      this.x = 3;
      this.y = 4;
      this.z = 5;
  }
  
  @Test
  @Order(1)
  @Named("When I add them")
  public void whenIAddThem() {
    int _plus = (this.x + this.y);
    int _plus_1 = (_plus + this.z);
    this.sum = _plus_1;
  }
  
  @Test
  @Order(2)
  @Named("Then the sum should be 12.")
  public void thenTheSumShouldBe12() {
    Matcher<Integer> _is = Is.<Integer>is(Integer.valueOf(12));
    Assert.<Integer>assertThat(Integer.valueOf(this.sum), _is);
  }
  
  public int x;
  
  public int y;
  
  public int z;
  
  public int sum;
}
