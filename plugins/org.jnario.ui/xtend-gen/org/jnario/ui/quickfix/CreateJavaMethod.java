package org.jnario.ui.quickfix;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.common.types.xtext.ui.JdtHyperlink;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;
import org.jnario.ui.quickfix.XtendMethodBuilder;

@Data
@SuppressWarnings("all")
public class CreateJavaMethod implements IModification {
  private final XtendMethodBuilder _methodBuilder;
  
  public XtendMethodBuilder getMethodBuilder() {
    return this._methodBuilder;
  }
  
  private final IType _type;
  
  public IType getType() {
    return this._type;
  }
  
  public void apply(final IModificationContext context) throws Exception {
    IMethod _generateMethod = this.generateMethod();
    this.openInEditor(_generateMethod);
  }
  
  private IMethod generateMethod() {
    try {
      IMethod _xblockexpression = null;
      {
        StringBuilderBasedAppendable _stringBuilderBasedAppendable = new StringBuilderBasedAppendable();
        final StringBuilderBasedAppendable content = _stringBuilderBasedAppendable;
        XtendMethodBuilder _methodBuilder = this.getMethodBuilder();
        _methodBuilder.build(content);
        IType _type = this.getType();
        String _string = content.toString();
        NullProgressMonitor _nullProgressMonitor = new NullProgressMonitor();
        IMethod _createMethod = _type.createMethod(_string, null, true, _nullProgressMonitor);
        _xblockexpression = (_createMethod);
      }
      return _xblockexpression;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void openInEditor(final IJavaElement element) {
    JdtHyperlink _jdtHyperlink = new JdtHyperlink();
    final JdtHyperlink link = _jdtHyperlink;
    link.setJavaElement(element);
    link.open();
  }
  
  public CreateJavaMethod(final XtendMethodBuilder methodBuilder, final IType type) {
    super();
    this._methodBuilder = methodBuilder;
    this._type = type;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_methodBuilder== null) ? 0 : _methodBuilder.hashCode());
    result = prime * result + ((_type== null) ? 0 : _type.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    CreateJavaMethod other = (CreateJavaMethod) obj;
    if (_methodBuilder == null) {
      if (other._methodBuilder != null)
        return false;
    } else if (!_methodBuilder.equals(other._methodBuilder))
      return false;
    if (_type == null) {
      if (other._type != null)
        return false;
    } else if (!_type.equals(other._type))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
