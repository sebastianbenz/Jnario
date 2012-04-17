package org.jnario.spec.tests.integration;

import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.spec.tests.integration.CollectionLiteralsListLiteralSpec;
import org.jnario.spec.tests.integration.CollectionLiteralsSetLiteralSpec;
import org.junit.runner.RunWith;

/**
 * You can use the `should` statement to express the expected behavior of objects.
 */
@Contains({ CollectionLiteralsListLiteralSpec.class, CollectionLiteralsSetLiteralSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("CollectionLiterals")
public class CollectionLiteralsSpec {
}
