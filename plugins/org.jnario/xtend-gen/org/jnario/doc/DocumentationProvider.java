/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.doc;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;

@SuppressWarnings("all")
public class DocumentationProvider {
  private final IEObjectDocumentationProvider delegate;
  
  @Inject
  public DocumentationProvider(final IEObjectDocumentationProvider delegate) {
    this.delegate = delegate;
  }
  
  public String getDocumentation(final EObject eObject) {
    String _xblockexpression = null;
    {
      final String doc = this.delegate.getDocumentation(eObject);
      boolean _equals = Objects.equal(doc, null);
      if (_equals) {
        return null;
      }
      String _replaceAll = doc.replaceAll("\\\\/\\*", "/*");
      _xblockexpression = _replaceAll.replaceAll("\\\\\\*/", "*/");
    }
    return _xblockexpression;
  }
}
