/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.resource;

import com.google.common.base.Objects;
import java.util.Collection;
import java.util.HashSet;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtend.core.resource.XtendResourceDescriptionManager;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class SuiteResourceDescriptionManager extends XtendResourceDescriptionManager {
  private final static HashSet<String> FILE_EXTENSIONS = CollectionLiterals.<String>newHashSet("suite", "spec", "feature");
  
  /**
   * Every spec change means new potential matches for a spec reg ex.
   */
  public boolean isAffected(final Collection<IResourceDescription.Delta> deltas, final IResourceDescription candidate, final IResourceDescriptions context) {
    boolean _isAffected = super.isAffected(deltas, candidate, context);
    if (_isAffected) {
      return true;
    }
    final Function1<IResourceDescription.Delta, Boolean> _function = new Function1<IResourceDescription.Delta, Boolean>() {
      public Boolean apply(final IResourceDescription.Delta it) {
        return Boolean.valueOf(SuiteResourceDescriptionManager.this.isNewSpec(it));
      }
    };
    Iterable<IResourceDescription.Delta> _filter = IterableExtensions.<IResourceDescription.Delta>filter(deltas, _function);
    boolean _isEmpty = IterableExtensions.isEmpty(_filter);
    return (!_isEmpty);
  }
  
  public boolean isNewSpec(final IResourceDescription.Delta delta) {
    boolean _and = false;
    IResourceDescription _new = delta.getNew();
    boolean _notEquals = (!Objects.equal(_new, null));
    if (!_notEquals) {
      _and = false;
    } else {
      URI _uri = delta.getUri();
      String _fileExtension = _uri.fileExtension();
      boolean _contains = SuiteResourceDescriptionManager.FILE_EXTENSIONS.contains(_fileExtension);
      _and = _contains;
    }
    return _and;
  }
}
