package org.jnario.spec.tests.documentation;

import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.spec.tests.documentation.IntroducingJnarioSpecsHowToWriteASpecificationSpec;
import org.jnario.spec.tests.documentation.IntroducingJnarioSpecsWritingAssertionsSpec;
import org.junit.runner.RunWith;

/**
 * This tutorial gives you an introduction on how to write specifications with Jnario.
 * Jnario Specs are based on [Xtend](http://www.xtend-lang.org). it might be a good idea
 * to read the Xtend [documentation](http://www.eclipse.org/xtend/documentation/index.html) as well,
 * because Jnario's expressions, fields, methods and extensions work exactly as in Xtend.
 */
@Contains({ IntroducingJnarioSpecsHowToWriteASpecificationSpec.class, IntroducingJnarioSpecsWritingAssertionsSpec.class })
@SuppressWarnings("all")
@Named("Introducing Jnario Specs")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = SpecTestCreator.class)
public class IntroducingJnarioSpecsSpec {
}
