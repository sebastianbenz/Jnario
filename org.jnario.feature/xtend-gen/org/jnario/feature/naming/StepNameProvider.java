package org.jnario.feature.naming;

import com.google.common.base.Objects;
import java.util.regex.Matcher;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeaturePackage;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepReference;
import org.jnario.feature.jvmmodel.StepArgumentsProvider;
import org.jnario.util.Nodes;
import org.jnario.util.Strings;

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
    String _xifexpression = null;
    Step _reference = ref.getReference();
    boolean _equals = Objects.equal(_reference, null);
    if (_equals) {
      _xifexpression = null;
    } else {
      EReference _stepReference_Reference = FeaturePackage.eINSTANCE.getStepReference_Reference();
      String _textForFeature = Nodes.textForFeature(ref, _stepReference_Reference);
      _xifexpression = _textForFeature;
    }
    return _xifexpression;
  }
  
  public String getMethodName(final Step step) {
    String originalName = this.nameOf(step);
    final int index = originalName.lastIndexOf("\n");
    int _minus = (-1);
    boolean _notEquals = (index != _minus);
    if (_notEquals) {
      int _minus_1 = (index - 1);
      String _substring = originalName.substring(0, _minus_1);
      String _trim = _substring.trim();
      originalName = _trim;
    }
    String _convertToCamelCase = Strings.convertToCamelCase(originalName);
    return org.eclipse.xtext.util.Strings.toFirstLower(_convertToCamelCase);
  }
  
  public String describe(final Feature feature) {
    String _name = feature.getName();
    String _makeJunitConform = Strings.makeJunitConform(_name);
    return _makeJunitConform;
  }
  
  public String describe(final Scenario scenario) {
    String _name = scenario.getName();
    String _makeJunitConform = Strings.makeJunitConform(_name);
    return _makeJunitConform;
  }
  
  public String describe(final Step step) {
    String name = this.nameOf(step);
    final int index = Strings.indexOfNewLine(name);
    int _minus = (-1);
    boolean _notEquals = (index != _minus);
    if (_notEquals) {
      String _substring = name.substring(0, index);
      name = _substring;
    }
    return Strings.makeJunitConform(name);
  }
  
  private String removeExtraCharacters(final String string) {
    String _trim = string.trim();
    String _replace = _trim.replace("\"", "\\\"");
    return _replace.replaceAll(StepNameProvider.MULTILINE, "");
  }
  
  public String removeKeywords(final String name) {
    boolean _isNullOrEmpty = com.google.common.base.Strings.isNullOrEmpty(name);
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
  
  private String removeArguments(final String name) {
    Matcher _matcher = StepArgumentsProvider.ARG_PATTERN.matcher(name);
    return _matcher.replaceAll("\"\"");
  }
  
  public String removeKeywordsAndArguments(final String name) {
    String _removeKeywords = this.removeKeywords(name);
    String _removeArguments = this.removeArguments(_removeKeywords);
    return this.removeExtraCharacters(_removeArguments);
  }
}
