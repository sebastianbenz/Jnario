package example;

import org.hamcrest.StringDescription;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Adding values")
public class AddingValuesSpec {
  @Test
  @Named("4 + 3 is 8")
  @Order(99)
  public void __43Is8() throws Exception {
    int _plus = (4 + 3);
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_plus), Integer.valueOf(8));
    Assert.assertTrue("\nExpected 4 + 3 => 8 but"
     + "\n     4 + 3 is " + new StringDescription().appendValue(Integer.valueOf(_plus)).toString() + "\n", _doubleArrow);
    
  }
}
