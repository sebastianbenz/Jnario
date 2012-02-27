package introduction;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.jnario.test.util.SpecExecutor;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Tutorial")
public class TutorialSpec {
  /**
   * @filter('''.executesSuccessfully)
   */
  @Test
  @Named("Implicit subject creation")
  @Order(0)
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
    _builder.append("subject.should.be(typeof(ArrayList))");
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
