/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.tests.unit.jnario;

import org.jnario.jnario.tests.unit.jnario.StringsMakeJunitConformSpec;
import org.jnario.jnario.tests.unit.jnario.StringsStartsWithWordSpec;
import org.jnario.jnario.tests.unit.jnario.StringsTrimSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ StringsStartsWithWordSpec.class, StringsMakeJunitConformSpec.class, StringsTrimSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Strings")
public class StringsSpec {
}
