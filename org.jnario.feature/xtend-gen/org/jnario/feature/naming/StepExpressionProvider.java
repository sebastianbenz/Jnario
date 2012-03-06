/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.jnario.feature.naming;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepExpression;
import org.jnario.feature.feature.StepReference;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("all")
public class StepExpressionProvider {
  public StepExpression expressionOf(final Step step) {
      if ((step instanceof StepReference)) {
        this.getOrCreateExpression(((StepReference) step));
      }
      StepExpression _stepExpression = step.getStepExpression();
      return _stepExpression;
  }
  
  public StepExpression getOrCreateExpression(final StepReference ref) {
      Step _reference = ref==null?(Step)null:ref.getReference();
      StepExpression _stepExpression = _reference==null?(StepExpression)null:_reference.getStepExpression();
      StepExpression _copy = EcoreUtil.<StepExpression>copy(_stepExpression);
      final StepExpression expr = _copy;
      ref.setStepExpression(expr);
      return expr;
  }
}
