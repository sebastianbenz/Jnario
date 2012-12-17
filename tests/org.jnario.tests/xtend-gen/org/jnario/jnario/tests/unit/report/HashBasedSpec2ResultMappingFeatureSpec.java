package org.jnario.jnario.tests.unit.report;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.hamcrest.StringDescription;
import org.jnario.feature.feature.Feature;
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
@Named("Feature")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = FeatureTestCreator.class)
public class HashBasedSpec2ResultMappingFeatureSpec extends HashBasedSpec2ResultMappingSpec {
  @Before
  public void before() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test ");
    _builder.newLine();
    _builder.append("Feature: My Feature");
    _builder.newLine();
    _builder.append("Scenario: My Scenario");
    _builder.newLine();
    _builder.append("Given a step");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"with implementation\"");
    _builder.newLine();
    _builder.append("Scenario: My other Scenario");
    _builder.newLine();
    _builder.append("Given another step");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"with implementation\"");
    _builder.newLine();
    this.m.parseScenario(_builder);
  }
  
  @Test
  @Named("returns **Passed** if all scenarios passed")
  @Order(19)
  public void _returnsPassedIfAllScenariosPassed() throws Exception {
    this.passedStep("Given a step");
    this.passedStep(HashBasedSpec2ResultMappingSpec.OTHER_SCENARIO_CLASSNAME, "Given another step");
    Feature _feature = this.feature();
    SpecExecution _result = this.result(_feature);
    boolean _doubleArrow = Should.operator_doubleArrow(_result, Passed.class);
    Assert.assertTrue("\nExpected feature.result => typeof(Passed) but"
     + "\n     feature.result is " + new StringDescription().appendValue(_result).toString()
     + "\n     feature is " + new StringDescription().appendValue(_feature).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("returns **Failed** if one scenario failed")
  @Order(20)
  public void _returnsFailedIfOneScenarioFailed() throws Exception {
    this.passedStep("Given a step");
    this.failedStep(HashBasedSpec2ResultMappingSpec.OTHER_SCENARIO_CLASSNAME, "Given another step");
    Feature _feature = this.feature();
    SpecExecution _result = this.result(_feature);
    boolean _doubleArrow = Should.operator_doubleArrow(_result, Failed.class);
    Assert.assertTrue("\nExpected feature.result => typeof(Failed) but"
     + "\n     feature.result is " + new StringDescription().appendValue(_result).toString()
     + "\n     feature is " + new StringDescription().appendValue(_feature).toString() + "\n", _doubleArrow);
    
  }
}
