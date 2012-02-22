package de.bmw.carit.jnario.naming;

import de.bmw.carit.jnario.jnario.Step;
import de.bmw.carit.jnario.jnario.StepExpression;
import de.bmw.carit.jnario.jnario.StepReference;
import org.eclipse.emf.ecore.util.EcoreUtil;

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
