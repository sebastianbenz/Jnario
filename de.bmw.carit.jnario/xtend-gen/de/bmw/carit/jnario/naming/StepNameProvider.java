package de.bmw.carit.jnario.naming;

import de.bmw.carit.jnario.jnario.JnarioPackage;
import de.bmw.carit.jnario.jnario.Step;
import de.bmw.carit.jnario.jnario.StepReference;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;

@SuppressWarnings("all")
public class StepNameProvider {
  public String nameOf(final Step step) {
      if ((step instanceof StepReference)) {
        String _nameOf = this.nameOf(((StepReference) step));
        return _nameOf;
      }
      String _name = step.getName();
      String _trim = _name==null?(String)null:_name.trim();
      return _trim;
  }
  
  public String nameOf(final StepReference ref) {
      Step _reference = ref.getReference();
      final Step referencedStep = _reference;
      boolean _operator_equals = ObjectExtensions.operator_equals(referencedStep, null);
      if (_operator_equals) {
        return null;
      }
      boolean _eIsProxy = referencedStep.eIsProxy();
      boolean _operator_not = BooleanExtensions.operator_not(_eIsProxy);
      if (_operator_not) {
        String _nameOf = this.nameOf(referencedStep);
        return _nameOf;
      }
      EReference _stepReference_Reference = JnarioPackage.eINSTANCE.getStepReference_Reference();
      String _referenceText = this.referenceText(ref, _stepReference_Reference);
      return _referenceText;
  }
  
  public String referenceText(final EObject obj, final EReference ref) {
      List<INode> _findNodesForFeature = NodeModelUtils.findNodesForFeature(obj, ref);
      final List<INode> nodes = _findNodesForFeature;
      Iterable<ILeafNode> _filter = IterableExtensions.<ILeafNode>filter(nodes, org.eclipse.xtext.nodemodel.ILeafNode.class);
      final Iterable<ILeafNode> leafs = _filter;
      final Function1<ILeafNode,String> _function = new Function1<ILeafNode,String>() {
          public String apply(final ILeafNode it) {
            String _text = it.getText();
            return _text;
          }
        };
      Iterable<String> _map = IterableExtensions.<ILeafNode, String>map(leafs, _function);
      String _join = IterableExtensions.join(_map);
      String _trim = _join.trim();
      return _trim;
  }
}
