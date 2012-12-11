package org.jnario.feature.tests.integration;

import java.util.List;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.jnario.feature.tests.integration.SetupTeardownWithFeatureExtensionsFeature;
import org.jnario.jnario.test.util.ConsoleRecorder;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Using an Extension")
@SuppressWarnings("all")
public class SetupTeardownWithFeatureExtensionsFeatureUsingAnExtension extends SetupTeardownWithFeatureExtensionsFeature {
  CharSequence feature;
  
  ConsoleRecorder recorder;
  
  @Test
  @Order(0)
  @Named("When I declare an extension field of type **ExampleExtension** in the background")
  public void whenIDeclareAnExtensionFieldOfTypeExampleExtensionInTheBackground() {
    StepArguments _stepArguments = new StepArguments("import org.jnario.feature.tests.integration.ExampleExtension\n\nFeature: Feature with extensions\n  \n  Background: A common extension to all scenarios\n      extension static ExampleExtension = new ExampleExtension \n    \n  Scenario: Scenario 1\n    Given a step \n      println(\"step 1\")\n    Then we have two steps\n    println(\"step 2\")\n  Scenario: Scenario 2\n    Given a step \n      println(\"step 3\")\n    Then we have two steps\n      println(\"step 4\")\n");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    this.feature = _first;
  }
  
  @Test
  @Order(1)
  @Named("And execute the feature")
  public void andExecuteTheFeature() {
    ConsoleRecorder _start = ConsoleRecorder.start();
    this.recorder = _start;
    FeatureExecutor.isSuccessful(this.feature);
  }
  
  @Test
  @Order(2)
  @Named("Then the execution order is")
  public void thenTheExecutionOrderIs() {
    StepArguments _stepArguments = new StepArguments("before\nstep 1\nstep 2\nafter\nbefore\nstep 3\nstep 4\nafter\n");
    final StepArguments args = _stepArguments;
    String _stop = this.recorder.stop();
    final String actual = _stop.trim();
    String _first = JnarioIterableExtensions.<String>first(args);
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
}
