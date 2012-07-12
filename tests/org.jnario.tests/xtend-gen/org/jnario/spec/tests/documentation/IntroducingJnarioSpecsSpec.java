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
 * 
 * ### Installation & Runtime Library
 * 
 * Jnario currently requires [Eclipse](http://www.eclipse.org) 3.5 or higher with [Xtext](http://www.xtext.org) 2.3,
 *  and a Java SDK version 5 or above. You can install the most recent version from this update site:
 * `http://www.jnario.org/updates/snapshot/`. Jnario requires a small runtime library that contains
 * the JUnit integration. You can download the jar
 * [here](http://jnario.org/updates/snapshot/org.jnario.lib-0.1.0-SNAPSHOT.jar).
 */
@Contains({ IntroducingJnarioSpecsHowToWriteASpecificationSpec.class, IntroducingJnarioSpecsWritingAssertionsSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Introducing Jnario Specs")
@CreateWith(value = SpecTestCreator.class)
public class IntroducingJnarioSpecsSpec {
}
