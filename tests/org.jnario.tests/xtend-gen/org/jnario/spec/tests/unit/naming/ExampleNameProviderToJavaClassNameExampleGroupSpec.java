package org.jnario.spec.tests.unit.naming;

import java.util.ArrayList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.hamcrest.StringDescription;
import org.jnario.jnario.test.util.Query;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("toJavaClassName[ExampleGroup]")
@RunWith(ExampleGroupRunner.class)
public class ExampleNameProviderToJavaClassNameExampleGroupSpec extends ExampleNameProviderSpec {
  @Subject
  public ExampleNameProvider subject;
  
  @Test
  @Named("should remove all white spaces from ExampleGroup\\\'s description")
  @Order(1)
  public void _shouldRemoveAllWhiteSpacesFromExampleGroupSDescription() throws Exception {
    String _firstJavaClassName = this.firstJavaClassName("describe \'My Example\'");
    boolean _should_contain = Should.should_contain(_firstJavaClassName, " ");
    Assert.assertFalse("\nExpected firstJavaClassName(\"describe \'My Example\'\") should not contain \" \" but"
     + "\n     firstJavaClassName(\"describe \'My Example\'\") is " + new StringDescription().appendValue(_firstJavaClassName).toString() + "\n", _should_contain);
    
  }
  
  @Test
  @Named("should append \\\'Spec\\\' to class name")
  @Order(2)
  public void _shouldAppendSpecToClassName() throws Exception {
    String _firstJavaClassName = this.firstJavaClassName("describe \'My Example\'");
    Matcher<String> _endsWith = Matchers.endsWith("Spec");
    boolean _doubleArrow = Should.operator_doubleArrow(_firstJavaClassName, _endsWith);
    Assert.assertTrue("\nExpected firstJavaClassName(\"describe \'My Example\'\") => endsWith(\'Spec\') but"
     + "\n     firstJavaClassName(\"describe \'My Example\'\") is " + new StringDescription().appendValue(_firstJavaClassName).toString()
     + "\n     endsWith(\'Spec\') is " + new StringDescription().appendValue(_endsWith).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should prepend target type name")
  @Order(3)
  public void _shouldPrependTargetTypeName() throws Exception {
    String _firstJavaClassName = this.firstJavaClassName("describe org.junit.Assert \'My Example\'");
    Matcher<String> _startsWith = Matchers.startsWith("Assert");
    boolean _doubleArrow = Should.operator_doubleArrow(_firstJavaClassName, _startsWith);
    Assert.assertTrue("\nExpected firstJavaClassName(\"describe org.junit.Assert \'My Example\'\") => startsWith(\"Assert\") but"
     + "\n     firstJavaClassName(\"describe org.junit.Assert \'My Example\'\") is " + new StringDescription().appendValue(_firstJavaClassName).toString()
     + "\n     startsWith(\"Assert\") is " + new StringDescription().appendValue(_startsWith).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should prepend unresolved target type name")
  @Order(4)
  public void _shouldPrependUnresolvedTargetTypeName() throws Exception {
    String _firstJavaClassName = this.firstJavaClassName("describe Unresolved");
    Matcher<String> _startsWith = Matchers.startsWith("UnresolvedSpec");
    boolean _doubleArrow = Should.operator_doubleArrow(_firstJavaClassName, _startsWith);
    Assert.assertTrue("\nExpected firstJavaClassName(\"describe Unresolved\")              => startsWith(\"UnresolvedSpec\") but"
     + "\n     firstJavaClassName(\"describe Unresolved\") is " + new StringDescription().appendValue(_firstJavaClassName).toString()
     + "\n     startsWith(\"UnresolvedSpec\") is " + new StringDescription().appendValue(_startsWith).toString() + "\n", _doubleArrow);
    
    String _firstJavaClassName_1 = this.firstJavaClassName("describe java.Unresolved");
    Matcher<String> _startsWith_1 = Matchers.startsWith("UnresolvedSpec");
    boolean _doubleArrow_1 = Should.operator_doubleArrow(_firstJavaClassName_1, _startsWith_1);
    Assert.assertTrue("\nExpected firstJavaClassName(\"describe java.Unresolved\")         => startsWith(\"UnresolvedSpec\") but"
     + "\n     firstJavaClassName(\"describe java.Unresolved\") is " + new StringDescription().appendValue(_firstJavaClassName_1).toString()
     + "\n     startsWith(\"UnresolvedSpec\") is " + new StringDescription().appendValue(_startsWith_1).toString() + "\n", _doubleArrow_1);
    
    String _firstJavaClassName_2 = this.firstJavaClassName("describe Unresolved$SubClass");
    Matcher<String> _startsWith_2 = Matchers.startsWith("SubClassSpec");
    boolean _doubleArrow_2 = Should.operator_doubleArrow(_firstJavaClassName_2, _startsWith_2);
    Assert.assertTrue("\nExpected firstJavaClassName(\"describe Unresolved$SubClass\")     => startsWith(\"SubClassSpec\") but"
     + "\n     firstJavaClassName(\"describe Unresolved$SubClass\") is " + new StringDescription().appendValue(_firstJavaClassName_2).toString()
     + "\n     startsWith(\"SubClassSpec\") is " + new StringDescription().appendValue(_startsWith_2).toString() + "\n", _doubleArrow_2);
    
    String _firstJavaClassName_3 = this.firstJavaClassName("describe java.Unresolved<String>");
    Matcher<String> _startsWith_3 = Matchers.startsWith("UnresolvedSpec");
    boolean _doubleArrow_3 = Should.operator_doubleArrow(_firstJavaClassName_3, _startsWith_3);
    Assert.assertTrue("\nExpected firstJavaClassName(\"describe java.Unresolved<String>\") => startsWith(\"UnresolvedSpec\") but"
     + "\n     firstJavaClassName(\"describe java.Unresolved<String>\") is " + new StringDescription().appendValue(_firstJavaClassName_3).toString()
     + "\n     startsWith(\"UnresolvedSpec\") is " + new StringDescription().appendValue(_startsWith_3).toString() + "\n", _doubleArrow_3);
    
  }
  
  @Test
  @Named("should convert description to camel case")
  @Order(5)
  public void _shouldConvertDescriptionToCamelCase() throws Exception {
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(
      "describe \'my example\'", 
      "describe \'my\nexample\'", 
      "describe \'my\texample\'", 
      "describe \'my_example\'");
    final Procedure1<String> _function = new Procedure1<String>() {
        public void apply(final String it) {
          String _firstJavaClassName = ExampleNameProviderToJavaClassNameExampleGroupSpec.this.firstJavaClassName(it);
          boolean _doubleArrow = Should.operator_doubleArrow(_firstJavaClassName, "MyExampleSpec");
          Assert.assertTrue("\nExpected firstJavaClassName(it) => \'MyExampleSpec\' but"
           + "\n     firstJavaClassName(it) is " + new StringDescription().appendValue(_firstJavaClassName).toString()
           + "\n     it is " + new StringDescription().appendValue(it).toString() + "\n", _doubleArrow);
          
        }
      };
    IterableExtensions.<String>forEach(_newArrayList, _function);
  }
  
  @Test
  @Named("should prefix numbers")
  @Order(6)
  public void _shouldPrefixNumbers() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"2 Facts\"{}");
    _builder.newLine();
    final String name = this.firstJavaClassName(_builder);
    boolean _doubleArrow = Should.operator_doubleArrow(name, "_2FactsSpec");
    Assert.assertTrue("\nExpected name => \'_2FactsSpec\' but"
     + "\n     name is " + new StringDescription().appendValue(name).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should prefix numbers in nested specs")
  @Order(7)
  public void _shouldPrefixNumbersInNestedSpecs() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"2 Facts\"{");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("context \"Context\"");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final String name = this.secondJavaClassName(_builder);
    boolean _doubleArrow = Should.operator_doubleArrow(name, "_2FactsContextSpec");
    Assert.assertTrue("\nExpected name => \'_2FactsContextSpec\' but"
     + "\n     name is " + new StringDescription().appendValue(name).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should append the target operation\\\'s name and params")
  @Order(8)
  public void _shouldAppendTheTargetOperationSNameAndParams() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe org.junit.Assert{");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("context assertTrue(boolean) ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    String _secondJavaClassName = this.secondJavaClassName(_builder);
    Matcher<String> _endsWith = Matchers.endsWith("AssertTrueBooleanSpec");
    boolean _doubleArrow = Should.operator_doubleArrow(_secondJavaClassName, _endsWith);
    Assert.assertTrue("\nExpected secondJavaClassName(\r\n        \'\'\'\r\n        describe org.junit.Assert{\r\n              context assertTrue(boolean) \r\n        }\r\n        \'\'\') => endsWith(\'AssertTrueBooleanSpec\') but"
     + "\n     secondJavaClassName(\r\n        \'\'\'\r\n        describe org.junit.Assert{\r\n              context assertTrue(boolean) \r\n        }\r\n        \'\'\') is " + new StringDescription().appendValue(_secondJavaClassName).toString()
     + "\n     \'\'\'\r\n        describe org.junit.Assert{\r\n              context assertTrue(boolean) \r\n        }\r\n        \'\'\' is " + new StringDescription().appendValue(_builder).toString()
     + "\n     endsWith(\'AssertTrueBooleanSpec\') is " + new StringDescription().appendValue(_endsWith).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should append the description")
  @Order(9)
  public void _shouldAppendTheDescription() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe org.junit.Assert{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("context \'assertTrue\' ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    String _secondJavaClassName = this.secondJavaClassName(_builder);
    Matcher<String> _endsWith = Matchers.endsWith("AssertTrueSpec");
    boolean _doubleArrow = Should.operator_doubleArrow(_secondJavaClassName, _endsWith);
    Assert.assertTrue("\nExpected secondJavaClassName(\r\n      \'\'\'\r\n        describe org.junit.Assert{\r\n          context \'assertTrue\' \r\n        }\r\n      \'\'\') => endsWith(\'AssertTrueSpec\') but"
     + "\n     secondJavaClassName(\r\n      \'\'\'\r\n        describe org.junit.Assert{\r\n          context \'assertTrue\' \r\n        }\r\n      \'\'\') is " + new StringDescription().appendValue(_secondJavaClassName).toString()
     + "\n     \'\'\'\r\n        describe org.junit.Assert{\r\n          context \'assertTrue\' \r\n        }\r\n      \'\'\' is " + new StringDescription().appendValue(_builder).toString()
     + "\n     endsWith(\'AssertTrueSpec\') is " + new StringDescription().appendValue(_endsWith).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should prepend the parent ExampleGroup\\\'s name")
  @Order(10)
  public void _shouldPrependTheParentExampleGroupSName() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe org.junit.Assert{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("context assertTrue(boolean) ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    String _secondJavaClassName = this.secondJavaClassName(_builder);
    boolean _doubleArrow = Should.operator_doubleArrow(_secondJavaClassName, "AssertAssertTrueBooleanSpec");
    Assert.assertTrue("\nExpected secondJavaClassName(\r\n      \'\'\'\r\n      describe org.junit.Assert{\r\n        context assertTrue(boolean) \r\n      }\r\n      \'\'\') => \'AssertAssertTrueBooleanSpec\' but"
     + "\n     secondJavaClassName(\r\n      \'\'\'\r\n      describe org.junit.Assert{\r\n        context assertTrue(boolean) \r\n      }\r\n      \'\'\') is " + new StringDescription().appendValue(_secondJavaClassName).toString()
     + "\n     \'\'\'\r\n      describe org.junit.Assert{\r\n        context assertTrue(boolean) \r\n      }\r\n      \'\'\' is " + new StringDescription().appendValue(_builder).toString() + "\n", _doubleArrow);
    
  }
  
  public String firstJavaClassName(final CharSequence content) {
    String _plus = (content + "{}");
    Query _parse = this.parse(_plus);
    ExampleGroup _first = _parse.<ExampleGroup>first(ExampleGroup.class);
    String _javaClassName = this.subject.toJavaClassName(_first);
    return _javaClassName;
  }
  
  public String secondJavaClassName(final CharSequence content) {
    String _plus = (content + "{}");
    Query _parse = this.parse(_plus);
    ExampleGroup _second = _parse.<ExampleGroup>second(ExampleGroup.class);
    String _javaClassName = this.subject.toJavaClassName(_second);
    return _javaClassName;
  }
}
