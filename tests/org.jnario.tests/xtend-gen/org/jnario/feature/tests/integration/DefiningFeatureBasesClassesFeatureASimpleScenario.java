package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.DefiningFeatureBasesClassesFeature;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: A simple scenario")
@SuppressWarnings("all")
public class DefiningFeatureBasesClassesFeatureASimpleScenario extends DefiningFeatureBasesClassesFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("Given a scenario")
  public void givenAScenario() {
    StepArguments _stepArguments = new StepArguments("import org.jnario.runner.Extends\nimport junit.framework.TestCase\n\n@Extends(typeof(TestCase)) \nFeature: Extend Annotation\n\tScenario: My Scenario\n\t\tThen my feature class extends test case\n\t\t\ttypeof(ExtendAnnotationFeature).superclass => typeof(TestCase)\n\t\tAnd my scenario class extends my feature class\n\t\t\ttypeof(ExtendAnnotationFeatureMyScenario).superclass => typeof(ExtendAnnotationFeature)\n");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    this.jnarioFile = _first;
  }
  
  @Test
  @Order(1)
  @Named("Then it should execute successfully")
  public void thenItShouldExecuteSuccessfully() {
    FeatureExecutor.isSuccessful(this.jnarioFile);
  }
}
