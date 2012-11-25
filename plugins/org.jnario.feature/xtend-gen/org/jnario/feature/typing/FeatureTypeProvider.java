package org.jnario.feature.typing;

import com.google.common.base.Objects;
import com.google.inject.Singleton;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend.core.xtend.XtendFunction;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XExpression;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepExpression;
import org.jnario.typing.JnarioTypeProvider;

@Singleton
@SuppressWarnings("all")
public class FeatureTypeProvider extends JnarioTypeProvider {
  public JvmTypeReference expectedType(final EObject container, final EReference reference, final int index, final boolean rawType) {
    JvmTypeReference _xifexpression = null;
    if ((container instanceof StepExpression)) {
      EObject _eContainer = container.eContainer();
      JvmTypeReference __expectedType = this._expectedType(((XtendFunction) _eContainer), reference, index, rawType);
      _xifexpression = __expectedType;
    } else {
      JvmTypeReference _expectedType = super.expectedType(container, reference, index, rawType);
      _xifexpression = _expectedType;
    }
    return _xifexpression;
  }
  
  public JvmTypeReference getExpectedReturnType(final XExpression expr, final boolean rawType) {
    final JvmTypeReference returnType = super.getExpectedReturnType(expr, rawType);
    boolean _notEquals = (!Objects.equal(returnType, null));
    if (_notEquals) {
      return returnType;
    }
    final Step function = EcoreUtil2.<Step>getContainerOfType(expr, Step.class);
    boolean _equals = Objects.equal(function, null);
    if (_equals) {
      return null;
    }
    XExpression _expression = function.getExpression();
    return this.getPrimitiveVoid(_expression);
  }
}
