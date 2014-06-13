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
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.Extension;
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
  @Extension
  private ExpressionCopier _expressionCopier;
  
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
    StepImplementation _reference = null;
    if (ref!=null) {
      _reference=ref.getReference();
    }
    final StepImplementation step = _reference;
    boolean _or = false;
    boolean _equals = Objects.equal(step, null);
    if (_equals) {
      _or = true;
    } else {
      boolean _eIsProxy = step.eIsProxy();
      _or = _eIsProxy;
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
}
