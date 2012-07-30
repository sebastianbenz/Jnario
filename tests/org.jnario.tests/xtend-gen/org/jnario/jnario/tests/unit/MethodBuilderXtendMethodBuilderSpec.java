package org.jnario.jnario.tests.unit;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.jnario.tests.unit.MethodBuilderSpec;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.ui.quickfix.MethodBuilderProvider;
import org.jnario.ui.quickfix.XtendMethodBuilder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("XtendMethodBuilder")
public class MethodBuilderXtendMethodBuilderSpec extends MethodBuilderSpec {
  @Test
  @Named("creates method with specified name")
  @Order(99)
  public void createsMethodWithSpecifiedName() throws Exception {
    String _generatedMethod = this.generatedMethod();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("def myMethod(){");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.is(_generatedMethod, _builder);
  }
  
  @Test
  @Named("adds method parameters")
  @Order(99)
  public void addsMethodParameters() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact myMethod(true, 4)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.setContext(_builder);
    String _generatedMethod = this.generatedMethod();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("def myMethod(boolean b, int i){");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.is(_generatedMethod, _builder_1);
  }
  
  @Test
  @Named("returns false for boolean")
  @Order(99)
  public void returnsFalseForBoolean() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("boolean b = myMethod()");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.setContext(_builder);
    String _generatedMethod = this.generatedMethod();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("def myMethod(){");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("return false");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.is(_generatedMethod, _builder_1);
  }
  
  @Test
  @Named("returns default value for numbers")
  @Order(99)
  public void returnsDefaultValueForNumbers() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("int i = myMethod()");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.setContext(_builder);
    String _generatedMethod = this.generatedMethod();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("def myMethod(){");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("return 0");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.is(_generatedMethod, _builder_1);
  }
  
  @Test
  @Named("returns null for objects")
  @Order(99)
  public void returnsNullForObjects() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Object o = myMethod()");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.setContext(_builder);
    String _generatedMethod = this.generatedMethod();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("def myMethod(){");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("return null");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.is(_generatedMethod, _builder_1);
  }
  
  @Test
  @Ignore
  @Named("uses simple name for parameters [PENDING]")
  @Order(99)
  public void usesSimpleNameForParameters() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Object o = myMethod(<String>newArrayList)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.setContext(_builder);
    String _generatedMethod = this.generatedMethod();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("def myMethod(ArrayList<String> strings){");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("return null");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.is(_generatedMethod, _builder_1);
  }
  
  @Test
  @Named("returns nothing if void")
  @Order(99)
  public void returnsNothingIfVoid() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact myMethod()");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.setContext(_builder);
    String _generatedMethod = this.generatedMethod();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("def myMethod(){");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.is(_generatedMethod, _builder_1);
  }
  
  @Inject
  public XtendMethodBuilder createSubject(final MethodBuilderProvider provider) {
    XtendMethodBuilder _newXtendMethodBuilder = provider.newXtendMethodBuilder("myMethod");
    XtendMethodBuilder _subject = this.subject = _newXtendMethodBuilder;
    return _subject;
  }
}
