package de.bmw.carit.jnario.naming;

import de.bmw.carit.jnario.jnario.Code;
import de.bmw.carit.jnario.jnario.Ref;
import de.bmw.carit.jnario.jnario.Step;
import org.eclipse.emf.ecore.util.EcoreUtil;

@SuppressWarnings("all")
public class StepExpressionProvider {
  public Code expressionOf(final Step step) {
      if ((step instanceof Ref)) {
        this.getOrCreateExpression(((Ref) step));
      }
      Code _code = step.getCode();
      return _code;
  }
  
  public Code getOrCreateExpression(final Ref ref) {
      Step _reference = ref==null?(Step)null:ref.getReference();
      Code _code = _reference==null?(Code)null:_reference.getCode();
      Code _copy = EcoreUtil.<Code>copy(_code);
      final Code expr = _copy;
      ref.setCode(expr);
      return expr;
  }
}
