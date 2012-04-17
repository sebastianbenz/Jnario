package org.jnario.spec.tests.integration;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.jnario.test.util.SpecExecutor;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("ImplicitSubject")
public class ImplicitSubjectSpec {
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("should create instance of target type")
  @Order(99)
  public void shouldCreateInstanceOfTargetType() throws Exception {
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
    SpecExecutor.executesSuccessfully(_builder);
  }
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("can be overridden within example group")
  @Order(99)
  public void canBeOverriddenWithinExampleGroup() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import static org.hamcrest.CoreMatchers.*");
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
    SpecExecutor.executesSuccessfully(_builder);
  }
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("will be only created if is used")
  @Order(99)
  public void willBeOnlyCreatedIfIsUsed() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import static org.hamcrest.CoreMatchers.*");
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
    SpecExecutor.executesSuccessfully(_builder);
  }
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("can be accessed from nested ExampleGroups")
  @Order(99)
  public void canBeAccessedFromNestedExampleGroups() throws Exception {
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
    SpecExecutor.executesSuccessfully(_builder);
  }
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("can be overridden from nested ExampleGroups")
  @Order(99)
  public void canBeOverriddenFromNestedExampleGroups() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import static org.hamcrest.CoreMatchers.*");
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
    SpecExecutor.executesSuccessfully(_builder);
  }
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("will be only created in the subexample if is not used in the parent example group")
  @Order(99)
  public void willBeOnlyCreatedInTheSubexampleIfIsNotUsedInTheParentExampleGroup() throws Exception {
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
    SpecExecutor.executesSuccessfully(_builder);
  }
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("will not be created in a sub example if is used in the parent example group")
  @Order(99)
  public void willNotBeCreatedInASubExampleIfIsUsedInTheParentExampleGroup() throws Exception {
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
    SpecExecutor.executesSuccessfully(_builder);
  }
}
