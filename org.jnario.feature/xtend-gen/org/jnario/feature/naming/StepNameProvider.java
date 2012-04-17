package org.jnario.feature.naming;

import com.google.common.base.Objects;
import com.google.common.base.Strings;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.feature.feature.FeaturePackage;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepReference;
import org.jnario.util.Nodes;

/**
 * @author Sebastian Benz - Initial contribution and API
 * @author Birgit Engelmann
 */
@SuppressWarnings("all")
public class StepNameProvider {
  private static String MULTILINE = "\\\\( |\t)*\r?\n?( |\t)*";
  
  public String nameOf(final Step step) {
    String _xblockexpression = null;
    {
      boolean _equals = Objects.equal(step, null);
      if (_equals) {
        return "";
      }
      String _xifexpression = null;
      if ((step instanceof StepReference)) {
        String _nameOf = this.nameOf(((StepReference) step));
        _xifexpression = _nameOf;
      } else {
        String _name = step.getName();
        String _removeExtraCharacters = _name==null?(String)null:this.removeExtraCharacters(new Function0<String>() {
          public String apply() {
            String _name = step.getName();
            return _name;
          }
        }.apply());
        _xifexpression = _removeExtraCharacters;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public String nameOf(final StepReference ref) {
    Step _reference = ref.getReference();
    boolean _equals = Objects.equal(_reference, null);
    if (_equals) {
      return null;
    }
    EReference _stepReference_Reference = FeaturePackage.eINSTANCE.getStepReference_Reference();
    return Nodes.textForFeature(ref, _stepReference_Reference);
  }
  
  public String removeExtraCharacters(final String string) {
    String _trim = string.trim();
    String _replace = _trim.replace("\"", "\\\"");
    return _replace.replaceAll(StepNameProvider.MULTILINE, "");
  }
  
  public String removeKeywords(final String name) {
    boolean _isNullOrEmpty = Strings.isNullOrEmpty(name);
    if (_isNullOrEmpty) {
      return "";
    }
    int index = name.indexOf(" ");
    int _minus = (-1);
    boolean _equals = (index == _minus);
    if (_equals) {
      return "";
    }
    int _plus = (index + 1);
    return name.substring(_plus);
  }
  
  public String removeArguments(final String name) {
    return name.replaceAll("\"[^\"]*\"", "\"\"");
  }
  
  public String removeKeywordsAndArguments(final String name) {
    String _removeKeywords = this.removeKeywords(name);
    String _removeArguments = this.removeArguments(_removeKeywords);
    return this.removeExtraCharacters(_removeArguments);
  }
}
