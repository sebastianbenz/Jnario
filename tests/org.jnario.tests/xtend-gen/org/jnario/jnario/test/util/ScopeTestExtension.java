/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.test.util;

import com.google.inject.Inject;
import java.util.Iterator;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Resources;
import org.jnario.lib.JnarioIterableExtensions;

@SuppressWarnings("all")
public class ScopeTestExtension implements Iterable {
  @Inject
  private ModelStore store;
  
  @Inject
  @Extension
  private IScopeProvider _iScopeProvider;
  
  public Resource parseSpec(final CharSequence content) {
    Resource _parseSpec = this.store.parseSpec(content);
    return _parseSpec;
  }
  
  public Resource parseSuite(final CharSequence content) {
    Resource _parseSuite = this.store.parseSuite(content);
    return _parseSuite;
  }
  
  public Resource parseFeature(final CharSequence content) {
    Resource _parseScenario = this.store.parseScenario(content);
    return _parseScenario;
  }
  
  public Set<String> scope(final EObject context, final EReference ref) {
    Set<String> _xblockexpression = null;
    {
      XtextResourceSet _resourceSet = this.store.getResourceSet();
      Resources.addContainerStateAdapter(_resourceSet);
      IScope _scope = this._iScopeProvider.getScope(context, ref);
      Set<String> _scope_1 = this.scope(_scope);
      _xblockexpression = (_scope_1);
    }
    return _xblockexpression;
  }
  
  public Set<String> scope(final IScope scope) {
    Iterable<IEObjectDescription> _allElements = scope.getAllElements();
    final Function1<IEObjectDescription,String> _function = new Function1<IEObjectDescription,String>() {
      public String apply(final IEObjectDescription it) {
        String _string = it.toString();
        return _string;
      }
    };
    Iterable<String> _map = IterableExtensions.<IEObjectDescription, String>map(_allElements, _function);
    Set<String> _set = IterableExtensions.<String>toSet(_map);
    return _set;
  }
  
  public Iterator iterator() {
    Iterator<EObject> _iterator = this.store.iterator();
    return _iterator;
  }
  
  public EObject first(final Class<? extends EObject> type) {
    return JnarioIterableExtensions.first(this, type);
  }
  
  public EObject second(final Class<? extends EObject> type) {
    return JnarioIterableExtensions.second(this, type);
  }
}
