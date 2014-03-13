/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.unit.parser;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.jnario.feature.FeatureInjectorProvider;
import org.jnario.feature.tests.unit.parser.examples.Examples;
import org.jnario.jnario.test.util.AbstractParserTest;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(FeatureInjectorProvider.class)
@SuppressWarnings("all")
public class ParserTest extends AbstractParserTest {
  public Class<?> context() {
    return Examples.class;
  }
}
