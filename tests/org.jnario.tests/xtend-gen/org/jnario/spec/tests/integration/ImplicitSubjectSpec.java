/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
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
 * If your spec describes a specific type, Jnario
 * will automatically create an instance variable
 * ```subject``` of this type. By default it will
 * use the no arg constructor to instantiate the subject
 * field, but it is possible to use Guice or other tools
 * to instantiate the subject by providing a custom
 * **SpecCreator**.
 */
@CreateWith(SpecTestCreator.class)
@Named("Implicit Subject")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ImplicitSubjectSpec {
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public BehaviorExecutor _behaviorExecutor;
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("spec creates instance of target type")
  @Order(1)
  public void _specCreatesInstanceOfTargetType() throws Exception {
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
    _builder.append("  ");
    _builder.append("fact subject should be typeof(String)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder);
  }
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("subject can be overridden within example group")
  @Order(2)
  public void _subjectCanBeOverriddenWithinExampleGroup() throws Exception {
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
  @Named("subjects can be instantiated manually")
  @Order(3)
  public void _subjectsCanBeInstantiatedManually() throws Exception {
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
  @Named("subjects will be only created if used")
  @Order(4)
  public void _subjectsWillBeOnlyCreatedIfUsed() throws Exception {
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
  @Named("subjects can be accessed from nested ExampleGroups")
  @Order(5)
  public void _subjectsCanBeAccessedFromNestedExampleGroups() throws Exception {
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
  @Named("subjects can be overridden from nested ExampleGroups")
  @Order(6)
  public void _subjectsCanBeOverriddenFromNestedExampleGroups() throws Exception {
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
  @Named("subject will be only created in the subexample if is not used in the parent example group")
  @Order(7)
  public void _subjectWillBeOnlyCreatedInTheSubexampleIfIsNotUsedInTheParentExampleGroup() throws Exception {
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
  @Named("subject will not be created in a sub example if is used in the parent example group")
  @Order(8)
  public void _subjectWillNotBeCreatedInASubExampleIfIsUsedInTheParentExampleGroup() throws Exception {
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
