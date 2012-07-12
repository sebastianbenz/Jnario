/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.tests.unit;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;
import org.jnario.doc.DocumentationProvider;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("DocumentationProvider")
public class DocumentationProviderSpec {
  String comment = "";
  
  final DocumentationProvider subject = new Function0<DocumentationProvider>() {
    public DocumentationProvider apply() {
      final Function1<EObject,String> _function = new Function1<EObject,String>() {
          public String apply(final EObject it) {
            return DocumentationProviderSpec.this.comment;
          }
        };
      DocumentationProvider _documentationProvider = new DocumentationProvider(new IEObjectDocumentationProvider() {
          public String getDocumentation(EObject o) {
            return _function.apply(o);
          }
      });
      return _documentationProvider;
    }
  }.apply();
  
  @Test
  @Named("returns null if no comment")
  @Order(99)
  public void returnsNullIfNoComment() throws Exception {
    String _documentation = this.documentation(null);
    Matcher<?> _nullValue = CoreMatchers.nullValue();
    boolean _doubleArrow = Should.operator_doubleArrow(_documentation, _nullValue);
    Assert.assertTrue("\nExpected documentation(null) => nullValue but"
     + "\n     documentation(null) is " + new StringDescription().appendValue(_documentation).toString()
     + "\n     nullValue is " + new StringDescription().appendValue(_nullValue).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("returns comment")
  @Order(99)
  public void returnsComment() throws Exception {
    String _documentation = this.documentation("Hello World");
    boolean _doubleArrow = Should.operator_doubleArrow(_documentation, "Hello World");
    Assert.assertTrue("\nExpected documentation(\"Hello World\") => \"Hello World\" but"
     + "\n     documentation(\"Hello World\") is " + new StringDescription().appendValue(_documentation).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'/*\\\' can be escaped with \\\'\\\'")
  @Order(99)
  public void canBeEscapedWith() throws Exception {
    String _documentation = this.documentation("Hello \\/*World");
    boolean _doubleArrow = Should.operator_doubleArrow(_documentation, "Hello /*World");
    Assert.assertTrue("\nExpected documentation(\"Hello \\\\/*World\") => \"Hello /*World\" but"
     + "\n     documentation(\"Hello \\\\/*World\") is " + new StringDescription().appendValue(_documentation).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\\/*\\\' can be unescaped with \\\'\\\'")
  @Order(99)
  public void canBeUnescapedWith() throws Exception {
    String _documentation = this.documentation("Hello \\\\/*World");
    boolean _doubleArrow = Should.operator_doubleArrow(_documentation, "Hello \\/*World");
    Assert.assertTrue("\nExpected documentation(\"Hello \\\\\\\\/*World\") => \"Hello \\\\/*World\" but"
     + "\n     documentation(\"Hello \\\\\\\\/*World\") is " + new StringDescription().appendValue(_documentation).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'*/\\\' can also be escaped with \\\'\\\'")
  @Order(99)
  public void canAlsoBeEscapedWith() throws Exception {
    String _documentation = this.documentation("Hello \\*/World");
    boolean _doubleArrow = Should.operator_doubleArrow(_documentation, "Hello */World");
    Assert.assertTrue("\nExpected documentation(\"Hello \\\\*/World\") => \"Hello */World\" but"
     + "\n     documentation(\"Hello \\\\*/World\") is " + new StringDescription().appendValue(_documentation).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\\*/\\\' can also be unescaped with \\\'\\\'")
  @Order(99)
  public void canAlsoBeUnescapedWith() throws Exception {
    String _documentation = this.documentation("Hello \\\\*/World");
    boolean _doubleArrow = Should.operator_doubleArrow(_documentation, "Hello \\*/World");
    Assert.assertTrue("\nExpected documentation(\"Hello \\\\\\\\*/World\") => \"Hello \\\\*/World\" but"
     + "\n     documentation(\"Hello \\\\\\\\*/World\") is " + new StringDescription().appendValue(_documentation).toString() + "\n", _doubleArrow);
    
  }
  
  public String documentation(final String doc) {
    String _xblockexpression = null;
    {
      this.comment = doc;
      String _documentation = this.subject.getDocumentation(null);
      _xblockexpression = (_documentation);
    }
    return _xblockexpression;
  }
}
