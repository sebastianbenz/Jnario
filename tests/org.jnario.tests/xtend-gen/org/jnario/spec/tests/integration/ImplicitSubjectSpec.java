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
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Implicit Subject")
@CreateWith(value = SpecTestCreator.class)
public class ImplicitSubjectSpec {
  @Inject
  @Extension
  public BehaviorExecutor _behaviorExecutor;
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("should create instance of target type")
  @Order(99)
  public void _shouldCreateInstanceOfTargetType() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.newLine();
    _builder.append("describe String {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("fact subject should not be null");
    _builder.newLine();
    _builder.append("      ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder);
  }
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("can be overridden within example group")
  @Order(99)
  public void _canBeOverriddenWithinExampleGroup() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.newLine();
    _builder.append("describe String {");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("String subject = \"overridden\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("fact \"subject should be overridden\"{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("subject should be \"overridden\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("      ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder);
  }
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Ignore
  @Named("can be overridden by manually calling the constructor [PENDING]")
  @Order(99)
  public void _canBeOverriddenByManuallyCallingTheConstructor() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.newLine();
    _builder.append("describe Integer {");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("before subject = new Integer(42)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("fact \"subject should be overridden\"{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("subject should be 42");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("      ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder);
  }
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("will be only created if is used")
  @Order(99)
  public void _willBeOnlyCreatedIfIsUsed() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.newLine();
    _builder.append("describe String {");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("fact \"throws NoSuchFieldException because subject will not be created\"{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("typeof(StringSpec).getField(\"subject\") throws NoSuchFieldException");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("      ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder);
  }
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("can be accessed from nested ExampleGroups")
  @Order(99)
  public void _canBeAccessedFromNestedExampleGroups() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.newLine();
    _builder.append("describe String {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("describe \"Nested ExampleGroup\"{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("fact \"should inherit the subject\"{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("subject should be \"\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder);
  }
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("can be overridden from nested ExampleGroups")
  @Order(99)
  public void _canBeOverriddenFromNestedExampleGroups() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.newLine();
    _builder.append("describe String {");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("describe java.util.ArrayList \"Nested ExampleGroup with different target type\"{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("fact \"can override the subject\"{");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("assert subject.empty");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder);
  }
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("will be only created in the subexample if is not used in the parent example group")
  @Order(99)
  public void _willBeOnlyCreatedInTheSubexampleIfIsNotUsedInTheParentExampleGroup() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.newLine();
    _builder.append("describe Integer{");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("describe Integer {");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Integer subject = 0");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("fact \"can be manually assigned from within sub specification\"{");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("subject should be 0");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder);
  }
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("will not be created in a sub example if is used in the parent example group")
  @Order(99)
  public void _willNotBeCreatedInASubExampleIfIsUsedInTheParentExampleGroup() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.newLine();
    _builder.append("describe String {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("describe String{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("fact \"should generate subject for superclass\"{");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("assert typeof(StringSpec).getDeclaredField(\"subject\") != null");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("fact \"should not generate subject for subclass\"{");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("typeof(StringStringSpec).getDeclaredField(\"subject\") throws NoSuchFieldException");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("fact \"uses subject\"{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("subject.toString");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("fact \"uses subject\"{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("subject.toString");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder);
  }
}
