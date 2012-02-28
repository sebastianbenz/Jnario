package org.jnario.feature.naming;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.feature.feature.FeaturePackage;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepReference;

/**
 * @author Sebastian Benz - Initial contribution and API
 * @author Birgit Engelmann
 */
@SuppressWarnings("all")
public class StepNameProvider {
  private static String MULTILINE = "\\\\( |\t)*\r?\n?( |\t)*";
  
  public String nameOf(final Step step) {
    if ((step instanceof StepReference)) {
      String _nameOf = this.nameOf(((StepReference) step));
      return _nameOf;
    }
    String _name = step.getName();
    String _removeExtraCharacters = _name==null?(String)null:this.removeExtraCharacters(_name);
    return _removeExtraCharacters;
  }
  
  public String nameOf(final StepReference ref) {
    Step _reference = ref.getReference();
    final Step referencedStep = _reference;
    boolean _equals = Objects.equal(referencedStep, null);
    if (_equals) {
      return null;
    }
    boolean _eIsProxy = referencedStep.eIsProxy();
    boolean _not = (!_eIsProxy);
    if (_not) {
      String _nameOf = this.nameOf(referencedStep);
      return _nameOf;
    }
    EReference _stepReference_Reference = FeaturePackage.eINSTANCE.getStepReference_Reference();
    String _referenceText = this.referenceText(ref, _stepReference_Reference);
    return _referenceText;
  }
  
  public String referenceText(final EObject obj, final EReference ref) {
    List<INode> _findNodesForFeature = NodeModelUtils.findNodesForFeature(obj, ref);
    final List<INode> nodes = _findNodesForFeature;
    Iterable<ILeafNode> _filter = Iterables.<ILeafNode>filter(nodes, ILeafNode.class);
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
  
  public String removeExtraCharacters(final String string) {
    String _trim = string.trim();
    String _replace = _trim.replace("\"", "\\\"");
    String _replaceAll = _replace.replaceAll(StepNameProvider.MULTILINE, " ");
    return _replaceAll;
  }
}
