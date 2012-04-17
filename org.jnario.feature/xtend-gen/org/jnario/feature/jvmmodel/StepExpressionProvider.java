package org.jnario.feature.jvmmodel;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepExpression;
import org.jnario.feature.feature.StepReference;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("all")
public class StepExpressionProvider {
  public List<XExpression> getExpressions(final Step step) {
    boolean _equals = Objects.equal(step, null);
    if (_equals) {
      return CollectionLiterals.<XExpression>emptyList();
    }
    final StepExpression stepExpression = step.getStepExpression();
    boolean _equals_1 = Objects.equal(stepExpression, null);
    if (_equals_1) {
      return CollectionLiterals.<XExpression>emptyList();
    }
    final XBlockExpression blockExpression = stepExpression.getBlockExpression();
    boolean _equals_2 = Objects.equal(blockExpression, null);
    if (_equals_2) {
      return CollectionLiterals.<XExpression>emptyList();
    }
    return blockExpression.getExpressions();
  }
  
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
