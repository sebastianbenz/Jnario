package diverse;

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
@Named("Stack")
public class StackSpec {
  @Subject
  public Stack subject;
  
  @Test
  @Named("subject.empty should be true")
  @Order(99)
  public void _subjectEmptyShouldBeTrue() throws Exception {
    boolean _empty = this.subject.empty();
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_empty), true);
    Assert.assertTrue("\nExpected subject.empty should be true but"
     + "\n     subject.empty is " + new StringDescription().appendValue(Boolean.valueOf(_empty)).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("initially empty")
  @Order(99)
  public void _initiallyEmpty() throws Exception {
    int _size = this.subject.size();
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_size), Integer.valueOf(0));
    Assert.assertTrue("\nExpected subject.size => 0 but"
     + "\n     subject.size is " + new StringDescription().appendValue(Integer.valueOf(_size)).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("subject.pop[] throws EmptyStackException")
  @Order(99)
  public void _subjectPopThrowsEmptyStackException() throws Exception {
    try{
      this.subject.pop();
      Assert.fail("Expected " + EmptyStackException.class.getName() + " in \n     subject.pop()\n with:"
       + "\n     subject is " + new StringDescription().appendValue(this.subject).toString());
    }catch(EmptyStackException e){
      // expected
    }
  }
  
  @Test
  @Named("increases size when pushing")
  @Order(99)
  public void _increasesSizeWhenPushing() throws Exception {
    this.subject.push("something");
    int _size = this.subject.size();
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_size), Integer.valueOf(1));
    Assert.assertTrue("\nExpected subject.size => 1 but"
     + "\n     subject.size is " + new StringDescription().appendValue(Integer.valueOf(_size)).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("decreases size when popping")
  @Order(99)
  public void _decreasesSizeWhenPopping() throws Exception {
    this.subject.push("something");
    this.subject.pop();
    int _size = this.subject.size();
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_size), Integer.valueOf(0));
    Assert.assertTrue("\nExpected subject.size => 0 but"
     + "\n     subject.size is " + new StringDescription().appendValue(Integer.valueOf(_size)).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("pop returns last pushed element")
  @Order(99)
  public void _popReturnsLastPushedElement() throws Exception {
    this.subject.push("something");
    this.subject.push("something else");
    Object _pop = this.subject.pop();
    boolean _doubleArrow = Should.operator_doubleArrow(_pop, "something else");
    Assert.assertTrue("\nExpected subject.pop() => \"something else\" but"
     + "\n     subject.pop() is " + new StringDescription().appendValue(_pop).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _doubleArrow);
    
    Object _pop_1 = this.subject.pop();
    boolean _doubleArrow_1 = Should.operator_doubleArrow(_pop_1, "something");
    Assert.assertTrue("\nExpected subject.pop() => \"something\" but"
     + "\n     subject.pop() is " + new StringDescription().appendValue(_pop_1).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _doubleArrow_1);
    
  }
}
