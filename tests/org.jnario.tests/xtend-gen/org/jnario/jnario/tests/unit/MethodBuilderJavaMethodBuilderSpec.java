package org.jnario.jnario.tests.unit;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.jnario.tests.unit.MethodBuilderSpec;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.ui.quickfix.JavaMethodBuilder;
import org.jnario.ui.quickfix.MethodBuilderProvider;
import org.jnario.ui.quickfix.XtendMethodBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("JavaMethodBuilder")
public class MethodBuilderJavaMethodBuilderSpec extends MethodBuilderSpec {
  @Test
  @Named("creates public void method with specified name")
  @Order(99)
  public void createsPublicVoidMethodWithSpecifiedName() throws Exception {
    String _generatedMethod = this.generatedMethod();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public void myMethod(){");
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
    _builder_1.append("public void myMethod(boolean b, int i){");
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
    _builder_1.append("public boolean myMethod(){");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("return false;");
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
    _builder_1.append("public int myMethod(){");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("return 0;");
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
    _builder_1.append("public Object myMethod(){");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("return null;");
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
    _builder_1.append("public void myMethod(){");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.is(_generatedMethod, _builder_1);
  }
  
  @Inject
  public XtendMethodBuilder createSubject(final MethodBuilderProvider provider) {
    JavaMethodBuilder _newJavaMethodBuilder = provider.newJavaMethodBuilder("myMethod");
    XtendMethodBuilder _subject = this.subject = _newJavaMethodBuilder;
    return _subject;
  }
}
