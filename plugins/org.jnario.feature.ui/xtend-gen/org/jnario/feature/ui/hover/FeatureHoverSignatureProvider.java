package org.jnario.feature.ui.hover;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.ide.hover.XtendHoverSignatureProvider;
import org.jnario.feature.feature.Step;
import org.jnario.feature.naming.StepNameProvider;

@SuppressWarnings("all")
public class FeatureHoverSignatureProvider extends XtendHoverSignatureProvider {
  @Inject
  private StepNameProvider _stepNameProvider;
  
  public String getSignature(final EObject object) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (object instanceof Step) {
        final Step _step = (Step)object;
        _matched=true;
        String _signature = this.getSignature(_step);
        _switchResult = _signature;
      }
    }
    if (!_matched) {
      String _signature = super.getSignature(object);
      _switchResult = _signature;
    }
    return _switchResult;
  }
  
  public String getSignature(final Step step) {
    String _nameOf = this._stepNameProvider.nameOf(step);
    return _nameOf;
  }
}
