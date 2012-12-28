package org.jnario.spec.tests.integration;

import com.google.common.base.Objects;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.hamcrest.StringDescription;
import org.jnario.jnario.test.util.Helpers;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * You can use the `should` statement to express the expected behavior of objects.
 */
@SuppressWarnings("all")
@Named("Using Should")
@RunWith(ExampleGroupRunner.class)
public class UsingShouldSpec {
  /**
   * `should` passes if the result of the left expression is
   * equal to the result of the right expression. You can use `not` to
   * assert that the expressions have different results. There is also
   * a short cut available: `=>` which has the same effect as `should be`.
   */
  @Test
  @Named("To pass..")
  @Order(1)
  public void _toPass() throws Exception {
    boolean _should_be = Should.<Boolean>should_be(
      Boolean.valueOf(true), true);
    Assert.assertTrue("\nExpected // equality\n\t\ttrue should be true but"
     + "\n     // equality\n\t\ttrue should be true is " + new StringDescription().appendValue(true).toString() + "\n", _should_be);
    
    int _plus = (1 + 1);
    boolean _should_be_1 = Should.should_be(Integer.valueOf(_plus), Integer.valueOf(1));
    Assert.assertFalse("\nExpected 1 + 1 should not be 1 but"
     + "\n     1 + 1 is " + new StringDescription().appendValue(Integer.valueOf(_plus)).toString() + "\n", _should_be_1);
    
    Matcher<String> _nullValue = CoreMatchers.<String>nullValue();
    boolean _should_be_2 = Should.<String>should_be(
      "something", _nullValue);
    Assert.assertFalse("\nExpected \"something\" should not be null but" + " did not." + "\n", _should_be_2);
    
    int _plus_1 = (1 + 1);
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_plus_1), Integer.valueOf(2));
    Assert.assertTrue("\nExpected 1 + 1 => 2 but"
     + "\n     1 + 1 is " + new StringDescription().appendValue(Integer.valueOf(_plus_1)).toString() + "\n", _doubleArrow);
    
    boolean _doubleArrow_1 = Should.operator_doubleArrow(
      "a string", String.class);
    Assert.assertTrue("\nExpected // types\n\t\t\"a string\" => typeof(String) but"
     + "\n     // types\n\t\t\"a string\" => typeof(String) is " + new StringDescription().appendValue(_doubleArrow_1).toString() + "\n", _doubleArrow_1);
    
    Class<? extends Object> _class = "a string".getClass();
    boolean _doubleArrow_2 = Should.operator_doubleArrow(_class, String.class);
    Assert.assertTrue("\nExpected \"a string\".getClass => typeof(String) but"
     + "\n     \"a string\".getClass is " + new StringDescription().appendValue(_class).toString() + "\n", _doubleArrow_2);
    
    boolean _should_contain = Should.should_contain(
      "something", "thing");
    Assert.assertTrue("\nExpected // strings\n\t\t\"something\" should contain \"thing\" but"
     + "\n     // strings\n\t\t\"something\" should contain \"thing\" is " + new StringDescription().appendValue(true).toString() + "\n", _should_contain);
    
    boolean _should_contain_1 = Should.should_contain(
      "something", "any");
    Assert.assertFalse("\nExpected \"something\" should not contain \"any\" but"
     + "\n     \"something\" should not contain \"any\" is " + new StringDescription().appendValue(true).toString() + "\n", _should_contain_1);
    
    List<String> _list = JnarioCollectionLiterals.<String>list("something");
    boolean _should_contain_2 = Should.<String>should_contain(_list, "something");
    Assert.assertTrue("\nExpected // iterables\n\t\tlist(\"something\") should contain \"something\" but"
     + "\n     // iterables\n\t\tlist(\"something\") is " + new StringDescription().appendValue(_list).toString() + "\n", _should_contain_2);
    
    List<String> _list_1 = JnarioCollectionLiterals.<String>list("something");
    boolean _should_contain_3 = Should.<String>should_contain(_list_1, "something else");
    Assert.assertFalse("\nExpected list(\"something\") should not contain \"something else\" but"
     + "\n     list(\"something\") is " + new StringDescription().appendValue(_list_1).toString() + "\n", _should_contain_3);
    
    final Procedure1<String> _function = new Procedure1<String>() {
        public void apply(final String it) {
          int _length = it.length();
          boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_length), Integer.valueOf(11));
          Assert.assertTrue("\nExpected length => 11 but"
           + "\n     length is " + new StringDescription().appendValue(Integer.valueOf(_length)).toString() + "\n", _doubleArrow);
          
          boolean _should_startWith = Should.should_startWith(it, "hello");
          Assert.assertTrue("\nExpected it should startWith(\"hello\") but"
           + "\n     it is " + new StringDescription().appendValue(it).toString() + "\n", _should_startWith);
          
          boolean _should_endWith = Should.should_endWith(it, "world");
          Assert.assertTrue("\nExpected it should endWith(\"world\") but"
           + "\n     it is " + new StringDescription().appendValue(it).toString() + "\n", _should_endWith);
          
        }
      };
    final String greeting = ObjectExtensions.<String>operator_doubleArrow("hello world", _function);
    boolean _doubleArrow_3 = Should.operator_doubleArrow(greeting, String.class);
    Assert.assertTrue("\nExpected greeting => typeof(String) but"
     + "\n     greeting is " + new StringDescription().appendValue(greeting).toString() + "\n", _doubleArrow_3);
    
    boolean expectedException = false;
    String message = "";
    try{
      Stack<String> _stack = new Stack<String>();
      _stack.pop();
      message = "Expected " + EmptyStackException.class.getName() + " for \n     // expecting exceptions\n\t\tnew Stack<String>().pop\n with:"
       + "\n     // expecting exceptions\n\t\tnew Stack<String>() is " + new StringDescription().appendValue(_stack).toString();
    }catch(EmptyStackException e){
      expectedException = true;
    }
    Assert.assertTrue(message, expectedException);
    boolean expectedException_1 = false;
    String message_1 = "";
    try{
      Stack<String> _stack_1 = new Stack<String>();
      _stack_1.pop();
      message_1 = "Expected " + EmptyStackException.class.getName() + " for \n     new Stack<String>().pop\n with:"
       + "\n     new Stack<String>() is " + new StringDescription().appendValue(_stack_1).toString();
    }catch(EmptyStackException e){
      expectedException_1 = true;
    }
    Assert.assertTrue(message_1, expectedException_1);
  }
  
  /**
   * `should` throws an AssertionError if the result of the left
   * expression does not equal the result of the right expression.
   * Here is a helper method we are going to use:
   * 
   * <pre class="prettyprint lang-spec">
   * def void method(){
   *   throw new IllegalArgumentException
   * }
   * </pre>
   * 
   * ...and here are the examples:
   */
  @Test
  @Named("...or not to pass")
  @Order(2)
  public void _orNotToPass() throws Exception {
    boolean expectedException = false;
    String message = "";
    try{
      int _plus = (1 + 1);
      boolean _should_be = Should.should_be(Integer.valueOf(_plus), Integer.valueOf(1));
      Assert.assertTrue("\nExpected 1 + 1 should be 1 but"
       + "\n     1 + 1 is " + new StringDescription().appendValue(Integer.valueOf(_plus)).toString() + "\n", _should_be);
      
      message = "Expected " + AssertionError.class.getName() + " for \n     1 + 1 should be 1\n with:"
       + "\n     1 + 1 is " + new StringDescription().appendValue(Integer.valueOf(_plus)).toString();
    }catch(AssertionError e){
      expectedException = true;
    }
    Assert.assertTrue(message, expectedException);
    boolean expectedException_1 = false;
    String message_1 = "";
    try{
      int _plus_1 = (1 + 1);
      boolean _should_be_1 = Should.should_be(Integer.valueOf(_plus_1), Integer.valueOf(2));
      Assert.assertFalse("\nExpected 1 + 1 should not be 2 but"
       + "\n     1 + 1 is " + new StringDescription().appendValue(Integer.valueOf(_plus_1)).toString() + "\n", _should_be_1);
      
      message_1 = "Expected " + AssertionError.class.getName() + " for \n     1 + 1 should not be 2\n with:"
       + "\n     1 + 1 is " + new StringDescription().appendValue(Integer.valueOf(_plus_1)).toString();
    }catch(AssertionError e){
      expectedException_1 = true;
    }
    Assert.assertTrue(message_1, expectedException_1);
    boolean expectedException_2 = false;
    String message_2 = "";
    try{
      int _plus_2 = (1 + 1);
      boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_plus_2), Integer.valueOf(1));
      Assert.assertTrue("\nExpected 1 + 1 => 1 but"
       + "\n     1 + 1 is " + new StringDescription().appendValue(Integer.valueOf(_plus_2)).toString() + "\n", _doubleArrow);
      
      message_2 = "Expected " + AssertionError.class.getName() + " for \n     1 + 1 => 1\n with:"
       + "\n     1 + 1 is " + new StringDescription().appendValue(Integer.valueOf(_plus_2)).toString();
    }catch(AssertionError e){
      expectedException_2 = true;
    }
    Assert.assertTrue(message_2, expectedException_2);
    boolean expectedException_3 = false;
    String message_3 = "";
    try{
      Object _object = new Object();
      Matcher<?> _nullValue = CoreMatchers.nullValue();
      boolean _doubleArrow_1 = Should.operator_doubleArrow(_object, _nullValue);
      Assert.assertTrue("\nExpected new Object => null but"
       + "\n     new Object is " + new StringDescription().appendValue(_object).toString() + "\n", _doubleArrow_1);
      
      message_3 = "Expected " + AssertionError.class.getName() + " for \n     new Object => null\n with:"
       + "\n     new Object is " + new StringDescription().appendValue(_object).toString();
    }catch(AssertionError e){
      expectedException_3 = true;
    }
    Assert.assertTrue(message_3, expectedException_3);
    boolean expectedException_4 = false;
    String message_4 = "";
    try{
      Object _object_1 = new Object();
      Matcher<Object> _nullValue_1 = CoreMatchers.<Object>nullValue();
      boolean _should_be_2 = Should.<Object>should_be(_object_1, _nullValue_1);
      Assert.assertTrue("\nExpected new Object should be null but"
       + "\n     new Object is " + new StringDescription().appendValue(_object_1).toString() + "\n", _should_be_2);
      
      message_4 = "Expected " + AssertionError.class.getName() + " for \n     new Object should be null\n with:"
       + "\n     new Object is " + new StringDescription().appendValue(_object_1).toString();
    }catch(AssertionError e){
      expectedException_4 = true;
    }
    Assert.assertTrue(message_4, expectedException_4);
    boolean expectedException_5 = false;
    String message_5 = "";
    try{
      this.method();
      message_5 = "Expected " + IllegalArgumentException.class.getName() + " for \n     method()\n with:";
    }catch(IllegalArgumentException e){
      expectedException_5 = true;
    }
    Assert.assertTrue(message_5, expectedException_5);
  }
  
  /**
   * When failing, `should` and `=>` try to give you as much context information as possible.
   * The error message will print the values of all expressions and their subexpressions.
   */
  @Test
  @Named("Why did it fail?")
  @Order(3)
  public void _whyDidItFail() throws Exception {
    final Procedure1<Boolean> _function = new Procedure1<Boolean>() {
        public void apply(final Boolean it) {
          int _plus = (1 + 1);
          boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_plus), Integer.valueOf(1));
          Assert.assertTrue("\nExpected 1 + 1 => 1 but"
           + "\n     1 + 1 is " + new StringDescription().appendValue(Integer.valueOf(_plus)).toString() + "\n", _doubleArrow);
          
        }
      };
    String _errorMessage = Helpers.errorMessage(_function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Expected 1 + 1 => 1 but");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("1 + 1 is <2>");
    Helpers.is(_errorMessage, _builder);
    final String x = "hello";
    final Procedure1<Boolean> _function_1 = new Procedure1<Boolean>() {
        public void apply(final Boolean it) {
          String _upperCase = x.toUpperCase();
          boolean _should_be = Should.should_be(_upperCase, "HELLO");
          Assert.assertFalse("\nExpected x.toUpperCase should not be \"HELLO\" but"
           + "\n     x.toUpperCase is " + new StringDescription().appendValue(_upperCase).toString()
           + "\n     x is " + new StringDescription().appendValue(x).toString() + "\n", _should_be);
          
        }
      };
    String _errorMessage_1 = Helpers.errorMessage(_function_1);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("Expected x.toUpperCase should not be \"HELLO\" but");
    _builder_1.newLine();
    _builder_1.append("     ");
    _builder_1.append("x.toUpperCase is \"HELLO\"");
    _builder_1.newLine();
    _builder_1.append("     ");
    _builder_1.append("x is \"hello\"");
    Helpers.is(_errorMessage_1, _builder_1);
    final String y = "world";
    final Procedure1<Boolean> _function_2 = new Procedure1<Boolean>() {
        public void apply(final Boolean it) {
          boolean _doubleArrow = Should.operator_doubleArrow(x, y);
          Assert.assertTrue("\nExpected x => y but"
           + "\n     x is " + new StringDescription().appendValue(x).toString()
           + "\n     y is " + new StringDescription().appendValue(y).toString() + "\n", _doubleArrow);
          
        }
      };
    String _errorMessage_2 = Helpers.errorMessage(_function_2);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("Expected x => y but");
    _builder_2.newLine();
    _builder_2.append("     ");
    _builder_2.append("x is \"hello\"");
    _builder_2.newLine();
    _builder_2.append("     ");
    _builder_2.append("y is \"world\"");
    Helpers.is(_errorMessage_2, _builder_2);
  }
  
  /**
   * In order to be able to print the value of all subexpressions when an assertion failed,
   * we disabled the short circuit semantics of '&&' and '||' within assertions.
   */
  @Test
  @Named("Short Circuit Invocation")
  @Order(4)
  public void _shortCircuitInvocation() throws Exception {
    final String aString = null;
    boolean expectedException = false;
    String message = "";
    try{
      boolean _notEquals = (!Objects.equal(aString, null));
      int _length = aString.length();
      boolean _equals = (_length == 0);
      boolean _and = (_notEquals && _equals);
      Assert.assertTrue("\nExpected aString != null && aString.length == 0 but"
       + "\n     aString != null is " + new StringDescription().appendValue(_notEquals).toString()
       + "\n     aString is " + new StringDescription().appendValue(aString).toString()
       + "\n     aString.length == 0 is " + new StringDescription().appendValue(_equals).toString()
       + "\n     aString.length is " + new StringDescription().appendValue(_length).toString() + "\n", _and);
      
      message = "Expected " + NullPointerException.class.getName() + " for \n     assert aString != null && aString.length == 0\n with:"
       + "\n     aString != null && aString.length == 0 is " + new StringDescription().appendValue(_and).toString()
       + "\n     aString != null is " + new StringDescription().appendValue(_notEquals).toString()
       + "\n     aString is " + new StringDescription().appendValue(aString).toString()
       + "\n     aString.length == 0 is " + new StringDescription().appendValue(_equals).toString()
       + "\n     aString.length is " + new StringDescription().appendValue(_length).toString();
    }catch(NullPointerException e){
      expectedException = true;
    }
    Assert.assertTrue(message, expectedException);
  }
  
  /**
   * You can also the `should` and `=>` together with [hamcrest](http://code.google.com/p/hamcrest/)
   * matchers. The following static import statements are needed to run the examples:
   * 
   *     import static org.hamcrest.CoreMatchers.startsWith
   *     import static org.hamcrest.CoreMatchers.equalTo
   *     import static org.hamcrest.Matchers.hasItem
   * 
   * If the right-hand side of a should expression is a matcher, the matcher will be evaluated instead
   * of testing for equality:
   */
  @Test
  @Named("Combining hamcrest and should")
  @Order(5)
  public void _combiningHamcrestAndShould() throws Exception {
    Matcher<String> _startsWith = Matchers.startsWith("h");
    boolean _doubleArrow = Should.operator_doubleArrow(
      "hello", _startsWith);
    Assert.assertTrue("\nExpected \"hello\" => startsWith(\"h\") but"
     + "\n     startsWith(\"h\") is " + new StringDescription().appendValue(_startsWith).toString() + "\n", _doubleArrow);
    
    List<String> _list = JnarioCollectionLiterals.<String>list("red", "green");
    Matcher<Iterable<String>> _hasItem = Matchers.<String>hasItem("red");
    boolean _doubleArrow_1 = Should.operator_doubleArrow(_list, _hasItem);
    Assert.assertTrue("\nExpected list(\"red\", \"green\") => hasItem(\"red\") but"
     + "\n     list(\"red\", \"green\") is " + new StringDescription().appendValue(_list).toString()
     + "\n     hasItem(\"red\") is " + new StringDescription().appendValue(_hasItem).toString() + "\n", _doubleArrow_1);
    
    Matcher<Integer> _greaterThan = Matchers.<Integer>greaterThan(Integer.valueOf(5));
    boolean _should_be = Should.<Integer>should_be(
      Integer.valueOf(9), _greaterThan);
    Assert.assertTrue("\nExpected 9 should be greaterThan(5) but"
     + "\n     greaterThan(5) is " + new StringDescription().appendValue(_greaterThan).toString() + "\n", _should_be);
    
  }
  
  public void method() {
    IllegalArgumentException _illegalArgumentException = new IllegalArgumentException();
    throw _illegalArgumentException;
  }
}
