/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.tests.unit;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.hamcrest.Matcher;
import org.jnario.doc.DocumentationProvider;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("DocumentationProvider")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class DocumentationProviderSpec {
  String comment = "";
  
  final DocumentationProvider subject = new Function0<DocumentationProvider>() {
    public DocumentationProvider apply() {
      final IEObjectDocumentationProvider _function = new IEObjectDocumentationProvider() {
        public String getDocumentation(final EObject it) {
          return DocumentationProviderSpec.this.comment;
        }
      };
      DocumentationProvider _documentationProvider = new DocumentationProvider(_function);
      return _documentationProvider;
    }
  }.apply();
  
  @Test
  @Named("returns null if no comment")
  @Order(1)
  public void _returnsNullIfNoComment() throws Exception {
    String _documentation = this.documentation(null);
    Matcher<Object> _nullValue = Should.<Object>nullValue();
    boolean _doubleArrow = Should.operator_doubleArrow(_documentation, _nullValue);
    Assert.assertTrue("\nExpected documentation(null) => null but"
     + "\n     documentation(null) is " + new org.hamcrest.StringDescription().appendValue(_documentation).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("returns comment")
  @Order(2)
  public void _returnsComment() throws Exception {
    String _documentation = this.documentation("Hello World");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_documentation, "Hello World");
    Assert.assertTrue("\nExpected documentation(\"Hello World\") => \"Hello World\" but"
     + "\n     documentation(\"Hello World\") is " + new org.hamcrest.StringDescription().appendValue(_documentation).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'/*\\\' can be escaped with \\\'\\\'")
  @Order(3)
  public void _canBeEscapedWith() throws Exception {
    String _documentation = this.documentation("Hello \\/*World");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_documentation, "Hello /*World");
    Assert.assertTrue("\nExpected documentation(\"Hello \\\\/*World\") => \"Hello /*World\" but"
     + "\n     documentation(\"Hello \\\\/*World\") is " + new org.hamcrest.StringDescription().appendValue(_documentation).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\\/*\\\' can be unescaped with \\\'\\\'")
  @Order(4)
  public void _canBeUnescapedWith() throws Exception {
    String _documentation = this.documentation("Hello \\\\/*World");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_documentation, "Hello \\/*World");
    Assert.assertTrue("\nExpected documentation(\"Hello \\\\\\\\/*World\") => \"Hello \\\\/*World\" but"
     + "\n     documentation(\"Hello \\\\\\\\/*World\") is " + new org.hamcrest.StringDescription().appendValue(_documentation).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'*/\\\' can also be escaped with \\\'\\\'")
  @Order(5)
  public void _canAlsoBeEscapedWith() throws Exception {
    String _documentation = this.documentation("Hello \\*/World");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_documentation, "Hello */World");
    Assert.assertTrue("\nExpected documentation(\"Hello \\\\*/World\") => \"Hello */World\" but"
     + "\n     documentation(\"Hello \\\\*/World\") is " + new org.hamcrest.StringDescription().appendValue(_documentation).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\\*/\\\' can also be unescaped with \\\'\\\'")
  @Order(6)
  public void _canAlsoBeUnescapedWith() throws Exception {
    String _documentation = this.documentation("Hello \\\\*/World");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_documentation, "Hello \\*/World");
    Assert.assertTrue("\nExpected documentation(\"Hello \\\\\\\\*/World\") => \"Hello \\\\*/World\" but"
     + "\n     documentation(\"Hello \\\\\\\\*/World\") is " + new org.hamcrest.StringDescription().appendValue(_documentation).toString() + "\n", _doubleArrow);
    
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
