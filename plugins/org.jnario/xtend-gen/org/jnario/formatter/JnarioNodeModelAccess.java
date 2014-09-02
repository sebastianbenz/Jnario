package org.jnario.formatter;

import com.google.common.base.Objects;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.nodemodel.BidiTreeIterable;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.formatting.NodeModelAccess;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class JnarioNodeModelAccess extends NodeModelAccess {
  public Iterable<ILeafNode> nodesForKeyword(final EObject obj, final String kw) {
    List<ILeafNode> _xblockexpression = null;
    {
      final ICompositeNode node = NodeModelUtils.findActualNodeFor(obj);
      boolean _equals = Objects.equal(node, null);
      if (_equals) {
        return Collections.<ILeafNode>unmodifiableList(CollectionLiterals.<ILeafNode>newArrayList());
      }
      BidiTreeIterable<INode> _asTreeIterable = node.getAsTreeIterable();
      final Function1<INode, Boolean> _function = new Function1<INode, Boolean>() {
        public Boolean apply(final INode it) {
          boolean _and = false;
          boolean _and_1 = false;
          EObject _semanticElement = it.getSemanticElement();
          boolean _equals = Objects.equal(_semanticElement, obj);
          if (!_equals) {
            _and_1 = false;
          } else {
            EObject _grammarElement = it.getGrammarElement();
            _and_1 = (_grammarElement instanceof Keyword);
          }
          if (!_and_1) {
            _and = false;
          } else {
            String _text = it.getText();
            boolean _equals_1 = Objects.equal(_text, kw);
            _and = _equals_1;
          }
          return Boolean.valueOf(_and);
        }
      };
      INode _findFirst = IterableExtensions.<INode>findFirst(_asTreeIterable, _function);
      final ILeafNode leafNode = ((ILeafNode) _findFirst);
      List<ILeafNode> _xifexpression = null;
      boolean _tripleEquals = (leafNode == null);
      if (_tripleEquals) {
        _xifexpression = Collections.<ILeafNode>unmodifiableList(CollectionLiterals.<ILeafNode>newArrayList());
      } else {
        _xifexpression = Collections.<ILeafNode>unmodifiableList(CollectionLiterals.<ILeafNode>newArrayList(leafNode));
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
