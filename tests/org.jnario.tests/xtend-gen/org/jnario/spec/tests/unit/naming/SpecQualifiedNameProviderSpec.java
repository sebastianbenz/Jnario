/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.unit.naming;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;
import org.hamcrest.Matcher;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.naming.SpecQualifiedNameProvider;
import org.jnario.spec.spec.ExampleGroup;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("SpecQualifiedNameProvider")
@RunWith(ExampleGroupRunner.class)
@CreateWith(SpecTestCreator.class)
@SuppressWarnings("all")
public class SpecQualifiedNameProviderSpec {
  @Subject
  public SpecQualifiedNameProvider subject;
  
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public ModelStore _modelStore;
  
  @Test
  @Named("null if spec description is empty")
  @Order(1)
  public void _nullIfSpecDescriptionIsEmpty() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test");
    _builder.newLine();
    _builder.append("describe \"\"{}");
    this._modelStore.parseSpec(_builder);
    String _qualifiedName = this.qualifiedName();
    Matcher<String> _nullValue = Should.<String>nullValue();
    boolean _should_be = Should.<String>should_be(_qualifiedName, _nullValue);
    Assert.assertTrue("\nExpected qualifiedName should be nullValue but"
     + "\n     qualifiedName is " + new org.hamcrest.StringDescription().appendValue(_qualifiedName).toString()
     + "\n     nullValue is " + new org.hamcrest.StringDescription().appendValue(_nullValue).toString() + "\n", _should_be);
    
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("describe \"\"{}");
    this._modelStore.parseSpec(_builder_1);
    String _qualifiedName_1 = this.qualifiedName();
    Matcher<String> _nullValue_1 = Should.<String>nullValue();
    Assert.assertTrue("\nExpected qualifiedName should be nullValue but"
     + "\n     qualifiedName is " + new org.hamcrest.StringDescription().appendValue(_qualifiedName_1).toString()
     + "\n     nullValue is " + new org.hamcrest.StringDescription().appendValue(_nullValue_1).toString() + "\n", Should.<String>should_be(_qualifiedName_1, _nullValue_1));
    
  }
  
  @Test
  @Named("uses spec description")
  @Order(2)
  public void _usesSpecDescription() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"My Spec\"{}");
    this._modelStore.parseSpec(_builder);
    String _qualifiedName = this.qualifiedName();
    Assert.assertTrue("\nExpected qualifiedName => \"My Spec\" but"
     + "\n     qualifiedName is " + new org.hamcrest.StringDescription().appendValue(_qualifiedName).toString() + "\n", Should.<String>operator_doubleArrow(_qualifiedName, "My Spec"));
    
  }
  
  @Test
  @Named("trims spec description whitespace")
  @Order(3)
  public void _trimsSpecDescriptionWhitespace() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"My Spec  \"{}");
    this._modelStore.parseSpec(_builder);
    String _qualifiedName = this.qualifiedName();
    Assert.assertTrue("\nExpected qualifiedName => \"My Spec\" but"
     + "\n     qualifiedName is " + new org.hamcrest.StringDescription().appendValue(_qualifiedName).toString() + "\n", Should.<String>operator_doubleArrow(_qualifiedName, "My Spec"));
    
  }
  
  @Test
  @Named("uses referenced type")
  @Order(4)
  public void _usesReferencedType() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe org.junit.Assert{}");
    this._modelStore.parseSpec(_builder);
    String _qualifiedName = this.qualifiedName();
    Assert.assertTrue("\nExpected qualifiedName => \"Assert\" but"
     + "\n     qualifiedName is " + new org.hamcrest.StringDescription().appendValue(_qualifiedName).toString() + "\n", Should.<String>operator_doubleArrow(_qualifiedName, "Assert"));
    
  }
  
  @Test
  @Named("uses referenced type and description")
  @Order(5)
  public void _usesReferencedTypeAndDescription() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe org.junit.Assert \"My Spec\"{}");
    this._modelStore.parseSpec(_builder);
    String _qualifiedName = this.qualifiedName();
    Assert.assertTrue("\nExpected qualifiedName => \"Assert My Spec\" but"
     + "\n     qualifiedName is " + new org.hamcrest.StringDescription().appendValue(_qualifiedName).toString() + "\n", Should.<String>operator_doubleArrow(_qualifiedName, "Assert My Spec"));
    
  }
  
  @Test
  @Named("adds spec package")
  @Order(6)
  public void _addsSpecPackage() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test");
    _builder.newLine();
    _builder.append("describe \"My Spec\"{}");
    this._modelStore.parseSpec(_builder);
    String _qualifiedName = this.qualifiedName();
    Assert.assertTrue("\nExpected qualifiedName => \"test.My Spec\" but"
     + "\n     qualifiedName is " + new org.hamcrest.StringDescription().appendValue(_qualifiedName).toString() + "\n", Should.<String>operator_doubleArrow(_qualifiedName, "test.My Spec"));
    
  }
  
  public String qualifiedName() {
    ExampleGroup _firstSpec = this._modelStore.firstSpec();
    QualifiedName _fullyQualifiedName = this.subject.getFullyQualifiedName(_firstSpec);
    String _string = null;
    if (_fullyQualifiedName!=null) {
      _string=_fullyQualifiedName.toString();
    }
    return _string;
  }
}
