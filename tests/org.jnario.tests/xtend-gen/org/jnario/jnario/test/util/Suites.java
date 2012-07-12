/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.test.util;

import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuiteFactory;

@SuppressWarnings("all")
public class Suites {
  private final static SuiteFactory factory = SuiteFactory.eINSTANCE;
  
  public static Suite suite(final String name) {
    Suite _xblockexpression = null;
    {
      final Suite suite = Suites.factory.createSuite();
      suite.setName(name);
      _xblockexpression = (suite);
    }
    return _xblockexpression;
  }
}
