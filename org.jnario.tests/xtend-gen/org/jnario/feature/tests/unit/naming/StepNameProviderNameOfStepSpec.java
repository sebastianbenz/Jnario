package org.jnario.feature.tests.unit.naming;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.jnario.feature.feature.Given;
import org.jnario.feature.feature.GivenReference;
import org.jnario.feature.tests.unit.naming.StepNameProviderSpec;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("nameOf[Step]")
public class StepNameProviderNameOfStepSpec extends StepNameProviderSpec {
  @Test
  @Named("returns null if the step has no name")
  @Order(99)
  public void returnsNullIfTheStepHasNoName() throws Exception {
    Given _emptyStep = this.emptyStep();
    String _nameOf = this.subject.nameOf(_emptyStep);
    boolean _equals = ObjectExtensions.operator_equals(_nameOf, null);
    Assert.assertTrue("\nExpected subject.nameOf(emptyStep) == null but"
     + "\n     subject.nameOf(emptyStep) is " + "\"" + _nameOf + "\""
     + "\n     subject is " + this.subject
     + "\n     emptyStep is " + _emptyStep + "\n", _equals);
    
  }
  
  @Test
  @Named("returns null if the step has no reference")
  @Order(99)
  public void returnsNullIfTheStepHasNoReference() throws Exception {
    GivenReference _emptyRef = this.emptyRef();
    String _nameOf = this.subject.nameOf(_emptyRef);
    boolean _equals = ObjectExtensions.operator_equals(_nameOf, null);
    Assert.assertTrue("\nExpected subject.nameOf(emptyRef) == null but"
     + "\n     subject.nameOf(emptyRef) is " + "\"" + _nameOf + "\""
     + "\n     subject is " + this.subject
     + "\n     emptyRef is " + _emptyRef + "\n", _equals);
    
  }
  
  @Test
  @Named("returns the name for a step with definition")
  @Order(99)
  public void returnsTheNameForAStepWithDefinition() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Scenario: MyScenario");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Given a step with an implementation");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("1 + 1 => 2");
    _builder.newLine();
    this.parseScenario(_builder);
    String _stepName = this.stepName();
    boolean _doubleArrow = ObjectExtensions.<String>operator_doubleArrow(_stepName, "Given a step with an implementation");
    Assert.assertTrue("\nExpected stepName => \"Given a step with an implementation\" but"
     + "\n     stepName is " + "\"" + _stepName + "\"" + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("returns the name for a step with resolved reference")
  @Order(99)
  public void returnsTheNameForAStepWithResolvedReference() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Scenario: MyScenario 2");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Given a step with a resolved reference");
    _builder.newLine();
    _builder.append("Scenario: MyScenario 1");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Given a step with a resolved reference");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"implementation\"");
    _builder.newLine();
    this.parseScenario(_builder);
    String _stepName = this.stepName();
    boolean _doubleArrow = ObjectExtensions.<String>operator_doubleArrow(_stepName, "Given a step with a resolved reference");
    Assert.assertTrue("\nExpected stepName => \"Given a step with a resolved reference\" but"
     + "\n     stepName is " + "\"" + _stepName + "\"" + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("returns the name for a step with unresolved reference")
  @Order(99)
  public void returnsTheNameForAStepWithUnresolvedReference() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Scenario: MyScenario 2");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Given a step with an unresolved reference");
    _builder.newLine();
    this.parseScenario(_builder);
    String _stepName = this.stepName();
    boolean _doubleArrow = ObjectExtensions.<String>operator_doubleArrow(_stepName, "Given a step with an unresolved reference");
    Assert.assertTrue("\nExpected stepName => \"Given a step with an unresolved reference\" but"
     + "\n     stepName is " + "\"" + _stepName + "\"" + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("keeps parameter values")
  @Order(99)
  public void keepsParameterValues() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Scenario: MyScenario 2");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Given a step with two values \"a\" and \"b\"");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("1 + 1 => 2");
    _builder.newLine();
    this.parseScenario(_builder);
    String _stepName = this.stepName();
    boolean _doubleArrow = ObjectExtensions.<String>operator_doubleArrow(_stepName, "Given a step with two values \"a\" and \"b\"");
    Assert.assertTrue("\nExpected stepName => \'Given a step with two values \"a\" and \"b\"\' but"
     + "\n     stepName is " + "\"" + _stepName + "\"" + "\n", _doubleArrow);
    
  }
}
