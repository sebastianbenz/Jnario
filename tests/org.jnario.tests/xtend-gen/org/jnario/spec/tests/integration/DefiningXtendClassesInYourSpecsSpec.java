package org.jnario.spec.tests.integration;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * You can define xtend helper classes in your specs.
 */
@Named("Defining Xtend classes in your specs")
@RunWith(ExampleGroupRunner.class)
@CreateWith(SpecTestCreator.class)
@SuppressWarnings("all")
public class DefiningXtendClassesInYourSpecsSpec {
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public BehaviorExecutor _behaviorExecutor;
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("either before...")
  @Order(1)
  public void _eitherBefore() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Data class Greeter{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("String name");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("def sayHello(){");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"Hello \" + name");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("describe \"Saying Hello\"{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("fact new Greeter(\"Sebastian\").sayHello => \"Hello Sebastian\"");
    _builder.newLine();
    _builder.append("}  \t");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder);
  }
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("...or after your specs")
  @Order(2)
  public void _orAfterYourSpecs() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Saying Hello\"{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("fact new Greeter(\"Sebastian\").sayHello => \"Hello Sebastian\"");
    _builder.newLine();
    _builder.append("}  \t");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Data class Greeter{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("String name");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("def sayHello(){");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"Hello \" + name");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder);
  }
}
