package org.jnario.spec.tests.documentation;

import java.util.Stack;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.jnario.test.util.Helpers;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.tests.documentation.JnarioSpecsTutorialSpec;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Jnario provides different statements for writing assertions ([more...](/org/jnario/spec/tests/integration/AssertionSpec.html)).
 */
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Writing Assertions")
public class JnarioSpecsTutorialWritingAssertionsSpec extends JnarioSpecsTutorialSpec {
  /**
   * The `assert` statement fails if
   * the following expression does not evaluate to `true`.
   */
  @Test
  @Named("\\\'assert\\\'")
  @Order(99)
  public void _assert() throws Exception {
    Assert.assertTrue("\nExpected true but" + " did not." + "\n", true);
    
    Stack<?> _stack = new Stack<Object>();
    boolean _empty = _stack.empty();
    Assert.assertTrue("\nExpected new Stack().empty but"
     + "\n     new Stack() is " + _stack + "\n", _empty);
    
    boolean _startsWith = "Hello".startsWith("H");
    Assert.assertTrue("\nExpected \"Hello\".startsWith(\"H\") but"
     + "\n     \"Hello\".startsWith(\"H\") is " + _startsWith + "\n", _startsWith);
    
  }
  
  /**
   * If you want to express how an object should behave, you can use
   * `should`. It passes if the result of the left expression is
   * equal to the result of the right expression. You can also use `not` to
   * assert that both expressions have different results. You have already seen
   * the short cut `=>` which has the same effect as `should be`.
   */
  @Test
  @Named("\\\'should\\\' and `=>`")
  @Order(99)
  public void shouldAnd() throws Exception {
    boolean _should_be = Should.<Boolean>should_be(
      true, true);
    Assert.assertTrue("\nExpected true should be true but"
     + "\n     true should be true is " + null + "\n", _should_be);
    
    boolean _doubleArrow = Should.operator_doubleArrow(
      Boolean.valueOf(false), Boolean.valueOf(false));
    Assert.assertTrue("\nExpected false => false but"
     + "\n     false => false is " + _doubleArrow + "\n", _doubleArrow);
    
    int _plus = (1 + 1);
    boolean _should_be_1 = Should.should_be(_plus, 1);
    Assert.assertFalse("\nExpected 1 + 1 should not be 1 but"
     + "\n     1 + 1 is " + _plus + "\n", _should_be_1);
    
    int _plus_1 = (1 + 1);
    boolean _doubleArrow_1 = Should.operator_doubleArrow(Integer.valueOf(_plus_1), Integer.valueOf(2));
    Assert.assertTrue("\nExpected 1 + 1 => 2 but"
     + "\n     1 + 1 is " + Integer.valueOf(_plus_1) + "\n", _doubleArrow_1);
    
  }
  
  /**
   * Assertions in Jnario are self-explainable. When an assertion fails, it tries to
   * provide as much information as possible. It will
   * print the exact expression that has failed together with the actual value
   * of all subexpressions. This means that you don't need to debug a test to
   * see why it actually has failed.
   */
  @Test
  @Named("Self-explaining failures")
  @Order(99)
  public void selfExplainingFailures() throws Exception {
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
          Assert.assertTrue("\nExpected x == 1 && y == 0 but"
           + "\n     x == 1 is " + _equals
           + "\n     x is " + x
           + "\n     y == 0 is " + _equals_1
           + "\n     y is " + y + "\n", _and);
          
        }
      };
    String _errorMessage = Helpers.errorMessage(_function);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Expected x == 1 && y == 0 but");
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
    final String greeting = "hello";
    final Procedure1<Boolean> _function_1 = new Procedure1<Boolean>() {
        public void apply(final Boolean it) {
          String _upperCase = greeting.toUpperCase();
          boolean _should_be = Should.should_be(_upperCase, "HELLO");
          Assert.assertFalse("\nExpected greeting.toUpperCase should not be \"HELLO\" but"
           + "\n     greeting.toUpperCase is " + "\"" + _upperCase + "\""
           + "\n     greeting is " + "\"" + greeting + "\"" + "\n", _should_be);
          
        }
      };
    String _errorMessage_1 = Helpers.errorMessage(_function_1);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("Expected greeting.toUpperCase should not be \"HELLO\" but");
    _builder_1.newLine();
    _builder_1.append("     ");
    _builder_1.append("greeting.toUpperCase is \"HELLO\"");
    _builder_1.newLine();
    _builder_1.append("     ");
    _builder_1.append("greeting is \"hello\"");
    Helpers.is(_errorMessage_1, _builder_1);
  }
}
