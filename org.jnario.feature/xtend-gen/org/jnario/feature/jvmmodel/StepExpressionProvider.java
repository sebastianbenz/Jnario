package org.jnario.feature.jvmmodel;

import java.util.List;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepExpression;
import org.jnario.feature.feature.StepReference;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("all")
public class StepExpressionProvider {
  public List<XExpression> getExpressions(final Step step) {
    boolean _equals = ObjectExtensions.operator_equals(step, null);
    if (_equals) {
      return CollectionLiterals.<XExpression>emptyList();
    }
    final StepExpression stepExpression = step.getStepExpression();
    boolean _equals_1 = ObjectExtensions.operator_equals(stepExpression, null);
    if (_equals_1) {
      return CollectionLiterals.<XExpression>emptyList();
    }
    final XBlockExpression blockExpression = stepExpression.getBlockExpression();
    boolean _equals_2 = ObjectExtensions.operator_equals(blockExpression, null);
    if (_equals_2) {
      return CollectionLiterals.<XExpression>emptyList();
    }
    return blockExpression.getExpressions();
  }
  
  public StepExpression expressionOf(final Step step) {
    if ((step instanceof StepReference)) {
      this.getOrCreateExpression(((StepReference) step));
    }
    return step.getStepExpression();
  }
  
  public StepExpression getOrCreateExpression(final StepReference ref) {
    StepExpression _stepExpression = ref.getStepExpression();
    boolean _notEquals = ObjectExtensions.operator_notEquals(_stepExpression, null);
    if (_notEquals) {
      return ref.getStepExpression();
    }
    final Step step = ref==null?(Step)null:ref.getReference();
    StepExpression _stepExpression_1 = step==null?(StepExpression)null:step.getStepExpression();
    StepExpression _cloneWithProxies = EcoreUtil2.<StepExpression>cloneWithProxies(_stepExpression_1);
    final StepExpression expr = ((StepExpression) _cloneWithProxies);
    ref.setStepExpression(expr);
    return expr;
  }
}
