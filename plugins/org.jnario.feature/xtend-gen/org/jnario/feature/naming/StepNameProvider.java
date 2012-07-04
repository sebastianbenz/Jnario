package org.jnario.feature.naming;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.regex.Matcher;
import org.eclipse.emf.ecore.EReference;
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
  protected String _nameOf(final Step step) {
    String _xblockexpression = null;
    {
      boolean _equals = Objects.equal(step, null);
      if (_equals) {
        return "";
      }
      String _name = step.getName();
      String _trim = _name==null?(String)null:_name.trim();
      _xblockexpression = (_trim);
    }
    return _xblockexpression;
  }
  
  protected String _nameOf(final StepReference ref) {
    String _xifexpression = null;
    boolean _or = false;
    boolean _equals = Objects.equal(ref, null);
    if (_equals) {
      _or = true;
    } else {
      Step _reference = ref.getReference();
      boolean _equals_1 = Objects.equal(_reference, null);
      _or = (_equals || _equals_1);
    }
    if (_or) {
      _xifexpression = null;
    } else {
      EReference _stepReference_Reference = FeaturePackage.eINSTANCE.getStepReference_Reference();
      String _textForFeature = Nodes.textForFeature(ref, _stepReference_Reference);
      _xifexpression = _textForFeature;
    }
    return _xifexpression;
  }
  
  public String getMethodName(final Step step) {
    String _nameOf = this.nameOf(step);
    String _firstLine = Strings.firstLine(_nameOf);
    String originalName = _firstLine.trim();
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
    String _firstLine = Strings.firstLine(name);
    return Strings.makeJunitConform(_firstLine);
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
    String _firstLine = Strings.firstLine(name);
    String _removeKeywords = this.removeKeywords(_firstLine);
    return this.removeArguments(_removeKeywords);
  }
  
  public String nameOf(final Step ref) {
    if (ref instanceof StepReference) {
      return _nameOf((StepReference)ref);
    } else if (ref != null) {
      return _nameOf(ref);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ref).toString());
    }
  }
}
