package org.jnario.feature.tests.integration;

import com.google.inject.Inject;
import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.test.util.ResultMatchers;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.lib.StringConversions;
import org.jnario.runner.CreateWith;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: When a step of a background all following steps and all scenario steps should be pending")
@CreateWith(value = FeatureTestCreator.class)
@SuppressWarnings("all")
public class PendingStepsFeatureWhenAStepOfABackgroundAllFollowingStepsAndAllScenarioStepsShouldBePending {
  @Test
  @Order(0)
  @Named("Given a scenario")
  public void givenAScenario() {
    StepArguments _stepArguments = new StepArguments("Feature: With pending steps\n\tBackground:\n\t\tint x\n\t\tGiven a variable x\n\t\t\tx = 3\n\t\tAnd has no implementation\n\tScenario: Scenario with pending steps\n\t\tGiven a variable y\n\t\t\tvar y = 3\n\t\tWhen something is added to x\n\t\t\tx = x + 5\n\t\tThen there should be the corresponding result\n\t\t\tx => 8\n\t\t");
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
  
  @Test
  @Order(2)
  @Named("And the expected number of ignored steps is \\\"4\\\"")
  public void andTheExpectedNumberOfIgnoredStepsIs4() {
    StepArguments _stepArguments = new StepArguments("4");
    final StepArguments args = _stepArguments;
    Result _execute = this.runner.execute(this.jnarioFile);
    String _first = JnarioIterableExtensions.<String>first(args);
    int _int = StringConversions.toInt(_first);
    Matcher<Result> _ignoreCountIs = ResultMatchers.ignoreCountIs(_int);
    boolean _doubleArrow = Should.operator_doubleArrow(_execute, _ignoreCountIs);
    Assert.assertTrue("\nExpected runner.execute(jnarioFile) => ignoreCountIs(args.first.toInt) but"
     + "\n     runner.execute(jnarioFile) is " + new StringDescription().appendValue(_execute).toString()
     + "\n     ignoreCountIs(args.first.toInt) is " + new StringDescription().appendValue(_ignoreCountIs).toString()
     + "\n     args.first.toInt is " + new StringDescription().appendValue(_int).toString()
     + "\n     args.first is " + new StringDescription().appendValue(_first).toString() + "\n", _doubleArrow);
    
  }
  
  CharSequence jnarioFile;
  
  @Inject
  FeatureExecutor runner;
}
