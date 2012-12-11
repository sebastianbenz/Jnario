package org.jnario.jnario.tests.unit.report;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.hamcrest.StringDescription;
import org.jnario.feature.feature.Step;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.tests.unit.report.HashBasedSpec2ResultMappingSpec;
import org.jnario.lib.Assert;
import org.jnario.report.Passed;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("Step")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = FeatureTestCreator.class)
public class HashBasedSpec2ResultMappingStepSpec extends HashBasedSpec2ResultMappingSpec {
  final Passed aResult = new Function0<Passed>() {
    public Passed apply() {
      Passed _passingSpec = Passed.passingSpec("example.SomethingFeatureMyScenario", "Given a step", HashBasedSpec2ResultMappingSpec.anyExecutionTime);
      return _passingSpec;
    }
  }.apply();
  
  final Passed aResultWithDifferentClassName = new Function0<Passed>() {
    public Passed apply() {
      Passed _passingSpec = Passed.passingSpec("example.DifferentSpec", "a fact", HashBasedSpec2ResultMappingSpec.anyExecutionTime);
      return _passingSpec;
    }
  }.apply();
  
  final Passed aResultWithDifferentName = new Function0<Passed>() {
    public Passed apply() {
      Passed _passingSpec = Passed.passingSpec("example.SomethingSpec", "another fact", HashBasedSpec2ResultMappingSpec.anyExecutionTime);
      return _passingSpec;
    }
  }.apply();
  
  final Passed pendingResult = new Function0<Passed>() {
    public Passed apply() {
      Passed _passingSpec = Passed.passingSpec("example.SomethingFeatureMyScenario", "Given a pending step [PENDING]", HashBasedSpec2ResultMappingSpec.anyExecutionTime);
      return _passingSpec;
    }
  }.apply();
  
  final Passed resultWithUnicodeChars = new Function0<Passed>() {
    public Passed apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Given step with uml\\u00E4uts");
      Passed _passingSpec = Passed.passingSpec("example.SomethingFeatureMyScenario", _builder.toString(), HashBasedSpec2ResultMappingSpec.anyExecutionTime);
      return _passingSpec;
    }
  }.apply();
  
  final Passed resultWithArgs = new Function0<Passed>() {
    public Passed apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Given step with \\\"args\\\"");
      Passed _passingSpec = Passed.passingSpec("example.SomethingFeatureMyScenario", _builder.toString(), HashBasedSpec2ResultMappingSpec.anyExecutionTime);
      return _passingSpec;
    }
  }.apply();
  
  @Test
  @Named("matches if classname and name are equal")
  @Order(13)
  public void _matchesIfClassnameAndNameAreEqual() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package example");
    _builder.newLine();
    _builder.append("Feature: Something");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: MyScenario");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Given a step");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("1 + 1 => 2");
    _builder.newLine();
    this.m.parseScenario(_builder);
    this.subject.accept(this.aResult);
    Step _step = this.step();
    boolean _should_match = this.should_match(_step, this.aResult);
    Assert.assertTrue("\nExpected step should match aResult but"
     + "\n     step is " + new StringDescription().appendValue(_step).toString()
     + "\n     aResult is " + new StringDescription().appendValue(this.aResult).toString() + "\n", _should_match);
    
    Step _step_1 = this.step();
    boolean _should_match_1 = this.should_match(_step_1, this.aResultWithDifferentClassName);
    Assert.assertFalse("\nExpected step should not match aResultWithDifferentClassName but"
     + "\n     step is " + new StringDescription().appendValue(_step_1).toString()
     + "\n     aResultWithDifferentClassName is " + new StringDescription().appendValue(this.aResultWithDifferentClassName).toString() + "\n", _should_match_1);
    
    Step _step_2 = this.step();
    boolean _should_match_2 = this.should_match(_step_2, this.aResultWithDifferentName);
    Assert.assertFalse("\nExpected step should not match aResultWithDifferentName but"
     + "\n     step is " + new StringDescription().appendValue(_step_2).toString()
     + "\n     aResultWithDifferentName is " + new StringDescription().appendValue(this.aResultWithDifferentName).toString() + "\n", _should_match_2);
    
  }
  
  @Test
  @Named("includes pending state when matching")
  @Order(14)
  public void _includesPendingStateWhenMatching() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package example");
    _builder.newLine();
    _builder.append("Feature: Something");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: MyScenario");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Given a pending step");
    _builder.newLine();
    this.m.parseScenario(_builder);
    this.subject.accept(this.pendingResult);
    Step _step = this.step();
    boolean _should_match = this.should_match(_step, this.pendingResult);
    Assert.assertTrue("\nExpected step should match pendingResult but"
     + "\n     step is " + new StringDescription().appendValue(_step).toString()
     + "\n     pendingResult is " + new StringDescription().appendValue(this.pendingResult).toString() + "\n", _should_match);
    
  }
  
  @Test
  @Named("handles escaped characters")
  @Order(15)
  public void _handlesEscapedCharacters() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package example");
    _builder.newLine();
    _builder.append("Feature: Something");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: MyScenario");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Given step with uml\u00E4uts");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("1 =>1");
    _builder.newLine();
    this.m.parseScenario(_builder);
    this.subject.accept(this.resultWithUnicodeChars);
    Step _step = this.step();
    boolean _should_match = this.should_match(_step, this.resultWithUnicodeChars);
    Assert.assertTrue("\nExpected step should match resultWithUnicodeChars but"
     + "\n     step is " + new StringDescription().appendValue(_step).toString()
     + "\n     resultWithUnicodeChars is " + new StringDescription().appendValue(this.resultWithUnicodeChars).toString() + "\n", _should_match);
    
  }
  
  @Test
  @Named("handles step arguments")
  @Order(16)
  public void _handlesStepArguments() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package example");
    _builder.newLine();
    _builder.append("Feature: Something");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: MyScenario");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Given step with \"args\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("1 =>1");
    _builder.newLine();
    this.m.parseScenario(_builder);
    this.subject.accept(this.resultWithArgs);
    Step _step = this.step();
    boolean _should_match = this.should_match(_step, this.resultWithArgs);
    Assert.assertTrue("\nExpected step should match resultWithArgs but"
     + "\n     step is " + new StringDescription().appendValue(_step).toString()
     + "\n     resultWithArgs is " + new StringDescription().appendValue(this.resultWithArgs).toString() + "\n", _should_match);
    
  }
}
