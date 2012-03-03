package introduction;

import com.google.common.base.Objects;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.jnario.test.util.Helpers;
import org.jnario.jnario.test.util.SpecExecutor;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * <p align="center"><img src="file://localhost/Users/sebastian/Desktop/Specs.png"/></p>
 * 
 * *Jnario* is a framework helping you write executable software specifications.
 * It leverages the expressiveness of [Xtend](http://www.xtend-lang.org) and is easy to
 * integrate, as it compiles to plain [JUnit](http://www.junit.org/) tests.
 * In our other [presentation](http://www.eclipsecon.org/2012/sessions/program-thou-shalt-behave)
 * at this EclipseCon, we demonstrate how to use Jnario for writing executable acceptance
 * specifications in a business readable fashion.
 * This session introduces you to *Jnario Specs* - another language of Jnario allowing
 * software behavior specification on a unit level. We demonstrate how you can design and document
 * your software at the same time.
 * For example, this document is actually generated from a [spec](https://gist.github.com/1762405) written
 * with *Jnario Specs*.
 */
@RunWith(ExampleGroupRunner.class)
@Named("Jnario Specs - BDD for Java")
public class JnarioSpecsBDDForJavaSpec {
  /**
   * Jnario improves the readability of tests by providing assertion methods which can extend
   * any object (making use of Xtend's [extension methods](http://www.eclipse.org/xtend/#extensionmethods)).
   * These assertions help you express how an object should behave. They can be combined with any
   * [Hamcrest](http://code.google.com/p/hamcrest/) matcher, giving you the freedom to choose from
   * a wide range of existing matchers.
   */
  @Test
  @Named("Should-style Assertions")
  @Order(0)
  public void shouldStyleAssertions() throws Exception {
    boolean result = Objects.equal("hello", "hello");
    Assert.assertTrue("\nExpected \"hello\" should be \"hello\" but:" + "\n", result);
    boolean result_1 = Objects.equal(true, false);
    Assert.assertFalse("\nExpected true should not be false but:" + "\n", result_1);
    boolean result_2 = Objects.equal("hello", String.class);
    Assert.assertTrue("\nExpected \"hello\" should be typeof(String) but:" + "\n", result_2);
  }
  
  /**
   * With Jnario, debugging a failing test to discover the reason for its failure becomes
   * a thing of the past. Jnario provides a special assert statement that reports, when the assertion fails,
   * the value of all involved expressions.
   */
  @Test
  @Named("Self-explaining Assertions")
  @Order(1)
  public void selfExplainingAssertions() throws Exception {
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
    _builder.append("y == 0 is false  ");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("y is 1");
    Helpers.is(_errorMessage, _builder);
  }
  
  /**
   * *Jnario Specs* helps you write less boilerplate code in your
   * specifications. In the following example, `describe Calculator`
   * references the existing Java type `Calculator`.
   * Using this information Jnario will automatically create and instantiate a field `subject`,
   * which you can use in your specification. It is even possible to use
   * [Google Guice](http://code.google.com/p/google-guice/) to instantiate your subjects.
   * 
   * @filter(\.executesSuccessfully|''')
   */
  @Test
  @Named("Implicit subject creation")
  @Order(2)
  public void implicitSubjectCreation() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.ArrayList");
    _builder.newLine();
    _builder.newLine();
    _builder.append("describe ArrayList{");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("it \"should automatically create an instance of ArrayList called subject\"{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("subject should be typeof(ArrayList)");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    SpecExecutor.executesSuccessfully(_builder);
  }
}
