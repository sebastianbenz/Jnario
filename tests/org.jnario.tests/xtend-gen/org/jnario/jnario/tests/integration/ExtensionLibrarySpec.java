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
@SuppressWarnings("all")
@Named("Extension Library")
@RunWith(ExampleGroupRunner.class)
public class ExtensionLibrarySpec {
}
