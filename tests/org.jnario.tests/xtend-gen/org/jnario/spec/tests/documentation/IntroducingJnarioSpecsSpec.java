/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.documentation;

import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.spec.tests.documentation.IntroducingJnarioSpecsHowToWriteASpecificationSpec;
import org.jnario.spec.tests.documentation.IntroducingJnarioSpecsWritingAssertionsSpec;
import org.junit.runner.RunWith;

/**
 * This tutorial gives you an introduction on how to write specifications with Jnario.
 * Jnario Specs are based on [Xtend](http://www.xtend-lang.org). it might be a good idea
 * to read the Xtend [documentation](http://www.eclipse.org/xtend/documentation/index.html) as well,
 * because Jnario's expressions, fields, methods and extensions work exactly as in Xtend.
 */
@Contains({ IntroducingJnarioSpecsHowToWriteASpecificationSpec.class, IntroducingJnarioSpecsWritingAssertionsSpec.class })
@Named("Introducing Jnario Specs")
@RunWith(ExampleGroupRunner.class)
@CreateWith(SpecTestCreator.class)
@SuppressWarnings("all")
public class IntroducingJnarioSpecsSpec {
}
