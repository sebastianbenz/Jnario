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
@Named("XtendMethodBuilder")
@RunWith(ExampleGroupRunner.class)
public class MethodBuilderXtendMethodBuilderSpec extends MethodBuilderSpec {
  @Test
  @Named("creates method with specified name")
  @Order(1)
  public void _createsMethodWithSpecifiedName() throws Exception {
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
  
  @Test
  @Named("adds method parameters")
  @Order(2)
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
    _builder_1.append("def myMethod(boolean b, int i){");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.is(_generatedMethod, _builder_1);
  }
  
  @Test
  @Named("ignores feature call target")
  @Order(3)
  public void _ignoresFeatureCallTarget() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String x");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact x.myMethod(true, 4)");
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
  @Order(4)
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
  @Order(5)
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
  @Order(6)
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
  @Named("uses simple name for parameters")
  @Order(7)
  public void _usesSimpleNameForParameters() throws Exception {
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
  @Order(8)
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
    _builder_1.append("def myMethod(){");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.is(_generatedMethod, _builder_1);
  }
  
  public XtendMethodBuilder setContext(final CharSequence s) {
    XtendMethodBuilder _xblockexpression = null;
    {
      this.m.parseSpec(s);
      XAbstractFeatureCall _first = this.m.<XAbstractFeatureCall>first(XAbstractFeatureCall.class);
      XtendMethodBuilder _newXtendMethodBuilder = this.builderProvider.newXtendMethodBuilder("myMethod", _first);
      XtendMethodBuilder _builder = this.builder = _newXtendMethodBuilder;
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
}
