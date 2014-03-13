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
import org.eclipse.xtext.xbase.lib.IntegerRange;
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
import org.jnario.spec.spec.Example;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("toMethodName[Example]")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExampleNameProviderToMethodNameExampleSpec extends ExampleNameProviderSpec {
  @Subject
  public ExampleNameProvider subject;
  
  @Test
  @Named("converts method description to camel case starting in lowercase")
  @Order(1)
  public void _convertsMethodDescriptionToCamelCaseStartingInLowercase() throws Exception {
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(
      "\'my example\'", 
      "\'my\nexample\'", 
      "\'my\texample\'", 
      "\'my_example\'");
    final Procedure1<String> _function = new Procedure1<String>() {
      public void apply(final String it) {
        String _firstMethodName = ExampleNameProviderToMethodNameExampleSpec.this.firstMethodName(it);
        Assert.assertTrue("\nExpected firstMethodName(it) => \'_myExample\' but"
         + "\n     firstMethodName(it) is " + new org.hamcrest.StringDescription().appendValue(_firstMethodName).toString()
         + "\n     it is " + new org.hamcrest.StringDescription().appendValue(it).toString() + "\n", Should.<String>operator_doubleArrow(_firstMethodName, "_myExample"));
        
      }
    };
    IterableExtensions.<String>forEach(_newArrayList, _function);
  }
  
  @Test
  @Named("shortens method name to 250 chars")
  @Order(2)
  public void _shortensMethodNameTo250Chars() throws Exception {
    String _nameOfLength = this.nameOfLength(251);
    String _firstMethodName = this.firstMethodName(_nameOfLength);
    int _length = _firstMethodName.length();
    Assert.assertTrue("\nExpected firstMethodName(nameOfLength(251)).length => 250 but"
     + "\n     firstMethodName(nameOfLength(251)).length is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_length)).toString()
     + "\n     firstMethodName(nameOfLength(251)) is " + new org.hamcrest.StringDescription().appendValue(_firstMethodName).toString()
     + "\n     nameOfLength(251) is " + new org.hamcrest.StringDescription().appendValue(_nameOfLength).toString() + "\n", Should.<Integer>operator_doubleArrow(Integer.valueOf(_length), Integer.valueOf(250)));
    
  }
  
  public String nameOfLength(final int i) {
    String _xblockexpression = null;
    {
      String result = "";
      IntegerRange _upTo = new IntegerRange(0, i);
      for (final Integer j : _upTo) {
        result = (result + "a");
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public String firstMethodName(final String content) {
    String _xblockexpression = null;
    {
      final String contentWithContext = (("describe \'Context\'{ fact " + content) + "}");
      Query _parse = this.parse(contentWithContext);
      Example _first = _parse.<Example>first(Example.class);
      _xblockexpression = this.subject.toMethodName(_first);
    }
    return _xblockexpression;
  }
}
