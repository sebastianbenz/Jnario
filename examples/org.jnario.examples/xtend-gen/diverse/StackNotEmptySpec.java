package diverse;

import diverse.StackSpec;
import java.util.Stack;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("not empty")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class StackNotEmptySpec extends StackSpec {
  @Test
  @Named("pop removes last element")
  @Order(1)
  public void _popRemovesLastElement() throws Exception {
    final Stack<String> stack = new Stack<String>();
    stack.add("something");
    String _pop = stack.pop();
    Assert.assertTrue("\nExpected stack.pop => \"something\" but"
     + "\n     stack.pop is " + new org.hamcrest.StringDescription().appendValue(_pop).toString()
     + "\n     stack is " + new org.hamcrest.StringDescription().appendValue(stack).toString() + "\n", Should.<String>operator_doubleArrow(_pop, "something"));
    
  }
}
