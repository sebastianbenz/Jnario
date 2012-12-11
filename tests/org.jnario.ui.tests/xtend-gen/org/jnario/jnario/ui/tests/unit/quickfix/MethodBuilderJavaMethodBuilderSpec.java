package org.jnario.jnario.ui.tests.unit.quickfix;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.jnario.jnario.ui.tests.unit.quickfix.MethodBuilderSpec;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.ui.quickfix.XtendMethodBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("JavaMethodBuilder")
@RunWith(ExampleGroupRunner.class)
public class MethodBuilderJavaMethodBuilderSpec extends MethodBuilderSpec {
  @Test
  @Named("creates public void method with specified name")
  @Order(9)
  public void _createsPublicVoidMethodWithSpecifiedName() throws Exception {
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
  
  @Test
  @Named("adds method parameters")
  @Order(10)
  public void _addsMethodParameters() throws Exception {
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
  @Order(11)
  public void _returnsFalseForBoolean() throws Exception {
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
  @Order(12)
  public void _returnsDefaultValueForNumbers() throws Exception {
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
  @Order(13)
  public void _returnsNullForObjects() throws Exception {
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
  @Order(14)
  public void _returnsNothingIfVoid() throws Exception {
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
  
  @Test
  @Named("generated no method body if interface")
  @Order(15)
  public void _generatedNoMethodBodyIfInterface() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact myMethod()");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.setContext(_builder);
    this.builder.setIsInterface(true);
    String _generatedMethod = this.generatedMethod();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("public void myMethod();");
    this.is(_generatedMethod, _builder_1);
  }
  
  public XtendMethodBuilder setContext(final CharSequence s) {
    XtendMethodBuilder _xblockexpression = null;
    {
      this.m.parseSpec(s);
      XAbstractFeatureCall _first = this.m.<XAbstractFeatureCall>first(XAbstractFeatureCall.class);
      XtendMethodBuilder _newJavaMethodBuilder = this.builderProvider.newJavaMethodBuilder("myMethod", _first);
      XtendMethodBuilder _builder = this.builder = _newJavaMethodBuilder;
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
}
