package diverse;

import java.util.EmptyStackException;
import java.util.Stack;
import org.hamcrest.CoreMatchers;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Stack")
public class StackSpec {
  @Subject
  public Stack subject;
  
  @Test
  @Named("[subject.empty should be true]")
  @Order(0)
  public void subjectEmptyShouldBeTrue() throws Exception {
    boolean _empty = this.subject.empty();
    boolean result = CoreMatchers.is(true).matches(_empty);
    Assert.assertTrue("\nExpected subject.empty should be true but:"
     + "\n     subject.empty is " + _empty
     + "\n     subject is " + this.subject + "\n", result);
  }
  
  @Test
  @Named("initially empty")
  @Order(1)
  public void initiallyEmpty() throws Exception {
    int _size = this.subject.size();
    boolean result = CoreMatchers.is(0).matches(_size);
    Assert.assertTrue("\nExpected subject.size => 0 but:"
     + "\n     subject.size is " + _size
     + "\n     subject is " + this.subject + "\n", result);
  }
  
  @Test(expected = EmptyStackException.class)
  @Named("throws EmptyStackException  [subject.pop()]")
  @Order(2)
  public void subjectPop() throws Exception {
    this.subject.pop();
  }
  
  @Test
  @Named("increases size when pushing")
  @Order(3)
  public void increasesSizeWhenPushing() throws Exception {
    this.subject.push("something");
    int _size = this.subject.size();
    boolean result = CoreMatchers.is(1).matches(_size);
    Assert.assertTrue("\nExpected subject.size => 1 but:"
     + "\n     subject.size is " + _size
     + "\n     subject is " + this.subject + "\n", result);
  }
  
  @Test
  @Named("decreases size when popping")
  @Order(4)
  public void decreasesSizeWhenPopping() throws Exception {
    this.subject.push("something");
    this.subject.pop();
    int _size = this.subject.size();
    boolean result = CoreMatchers.is(0).matches(_size);
    Assert.assertTrue("\nExpected subject.size => 0 but:"
     + "\n     subject.size is " + _size
     + "\n     subject is " + this.subject + "\n", result);
  }
  
  @Test
  @Named("pop returns last pushed element")
  @Order(5)
  public void popReturnsLastPushedElement() throws Exception {
    this.subject.push("something");
    this.subject.push("something else");
    Object _pop = this.subject.pop();
    boolean result = CoreMatchers.is("something else").matches(_pop);
    Assert.assertTrue("\nExpected subject.pop() => \"something else\" but:"
     + "\n     subject.pop() is " + _pop
     + "\n     subject is " + this.subject + "\n", result);
    Object _pop_1 = this.subject.pop();
    boolean result_1 = CoreMatchers.is("something").matches(_pop_1);
    Assert.assertTrue("\nExpected subject.pop() => \"something\" but:"
     + "\n     subject.pop() is " + _pop_1
     + "\n     subject is " + this.subject + "\n", result_1);
  }
}
