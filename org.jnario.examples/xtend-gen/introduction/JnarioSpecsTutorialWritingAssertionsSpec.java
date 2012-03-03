package introduction;

import introduction.JnarioSpecsTutorialSpec;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.CoreMatchers;
import org.jnario.jnario.test.util.Helpers;
import org.jnario.jnario.test.util.SpecExecutor;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Jnario provides different ways to write assertions.
 */
@RunWith(ExampleGroupRunner.class)
@Named("Writing Assertions")
public class JnarioSpecsTutorialWritingAssertionsSpec extends JnarioSpecsTutorialSpec {
  /**
   * Jnario provides a special `assert` statement that makes it easy to
   * write meaningful assertions.
   */
  @Test
  @Named("\\\'assert\\\'")
  @Order(0)
  public void assert() throws Exception {
    Assert.assertTrue("\nExpected true but:" + "\n", true);
    
    boolean _equals = (1 == 1);
    Assert.assertTrue("\nExpected 1 == 1 but:"
     + "\n     1 == 1 is " + _equals + "\n", _equals);
    
    boolean _startsWith = "Hello".startsWith("H");
    Assert.assertTrue("\nExpected \"Hello\".startsWith(\"H\") but:"
     + "\n     \"Hello\".startsWith(\"H\") is " + _startsWith + "\n", _startsWith);
    
  }
  
  /**
   * If you want to express how an object should behave, you can use
   * `should` or `must`. It passes if the result of the left expression is
   * equal to the result of the right expression. You can also use `not` to
   * assert that both expressions have different results. There is also
   * a short cut available: `=>` which has the same effect as `should be`.
   */
  @Test
  @Named("\\\'should\\\', \\\'must\\\' and `=>`")
  @Order(1)
  public void shouldMustAnd() throws Exception {
    boolean result = CoreMatchers.is(true).matches(true);
    Assert.assertTrue("\nExpected true should be true but:" + "\n", result);
    boolean result_1 = CoreMatchers.is("hello").matches("hello");
    Assert.assertTrue("\nExpected \"hello\" must be \"hello\" but:" + "\n", result_1);
    int _plus = (1 + 1);
    boolean result_2 = CoreMatchers.is(1).matches(_plus);
    Assert.assertFalse("\nExpected 1 + 1 should not be 1 but:"
     + "\n     1 + 1 is " + _plus + "\n", result_2);
    String _upperCase = "hello".toUpperCase();
    boolean result_3 = CoreMatchers.is("hello").matches(_upperCase);
    Assert.assertFalse("\nExpected \"hello\".toUpperCase must not be \"hello\" but:"
     + "\n     \"hello\".toUpperCase is " + "\"" + _upperCase + "\"" + "\n", result_3);
    int _plus_1 = (1 + 1);
    boolean result_4 = CoreMatchers.is(2).matches(_plus_1);
    Assert.assertTrue("\nExpected 1 + 1 => 2 but:"
     + "\n     1 + 1 is " + _plus_1 + "\n", result_4);
  }
  
  /**
   * Assertions in Jnario are selfexplainable. This means, when failing, they try to
   * provide as as much information as possible. In that case, they
   * print the exact expression that has failed together with the actual value
   * of all subexpressions.
   */
  @Test
  @Named("Self-explaining failures")
  @Order(2)
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
    final String greeting = "hello";
    final Procedure1<Boolean> _function_1 = new Procedure1<Boolean>() {
        public void apply(final Boolean it) {
          String _upperCase = greeting.toUpperCase();
          boolean result = CoreMatchers.is("HELLO").matches(_upperCase);
          Assert.assertFalse("\nExpected greeting.toUpperCase should not be \"HELLO\" but:"
           + "\n     greeting.toUpperCase is " + "\"" + _upperCase + "\""
           + "\n     greeting is " + "\"" + greeting + "\"" + "\n", result);
        }
      };
    String _errorMessage_1 = Helpers.errorMessage(_function_1);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("Expected x.toUpperCase should not be \"HELLO\" but:");
    _builder_1.newLine();
    _builder_1.append("   ");
    _builder_1.append("x.toUpperCase is \"HELLO\"");
    _builder_1.newLine();
    _builder_1.append("   ");
    _builder_1.append("x is \"hello\"");
    Helpers.is(_errorMessage_1, _builder_1);
  }
  
  /**
   * There are two ways on how to check whether an expression is thrown.
   * The first one is to declare the type the expected Exception in the
   * example header after the `throws` keyword. If you want to check
   * for multiple exceptions in the same example, you can use the build in
   * `expect` extension method. The first parameter is the type of the
   * expected exception and the second parameter is a closure with the
   * expression that should throw the exception.
   * 
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("Expecting Exceptions")
  @Order(3)
  public void expectingExceptions() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Division\"{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("it throws ArithmeticException \"on division by zero\"{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("val x = 1 / 0");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("it \"throws an ArithmeticException on division by zero\"{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("expect(typeof(ArithmeticException))[");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("val x = 1 / 0");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("]");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("}");
    _builder.newLine();
    SpecExecutor.executesSuccessfully(_builder);
  }
}
