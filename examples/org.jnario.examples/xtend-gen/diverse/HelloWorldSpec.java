package diverse;

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
@Named("Hello World")
public class HelloWorldSpec {
  @Test
  @Named("\\\"Hello World\\\".length should be 11")
  @Order(0)
  public void _helloWorldLengthShouldBe11() throws Exception {
    int _length = "Hello World".length();
    boolean _should_be = Should.should_be(Integer.valueOf(_length), Integer.valueOf(11));
    Assert.assertTrue("\nExpected \"Hello World\".length should be 11 but"
     + "\n     \"Hello World\".length is " + new StringDescription().appendValue(Integer.valueOf(_length)).toString() + "\n", _should_be);
    
  }
}
