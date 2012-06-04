package org.jnario.spec.tests.integration;

import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.spec.tests.integration.CollectionLiteralsListLiteralSpec;
import org.jnario.spec.tests.integration.CollectionLiteralsSetLiteralSpec;
import org.junit.runner.RunWith;

@Contains({ CollectionLiteralsListLiteralSpec.class, CollectionLiteralsSetLiteralSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("CollectionLiterals")
public class CollectionLiteralsSpec {
}
