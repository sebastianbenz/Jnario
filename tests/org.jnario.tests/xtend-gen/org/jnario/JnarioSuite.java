package org.jnario;

import org.jnario.CommonSuite;
import org.jnario.FeatureSuite;
import org.jnario.SpecSuite;
import org.jnario.SuiteSuite;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("Jnario")
@Contains({ CommonSuite.class, SuiteSuite.class, FeatureSuite.class, SpecSuite.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
public class JnarioSuite {
}
