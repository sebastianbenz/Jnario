package org.jnario.spec.tests.unit.naming;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.jnario.jnario.test.util.Query;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderSpec;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("describe[ExampleGroup]")
public class ExampleNameProviderDescribeExampleGroupSpec extends ExampleNameProviderSpec {
  @Subject
  public ExampleNameProvider subject;
  
  @Test
  @Named("should use the description")
  @Order(99)
  public void shouldUseTheDescription() throws Exception {
    String _describeFirst = this.describeFirst("describe \'My Description\'");
    boolean _doubleArrow = ObjectExtensions.<String>operator_doubleArrow(_describeFirst, "My Description");
    Assert.assertTrue("\nExpected describeFirst(\"describe \'My Description\'\") => \"My Description\" but"
     + "\n     describeFirst(\"describe \'My Description\'\") is " + "\"" + _describeFirst + "\"" + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should use the target type")
  @Order(99)
  public void shouldUseTheTargetType() throws Exception {
    String _describeFirst = this.describeFirst("describe org.junit.Assert");
    boolean _doubleArrow = ObjectExtensions.<String>operator_doubleArrow(_describeFirst, "Assert");
    Assert.assertTrue("\nExpected describeFirst(\"describe org.junit.Assert\") => \"Assert\" but"
     + "\n     describeFirst(\"describe org.junit.Assert\") is " + "\"" + _describeFirst + "\"" + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should combine target type and description")
  @Order(99)
  public void shouldCombineTargetTypeAndDescription() throws Exception {
    String _describeFirst = this.describeFirst("describe org.junit.Assert \'and more\'");
    boolean _doubleArrow = ObjectExtensions.<String>operator_doubleArrow(_describeFirst, "Assert and more");
    Assert.assertTrue("\nExpected describeFirst(\"describe org.junit.Assert \'and more\'\") => \"Assert and more\" but"
     + "\n     describeFirst(\"describe org.junit.Assert \'and more\'\") is " + "\"" + _describeFirst + "\"" + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should use the target operation")
  @Order(99)
  public void shouldUseTheTargetOperation() throws Exception {
    String _describeSecond = this.describeSecond("describe org.junit.Assert{\r\n                    context assertTrue(boolean) \r\n                 }");
    boolean _doubleArrow = ObjectExtensions.<String>operator_doubleArrow(_describeSecond, "assertTrue[boolean]");
    Assert.assertTrue("\nExpected describeSecond(\"describe org.junit.Assert{\r\n                    context assertTrue(boolean) \r\n                 }\") => \"assertTrue[boolean]\" but"
     + "\n     describeSecond(\"describe org.junit.Assert{\r\n                    context assertTrue(boolean) \r\n                 }\") is " + "\"" + _describeSecond + "\"" + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should combine target operation and description")
  @Order(99)
  public void shouldCombineTargetOperationAndDescription() throws Exception {
    String _describeSecond = this.describeSecond("describe org.junit.Assert{\r\n                    context assertTrue(boolean) \'and more\'\r\n                 }");
    boolean _doubleArrow = ObjectExtensions.<String>operator_doubleArrow(_describeSecond, "assertTrue[boolean] and more");
    Assert.assertTrue("\nExpected describeSecond(\"describe org.junit.Assert{\r\n                    context assertTrue(boolean) \'and more\'\r\n                 }\") => \"assertTrue[boolean] and more\" but"
     + "\n     describeSecond(\"describe org.junit.Assert{\r\n                    context assertTrue(boolean) \'and more\'\r\n                 }\") is " + "\"" + _describeSecond + "\"" + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should escape quotes")
  @Order(99)
  public void shouldEscapeQuotes() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \'Example\'{");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("describe \'and \"more\"\'");
    _builder.newLine();
    _builder.append("                 ");
    _builder.append("}");
    final String text = _builder.toString();
    String _describeSecond = this.describeSecond(text);
    boolean _doubleArrow = ObjectExtensions.<String>operator_doubleArrow(_describeSecond, "and \\\"more\\\"");
    Assert.assertTrue("\nExpected describeSecond(text) => \'and \\\\\"more\\\\\"\' but"
     + "\n     describeSecond(text) is " + "\"" + _describeSecond + "\""
     + "\n     text is " + "\"" + text + "\"" + "\n", _doubleArrow);
    
  }
  
  public String describeFirst(final String content) {
    Query _parse = this.parse(content);
    ExampleGroup _first = _parse.<ExampleGroup>first(ExampleGroup.class);
    String _describe = this.subject.describe(_first);
    return _describe;
  }
  
  public String describeSecond(final String content) {
    Query _parse = this.parse(content);
    ExampleGroup _second = _parse.<ExampleGroup>second(ExampleGroup.class);
    String _describe = this.subject.describe(_second);
    return _describe;
  }
}
