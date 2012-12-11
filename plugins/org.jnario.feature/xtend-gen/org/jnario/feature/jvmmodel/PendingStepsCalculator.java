package org.jnario.feature.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.HashMap;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.feature.feature.Step;
import org.jnario.feature.jvmmodel.StepExpressionProvider;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@SuppressWarnings("all")
public class PendingStepsCalculator {
  @Inject
  private StepExpressionProvider _stepExpressionProvider;
  
  private HashMap<Step,Boolean> steps = new Function0<HashMap<Step,Boolean>>() {
    public HashMap<Step,Boolean> apply() {
      HashMap<Step,Boolean> _newHashMap = CollectionLiterals.<Step, Boolean>newHashMap();
      return _newHashMap;
    }
  }.apply();
  
  public void setSteps(final Iterable<Step> steps) {
    boolean hasPendingStep = false;
    for (final Step step : steps) {
      boolean _or = false;
      if (hasPendingStep) {
        _or = true;
      } else {
        boolean _hasExpression = this._stepExpressionProvider.hasExpression(step);
        boolean _not = (!_hasExpression);
        _or = (hasPendingStep || _not);
      }
      if (_or) {
        this.steps.put(step, Boolean.valueOf(true));
        hasPendingStep = true;
      } else {
        this.steps.put(step, Boolean.valueOf(false));
      }
    }
  }
  
  public Boolean isPendingOrAPreviousStepIsPending(final Step step) {
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(step, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _containsKey = this.steps.containsKey(step);
      _and = (_notEquals && _containsKey);
    }
    if (_and) {
      return this.steps.get(step);
    }
    return Boolean.valueOf(false);
  }
}
