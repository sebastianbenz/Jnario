package org.jnario.spec.tests.integration;

import com.google.common.base.Objects;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.jnario.test.util.Helpers;
import org.jnario.lib.Assert;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.tests.integration.AssertionSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Assertions in Jnario are selfexplainable. This means, when failing, they try to
 * provide as as much information as possible. In that case, they
 * print the exact expression that has failed together with the actual value
 * of all subexpressions.
 */
@SuppressWarnings("all")
@Named("No more debugging...")
@RunWith(ExampleGroupRunner.class)
public class AssertionNoMoreDebuggingSpec extends AssertionSpec {
  /**
   * For example, it will print the value of all referenced variables.
   */
  @Test
  @Named("Variable Access")
  @Order(3)
  public void _variableAccess() throws Exception {
    final boolean y = false;
    final Procedure1<Boolean> _function = new Procedure1<Boolean>() {
        public void apply(final Boolean it) {
          Assert.assertTrue("\nExpected y but"
           + "\n     y is " + new StringDescription().appendValue(y).toString() + "\n", y);
          
        }
      };
    String _errorMessage = Helpers.errorMessage(_function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Expected y but");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("y is <false>");
    Helpers.is(_errorMessage, _builder);
  }
  
  /**
   * Literal values obviously won't be printed.
   */
  @Test
  @Named("Filters literals")
  @Order(4)
  public void _filtersLiterals() throws Exception {
    final int x = 0;
    final Procedure1<Boolean> _function = new Procedure1<Boolean>() {
        public void apply(final Boolean it) {
          boolean _equals = (x == 42);
          Assert.assertTrue("\nExpected x == 42 but"
           + "\n     x is " + new StringDescription().appendValue(x).toString() + "\n", _equals);
          
        }
      };
    String _errorMessage = Helpers.errorMessage(_function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Expected x == 42 but");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("x is <0>");
    Helpers.is(_errorMessage, _builder);
  }
  
  /**
   * Here is another example .
   */
  @Test
  @Named("Not Equals")
  @Order(5)
  public void _notEquals() throws Exception {
    final int x = 42;
    final Procedure1<Boolean> _function = new Procedure1<Boolean>() {
        public void apply(final Boolean it) {
          boolean _equals = (x == 42);
          boolean _not = (!_equals);
          Assert.assertTrue("\nExpected !(x == 42) but"
           + "\n     x == 42 is " + new StringDescription().appendValue(_equals).toString()
           + "\n     x is " + new StringDescription().appendValue(x).toString() + "\n", _not);
          
        }
      };
    String _errorMessage = Helpers.errorMessage(_function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Expected !(x == 42) but");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("x == 42 is <true>");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("x is <42>");
    Helpers.is(_errorMessage, _builder);
  }
  
  /**
   * The result of a function call will be printed as well.
   */
  @Test
  @Named("Function Calls")
  @Order(6)
  public void _functionCalls() throws Exception {
    final Procedure1<Boolean> _function = new Procedure1<Boolean>() {
        public void apply(final Boolean it) {
          String _greet = AssertionNoMoreDebuggingSpec.this.greet("World");
          boolean _equals = Objects.equal(_greet, "Hello World!");
          Assert.assertTrue("\nExpected greet(\"World\") == \"Hello World!\" but"
           + "\n     greet(\"World\") is " + new StringDescription().appendValue(_greet).toString() + "\n", _equals);
          
        }
      };
    String _errorMessage = Helpers.errorMessage(_function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Expected greet(\"World\") == \"Hello World!\" but");
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
  @Order(7)
  public void _featureCalls() throws Exception {
    final Procedure1<Boolean> _function = new Procedure1<Boolean>() {
        public void apply(final Boolean it) {
          String _upperCase = "Hello".toUpperCase();
          String _lowerCase = _upperCase.toLowerCase();
          boolean _equals = Objects.equal(_lowerCase, "HELLO");
          Assert.assertTrue("\nExpected \"Hello\".toUpperCase.toLowerCase == \"HELLO\" but"
           + "\n     \"Hello\".toUpperCase.toLowerCase is " + new StringDescription().appendValue(_lowerCase).toString()
           + "\n     \"Hello\".toUpperCase is " + new StringDescription().appendValue(_upperCase).toString() + "\n", _equals);
          
        }
      };
    String _errorMessage = Helpers.errorMessage(_function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Expected \"Hello\".toUpperCase.toLowerCase == \"HELLO\" but");
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
  @Order(8)
  public void _andExpressions() throws Exception {
    final int x = 0;
    final int y = 1;
    final Procedure1<Boolean> _function = new Procedure1<Boolean>() {
        public void apply(final Boolean it) {
          boolean _equals = (x == 1);
          boolean _equals_1 = (y == 0);
          boolean _and = (_equals && _equals_1);
          Assert.assertTrue("\nExpected x == 1 && y == 0 but"
           + "\n     x == 1 is " + new StringDescription().appendValue(_equals).toString()
           + "\n     x is " + new StringDescription().appendValue(x).toString()
           + "\n     y == 0 is " + new StringDescription().appendValue(_equals_1).toString()
           + "\n     y is " + new StringDescription().appendValue(y).toString() + "\n", _and);
          
        }
      };
    String _errorMessage = Helpers.errorMessage(_function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Expected x == 1 && y == 0 but");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("x == 1 is <false>");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("x is <0>");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("y == 0 is <false>");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("y is <1>");
    Helpers.is(_errorMessage, _builder);
  }
  
  /**
   * If the same variable is accessed multiple times it will be printed only once.
   */
  @Test
  @Named("Removes duplicate feature calls")
  @Order(9)
  public void _removesDuplicateFeatureCalls() throws Exception {
    final int x = 0;
    final Procedure1<Boolean> _function = new Procedure1<Boolean>() {
        public void apply(final Boolean it) {
          boolean _greaterThan = (x > 0);
          boolean _lessThan = (x < 10);
          boolean _and = (_greaterThan && _lessThan);
          Assert.assertTrue("\nExpected x > 0 && x < 10 but"
           + "\n     x > 0 is " + new StringDescription().appendValue(_greaterThan).toString()
           + "\n     x is " + new StringDescription().appendValue(x).toString()
           + "\n     x < 10 is " + new StringDescription().appendValue(_lessThan).toString() + "\n", _and);
          
        }
      };
    String _errorMessage = Helpers.errorMessage(_function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Expected x > 0 && x < 10 but");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("x > 0 is <false>");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("x is <0>");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("x < 10 is <true>");
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
