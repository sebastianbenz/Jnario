package org.jnario.feature.tests.integration;

import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Extension fields in And step")
@SuppressWarnings("all")
public class ReferencesForStepsFeatureExtensionFieldsInAndStep {
  @Test
  @Order(0)
  @Named("When I have a scenario with a variable that is initialized")
  public void whenIHaveAScenarioWithAVariableThatIsInitialized() {
      StepArguments _stepArguments = new StepArguments("\r\n\t\t \timport org.jnario.feature.tests.integration.MyExtension\r\n\t\t\tFeature: Extension Fields\r\n\t\t\t\tScenario: A scenario with an extension field\r\n\t\t\t\t\textension MyExtension myExtension = new MyExtension\r\n\t\t\t\t\tval x = <String>newArrayList\r\n\t\t\t\t\tGiven an empty step\r\n\t\t\t\t\tAnd an implementation that uses the extension\r\n\t\t\t\t\t\tx.myExtensionMethod\r\n\t\t\t\t\tThen extension is called\r\n\t\t\t\t\t\tassert myExtension.called\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\tScenario: Another scenario that uses the extension\r\n\t\t\t\t\tGiven an empty step\r\n\t\t\t\t\tAnd an implementation that uses the extension\r\n\t\t\t\t\tThen extension is called\r\n\t\t\t\t\t\tAnd we can use it inside other steps\r\n\t\t\t\t\t\t\tx.myExtensionMethod\r\n\t\t");
      final StepArguments args = _stepArguments;
      String _first = JnarioIterableExtensions.<String>first(args);
      this.jnarioFile = _first;
  }
  
  @Test
  @Order(1)
  @Named("Then it should execute successfully")
  public void thenItShouldExecuteSuccessfully() {
    FeatureExecutor.isSuccessful(jnarioFile);
  }
  
  CharSequence jnarioFile;
}
