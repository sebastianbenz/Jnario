/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.ui.hover;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IRegion;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.Specification;
import org.jnario.suite.jvmmodel.SpecificationResolver;
import org.jnario.suite.suite.PatternReference;
import org.jnario.ui.doc.JnarioHoverProvider;

@SuppressWarnings("all")
public class SuiteHoverProvider extends JnarioHoverProvider {
  @Inject
  private SpecificationResolver _specificationResolver;
  
  public String getHoverInfoAsHtml(final EObject call, final EObject objectToView, final IRegion hoverRegion) {
    String comment = null;
    if ((objectToView instanceof PatternReference)) {
      final PatternReference spec = ((PatternReference) objectToView);
      List<Specification> _resolveSpecs = this._specificationResolver.resolveSpecs(spec);
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
      final Function1<Specification,Boolean> _function = new Function1<Specification,Boolean>() {
          public Boolean apply(final Specification it) {
            String _name = it.getName();
            boolean _notEquals = (!Objects.equal(_name, null));
            return Boolean.valueOf(_notEquals);
          }
        };
      Iterable<Specification> _filter = IterableExtensions.<Specification>filter(specs, _function);
      for(final Specification spec : _filter) {
        _builder.append("\t");
        _builder.append("<li>");
        String _name = spec.getName();
        _builder.append(_name, "	");
        _builder.append("</li>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
}
