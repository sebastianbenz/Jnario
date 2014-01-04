/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.HashMap;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.feature.feature.Step;
import org.jnario.feature.jvmmodel.StepExpressionProvider;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@SuppressWarnings("all")
public class PendingStepsCalculator {
  @Inject
  @Extension
  private StepExpressionProvider _stepExpressionProvider;
  
  private HashMap<Step,Boolean> steps = CollectionLiterals.<Step, Boolean>newHashMap();
  
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
    return false;
  }
}
