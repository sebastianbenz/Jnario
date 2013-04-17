/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.integration;

import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.After;
import org.junit.Before;

@SuppressWarnings("all")
public class ExampleExtension {
  @Before
  public String before() {
    String _println = InputOutput.<String>println("before");
    return _println;
  }
  
  @After
  public String after() {
    String _println = InputOutput.<String>println("after");
    return _println;
  }
  
  public String greet(final String s) {
    return ("Hello " + s);
  }
}
