package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.ReferencesForStepsFeature;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.StepArguments;
import org.jnario.runner.CreateWith;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Extension fields")
@CreateWith(value = FeatureTestCreator.class)
@SuppressWarnings("all")
public class ReferencesForStepsFeatureExtensionFields extends ReferencesForStepsFeature {
  CharSequence jnarioFile;
  
  @Test
  @Order(0)
  @Named("When I have a scenario with a variable that is initialized")
  public void whenIHaveAScenarioWithAVariableThatIsInitialized() {
    StepArguments _stepArguments = new StepArguments("import org.jnario.feature.tests.integration.MyExtension\n\t\tFeature: Extension Fields\n\t\t\tScenario: A scenario with an extension field\n\t\t\t\textension MyExtension myExtension = new MyExtension\n\t\t\t\tval x = <String>newArrayList\n\t\t\t\tGiven an implementation that uses the extension\n\t\t\t\t\tx.myExtensionMethod\n\t\t\t\tThen extension is called\n\t\t\t\t\tassert myExtension.called\n\t\t\t\t\t\t\t\t\n\t\t\tScenario: Another scenario that uses the extension\n\t\t\t\tGiven an implementation that uses the extension\n\t\t\t\tThen extension is called\n\t\t\t\t\tAnd we can use it inside other steps\n\t\t\t\t\t\tx.myExtensionMethod\n");
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
