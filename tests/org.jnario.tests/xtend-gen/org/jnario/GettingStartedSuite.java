/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario;

import org.jnario.feature.documentation.IntroducingJnarioFeaturesSpec;
import org.jnario.jnario.documentation._20FactsAboutXtendSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.spec.tests.documentation.IntroducingJnarioSpecsSpec;
import org.jnario.suite.documentation.IntroducingJnarioSuitesSpec;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Getting Started")
@Contains({ IntroducingJnarioFeaturesSpec.class, IntroducingJnarioSpecsSpec.class, IntroducingJnarioSuitesSpec.class, _20FactsAboutXtendSpec.class })
@SuppressWarnings("all")
public class GettingStartedSuite {
}
