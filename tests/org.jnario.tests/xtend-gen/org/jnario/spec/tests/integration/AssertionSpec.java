/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.integration;

import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.spec.tests.integration.AssertionIntroductionSpec;
import org.jnario.spec.tests.integration.AssertionNoMoreDebuggingSpec;
import org.junit.runner.RunWith;

@Contains({ AssertionIntroductionSpec.class, AssertionNoMoreDebuggingSpec.class })
@Named("Assertion")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class AssertionSpec {
}
