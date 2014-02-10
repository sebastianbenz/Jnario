package org.jnario.feature.ui.hover;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.doc.WhiteSpaceNormalizer;
import org.jnario.feature.feature.Step;
import org.jnario.ui.doc.JnarioHoverProvider;

@SuppressWarnings("all")
public class FeatureHoverProvider extends JnarioHoverProvider {
  @Inject
  @Extension
  private WhiteSpaceNormalizer normalizer;
  
  protected String getDocumentation(final EObject o) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (o instanceof Step) {
        _matched=true;
        _switchResult = this.getDocumentation(((Step)o));
      }
    }
    if (!_matched) {
      _switchResult = super.getDocumentation(o);
    }
    return _switchResult;
  }
  
  public String getDocumentation(final Step step) {
    String _xblockexpression = null;
    {
      XExpression _expression = step.getExpression();
      final ICompositeNode node = NodeModelUtils.getNode(_expression);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<pre>");
      _builder.newLine();
      String _text = node.getText();
      String _normalize = this.normalizer.normalize(_text);
      _builder.append(_normalize, "");
      _builder.newLineIfNotEmpty();
      _builder.append("</pre>");
      _xblockexpression = (_builder.toString());
    }
    return _xblockexpression;
  }
}
