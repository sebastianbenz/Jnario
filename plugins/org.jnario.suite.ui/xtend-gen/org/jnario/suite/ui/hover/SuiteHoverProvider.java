package org.jnario.suite.ui.hover;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IRegion;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.Specification;
import org.jnario.suite.jvmmodel.SpecResolver;
import org.jnario.suite.jvmmodel.SuiteClassNameProvider;
import org.jnario.suite.suite.PatternReference;
import org.jnario.ui.doc.JnarioHoverProvider;

@SuppressWarnings("all")
public class SuiteHoverProvider extends JnarioHoverProvider {
  @Inject
  private SpecResolver _specResolver;
  
  @Inject
  private SuiteClassNameProvider _suiteClassNameProvider;
  
  public String getHoverInfoAsHtml(final EObject call, final EObject objectToView, final IRegion hoverRegion) {
    String comment = null;
    if ((objectToView instanceof PatternReference)) {
      final PatternReference spec = ((PatternReference) objectToView);
      List<Specification> _resolveSpecs = this._specResolver.resolveSpecs(spec);
      CharSequence _document = this.document(_resolveSpecs);
      String _string = _document.toString();
      comment = _string;
    } else {
      String _hoverInfoAsHtml = super.getHoverInfoAsHtml(call, objectToView, hoverRegion);
      comment = _hoverInfoAsHtml;
    }
    return comment;
  }
  
  public CharSequence document(final List<Specification> specs) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00C7FOR spec : specs\u00C8");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<li>\u00C7spec.describe\u00C8</li>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\u00C7ENDFOR\u00C8");
    _builder.newLine();
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
}
