package org.jnario.feature.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepImplementation;
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
    final XExpression stepExpression = step.getExpression();
    final XBlockExpression blockExpression = ((XBlockExpression) stepExpression);
    boolean _equals_1 = Objects.equal(blockExpression, null);
    if (_equals_1) {
      return CollectionLiterals.<XExpression>emptyList();
    }
    return blockExpression.getExpressions();
  }
  
  public XExpression expressionOf(final Step step) {
    if ((step instanceof StepReference)) {
      this.getOrCreateExpression(((StepReference) step));
    }
    return step.getExpression();
  }
  
  private XExpression getOrCreateExpression(final StepReference ref) {
    XExpression _expression = ref.getExpression();
    boolean _notEquals = (!Objects.equal(_expression, null));
    if (_notEquals) {
      return ref.getExpression();
    }
    final StepImplementation step = ref==null?(StepImplementation)null:ref.getReference();
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
    XExpression _expression_1 = step.getExpression();
    XExpression _cloneWithProxies = this._expressionCopier.<XExpression>cloneWithProxies(_expression_1);
    final XExpression expr = ((XExpression) _cloneWithProxies);
    ref.setExpression(expr);
    return expr;
  }
  
  public boolean hasExpression(final Step step) {
    XExpression _expression = step.getExpression();
    boolean _notEquals = (!Objects.equal(_expression, null));
    if (_notEquals) {
      return true;
    }
    if ((step instanceof StepReference)) {
      final StepImplementation refStep = ((StepReference) step).getReference();
      boolean _and = false;
      boolean _notEquals_1 = (!Objects.equal(refStep, null));
      if (!_notEquals_1) {
        _and = false;
      } else {
        boolean _eIsProxy = refStep.eIsProxy();
        boolean _not = (!_eIsProxy);
        _and = (_notEquals_1 && _not);
      }
      if (_and) {
        return true;
      }
    }
    return false;
  }
}
