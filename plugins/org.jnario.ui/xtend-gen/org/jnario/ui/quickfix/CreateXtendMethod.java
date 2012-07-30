package org.jnario.ui.quickfix;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
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
  }
  
  public int getFunctionInsertOffset(final XtendClass clazz) {
    int _xblockexpression = (int) 0;
    {
      final ICompositeNode clazzNode = NodeModelUtils.findActualNodeFor(clazz);
      boolean _equals = Objects.equal(clazzNode, null);
      if (_equals) {
        String _name = clazz.getName();
        String _plus = ("Cannot determine node for clazz " + _name);
        IllegalStateException _illegalStateException = new IllegalStateException(_plus);
        throw _illegalStateException;
      }
      int lastClosingBraceOffset = (-1);
      Iterable<ILeafNode> _leafNodes = clazzNode.getLeafNodes();
      for (final ILeafNode leafNode : _leafNodes) {
        boolean _and = false;
        EObject _grammarElement = leafNode.getGrammarElement();
        if (!(_grammarElement instanceof Keyword)) {
          _and = false;
        } else {
          EObject _grammarElement_1 = leafNode.getGrammarElement();
          String _value = ((Keyword) _grammarElement_1).getValue();
          boolean _equals_1 = Objects.equal("}", _value);
          _and = ((_grammarElement instanceof Keyword) && _equals_1);
        }
        if (_and) {
          int _offset = leafNode.getOffset();
          lastClosingBraceOffset = _offset;
        }
      }
      int _xifexpression = (int) 0;
      int _minus = (-1);
      boolean _equals_2 = (lastClosingBraceOffset == _minus);
      if (_equals_2) {
        int _totalEndOffset = clazzNode.getTotalEndOffset();
        _xifexpression = _totalEndOffset;
      } else {
        _xifexpression = lastClosingBraceOffset;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
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
