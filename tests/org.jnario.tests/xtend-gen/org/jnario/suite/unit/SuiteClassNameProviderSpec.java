/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.unit;

import org.jnario.jnario.test.util.SuiteTestCreator;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.suite.unit.SuiteClassNameProviderDescribeSpec;
import org.jnario.suite.unit.SuiteClassNameProviderToJavaClassNameSpec;
import org.jnario.suite.unit.SuiteClassNameProviderToQualifiedJavaClassNameSpec;
import org.junit.runner.RunWith;

@Contains({ SuiteClassNameProviderToJavaClassNameSpec.class, SuiteClassNameProviderDescribeSpec.class, SuiteClassNameProviderToQualifiedJavaClassNameSpec.class })
@Named("SuiteClassNameProvider")
@RunWith(ExampleGroupRunner.class)
@CreateWith(SuiteTestCreator.class)
@SuppressWarnings("all")
public class SuiteClassNameProviderSpec {
}
