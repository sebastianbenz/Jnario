package org.jnario.suite.documentation;

import org.jnario.jnario.test.util.SuiteTestCreator;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.suite.documentation.IntroducingJnarioSuitesGettingStartedSpec;
import org.junit.runner.RunWith;

/**
 * Suites in Jnario serve two purposes:
 * 
 * 1. **Grouping:** A suite groups multiple specifications and executes them together. For example, a single
 *    Jnario suite could run all specifications in a project or there are different two suites, one containing
 *    all unit specifications and one containing all acceptance specifications.
 * 2. **Documentation:** Jnario generates HTML reports for suites making them a great way to provide additional
 *    documentation. For example, one can create an overview page describing the overall architecture
 *    of an application, which then links to other specifications describing the different parts
 *    in more detail.
 *    The overview page of the [Jnario documentation](http://jnario.org/org/jnario/JnarioDocumentationSuite.html)
 *    is a good example for this.
 */
@Contains(IntroducingJnarioSuitesGettingStartedSpec.class)
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Introducing Jnario Suites")
@CreateWith(value = SuiteTestCreator.class)
public class IntroducingJnarioSuitesSpec {
}
