package org.jnario.ui.quickfix;

import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;
import org.jnario.ui.quickfix.XtendMethodBuilder;

@Data
@SuppressWarnings("all")
public class CreateXtendMethod implements IModification {
  private final XtendMethodBuilder _methodBuilder;
  
  public XtendMethodBuilder getMethodBuilder() {
    return this._methodBuilder;
  }
  
  public void apply(final IModificationContext context) throws Exception {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("Auto-generated function stub");
    throw _unsupportedOperationException;
  }
  
  public CreateXtendMethod(final XtendMethodBuilder methodBuilder) {
    super();
    this._methodBuilder = methodBuilder;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_methodBuilder== null) ? 0 : _methodBuilder.hashCode());
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
    CreateXtendMethod other = (CreateXtendMethod) obj;
    if (_methodBuilder == null) {
      if (other._methodBuilder != null)
        return false;
    } else if (!_methodBuilder.equals(other._methodBuilder))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
