package org.jnario.spec.tests.integration;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.tests.integration.SetupTeardownSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("AfterAll")
@RunWith(ExampleGroupRunner.class)
public class SetupTeardownAfterAllSpec extends SetupTeardownSpec {
  @Test
  @Named("Execute once after all tests")
  @Order(3)
  public void _executeOnceAfterAllTests() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"After All\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("after all{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("println(\"after all\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact println(\"fact 1\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact println(\"fact 2\")");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("fact 1");
    _builder_1.newLine();
    _builder_1.append("fact 2");
    _builder_1.newLine();
    _builder_1.append("after all");
    _builder_1.newLine();
    this.prints(_builder, _builder_1.toString());
  }
}
