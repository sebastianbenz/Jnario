/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.unit;

import org.jnario.jnario.test.util.SuiteTestCreator;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuiteFactory;
import org.jnario.suite.unit.SuiteClassNameProviderDescribeSpec;
import org.jnario.suite.unit.SuiteClassNameProviderGetClassNameSpec;
import org.junit.runner.RunWith;

@Contains({ SuiteClassNameProviderGetClassNameSpec.class, SuiteClassNameProviderDescribeSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("SuiteClassNameProvider")
@CreateWith(value = SuiteTestCreator.class)
public class SuiteClassNameProviderSpec {
  public Suite suite(final String name) {
    Suite _xblockexpression = null;
    {
      final Suite suite = SuiteFactory.eINSTANCE.createSuite();
      suite.setName(name);
      _xblockexpression = (suite);
    }
    return _xblockexpression;
  }
}
