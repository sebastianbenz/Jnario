package org.jnario.feature.tests.unit.naming;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.XExpression;
import org.hamcrest.StringDescription;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepImplementation;
import org.jnario.feature.feature.StepReference;
import org.jnario.feature.jvmmodel.StepExpressionProvider;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Query;
import org.jnario.lib.Assert;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("all")
@Named("StepExpressionProvider")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = FeatureTestCreator.class)
public class StepExpressionProviderSpec {
  @Subject
  public StepExpressionProvider subject;
  
  @Inject
  @Extension
  public ModelStore modelStore;
  
  @Test
  @Named("should return the name for a step with definition")
  @Order(1)
  public void _shouldReturnTheNameForAStepWithDefinition() throws Exception {
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
    XExpression _expression = _step.getExpression();
    Step _step_1 = this.step();
    XExpression _expressionOf = this.subject.expressionOf(_step_1);
    boolean _equals = Objects.equal(_expression, _expressionOf);
    Assert.assertTrue("\nExpected step.expression == subject.expressionOf(step) but"
     + "\n     step.expression is " + new StringDescription().appendValue(_expression).toString()
     + "\n     step is " + new StringDescription().appendValue(_step).toString()
     + "\n     subject.expressionOf(step) is " + new StringDescription().appendValue(_expressionOf).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _equals);
    
  }
  
  @Test
  @Named("should copy the referenced step\\\'s implementation and set the referencing step")
  @Order(2)
  public void _shouldCopyTheReferencedStepSImplementationAndSetTheReferencingStep() throws Exception {
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
    final XExpression expr = this.subject.expressionOf(_step);
    boolean _notEquals = (!Objects.equal(expr, null));
    Assert.assertTrue("\nExpected expr != null but"
     + "\n     expr is " + new StringDescription().appendValue(expr).toString() + "\n", _notEquals);
    
    Step _step_1 = this.step();
    XExpression _expression = _step_1.getExpression();
    boolean _equals = Objects.equal(_expression, expr);
    Assert.assertTrue("\nExpected step.expression == expr but"
     + "\n     step.expression is " + new StringDescription().appendValue(_expression).toString()
     + "\n     step is " + new StringDescription().appendValue(_step_1).toString()
     + "\n     expr is " + new StringDescription().appendValue(expr).toString() + "\n", _equals);
    
    Step _step_2 = this.step();
    StepImplementation _reference = ((StepReference) _step_2).getReference();
    XExpression _expression_1 = _reference.getExpression();
    boolean _notEquals_1 = (!Objects.equal(_expression_1, expr));
    Assert.assertTrue("\nExpected (step as StepReference).reference.expression != expr but"
     + "\n     (step as StepReference).reference.expression is " + new StringDescription().appendValue(_expression_1).toString()
     + "\n     (step as StepReference).reference is " + new StringDescription().appendValue(_reference).toString()
     + "\n     step as StepReference is " + new StringDescription().appendValue(((StepReference) _step_2)).toString()
     + "\n     step is " + new StringDescription().appendValue(_step_2).toString()
     + "\n     expr is " + new StringDescription().appendValue(expr).toString() + "\n", _notEquals_1);
    
  }
  
  public Step step() {
    Query _query = Query.query(this.modelStore);
    return _query.<Step>first(Step.class);
  }
}
