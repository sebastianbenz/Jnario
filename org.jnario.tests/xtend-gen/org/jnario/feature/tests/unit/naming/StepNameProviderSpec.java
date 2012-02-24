package org.jnario.feature.tests.unit.naming;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.jnario.feature.feature.FeatureFactory;
import org.jnario.feature.feature.Given;
import org.jnario.feature.feature.GivenReference;
import org.jnario.feature.feature.Step;
import org.jnario.feature.naming.StepNameProvider;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Query;
import org.jnario.jnario.test.util.SpecTestInstantiator;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.InstantiateWith;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@RunWith(ExampleGroupRunner.class)
@Named("StepNameProvider")
@InstantiateWith(SpecTestInstantiator.class)
public class StepNameProviderSpec {
  @Subject
  public StepNameProvider subject;
  
  @Inject
  @Extension
  public ModelStore modelStore;
  
  @Test
  @Named("should return null if the step has no name")
  @Order(1)
  public void shouldReturnNullIfTheStepHasNoName() throws Exception {
    Given _emptyStep = this.emptyStep();
    String _nameOf = this.subject.nameOf(_emptyStep);
    boolean _operator_equals = ObjectExtensions.operator_equals(_nameOf, null);
    org.junit.Assert.assertTrue("\nExpected subject.nameOf(emptyStep) == null but:"
     + "\n     subject.nameOf(emptyStep) is " + "\"" + _nameOf + "\""
     + "\n     subject is " + this.subject
     + "\n     emptyStep is " + _emptyStep + "\n", _operator_equals);
  }
  
  @Test
  @Named("should return null if the step has no reference")
  @Order(2)
  public void shouldReturnNullIfTheStepHasNoReference() throws Exception {
    GivenReference _emptyRef = this.emptyRef();
    String _nameOf = this.subject.nameOf(_emptyRef);
    boolean _operator_equals = ObjectExtensions.operator_equals(_nameOf, null);
    org.junit.Assert.assertTrue("\nExpected subject.nameOf(emptyRef) == null but:"
     + "\n     subject.nameOf(emptyRef) is " + "\"" + _nameOf + "\""
     + "\n     subject is " + this.subject
     + "\n     emptyRef is " + _emptyRef + "\n", _operator_equals);
  }
  
  @Test
  @Named("should return the name for a step with definition")
  @Order(3)
  public void shouldReturnTheNameForAStepWithDefinition() throws Exception {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Feature: Example");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Scenario: MyScenario");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Given a step with an implementation");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("\"the implementation\"");
      _builder.newLine();
      this.modelStore.parseScenario(_builder);
      String _stepName = this.stepName();
      boolean _operator_equals = ObjectExtensions.operator_equals(_stepName, "Given a step with an implementation");
      org.junit.Assert.assertTrue("\nExpected stepName == \"Given a step with an implementation\" but:"
       + "\n     stepName is " + "\"" + _stepName + "\"" + "\n", _operator_equals);
      
  }
  
  @Test
  @Named("should return the name for a step with resolved reference")
  @Order(4)
  public void shouldReturnTheNameForAStepWithResolvedReference() throws Exception {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Feature: Example");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Scenario: MyScenario 2");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Given a step with a resolved reference");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Scenario: MyScenario 1");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Given a step with a resolved reference");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("\"implementation\"");
      _builder.newLine();
      this.modelStore.parseScenario(_builder);
      String _stepName = this.stepName();
      boolean _operator_equals = ObjectExtensions.operator_equals(_stepName, "Given a step with a resolved reference");
      org.junit.Assert.assertTrue("\nExpected stepName == \"Given a step with a resolved reference\" but:"
       + "\n     stepName is " + "\"" + _stepName + "\"" + "\n", _operator_equals);
      
  }
  
  @Test
  @Named("should return the name for a step with unresolved reference")
  @Order(5)
  public void shouldReturnTheNameForAStepWithUnresolvedReference() throws Exception {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Feature: Example");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Scenario: MyScenario 2");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Given a step with an unresolved reference");
      _builder.newLine();
      this.modelStore.parseScenario(_builder);
      String _stepName = this.stepName();
      boolean _operator_equals = ObjectExtensions.operator_equals(_stepName, "Given a step with an unresolved reference");
      org.junit.Assert.assertTrue("\nExpected stepName == \"Given a step with an unresolved reference\" but:"
       + "\n     stepName is " + "\"" + _stepName + "\"" + "\n", _operator_equals);
      
  }
  
  public String stepName() {
      Query _query = Query.query(this.modelStore);
      Step _first = _query.<Step>first(org.jnario.feature.feature.Step.class);
      final Step step = _first;
      String _nameOf = this.subject.nameOf(step);
      return _nameOf;
  }
  
  public Given emptyStep() {
    Given _createGiven = FeatureFactory.eINSTANCE.createGiven();
    return _createGiven;
  }
  
  public GivenReference emptyRef() {
    GivenReference _createGivenReference = FeatureFactory.eINSTANCE.createGivenReference();
    return _createGivenReference;
  }
}
