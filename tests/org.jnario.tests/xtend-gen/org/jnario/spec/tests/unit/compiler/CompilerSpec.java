package org.jnario.spec.tests.unit.compiler;

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
@Named("Compiler")
@CreateWith(value = SpecTestCreator.class)
public class CompilerSpec {
  @Inject
  @Extension
  public BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("long boolean expressions compile correctly")
  @Order(99)
  public void _longBooleanExpressionsCompileCorrectly() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something with an expression\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"a fact with an if\"{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val x = 4");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(x > 4 && x > 5){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder);
  }
  
  @Test
  @Named("assert with multiple bool expressions")
  @Order(99)
  public void _assertWithMultipleBoolExpressions() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something with an expression\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"a fact with an if\"{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val x = 6");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("assert x > 4 && x > 5");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder);
  }
  
  @Test
  @Named("=> with multiple bool expressions")
  @Order(99)
  public void _withMultipleBoolExpressions() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something with an expression\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"a fact with =>\"{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val x = 6");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("(x > 4 && x > 5) => true");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder);
  }
  
  @Test
  @Named("should with multiple bool expressions")
  @Order(99)
  public void _shouldWithMultipleBoolExpressions() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something with an expression\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"a fact with should\"{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val x = 6");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("x > 4 && x > 5 should be true");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder);
  }
  
  @Test
  @Named("automatically converts lists to arrays")
  @Order(99)
  public void _automaticallyConvertsListsToArrays() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something with an expression\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"any fact\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def String[] x(){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("list(\"some string\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder);
  }
  
  @Test
  @Named("resolve fact method name clashes")
  @Order(99)
  public void _resolveFactMethodNameClashes() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Using Should\"{");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append(" \t  ");
    _builder.append("fact \"a***\"  ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("fact \"a???\" ");
    _builder.newLine();
    _builder.append("   \t\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder);
  }
}
