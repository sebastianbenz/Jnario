/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.tests.integration;

import org.jnario.jnario.tests.integration.ExtensionLibraryCollectionLiteralsSpec;
import org.jnario.jnario.tests.integration.ExtensionLibraryConvertingStringsSpec;
import org.jnario.jnario.tests.integration.ExtensionLibraryIterableIteratorHelpersSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * Jnario extends the extension library of Xtend with additional
 * functions which can be useful when writing tests.
 */
@Contains({ ExtensionLibraryCollectionLiteralsSpec.class, ExtensionLibraryIterableIteratorHelpersSpec.class, ExtensionLibraryConvertingStringsSpec.class })
@Named("Extension Library")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExtensionLibrarySpec {
}
