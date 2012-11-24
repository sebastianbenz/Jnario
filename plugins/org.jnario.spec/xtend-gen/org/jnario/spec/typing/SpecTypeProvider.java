package org.jnario.spec.typing;

import com.google.common.base.Objects;
import com.google.inject.Singleton;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XExpression;
import org.jnario.spec.spec.Example;
import org.jnario.typing.JnarioTypeProvider;

@Singleton
@SuppressWarnings("all")
public class SpecTypeProvider extends JnarioTypeProvider {
  public JvmTypeReference expectedType(final EObject container, final EReference reference, final int index, final boolean rawType) {
    return super.expectedType(container, reference, index, rawType);
  }
  
  public JvmTypeReference getExpectedReturnType(final XExpression expr, final boolean rawType) {
    final JvmTypeReference returnType = super.getExpectedReturnType(expr, rawType);
    boolean _notEquals = (!Objects.equal(returnType, null));
    if (_notEquals) {
      return returnType;
    }
    final Example function = EcoreUtil2.<Example>getContainerOfType(expr, Example.class);
    boolean _equals = Objects.equal(function, null);
    if (_equals) {
      return null;
    }
    XExpression _expr = function.getExpr();
    return this.getPrimitiveVoid(_expr);
  }
}
