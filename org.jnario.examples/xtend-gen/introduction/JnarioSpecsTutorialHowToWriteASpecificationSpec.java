package introduction;

import introduction.JnarioSpecsTutorialSpec;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.jnario.test.util.SpecExecutor;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("How to write a Specification")
public class JnarioSpecsTutorialHowToWriteASpecificationSpec extends JnarioSpecsTutorialSpec {
  /**
   * *Note:* You can declare packages and import other packages similar
   * to Java (static imports work as well).
   * 
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("A simple specification")
  @Order(0)
  public void aSimpleSpecification() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package demo");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.Stack");
    _builder.newLine();
    _builder.newLine();
    _builder.append("describe \"A Stack\"{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("- \"initially empty\"{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("assert new Stack().size == 0\t");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("- \"increases its size\"{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("val subject = new Stack<String>()");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("subject.add(\"A String\")");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("assert subject.size == 1");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("// ...");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    SpecExecutor.executesSuccessfully(_builder);
  }
  
  /**
   * The following specification will be executed as:
   * 
   *     Calculator
   *       - addition
   *         - adds two values
   *       - division
   *         - divides two values
   * 
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("Hierarchical Specifications")
  @Order(1)
  public void hierarchicalSpecifications() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Calculator\"{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("context \"addition\"{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("it \"adds two values\"{");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("assert new Calculator().add(1, 2) == 3");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("context \"division\"{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("it \"divides two values\"{");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("assert new Calculator().divide(4, 2) == 2");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    SpecExecutor.executesSuccessfully(_builder);
  }
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("Helper methods and fields")
  @Order(2)
  public void helperMethodsAndFields() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Helper Methods & Fields\"{");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("String subject = \"World\" ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("it \"can access fields and methods\"{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("assert subject.greeting == \"Hello World\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("def greeting(String s){");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return \"Hello \" + s");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("context \"shouting\"{");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("it \"can access fields and methods from parent\"{");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("assert subject.greeting.shout == \"HELLO WORLD\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("def shout(String s){");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("return s.toUpperCase");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    SpecExecutor.executesSuccessfully(_builder);
  }
  
  @Test
  @Ignore
  @Named("Pending [PENDING]")
  @Order(3)
  public void pending() throws Exception {
  }
}
