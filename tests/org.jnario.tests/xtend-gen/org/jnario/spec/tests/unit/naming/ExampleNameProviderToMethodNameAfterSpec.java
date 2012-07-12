/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.unit.naming;

import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.jnario.test.util.Query;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.After;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderSpec;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("toMethodName[After]")
public class ExampleNameProviderToMethodNameAfterSpec extends ExampleNameProviderSpec {
  @Subject
  public ExampleNameProvider subject;
  
  @Test
  @Named("should convert after description to camel case starting in lowercase")
  @Order(99)
  public void shouldConvertAfterDescriptionToCamelCaseStartingInLowercase() throws Exception {
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(
      "after \'my example\'", 
      "after \'my\nexample\'", 
      "after \'my\texample\'", 
      "after \'my_example\'");
    final Procedure1<String> _function = new Procedure1<String>() {
        public void apply(final String it) {
          String _firstMethodName = ExampleNameProviderToMethodNameAfterSpec.this.firstMethodName(it);
          boolean _doubleArrow = Should.operator_doubleArrow(_firstMethodName, "myExample");
          Assert.assertTrue("\nExpected firstMethodName => \'myExample\' but"
           + "\n     firstMethodName is " + new StringDescription().appendValue(_firstMethodName).toString() + "\n", _doubleArrow);
          
        }
      };
    IterableExtensions.<String>forEach(_newArrayList, _function);
  }
  
  @Test
  @Named("should use after as default name")
  @Order(99)
  public void shouldUseAfterAsDefaultName() throws Exception {
    String _firstMethodName = this.firstMethodName("after{}");
    boolean _doubleArrow = Should.operator_doubleArrow(_firstMethodName, "after");
    Assert.assertTrue("\nExpected firstMethodName(\"after{}\") => \"after\" but"
     + "\n     firstMethodName(\"after{}\") is " + new StringDescription().appendValue(_firstMethodName).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should enumerate afters without description")
  @Order(99)
  public void shouldEnumerateAftersWithoutDescription() throws Exception {
    String _secondMethodName = this.secondMethodName("after{}\r\n                 after{}");
    boolean _doubleArrow = Should.operator_doubleArrow(_secondMethodName, "after2");
    Assert.assertTrue("\nExpected secondMethodName(\"after{}\r\n                 after{}\") => \"after2\" but"
     + "\n     secondMethodName(\"after{}\r\n                 after{}\") is " + new StringDescription().appendValue(_secondMethodName).toString() + "\n", _doubleArrow);
    
  }
  
  public String firstMethodName(final String content) {
    String _xblockexpression = null;
    {
      String _plus = ("describe \'Context\'{" + content);
      final String contentWithContext = (_plus + "}");
      Query _parse = this.parse(contentWithContext);
      After _first = _parse.<After>first(After.class);
      String _methodName = this.subject.toMethodName(_first);
      _xblockexpression = (_methodName);
    }
    return _xblockexpression;
  }
  
  public String secondMethodName(final String content) {
    String _xblockexpression = null;
    {
      String _plus = ("describe \'Context\'{" + content);
      final String contentWithContext = (_plus + "}");
      Query _parse = this.parse(contentWithContext);
      After _second = _parse.<After>second(After.class);
      String _methodName = this.subject.toMethodName(_second);
      _xblockexpression = (_methodName);
    }
    return _xblockexpression;
  }
}
