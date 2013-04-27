package org.jnario.jnario.documentation;

import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * You can generate HTML reports for your specifications written in Jnario. If you generate these reports using Maven
 * youThis is a great way to communicate the
 * progress of your project with your stakeholders.
 * 
 * ![A failing feature report.](/img/report_error.png)
 * 
 * For an example have a look at the  [Game of Life example](/examples/gameoflife/GameOfLifeWithJnarioXtendSuite.html).
 * 
 *     mvn org.jnario:report:generate
 * 
 * This is will generate the html report the directory "target/jnario-doc". For how to setup Jnario with Maven see
 * the [installation guide](/org/jnario/jnario/documentation/InstallingJnarioSpec.html).
 */
@Named("Generating Reports")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class GeneratingReportsSpec {
}
