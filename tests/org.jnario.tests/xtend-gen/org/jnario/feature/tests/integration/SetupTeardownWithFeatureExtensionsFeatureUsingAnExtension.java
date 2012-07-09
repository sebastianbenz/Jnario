package org.jnario.feature.tests.integration;

import java.util.List;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.jnario.jnario.test.util.ConsoleRecorder;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Using an Extension")
@SuppressWarnings("all")
public class SetupTeardownWithFeatureExtensionsFeatureUsingAnExtension {
  @Test
  @Order(0)
  @Ignore
  @Named("Given a class **ExampleExtension** with JUnit before and after methods:")
  public void givenAClassExampleExtensionWithJUnitBeforeAndAfterMethods() {
    
  }
  
  @Test
  @Order(1)
  @Named("When I declare an extension field of type **ExampleExtension** in the background")
  public void whenIDeclareAnExtensionFieldOfTypeExampleExtensionInTheBackground() {
      StepArguments _stepArguments = new StepArguments("\r\n        import org.jnario.feature.tests.integration.ExampleExtension\r\n\r\n        Feature: Feature with extensions\r\n          \r\n          Background: A common extension to all scenarios\r\n              extension ExampleExtension = new ExampleExtension \r\n            Given a static extension field\r\n            \r\n          Scenario: Scenario 1\r\n            Given a step \r\n              println(\"step 1\")\r\n            Then we have two steps\r\n            println(\"step 2\")\r\n          Scenario: Scenario 2\r\n            Given a step \r\n              println(\"step 3\")\r\n            Then we have two steps\r\n              println(\"step 4\")\r\n      ");
      final StepArguments args = _stepArguments;
      String _first = args.first();
      this.feature = _first;
  }
  
  @Test
  @Order(2)
  @Named("And execute the feature")
  public void andExecuteTheFeature() {
      ConsoleRecorder _start = ConsoleRecorder.start();
      this.recorder = _start;
      FeatureExecutor.isSuccessful(this.feature);
  }
  
  @Test
  @Order(3)
  @Named("Then the execution order is")
  public void thenTheExecutionOrderIs() {
      StepArguments _stepArguments = new StepArguments("\r\n        before\r\n        step 1\r\n        step 2\r\n        after\r\n        before\r\n        step 3\r\n        step 4\r\n        after\r\n      ");
      final StepArguments args = _stepArguments;
      String _stop = this.recorder.stop();
      final String actual = _stop.trim();
      String _first = args.first();
      String _trim = _first.trim();
      String[] _split = _trim.split("\n");
      final Function1<String,String> _function = new Function1<String,String>() {
          public String apply(final String it) {
            String _trim = it.trim();
            return _trim;
          }
        };
      List<String> _map = ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(_split)), _function);
      String _newLine = Strings.newLine();
      final String expected = IterableExtensions.join(_map, _newLine);
      Assert.assertEquals(expected, actual);
  }
  
  CharSequence feature;
  
  ConsoleRecorder recorder;
}
