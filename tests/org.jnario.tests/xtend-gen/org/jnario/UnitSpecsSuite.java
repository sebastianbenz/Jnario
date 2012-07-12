/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario;

import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.spec.tests.integration.ExtensionsSpec;
import org.jnario.spec.tests.integration.ImplicitSubjectSpec;
import org.jnario.spec.tests.integration.UsingJUnitRulesInSpecsSpec;
import org.jnario.spec.tests.integration.UsingTablesSpec;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Unit Specs")
@Contains({ ExtensionsSpec.class, ImplicitSubjectSpec.class, UsingTablesSpec.class, UsingJUnitRulesInSpecsSpec.class })
@SuppressWarnings("all")
public class UnitSpecsSuite {
}
