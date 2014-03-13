/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.unit.naming;

import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.jnario.test.util.Query;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.After;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("toMethodName[After]")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExampleNameProviderToMethodNameAfterSpec extends ExampleNameProviderSpec {
  @Subject
  public ExampleNameProvider subject;
  
  @Test
  @Named("should convert after description to camel case starting in lowercase")
  @Order(1)
  public void _shouldConvertAfterDescriptionToCamelCaseStartingInLowercase() throws Exception {
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(
      "after \'my example\'", 
      "after \'my\nexample\'", 
      "after \'my\texample\'", 
      "after \'my_example\'");
    final Procedure1<String> _function = new Procedure1<String>() {
      public void apply(final String it) {
        String _firstMethodName = ExampleNameProviderToMethodNameAfterSpec.this.firstMethodName(it);
        Assert.assertTrue("\nExpected firstMethodName => \'_myExample\' but"
         + "\n     firstMethodName is " + new org.hamcrest.StringDescription().appendValue(_firstMethodName).toString() + "\n", Should.<String>operator_doubleArrow(_firstMethodName, "_myExample"));
        
      }
    };
    IterableExtensions.<String>forEach(_newArrayList, _function);
  }
  
  @Test
  @Named("should use after as default name")
  @Order(2)
  public void _shouldUseAfterAsDefaultName() throws Exception {
    String _firstMethodName = this.firstMethodName("after{}");
    Assert.assertTrue("\nExpected firstMethodName(\"after{}\") => \"after\" but"
     + "\n     firstMethodName(\"after{}\") is " + new org.hamcrest.StringDescription().appendValue(_firstMethodName).toString() + "\n", Should.<String>operator_doubleArrow(_firstMethodName, "after"));
    
  }
  
  @Test
  @Named("should use afterAll as default name")
  @Order(3)
  public void _shouldUseAfterAllAsDefaultName() throws Exception {
    String _firstMethodName = this.firstMethodName("after all{}");
    Assert.assertTrue("\nExpected firstMethodName(\"after all{}\") => \"afterAll\" but"
     + "\n     firstMethodName(\"after all{}\") is " + new org.hamcrest.StringDescription().appendValue(_firstMethodName).toString() + "\n", Should.<String>operator_doubleArrow(_firstMethodName, "afterAll"));
    
  }
  
  @Test
  @Named("should enumerate after without description")
  @Order(4)
  public void _shouldEnumerateAfterWithoutDescription() throws Exception {
    String _secondMethodName = this.secondMethodName("after{}\r\n                 after{}");
    Assert.assertTrue("\nExpected secondMethodName(\"after{}\r\n                 after{}\") => \"after2\" but"
     + "\n     secondMethodName(\"after{}\r\n                 after{}\") is " + new org.hamcrest.StringDescription().appendValue(_secondMethodName).toString() + "\n", Should.<String>operator_doubleArrow(_secondMethodName, "after2"));
    
  }
  
  @Test
  @Named("should enumerate nested after without description")
  @Order(5)
  public void _shouldEnumerateNestedAfterWithoutDescription() throws Exception {
    String _secondMethodName = this.secondMethodName(
      "after{}\r\n                 context{\r\n                   after{}\r\n                 }");
    Assert.assertTrue("\nExpected secondMethodName(\r\n                \"after{}\r\n                 context{\r\n                   after{}\r\n                 }\") => \"after2\" but"
     + "\n     secondMethodName(\r\n                \"after{}\r\n                 context{\r\n                   after{}\r\n                 }\") is " + new org.hamcrest.StringDescription().appendValue(_secondMethodName).toString() + "\n", Should.<String>operator_doubleArrow(_secondMethodName, "after2"));
    
  }
  
  @Test
  @Named("should enumerate nested after all without description")
  @Order(6)
  public void _shouldEnumerateNestedAfterAllWithoutDescription() throws Exception {
    String _secondMethodName = this.secondMethodName(
      "after all{}\r\n                 context{\r\n                   after all{}\r\n                 }");
    Assert.assertTrue("\nExpected secondMethodName(\r\n                \"after all{}\r\n                 context{\r\n                   after all{}\r\n                 }\") => \"afterAll2\" but"
     + "\n     secondMethodName(\r\n                \"after all{}\r\n                 context{\r\n                   after all{}\r\n                 }\") is " + new org.hamcrest.StringDescription().appendValue(_secondMethodName).toString() + "\n", Should.<String>operator_doubleArrow(_secondMethodName, "afterAll2"));
    
  }
  
  @Test
  @Named("nested after and after all keep their default name")
  @Order(7)
  public void _nestedAfterAndAfterAllKeepTheirDefaultName() throws Exception {
    String _secondMethodName = this.secondMethodName(
      "after{}\r\n                 context{\r\n                   after all{}\r\n                 }");
    Assert.assertTrue("\nExpected secondMethodName(\r\n                \"after{}\r\n                 context{\r\n                   after all{}\r\n                 }\") => \"afterAll\" but"
     + "\n     secondMethodName(\r\n                \"after{}\r\n                 context{\r\n                   after all{}\r\n                 }\") is " + new org.hamcrest.StringDescription().appendValue(_secondMethodName).toString() + "\n", Should.<String>operator_doubleArrow(_secondMethodName, "afterAll"));
    
  }
  
  public String firstMethodName(final String content) {
    String _xblockexpression = null;
    {
      final String contentWithContext = (("describe \'Context\'{" + content) + "}");
      Query _parse = this.parse(contentWithContext);
      After _first = _parse.<After>first(After.class);
      _xblockexpression = this.subject.toMethodName(_first);
    }
    return _xblockexpression;
  }
  
  public String secondMethodName(final String content) {
    String _xblockexpression = null;
    {
      final String contentWithContext = (("describe \'Context\'{" + content) + "}");
      Query _parse = this.parse(contentWithContext);
      After _second = _parse.<After>second(After.class);
      _xblockexpression = this.subject.toMethodName(_second);
    }
    return _xblockexpression;
  }
}
