package org.jnario.doc;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;

@SuppressWarnings("all")
public class DocumentationProvider {
  private final IEObjectDocumentationProvider delegate;
  
  @Inject
  public DocumentationProvider(final IEObjectDocumentationProvider delegate) {
    this.delegate = delegate;
  }
  
  public String getDocumentation(final EObject eObject) {
    String _xblockexpression = null;
    {
      final String doc = this.delegate.getDocumentation(eObject);
      String _replaceAll = doc.replaceAll("\\\\/\\*", "/*");
      String _replaceAll_1 = _replaceAll.replaceAll("\\\\\\*/", "*/");
      _xblockexpression = (_replaceAll_1);
    }
    return _xblockexpression;
  }
}
