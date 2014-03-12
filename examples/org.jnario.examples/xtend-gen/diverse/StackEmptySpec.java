package diverse;

import diverse.StackSpec;
import java.util.EmptyStackException;
import java.util.Stack;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("empty")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class StackEmptySpec extends StackSpec {
  final Stack<String> emptyStack = new Stack<String>();
  
  @Test
  @Named("emptyStack.size should be 0")
  @Order(1)
  public void _emptyStackSizeShouldBe0() throws Exception {
    int _size = this.emptyStack.size();
    boolean _should_be = Should.<Integer>should_be(Integer.valueOf(_size), Integer.valueOf(0));
    Assert.assertTrue("\nExpected emptyStack.size should be 0 but"
     + "\n     emptyStack.size is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_size)).toString()
     + "\n     emptyStack is " + new org.hamcrest.StringDescription().appendValue(this.emptyStack).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("emptyStack.pop throws EmptyStackException")
  @Order(2)
  public void _emptyStackPopThrowsEmptyStackException() throws Exception {
    boolean expectedException = false;
    String message = "";
    try{
      this.emptyStack.pop();
      message = "Expected " + EmptyStackException.class.getName() + " for \n     emptyStack.pop\n with:"
       + "\n     emptyStack is " + new org.hamcrest.StringDescription().appendValue(this.emptyStack).toString();
    }catch(EmptyStackException e){
      expectedException = true;
    }
    Assert.assertTrue(message, expectedException);
  }
}
