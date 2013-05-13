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
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class SuiteResourceDescriptionManager /* implements XtendResourceDescriptionManager  */{
  private final static HashSet<String> FILE_EXTENSIONS = new Function0<HashSet<String>>() {
    public HashSet<String> apply() {
      HashSet<String> _newHashSet = CollectionLiterals.<String>newHashSet("suite", "spec", "feature");
      return _newHashSet;
    }
  }.apply();
  
  public boolean isAffected(final Collection<Delta> deltas, final IResourceDescription candidate, final IResourceDescriptions context) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field super is undefined for the type SuiteResourceDescriptionManager"
      + "\nisAffected cannot be resolved");
  }
  
  public boolean isNewSpec(final Delta delta) {
    boolean _and = false;
    IResourceDescription _new = delta.getNew();
    boolean _notEquals = (!Objects.equal(_new, null));
    if (!_notEquals) {
      _and = false;
    } else {
      URI _uri = delta.getUri();
      String _fileExtension = _uri.fileExtension();
      boolean _contains = SuiteResourceDescriptionManager.FILE_EXTENSIONS.contains(_fileExtension);
      _and = (_notEquals && _contains);
    }
    return _and;
  }
}
