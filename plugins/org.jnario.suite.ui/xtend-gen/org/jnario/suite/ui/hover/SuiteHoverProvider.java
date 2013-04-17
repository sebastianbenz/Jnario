/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.ui.hover;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IRegion;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.Specification;
import org.jnario.suite.jvmmodel.SpecResolver;
import org.jnario.suite.jvmmodel.SuiteClassNameProvider;
import org.jnario.suite.suite.PatternReference;
import org.jnario.ui.doc.JnarioHoverProvider;

@SuppressWarnings("all")
public class SuiteHoverProvider extends JnarioHoverProvider {
  @Inject
  @Extension
  private SpecResolver _specResolver;
  
  @Inject
  @Extension
  private SuiteClassNameProvider _suiteClassNameProvider;
  
  public String getHoverInfoAsHtml(final EObject call, final EObject objectToView, final IRegion hoverRegion) {
    String comment = null;
    if ((objectToView instanceof PatternReference)) {
      final PatternReference spec = ((PatternReference) objectToView);
      List<Specification> _resolveSpecs = this._specResolver.resolveSpecs(spec);
      CharSequence _document = this.document(_resolveSpecs);
      String _string = _document.toString();
      comment = _string;
    } else {
      String _hoverInfoAsHtml = super.getHoverInfoAsHtml(call, objectToView, hoverRegion);
      comment = _hoverInfoAsHtml;
    }
    return comment;
  }
  
  public CharSequence document(final List<Specification> specs) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul>");
    _builder.newLine();
    {
      for(final Specification spec : specs) {
        _builder.append("\t");
        _builder.append("<li>");
        String _describe = this._suiteClassNameProvider.describe(spec);
        _builder.append(_describe, "	");
        _builder.append("</li>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
}
