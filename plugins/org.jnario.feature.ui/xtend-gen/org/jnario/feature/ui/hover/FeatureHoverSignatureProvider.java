package org.jnario.feature.ui.hover;

import org.eclipse.xtend.ide.hover.XtendHoverSignatureProvider;
import org.jnario.feature.feature.Step;
import org.jnario.feature.naming.StepNameProvider;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class FeatureHoverSignatureProvider extends XtendHoverSignatureProvider {
  @Inject
  private StepNameProvider _stepNameProvider;
  
  public String getSignature(final Step step) {
    String _nameOf = this._stepNameProvider.nameOf(step);
    return _nameOf;
  }
}
