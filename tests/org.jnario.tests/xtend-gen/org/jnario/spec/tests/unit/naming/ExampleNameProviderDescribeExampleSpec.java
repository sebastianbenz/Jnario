/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.unit.naming;

import org.jnario.jnario.test.util.Query;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.Example;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("describe[Example]")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExampleNameProviderDescribeExampleSpec extends ExampleNameProviderSpec {
  @Subject
  public ExampleNameProvider subject;
  
  @Test
  @Named("should use the description")
  @Order(1)
  public void _shouldUseTheDescription() throws Exception {
    String _describeFirst = this.describeFirst("\'should do stuff\' {true}");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_describeFirst, "should do stuff");
    Assert.assertTrue("\nExpected describeFirst(\"\'should do stuff\' {true}\") => \"should do stuff\" but"
     + "\n     describeFirst(\"\'should do stuff\' {true}\") is " + new org.hamcrest.StringDescription().appendValue(_describeFirst).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("appends \\\'[PENDING]\\\' to pending example descriptions")
  @Order(2)
  public void _appendsPENDINGToPendingExampleDescriptions() throws Exception {
    String _describeFirst = this.describeFirst("\'should do stuff\'");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_describeFirst, "should do stuff [PENDING]");
    Assert.assertTrue("\nExpected describeFirst(\"\'should do stuff\'\") => \"should do stuff [PENDING]\" but"
     + "\n     describeFirst(\"\'should do stuff\'\") is " + new org.hamcrest.StringDescription().appendValue(_describeFirst).toString() + "\n", _doubleArrow);
    
    String _describeFirst_1 = this.describeFirst("\'should do stuff\'{}");
    boolean _doubleArrow_1 = Should.<String>operator_doubleArrow(_describeFirst_1, "should do stuff [PENDING]");
    Assert.assertTrue("\nExpected describeFirst(\"\'should do stuff\'{}\") => \"should do stuff [PENDING]\" but"
     + "\n     describeFirst(\"\'should do stuff\'{}\") is " + new org.hamcrest.StringDescription().appendValue(_describeFirst_1).toString() + "\n", _doubleArrow_1);
    
  }
  
  public String describeFirst(final String content) {
    String _xblockexpression = null;
    {
      String _plus = ("describe \'Example\'{ fact " + content);
      final String contentWithExampleGroup = (_plus + "}");
      Query _parse = this.parse(contentWithExampleGroup);
      Example _first = _parse.<Example>first(Example.class);
      String _describe = this.subject.describe(_first);
      _xblockexpression = (_describe);
    }
    return _xblockexpression;
  }
}
