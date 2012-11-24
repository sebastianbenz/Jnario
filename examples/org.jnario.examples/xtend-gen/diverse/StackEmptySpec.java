package diverse;

import diverse.StackSpec;
import java.util.EmptyStackException;
import java.util.Stack;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
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
@Named("empty")
public class StackEmptySpec extends StackSpec {
  final Stack<String> emptyStack = new Function0<Stack<String>>() {
    public Stack<String> apply() {
      Stack<String> _stack = new Stack<String>();
      return _stack;
    }
  }.apply();
  
  @Test
  @Named("emptyStack.size should be 0")
  @Order(1)
  public void _emptyStackSizeShouldBe0() throws Exception {
    int _size = this.emptyStack.size();
    boolean _should_be = Should.should_be(Integer.valueOf(_size), Integer.valueOf(0));
    Assert.assertTrue("\nExpected emptyStack.size should be 0 but"
     + "\n     emptyStack.size is " + new StringDescription().appendValue(Integer.valueOf(_size)).toString()
     + "\n     emptyStack is " + new StringDescription().appendValue(this.emptyStack).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("emptyStack.pop throws EmptyStackException")
  @Order(2)
  public void _emptyStackPopThrowsEmptyStackException() throws Exception {
    try{
      this.emptyStack.pop();
      Assert.fail("Expected " + EmptyStackException.class.getName() + " in \n     emptyStack.pop\n with:"
       + "\n     emptyStack is " + new StringDescription().appendValue(this.emptyStack).toString());
    }catch(EmptyStackException e){
    }
  }
}
