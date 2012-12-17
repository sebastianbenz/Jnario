package org.jnario.suite.documentation;

import org.jnario.jnario.test.util.SuiteTestCreator;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.suite.documentation.IntroducingJnarioSuitesGettingStartedSpec;
import org.junit.runner.RunWith;

/**
 * Suites in Jnario are a great way to structure and document your specifications ([more](http://sebastianbenz.de/introducing-jnario-suites)):
 * 
 * 1. **Grouping:** A suite groups multiple specifications and executes them together.
 *    For example, you could create a single
 *    Jnario suite thats runs all your specifications in a project. Another possibility would
 *    be to create two different suites, one containing
 *    all specs and one containing all features.
 * 2. **Documentation:** Jnario generates HTML reports for suites making them a great way to provide additional
 *    documentation. For example, you can create a suite as an overview page describing the overall architecture
 *    of an application, which then links to other specifications describing the different parts
 *    in more detail.
 *    The overview page of the [Jnario documentation](http://jnario.org/org/jnario/JnarioDocumentationSuite.html)
 *    is a good example for this.
 */
@Contains(IntroducingJnarioSuitesGettingStartedSpec.class)
@SuppressWarnings("all")
@Named("Introducing Jnario Suites")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = SuiteTestCreator.class)
public class IntroducingJnarioSuitesSpec {
}
