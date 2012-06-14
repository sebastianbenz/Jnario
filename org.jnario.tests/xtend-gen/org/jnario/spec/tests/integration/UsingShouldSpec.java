package org.jnario.spec.tests.integration;

import java.util.ArrayList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.jnario.jnario.test.util.Helpers;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * You can use the `should` statement to express the expected behavior of objects.
 */
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Using Should")
public class UsingShouldSpec {
  /**
   * `should` passes if the result of the left expression is
   * equal to the result of the right expression. You can use `not` to
   * assert that the expressions have different results. There is also
   * a short cut available: `=>` which has the same effect as `should be`.
   */
  @Test
  @Named("To pass..")
  @Order(99)
  public void toPass() throws Exception {
    boolean _should_be = Should.<Boolean>should_be(
      Boolean.valueOf(true), true);
    Assert.assertTrue("\nExpected // equality\n\t\ttrue should be true but"
     + "\n     // equality\n\t\ttrue should be true is " + null + "\n", _should_be);
    
    int _plus = (1 + 1);
    boolean _should_be_1 = Should.should_be(Integer.valueOf(_plus), Integer.valueOf(1));
    Assert.assertFalse("\nExpected 1 + 1 should not be 1 but"
     + "\n     1 + 1 is " + Integer.valueOf(_plus) + "\n", _should_be_1);
    
    boolean _should_be_2 = Should.<String>should_be(
      "something", null);
    Assert.assertFalse("\nExpected \"something\" should not be null but"
     + "\n     \"something\" should not be null is " + null + "\n", _should_be_2);
    
    int _plus_1 = (1 + 1);
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_plus_1), Integer.valueOf(2));
    Assert.assertTrue("\nExpected 1 + 1 => 2 but"
     + "\n     1 + 1 is " + Integer.valueOf(_plus_1) + "\n", _doubleArrow);
    
    boolean _doubleArrow_1 = Should.operator_doubleArrow(
      "a string", String.class);
    Assert.assertTrue("\nExpected // types\n\t\t\"a string\" => typeof(String) but"
     + "\n     // types\n\t\t\"a string\" => typeof(String) is " + _doubleArrow_1 + "\n", _doubleArrow_1);
    
    boolean _should_contain = Should.should_contain(
      "something", "thing");
    Assert.assertTrue("\nExpected // strings\n\t\t\"something\" should contain \"thing\" but"
     + "\n     // strings\n\t\t\"something\" should contain \"thing\" is " + null + "\n", _should_contain);
    
    boolean _should_contain_1 = Should.should_contain(
      "something", "any");
    Assert.assertFalse("\nExpected \"something\" should not contain \"any\" but"
     + "\n     \"something\" should not contain \"any\" is " + null + "\n", _should_contain_1);
    
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("something");
    boolean _should_contain_2 = Should.<String>should_contain(_newArrayList, "something");
    Assert.assertTrue("\nExpected // iterables\n\t\tnewArrayList(\"something\") should contain \"something\" but"
     + "\n     // iterables\n\t\tnewArrayList(\"something\") is " + _newArrayList + "\n", _should_contain_2);
    
    ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList("something");
    boolean _should_contain_3 = Should.<String>should_contain(_newArrayList_1, "something else");
    Assert.assertFalse("\nExpected newArrayList(\"something\") should not contain \"something else\" but"
     + "\n     newArrayList(\"something\") is " + _newArrayList_1 + "\n", _should_contain_3);
    
    final Procedure1<String> _function = new Procedure1<String>() {
        public void apply(final String it) {
          int _length = it.length();
          boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_length), Integer.valueOf(11));
          Assert.assertTrue("\nExpected length => 11 but"
           + "\n     length is " + Integer.valueOf(_length) + "\n", _doubleArrow);
          
          boolean _should_startWith = Should.should_startWith(it, "hello");
          Assert.assertTrue("\nExpected it should startWith(\"hello\") but"
           + "\n     it is " + "\"" + it + "\"" + "\n", _should_startWith);
          
          boolean _should_endWith = Should.should_endWith(it, "world");
          Assert.assertTrue("\nExpected it should endWith(\"world\") but"
           + "\n     it is " + "\"" + it + "\"" + "\n", _should_endWith);
          
        }
      };
    final String greeting = ObjectExtensions.<String>operator_doubleArrow("hello world", _function);
    boolean _doubleArrow_2 = Should.operator_doubleArrow(greeting, String.class);
    Assert.assertTrue("\nExpected greeting => typeof(String) but"
     + "\n     greeting is " + "\"" + greeting + "\"" + "\n", _doubleArrow_2);
    
  }
  
  /**
   * `should` throws an AssertionError if the result of the left
   * expression does not equal the result of the right expression.
   */
  @Test
  @Named("...or not to pass")
  @Order(99)
  public void orNotToPass() throws Exception {
    try{
      int _plus = (1 + 1);
      boolean _should_be = Should.should_be(Integer.valueOf(_plus), Integer.valueOf(1));
      Assert.assertTrue("\nExpected 1 + 1 should be 1 but"
       + "\n     1 + 1 is " + Integer.valueOf(_plus) + "\n", _should_be);
      
      Assert.fail("Expected " + AssertionError.class.getName() + " in \n     1 + 1 should be 1\n with:"
       + "\n     1 + 1 is " + Integer.valueOf(_plus));
    }catch(AssertionError e){
      // expected
    }
    try{
      int _plus_1 = (1 + 1);
      boolean _should_be_1 = Should.should_be(Integer.valueOf(_plus_1), Integer.valueOf(1));
      Assert.assertFalse("\nExpected 1 + 1 should not be 1 but"
       + "\n     1 + 1 is " + Integer.valueOf(_plus_1) + "\n", _should_be_1);
      
      Assert.fail("Expected " + AssertionError.class.getName() + " in \n     1 + 1 should not be 1\n with:"
       + "\n     1 + 1 is " + Integer.valueOf(_plus_1));
    }catch(AssertionError e){
      // expected
    }
    try{
      int _plus_2 = (1 + 1);
      boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_plus_2), Integer.valueOf(1));
      Assert.assertTrue("\nExpected 1 + 1 => 1 but"
       + "\n     1 + 1 is " + Integer.valueOf(_plus_2) + "\n", _doubleArrow);
      
      Assert.fail("Expected " + AssertionError.class.getName() + " in \n     1 + 1 => 1\n with:"
       + "\n     1 + 1 is " + Integer.valueOf(_plus_2));
    }catch(AssertionError e){
      // expected
    }
    try{
      this.method();
      Assert.fail("Expected " + IllegalArgumentException.class.getName() + " in \n     method()\n with:");
    }catch(IllegalArgumentException e){
      // expected
    }
  }
  
  /**
   * When failing, `should` and `=>` try to give you as much context information as possible.
   * The error message will print the values of all expressions and their subexpressions.
   */
  @Test
  @Named("Why did it fail?")
  @Order(99)
  public void whyDidItFail() throws Exception {
    final Procedure1<Boolean> _function = new Procedure1<Boolean>() {
        public void apply(final Boolean it) {
          int _plus = (1 + 1);
          boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_plus), Integer.valueOf(1));
          Assert.assertTrue("\nExpected 1 + 1 => 1 but"
           + "\n     1 + 1 is " + Integer.valueOf(_plus) + "\n", _doubleArrow);
          
        }
      };
    String _errorMessage = Helpers.errorMessage(_function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Expected 1 + 1 => 1 but");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("1 + 1 is 2");
    Helpers.is(_errorMessage, _builder);
    final String x = "hello";
    final Procedure1<Boolean> _function_1 = new Procedure1<Boolean>() {
        public void apply(final Boolean it) {
          String _upperCase = x.toUpperCase();
          boolean _should_be = Should.should_be(_upperCase, "HELLO");
          Assert.assertFalse("\nExpected x.toUpperCase should not be \"HELLO\" but"
           + "\n     x.toUpperCase is " + "\"" + _upperCase + "\""
           + "\n     x is " + "\"" + x + "\"" + "\n", _should_be);
          
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
           + "\n     x is " + "\"" + x + "\""
           + "\n     y is " + "\"" + y + "\"" + "\n", _doubleArrow);
          
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
   * You can also the `should` and `=>` together with [hamcrest](http://code.google.com/p/hamcrest/)
   * matchers. The following static import statements are needed to run the examples.
   * 
   *     import static org.hamcrest.CoreMatchers.startsWith
   *     import static org.hamcrest.CoreMatchers.equalTo
   *     import static org.hamcrest.Matchers.hasItem
   */
  @Test
  @Named("Combining hamcrest and should")
  @Order(99)
  public void combiningHamcrestAndShould() throws Exception {
    Matcher<String> _startsWith = Matchers.startsWith("h");
    boolean _doubleArrow = Should.operator_doubleArrow(
      "hello", _startsWith);
    Assert.assertTrue("\nExpected \"hello\" => startsWith(\"h\") but"
     + "\n     startsWith(\"h\") is " + _startsWith + "\n", _doubleArrow);
    
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("red", "green");
    Matcher<Iterable<String>> _hasItem = Matchers.<String>hasItem("red");
    boolean _doubleArrow_1 = Should.operator_doubleArrow(_newArrayList, _hasItem);
    Assert.assertTrue("\nExpected newArrayList(\"red\", \"green\") => hasItem(\"red\") but"
     + "\n     newArrayList(\"red\", \"green\") is " + _newArrayList
     + "\n     hasItem(\"red\") is " + _hasItem + "\n", _doubleArrow_1);
    
    Matcher<String> _equalTo = CoreMatchers.<String>equalTo("hello");
    boolean _should_be = Should.<String>should_be(
      "hello", _equalTo);
    Assert.assertTrue("\nExpected \"hello\" should be equalTo(\"hello\") but"
     + "\n     equalTo(\"hello\") is " + _equalTo + "\n", _should_be);
    
  }
  
  public void method() {
    IllegalArgumentException _illegalArgumentException = new IllegalArgumentException();
    throw _illegalArgumentException;
  }
}
