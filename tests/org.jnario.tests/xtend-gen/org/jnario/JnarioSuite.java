/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario;

import org.jnario.CommonSuite;
import org.jnario.FeatureSuite;
import org.jnario.SpecSuite;
import org.jnario.SuiteSuite;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Jnario")
@Contains({ CommonSuite.class, SuiteSuite.class, FeatureSuite.class, SpecSuite.class })
@SuppressWarnings("all")
public class JnarioSuite {
}
