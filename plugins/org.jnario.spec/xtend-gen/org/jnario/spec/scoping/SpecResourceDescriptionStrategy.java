/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.scoping;

import com.google.common.collect.ImmutableMap.Builder;
import org.eclipse.emf.ecore.EObject;
import org.jnario.spec.spec.ExampleGroup;

@SuppressWarnings("all")
public class SpecResourceDescriptionStrategy /* implements JnarioResourceDescriptionStrategy  */{
  public final static String ROOT_SPEC = "root";
  
  public final static String TRUE = "1";
  
  public final static String FALSE = "0";
  
  public Builder<String,String> createUserData(final EObject eObject, final Builder<String,String> userData) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field super is undefined for the type SpecResourceDescriptionStrategy"
      + "\ncreateUserData cannot be resolved");
  }
  
  public String isRoot(final ExampleGroup exampleGroup) {
    String _xifexpression = null;
    EObject _eContainer = exampleGroup.eContainer();
    boolean _not = (!(_eContainer instanceof ExampleGroup));
    if (_not) {
      _xifexpression = SpecResourceDescriptionStrategy.TRUE;
    } else {
      _xifexpression = SpecResourceDescriptionStrategy.FALSE;
    }
    return _xifexpression;
  }
}
