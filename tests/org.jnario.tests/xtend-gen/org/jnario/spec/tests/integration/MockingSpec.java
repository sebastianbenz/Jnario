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

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Mocking")
@CreateWith(value = SpecTestCreator.class)
public class MockingSpec {
  @Inject
  @Extension
  public BehaviorExecutor _behaviorExecutor;
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("Mocking types")
  @Order(0)
  public void _mockingTypes() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.Stack");
    _builder.newLine();
    _builder.append("describe Rule{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("fact mock(Stack) should be typeof(Stack)");
    _builder.newLine();
    _builder.append("}\t\t");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder);
  }
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("Stubbing types")
  @Order(1)
  public void _stubbingTypes() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.Stack");
    _builder.newLine();
    _builder.append("describe Rule{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("val myStub = stub(Stack)");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("fact myStub should be typeof(Stack)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder);
  }
}
