package org.jnario.jnario.tests.unit.report;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.hamcrest.StringDescription;
import org.jnario.feature.feature.Scenario;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.tests.unit.report.HashBasedSpec2ResultMappingSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.report.Failed;
import org.jnario.report.Passed;
import org.jnario.report.SpecExecution;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("Scenario")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = FeatureTestCreator.class)
public class HashBasedSpec2ResultMappingScenarioSpec extends HashBasedSpec2ResultMappingSpec {
  @Before
  public void before() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test ");
    _builder.newLine();
    _builder.append("Feature: My Feature");
    _builder.newLine();
    _builder.append("Scenario: My Scenario");
    _builder.newLine();
    _builder.append("Given my Step");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"with implementation\"");
    _builder.newLine();
    _builder.append("And other Step");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"with implementation\"");
    _builder.newLine();
    this.m.parseScenario(_builder);
  }
  
  @Test
  @Named("returns **Passed** if all children passed")
  @Order(17)
  public void _returnsPassedIfAllChildrenPassed() throws Exception {
    this.passedStep("Given my Step");
    this.passedStep("And other Step");
    Scenario _scenario = this.scenario();
    SpecExecution _result = this.result(_scenario);
    boolean _doubleArrow = Should.operator_doubleArrow(_result, Passed.class);
    Assert.assertTrue("\nExpected scenario.result => typeof(Passed) but"
     + "\n     scenario.result is " + new StringDescription().appendValue(_result).toString()
     + "\n     scenario is " + new StringDescription().appendValue(_scenario).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("returns **Failed** if one child failed")
  @Order(18)
  public void _returnsFailedIfOneChildFailed() throws Exception {
    this.passedStep("Given my Step");
    this.failedStep("And other Step");
    Scenario _scenario = this.scenario();
    SpecExecution _result = this.result(_scenario);
    boolean _doubleArrow = Should.operator_doubleArrow(_result, Failed.class);
    Assert.assertTrue("\nExpected scenario.result => typeof(Failed) but"
     + "\n     scenario.result is " + new StringDescription().appendValue(_result).toString()
     + "\n     scenario is " + new StringDescription().appendValue(_scenario).toString() + "\n", _doubleArrow);
    
  }
}
