package linking;

import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("Example")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExampleSpec {
  @Test
  @Named("should pass")
  @Order(1)
  public void _shouldPass() throws Exception;
}
