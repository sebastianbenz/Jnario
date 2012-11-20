package diverse;

import diverse.StackSpec;
import java.util.EmptyStackException;
import java.util.Stack;
import org.hamcrest.StringDescription;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("empty")
public class StackEmptySpec extends StackSpec {
  @Subject
  public Stack subject;
  
  @Test
  @Named("subject.empty should be true")
  @Order(1)
  public void _subjectEmptyShouldBeTrue() throws Exception {
    boolean _empty = this.subject.empty();
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_empty), true);
    Assert.assertTrue("\nExpected subject.empty should be true but"
     + "\n     subject.empty is " + new StringDescription().appendValue(Boolean.valueOf(_empty)).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("subject.pop[] throws EmptyStackException")
  @Order(2)
  public void _subjectPopThrowsEmptyStackException() throws Exception {
    try{
      this.subject.pop();
      Assert.fail("Expected " + EmptyStackException.class.getName() + " in \n     subject.pop()\n with:"
       + "\n     subject is " + new StringDescription().appendValue(this.subject).toString());
    }catch(EmptyStackException e){
    }
  }
}
