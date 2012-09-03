package org.jnario.feature.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepExpression;
import org.jnario.feature.feature.StepReference;
import org.jnario.feature.jvmmodel.ExpressionCopier;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("all")
public class StepExpressionProvider {
  @Inject
  private ExpressionCopier _expressionCopier;
  
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
  
  public StepExpression expressionOf(final Step step) {
    if ((step instanceof StepReference)) {
      this.getOrCreateExpression(((StepReference) step));
    }
    return step.getStepExpression();
  }
  
  private StepExpression getOrCreateExpression(final StepReference ref) {
    StepExpression _stepExpression = ref.getStepExpression();
    boolean _notEquals = (!Objects.equal(_stepExpression, null));
    if (_notEquals) {
      return ref.getStepExpression();
    }
    final Step step = ref==null?(Step)null:ref.getReference();
    boolean _or = false;
    boolean _equals = Objects.equal(step, null);
    if (_equals) {
      _or = true;
    } else {
      boolean _eIsProxy = step.eIsProxy();
      _or = (_equals || _eIsProxy);
    }
    if (_or) {
      return null;
    }
    StepExpression _stepExpression_1 = step.getStepExpression();
    StepExpression _cloneWithProxies = this._expressionCopier.<StepExpression>cloneWithProxies(_stepExpression_1);
    final StepExpression expr = ((StepExpression) _cloneWithProxies);
    ref.setStepExpression(expr);
    return expr;
  }
}
