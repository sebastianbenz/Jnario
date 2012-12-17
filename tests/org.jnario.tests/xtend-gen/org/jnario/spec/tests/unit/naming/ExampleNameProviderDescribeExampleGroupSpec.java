package org.jnario.spec.tests.unit.naming;

import org.eclipse.xtend2.lib.StringConcatenation;
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
@Named("describe[ExampleGroup]")
@RunWith(ExampleGroupRunner.class)
public class ExampleNameProviderDescribeExampleGroupSpec extends ExampleNameProviderSpec {
  @Subject
  public ExampleNameProvider subject;
  
  @Test
  @Named("should use the description")
  @Order(32)
  public void _shouldUseTheDescription() throws Exception {
    String _describeFirst = this.describeFirst("describe \'My Description\'");
    boolean _doubleArrow = Should.operator_doubleArrow(_describeFirst, "My Description");
    Assert.assertTrue("\nExpected describeFirst(\"describe \'My Description\'\") => \"My Description\" but"
     + "\n     describeFirst(\"describe \'My Description\'\") is " + new StringDescription().appendValue(_describeFirst).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should use the target type")
  @Order(33)
  public void _shouldUseTheTargetType() throws Exception {
    String _describeFirst = this.describeFirst("describe org.junit.Assert");
    boolean _doubleArrow = Should.operator_doubleArrow(_describeFirst, "Assert");
    Assert.assertTrue("\nExpected describeFirst(\"describe org.junit.Assert\") => \"Assert\" but"
     + "\n     describeFirst(\"describe org.junit.Assert\") is " + new StringDescription().appendValue(_describeFirst).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should use the unresolved target type")
  @Order(34)
  public void _shouldUseTheUnresolvedTargetType() throws Exception {
    String _describeFirst = this.describeFirst("describe Unresolved");
    boolean _doubleArrow = Should.operator_doubleArrow(_describeFirst, "Unresolved");
    Assert.assertTrue("\nExpected describeFirst(\"describe Unresolved\") => \"Unresolved\" but"
     + "\n     describeFirst(\"describe Unresolved\") is " + new StringDescription().appendValue(_describeFirst).toString() + "\n", _doubleArrow);
    
    String _describeFirst_1 = this.describeFirst("describe org.Unresolved");
    boolean _doubleArrow_1 = Should.operator_doubleArrow(_describeFirst_1, "Unresolved");
    Assert.assertTrue("\nExpected describeFirst(\"describe org.Unresolved\") => \"Unresolved\" but"
     + "\n     describeFirst(\"describe org.Unresolved\") is " + new StringDescription().appendValue(_describeFirst_1).toString() + "\n", _doubleArrow_1);
    
  }
  
  @Test
  @Named("should combine target type and description")
  @Order(35)
  public void _shouldCombineTargetTypeAndDescription() throws Exception {
    String _describeFirst = this.describeFirst("describe org.junit.Assert \'and more\'");
    boolean _doubleArrow = Should.operator_doubleArrow(_describeFirst, "Assert and more");
    Assert.assertTrue("\nExpected describeFirst(\"describe org.junit.Assert \'and more\'\") => \"Assert and more\" but"
     + "\n     describeFirst(\"describe org.junit.Assert \'and more\'\") is " + new StringDescription().appendValue(_describeFirst).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should use the target operation")
  @Order(36)
  public void _shouldUseTheTargetOperation() throws Exception {
    String _describeSecond = this.describeSecond("describe org.junit.Assert{\r\n                    context assertTrue(boolean) {}\r\n                 }");
    boolean _doubleArrow = Should.operator_doubleArrow(_describeSecond, "assertTrue[boolean]");
    Assert.assertTrue("\nExpected describeSecond(\"describe org.junit.Assert{\r\n                    context assertTrue(boolean) {}\r\n                 }\") => \"assertTrue[boolean]\" but"
     + "\n     describeSecond(\"describe org.junit.Assert{\r\n                    context assertTrue(boolean) {}\r\n                 }\") is " + new StringDescription().appendValue(_describeSecond).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should combine target operation and description")
  @Order(37)
  public void _shouldCombineTargetOperationAndDescription() throws Exception {
    String _describeSecond = this.describeSecond("describe org.junit.Assert{\r\n                    context assertTrue(boolean) \'and more\'{}\r\n                 }");
    boolean _doubleArrow = Should.operator_doubleArrow(_describeSecond, "assertTrue[boolean] and more");
    Assert.assertTrue("\nExpected describeSecond(\"describe org.junit.Assert{\r\n                    context assertTrue(boolean) \'and more\'{}\r\n                 }\") => \"assertTrue[boolean] and more\" but"
     + "\n     describeSecond(\"describe org.junit.Assert{\r\n                    context assertTrue(boolean) \'and more\'{}\r\n                 }\") is " + new StringDescription().appendValue(_describeSecond).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should escape quotes")
  @Order(38)
  public void _shouldEscapeQuotes() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \'Example\'{");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("describe \'and \"more\"\'{}");
    _builder.newLine();
    _builder.append("                 ");
    _builder.append("}");
    final String text = _builder.toString();
    String _describeSecond = this.describeSecond(text);
    boolean _doubleArrow = Should.operator_doubleArrow(_describeSecond, "and \\\"more\\\"");
    Assert.assertTrue("\nExpected describeSecond(text) => \'and \\\\\"more\\\\\"\' but"
     + "\n     describeSecond(text) is " + new StringDescription().appendValue(_describeSecond).toString()
     + "\n     text is " + new StringDescription().appendValue(text).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should replace line breaks and leading whitespace with a single space")
  @Order(39)
  public void _shouldReplaceLineBreaksAndLeadingWhitespaceWithASingleSpace() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Example\\n\\t 2\"");
    final String text = _builder.toString();
    String _describeFirst = this.describeFirst(text);
    boolean _doubleArrow = Should.operator_doubleArrow(_describeFirst, "Example 2");
    Assert.assertTrue("\nExpected describeFirst(text) => \'Example 2\' but"
     + "\n     describeFirst(text) is " + new StringDescription().appendValue(_describeFirst).toString()
     + "\n     text is " + new StringDescription().appendValue(text).toString() + "\n", _doubleArrow);
    
  }
  
  public String describeFirst(final String content) {
    String _plus = (content + "{}");
    Query _parse = this.parse(_plus);
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
