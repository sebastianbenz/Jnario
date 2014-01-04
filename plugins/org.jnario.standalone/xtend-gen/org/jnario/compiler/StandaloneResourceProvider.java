/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.compiler;

import com.google.inject.Provider;
import org.eclipse.emf.ecore.resource.ResourceSet;

@SuppressWarnings("all")
public class StandaloneResourceProvider implements Provider<ResourceSet> {
  private ResourceSet resourceSet;
  
  public StandaloneResourceProvider(final ResourceSet resourceSet) {
    this.resourceSet = resourceSet;
  }
  
  public ResourceSet get() {
    return this.resourceSet;
  }
}
