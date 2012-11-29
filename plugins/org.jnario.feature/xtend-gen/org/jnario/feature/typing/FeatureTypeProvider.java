package org.jnario.feature.typing;

import com.google.common.base.Objects;
import com.google.inject.Singleton;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XExpression;
import org.jnario.feature.feature.Step;
import org.jnario.typing.JnarioTypeProvider;

@Singleton
@SuppressWarnings("all")
public class FeatureTypeProvider extends JnarioTypeProvider {
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
