/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.integration

import org.junit.Rule
import org.junit.rules.TemporaryFolder

/* 
 * JUnit rules work exactly as in JUnit. Just declare a public field with the rule annotation:
 * 
 * 	@Rule
 * 	public TemporaryFolder folder = new TemporaryFolder
 * 
 */
describe "Using JUnit Rules"{

  @Rule
  public TemporaryFolder folder = new TemporaryFolder	

  fact folder.root should not be null

}