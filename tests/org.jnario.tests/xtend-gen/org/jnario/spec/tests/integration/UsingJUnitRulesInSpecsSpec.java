package org.jnario.spec.tests.integration;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * JUnit rules work exactly as in JUnit. Just declare a public field with the rule annotation.
 */
@SuppressWarnings("all")
@Named("Using JUnit Rules in Specs")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = SpecTestCreator.class)
public class UsingJUnitRulesInSpecsSpec {
  @Inject
  @Extension
  public BehaviorExecutor _behaviorExecutor;
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("Example Specification:")
  @Order(1)
  public void _exampleSpecification() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("import org.junit.Rule");
    _builder.newLine();
    _builder.append("import org.junit.rules.TemporaryFolder");
    _builder.newLine();
    _builder.newLine();
    _builder.append("describe Rule{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("@Rule public val folder = new TemporaryFolder\t");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("fact folder.root should not be null");
    _builder.newLine();
    _builder.append("}\t\t");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder);
  }
}
