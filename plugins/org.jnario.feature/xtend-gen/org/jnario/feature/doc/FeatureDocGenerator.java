package org.jnario.feature.doc;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.doc.AbstractDocGenerator;
import org.jnario.doc.HtmlFile;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.naming.FeatureClassNameProvider;
import org.jnario.feature.naming.StepNameProvider;
import org.jnario.util.Strings;

@SuppressWarnings("all")
public class FeatureDocGenerator extends AbstractDocGenerator {
  @Inject
  private FeatureClassNameProvider _featureClassNameProvider;
  
  @Inject
  private StepNameProvider _stepNameProvider;
  
  public HtmlFile createHtmlFile(final XtendClass xtendClass) {
    boolean _not = (!(xtendClass instanceof Feature));
    if (_not) {
      return HtmlFile.EMPTY_FILE;
    }
    final Feature feature = ((Feature) xtendClass);
    final Procedure1<HtmlFile> _function = new Procedure1<HtmlFile>() {
        public void apply(final HtmlFile it) {
          String _className = FeatureDocGenerator.this._featureClassNameProvider.getClassName(feature);
          it.setName(_className);
          String _name = feature.getName();
          it.setTitle(_name);
          CharSequence _generateContent = FeatureDocGenerator.this.generateContent(feature);
          it.setContent(_generateContent);
          String _root = FeatureDocGenerator.this.root(feature);
          it.setRootFolder(_root);
        }
      };
    return HtmlFile.newHtmlFile(_function);
  }
  
  public CharSequence generateContent(final Feature feature) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>");
    String _description = feature.getDescription();
    String _markdown2Html = _description==null?(String)null:this.markdown2Html(_description);
    _builder.append(_markdown2Html, "");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    {
      Background _background = feature.getBackground();
      boolean _notEquals = (!Objects.equal(_background, null));
      if (_notEquals) {
        Background _background_1 = feature.getBackground();
        CharSequence _generate = this.generate(_background_1);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Scenario> _scenarios = feature.getScenarios();
      for(final Scenario scenario : _scenarios) {
        CharSequence _generate_1 = this.generate(scenario);
        _builder.append(_generate_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<XtendMember> _members = feature.getMembers();
      for(final XtendMember member : _members) {
        CharSequence _generate_2 = this.generate(member);
        _builder.append(_generate_2, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final Scenario scenario) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<h3>");
    String _name = scenario.getName();
    _builder.append(_name, "");
    _builder.append("</h3>");
    _builder.newLineIfNotEmpty();
    EList<Step> _steps = scenario.getSteps();
    Iterable<Step> _filter = Iterables.<Step>filter(_steps, Step.class);
    CharSequence _generate = this.generate(_filter);
    _builder.append(_generate, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generate(final Iterable<Step> steps) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul>");
    _builder.newLine();
    {
      for(final Step step : steps) {
        _builder.append("<li>");
        CharSequence _generate = this.generate(step);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
        EList<Step> _and = step.getAnd();
        Iterable<Step> _filter = Iterables.<Step>filter(_and, Step.class);
        CharSequence _generate_1 = this.generate(_filter);
        _builder.append(_generate_1, "");
        _builder.append("</li>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final Step step) {
    StringConcatenation _builder = new StringConcatenation();
    String _format = this.format(step);
    _builder.append(_format, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private String format(final Step step) {
    String _xblockexpression = null;
    {
      String result = this._stepNameProvider.nameOf(step);
      String codeBlock = "";
      final int index = result.indexOf("\n");
      int _minus = (-1);
      boolean _notEquals = (index != _minus);
      if (_notEquals) {
        String _substring = result.substring(index);
        codeBlock = _substring;
        String _substring_1 = result.substring(0, index);
        result = _substring_1;
      }
      String _firstWord = Strings.getFirstWord(result);
      String _plus = ("(" + _firstWord);
      String _plus_1 = (_plus + ")");
      String _replaceFirst = result.replaceFirst(_plus_1, "<strong>$1</strong>");
      result = _replaceFirst;
      String _plus_2 = (" " + result);
      String _replaceAll = _plus_2.replaceAll("\"(.*?)\"", "<code>$1</code>");
      result = _replaceAll;
      String _markdown2Html = this.markdown2Html(result);
      result = _markdown2Html;
      CharSequence _addCodeBlock = this.addCodeBlock(codeBlock);
      String _plus_3 = (result + _addCodeBlock);
      _xblockexpression = (_plus_3);
    }
    return _xblockexpression;
  }
  
  private CharSequence addCodeBlock(final String code) {
    int _length = code.length();
    boolean _equals = (_length == 0);
    if (_equals) {
      return "";
    }
    String codeBlock = code.trim();
    int _length_1 = codeBlock.length();
    int _minus = (_length_1 - 3);
    String _substring = codeBlock.substring(3, _minus);
    codeBlock = _substring;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<pre>");
    this.codeToHtml(codeBlock);
    _builder.append("</pre>");
    return _builder;
  }
  
  public CharSequence generate(final Object scenario) {
    if (scenario instanceof Scenario) {
      return _generate((Scenario)scenario);
    } else if (scenario instanceof Step) {
      return _generate((Step)scenario);
    } else if (scenario instanceof Iterable) {
      return _generate((Iterable<Step>)scenario);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(scenario).toString());
    }
  }
}
