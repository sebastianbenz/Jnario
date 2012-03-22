package org.jnario.feature.jvmmodel;

import com.google.common.base.Objects;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepExpression;
import org.jnario.feature.feature.StepReference;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("all")
public class StepExpressionProvider {
  public StepExpression expressionOf(final Step step, final JvmGenericType type) {
    if ((step instanceof StepReference)) {
      this.getOrCreateExpression(((StepReference) step), type);
    }
    return step.getStepExpression();
  }
  
  public StepExpression getOrCreateExpression(final StepReference ref, final JvmGenericType type) {
    StepExpression _stepExpression = ref.getStepExpression();
    boolean _notEquals = (!Objects.equal(_stepExpression, null));
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
