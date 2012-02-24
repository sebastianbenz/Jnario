package org.jnario.feature.tests.unit.naming;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepExpression;
import org.jnario.feature.feature.StepReference;
import org.jnario.feature.naming.StepExpressionProvider;
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
@Named("StepExpressionProvider")
@InstantiateWith(SpecTestInstantiator.class)
public class StepExpressionProviderSpec {
  @Subject
  public StepExpressionProvider subject;
  
  @Inject
  @Extension
  public ModelStore modelStore;
  
  @Test
  @Named("should return the name for a step with definition")
  @Order(1)
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
      Step _step = this.step();
      StepExpression _stepExpression = _step.getStepExpression();
      Step _step_1 = this.step();
      StepExpression _expressionOf = this.subject.expressionOf(_step_1);
      boolean _operator_equals = ObjectExtensions.operator_equals(_stepExpression, _expressionOf);
      org.junit.Assert.assertTrue("\nExpected step.stepExpression == subject.expressionOf(step) but:"
       + "\n     step.stepExpression is " + _stepExpression
       + "\n     step is " + _step
       + "\n     subject.expressionOf(step) is " + _expressionOf
       + "\n     subject is " + this.subject + "\n", _operator_equals);
      
  }
  
  @Test
  @Named("should copy the referenced step\'s implementation and set the referencing step")
  @Order(2)
  public void shouldCopyTheReferencedStepSImplementationAndSetTheReferencingStep() throws Exception {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Feature: Example");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Scenario: MyScenario 1");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Given a step ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Scenario: MyScenario 2");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Given a step ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("\"the implementation\"");
      _builder.newLine();
      this.modelStore.parseScenario(_builder);
      Step _step = this.step();
      StepExpression _expressionOf = this.subject.expressionOf(_step);
      final StepExpression expr = _expressionOf;
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(expr, null);
      org.junit.Assert.assertTrue("\nExpected expr != null but:"
       + "\n     expr is " + expr + "\n", _operator_notEquals);
      
      Step _step_1 = this.step();
      StepExpression _stepExpression = _step_1.getStepExpression();
      boolean _operator_equals = ObjectExtensions.operator_equals(_stepExpression, expr);
      org.junit.Assert.assertTrue("\nExpected step.stepExpression == expr but:"
       + "\n     step.stepExpression is " + _stepExpression
       + "\n     step is " + _step_1
       + "\n     expr is " + expr + "\n", _operator_equals);
      
      Step _step_2 = this.step();
      Step _reference = ((StepReference) _step_2).getReference();
      StepExpression _stepExpression_1 = _reference.getStepExpression();
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_stepExpression_1, expr);
      org.junit.Assert.assertTrue("\nExpected (step as StepReference).reference.stepExpression != expr but:"
       + "\n     (step as StepReference).reference.stepExpression is " + _stepExpression_1
       + "\n     (step as StepReference).reference is " + _reference
       + "\n     step as StepReference is " + ((StepReference) _step_2)
       + "\n     step is " + _step_2
       + "\n     expr is " + expr + "\n", _operator_notEquals_1);
      
  }
  
  public Step step() {
    Query _query = Query.query(this.modelStore);
    Step _first = _query.<Step>first(org.jnario.feature.feature.Step.class);
    return _first;
  }
}
