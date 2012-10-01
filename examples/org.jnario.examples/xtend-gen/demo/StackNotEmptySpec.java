package demo;

import demo.StackSpec;
import java.util.Stack;
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
@Named("not empty")
public class StackNotEmptySpec extends StackSpec {
  @Test
  @Named("pop removes last element")
  @Order(99)
  public void _popRemovesLastElement() throws Exception {
    Stack<String> _stack = new Stack<String>();
    final Stack<String> stack = _stack;
    stack.add("something");
    String _pop = stack.pop();
    boolean _doubleArrow = Should.operator_doubleArrow(_pop, "something");
    Assert.assertTrue("\nExpected stack.pop => \"something\" but"
     + "\n     stack.pop is " + new StringDescription().appendValue(_pop).toString()
     + "\n     stack is " + new StringDescription().appendValue(stack).toString() + "\n", _doubleArrow);
    
  }
}
