/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.unit.naming;

import org.eclipse.xtend2.lib.StringConcatenation;
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

@Named("describe[ExampleGroup]")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExampleNameProviderDescribeExampleGroupSpec extends ExampleNameProviderSpec {
  @Subject
  public ExampleNameProvider subject;
  
  @Test
  @Named("should use the description")
  @Order(1)
  public void _shouldUseTheDescription() throws Exception {
    String _describeFirst = this.describeFirst("describe \'My Description\'");
    Assert.assertTrue("\nExpected describeFirst(\"describe \'My Description\'\") => \"My Description\" but"
     + "\n     describeFirst(\"describe \'My Description\'\") is " + new org.hamcrest.StringDescription().appendValue(_describeFirst).toString() + "\n", Should.<String>operator_doubleArrow(_describeFirst, "My Description"));
    
  }
  
  @Test
  @Named("should use the target type")
  @Order(2)
  public void _shouldUseTheTargetType() throws Exception {
    String _describeFirst = this.describeFirst("describe org.junit.Assert");
    Assert.assertTrue("\nExpected describeFirst(\"describe org.junit.Assert\") => \"Assert\" but"
     + "\n     describeFirst(\"describe org.junit.Assert\") is " + new org.hamcrest.StringDescription().appendValue(_describeFirst).toString() + "\n", Should.<String>operator_doubleArrow(_describeFirst, "Assert"));
    
  }
  
  @Test
  @Named("should use the unresolved target type")
  @Order(3)
  public void _shouldUseTheUnresolvedTargetType() throws Exception {
    String _describeFirst = this.describeFirst("describe Unresolved");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_describeFirst, "Unresolved");
    Assert.assertTrue("\nExpected describeFirst(\"describe Unresolved\") => \"Unresolved\" but"
     + "\n     describeFirst(\"describe Unresolved\") is " + new org.hamcrest.StringDescription().appendValue(_describeFirst).toString() + "\n", _doubleArrow);
    
    String _describeFirst_1 = this.describeFirst("describe org.Unresolved");
    Assert.assertTrue("\nExpected describeFirst(\"describe org.Unresolved\") => \"Unresolved\" but"
     + "\n     describeFirst(\"describe org.Unresolved\") is " + new org.hamcrest.StringDescription().appendValue(_describeFirst_1).toString() + "\n", Should.<String>operator_doubleArrow(_describeFirst_1, "Unresolved"));
    
  }
  
  @Test
  @Named("should combine target type and description")
  @Order(4)
  public void _shouldCombineTargetTypeAndDescription() throws Exception {
    String _describeFirst = this.describeFirst("describe org.junit.Assert \'and more\'");
    Assert.assertTrue("\nExpected describeFirst(\"describe org.junit.Assert \'and more\'\") => \"Assert and more\" but"
     + "\n     describeFirst(\"describe org.junit.Assert \'and more\'\") is " + new org.hamcrest.StringDescription().appendValue(_describeFirst).toString() + "\n", Should.<String>operator_doubleArrow(_describeFirst, "Assert and more"));
    
  }
  
  @Test
  @Named("should use the target operation")
  @Order(5)
  public void _shouldUseTheTargetOperation() throws Exception {
    String _describeSecond = this.describeSecond("describe org.junit.Assert{\r\n                    context assertTrue(boolean) {}\r\n                 }");
    Assert.assertTrue("\nExpected describeSecond(\"describe org.junit.Assert{\r\n                    context assertTrue(boolean) {}\r\n                 }\") => \"assertTrue[boolean]\" but"
     + "\n     describeSecond(\"describe org.junit.Assert{\r\n                    context assertTrue(boolean) {}\r\n                 }\") is " + new org.hamcrest.StringDescription().appendValue(_describeSecond).toString() + "\n", Should.<String>operator_doubleArrow(_describeSecond, "assertTrue[boolean]"));
    
  }
  
  @Test
  @Named("should combine target operation and description")
  @Order(6)
  public void _shouldCombineTargetOperationAndDescription() throws Exception {
    String _describeSecond = this.describeSecond("describe org.junit.Assert{\r\n                    context assertTrue(boolean) \'and more\'{}\r\n                 }");
    Assert.assertTrue("\nExpected describeSecond(\"describe org.junit.Assert{\r\n                    context assertTrue(boolean) \'and more\'{}\r\n                 }\") => \"assertTrue[boolean] and more\" but"
     + "\n     describeSecond(\"describe org.junit.Assert{\r\n                    context assertTrue(boolean) \'and more\'{}\r\n                 }\") is " + new org.hamcrest.StringDescription().appendValue(_describeSecond).toString() + "\n", Should.<String>operator_doubleArrow(_describeSecond, "assertTrue[boolean] and more"));
    
  }
  
  @Test
  @Named("should escape quotes")
  @Order(7)
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
    Assert.assertTrue("\nExpected describeSecond(text) => \'and \\\\\"more\\\\\"\' but"
     + "\n     describeSecond(text) is " + new org.hamcrest.StringDescription().appendValue(_describeSecond).toString()
     + "\n     text is " + new org.hamcrest.StringDescription().appendValue(text).toString() + "\n", Should.<String>operator_doubleArrow(_describeSecond, "and \\\"more\\\""));
    
  }
  
  @Test
  @Named("should replace line breaks and leading whitespace with a single space")
  @Order(8)
  public void _shouldReplaceLineBreaksAndLeadingWhitespaceWithASingleSpace() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Example\\n\\t 2\"");
    final String text = _builder.toString();
    String _describeFirst = this.describeFirst(text);
    Assert.assertTrue("\nExpected describeFirst(text) => \'Example 2\' but"
     + "\n     describeFirst(text) is " + new org.hamcrest.StringDescription().appendValue(_describeFirst).toString()
     + "\n     text is " + new org.hamcrest.StringDescription().appendValue(text).toString() + "\n", Should.<String>operator_doubleArrow(_describeFirst, "Example 2"));
    
  }
  
  public String describeFirst(final String content) {
    Query _parse = this.parse((content + "{}"));
    ExampleGroup _first = _parse.<ExampleGroup>first(ExampleGroup.class);
    return this.subject.describe(_first);
  }
  
  public String describeSecond(final String content) {
    Query _parse = this.parse(content);
    ExampleGroup _second = _parse.<ExampleGroup>second(ExampleGroup.class);
    return this.subject.describe(_second);
  }
}
