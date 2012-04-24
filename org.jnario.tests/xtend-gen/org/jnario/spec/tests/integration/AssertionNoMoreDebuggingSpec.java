package org.jnario.spec.tests.integration;

import com.google.common.base.Objects;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.jnario.test.util.Helpers;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.tests.integration.AssertionSpec;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Assertions in Jnario are selfexplainable. This means, when failing, they try to
 * provide as as much information as possible. In that case, they
 * print the exact expression that has failed together with the actual value
 * of all subexpressions.
 */
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("No more debugging...")
public class AssertionNoMoreDebuggingSpec extends AssertionSpec {
  /**
   * For example, it will print the value of all referenced variables.
   */
  @Test
  @Named("Variable Access")
  @Order(99)
  public void variableAccess() throws Exception {
    final boolean y = false;
    final Procedure1<Boolean> _function = new Procedure1<Boolean>() {
        public void apply(final Boolean it) {
          Assert.assertTrue("\nExpected y but:"
           + "\n     y is " + y + "\n", y);
          
        }
      };
    String _errorMessage = Helpers.errorMessage(_function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Expected y but:");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("y is false");
    Helpers.is(_errorMessage, _builder);
  }
  
  /**
   * Literal values obviously won't be printed.
   */
  @Test
  @Named("Filters literals")
  @Order(99)
  public void filtersLiterals() throws Exception {
    final int x = 0;
    final Procedure1<Boolean> _function = new Procedure1<Boolean>() {
        public void apply(final Boolean it) {
          boolean _equals = (x == 42);
          Assert.assertTrue("\nExpected x == 42 but:"
           + "\n     x is " + x + "\n", _equals);
          
        }
      };
    String _errorMessage = Helpers.errorMessage(_function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Expected x == 42 but:");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("x is 0");
    Helpers.is(_errorMessage, _builder);
  }
  
  /**
   * Here is another example .
   */
  @Test
  @Named("Not Equals")
  @Order(99)
  public void notEquals() throws Exception {
    final int x = 42;
    final Procedure1<Boolean> _function = new Procedure1<Boolean>() {
        public void apply(final Boolean it) {
          boolean _equals = (x == 42);
          boolean _not = (!_equals);
          Assert.assertTrue("\nExpected !(x == 42) but:"
           + "\n     x == 42 is " + _equals
           + "\n     x is " + x + "\n", _not);
          
        }
      };
    String _errorMessage = Helpers.errorMessage(_function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Expected !(x == 42) but:");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("x == 42 is true");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("x is 42");
    Helpers.is(_errorMessage, _builder);
  }
  
  /**
   * The result of a function call will be printed as well.
   */
  @Test
  @Named("Function Calls")
  @Order(99)
  public void functionCalls() throws Exception {
    final Procedure1<Boolean> _function = new Procedure1<Boolean>() {
        public void apply(final Boolean it) {
          String _greet = AssertionNoMoreDebuggingSpec.this.greet("World");
          boolean _equals = Objects.equal(_greet, "Hello World!");
          Assert.assertTrue("\nExpected greet(\"World\") == \"Hello World!\" but:"
           + "\n     greet(\"World\") is " + "\"" + _greet + "\"" + "\n", _equals);
          
        }
      };
    String _errorMessage = Helpers.errorMessage(_function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Expected greet(\"World\") == \"Hello World!\" but:");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("greet(\"World\") is \"Hello World\"");
    Helpers.is(_errorMessage, _builder);
  }
  
  /**
   * The result of each feature call will be printed.
   */
  @Test
  @Named("Feature Calls")
  @Order(99)
  public void featureCalls() throws Exception {
    final Procedure1<Boolean> _function = new Procedure1<Boolean>() {
        public void apply(final Boolean it) {
          String _upperCase = "Hello".toUpperCase();
          String _lowerCase = _upperCase.toLowerCase();
          boolean _equals = Objects.equal(_lowerCase, "HELLO");
          Assert.assertTrue("\nExpected \"Hello\".toUpperCase.toLowerCase == \"HELLO\" but:"
           + "\n     \"Hello\".toUpperCase.toLowerCase is " + "\"" + _lowerCase + "\""
           + "\n     \"Hello\".toUpperCase is " + "\"" + _upperCase + "\"" + "\n", _equals);
          
        }
      };
    String _errorMessage = Helpers.errorMessage(_function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Expected \"Hello\".toUpperCase.toLowerCase == \"HELLO\" but:");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("\"Hello\".toUpperCase.toLowerCase is \"hello\"");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("\"Hello\".toUpperCase is \"HELLO\"");
    Helpers.is(_errorMessage, _builder);
  }
  
  /**
   * This example involves two expressions with `&&`.
   */
  @Test
  @Named("And expressions")
  @Order(99)
  public void andExpressions() throws Exception {
    final int x = 0;
    final int y = 1;
    final Procedure1<Boolean> _function = new Procedure1<Boolean>() {
        public void apply(final Boolean it) {
          boolean _and = false;
          boolean _equals = (x == 1);
          boolean _equals_1 = (y == 0);
          if (!_equals) {
            _and = false;
          } else {
            _and = (_equals && _equals_1);
          }
          Assert.assertTrue("\nExpected x == 1 && y == 0 but:"
           + "\n     x == 1 is " + _equals
           + "\n     x is " + x
           + "\n     y == 0 is " + _equals_1
           + "\n     y is " + y + "\n", _and);
          
        }
      };
    String _errorMessage = Helpers.errorMessage(_function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Expected x == 1 && y == 0 but:");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("x == 1 is false");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("x is 0");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("y == 0 is false");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("y is 1");
    Helpers.is(_errorMessage, _builder);
  }
  
  /**
   * If the same variable is accessed multiple times it will be printed only once.
   */
  @Test
  @Named("Removes duplicate feature calls")
  @Order(99)
  public void removesDuplicateFeatureCalls() throws Exception {
    final int x = 0;
    final Procedure1<Boolean> _function = new Procedure1<Boolean>() {
        public void apply(final Boolean it) {
          boolean _and = false;
          boolean _greaterThan = (x > 0);
          boolean _lessThan = (x < 10);
          if (!_greaterThan) {
            _and = false;
          } else {
            _and = (_greaterThan && _lessThan);
          }
          Assert.assertTrue("\nExpected x > 0 && x < 10 but:"
           + "\n     x > 0 is " + _greaterThan
           + "\n     x is " + x
           + "\n     x < 10 is " + _lessThan + "\n", _and);
          
        }
      };
    String _errorMessage = Helpers.errorMessage(_function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Expected x > 0 && x < 10 but:");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("x > 0 is false");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("x is 0");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("x < 10 is true");
    Helpers.is(_errorMessage, _builder);
  }
  
  /**
   * fact "Block expressions"{
   * errorMessage[assert {val x = "hello"; x} == ""].is('''''')
   * }
   */
  public String greet(final String name) {
    return ("Hello " + name);
  }
}
