package org.jnario.feature.doc;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.ExampleTable;
import org.jnario.doc.AbstractDocGenerator;
import org.jnario.doc.HtmlFile;
import org.jnario.doc.WhiteSpaceNormalizer;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepExpression;
import org.jnario.feature.naming.FeatureClassNameProvider;
import org.jnario.feature.naming.StepNameProvider;
import org.jnario.util.Strings;

@SuppressWarnings("all")
public class FeatureDocGenerator extends AbstractDocGenerator {
  @Inject
  private FeatureClassNameProvider _featureClassNameProvider;
  
  @Inject
  private StepNameProvider _stepNameProvider;
  
  @Inject
  private WhiteSpaceNormalizer _whiteSpaceNormalizer;
  
  public HtmlFile createHtmlFile(final XtendClass xtendClass) {
    HtmlFile _xblockexpression = null;
    {
      boolean _not = BooleanExtensions.operator_not((xtendClass instanceof Feature));
      if (_not) {
        return HtmlFile.EMPTY_FILE;
      }
      final Feature feature = ((Feature) xtendClass);
      final Procedure1<HtmlFile> _function = new Procedure1<HtmlFile>() {
          public void apply(final HtmlFile it) {
            String _className = FeatureDocGenerator.this._featureClassNameProvider.getClassName(feature);
            it.fileName = _className;
            String _name = feature.getName();
            it.title = _name;
            CharSequence _generateContent = FeatureDocGenerator.this.generateContent(feature);
            it.content = _generateContent;
            String _root = FeatureDocGenerator.this.root(feature);
            it.rootFolder = _root;
          }
        };
      HtmlFile _newHtmlFile = HtmlFile.newHtmlFile(_function);
      _xblockexpression = (_newHtmlFile);
    }
    return _xblockexpression;
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
      boolean _notEquals = ObjectExtensions.operator_notEquals(_background, null);
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
    Iterable<Step> _filter = IterableExtensions.<Step>filter(_steps, Step.class);
    CharSequence _generate = this.generate(_filter);
    _builder.append(_generate, "");
    _builder.newLineIfNotEmpty();
    {
      EList<ExampleTable> _examples = scenario.getExamples();
      boolean _isEmpty = _examples.isEmpty();
      boolean _not = BooleanExtensions.operator_not(_isEmpty);
      if (_not) {
        _builder.append("<h4>Examples:</h4>");
        _builder.newLine();
        {
          EList<ExampleTable> _examples_1 = scenario.getExamples();
          for(final ExampleTable example : _examples_1) {
            _builder.append("<p>");
            CharSequence _generate_1 = this.generate(example);
            _builder.append(_generate_1, "");
            _builder.append("</p>");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
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
        Iterable<Step> _filter = IterableExtensions.<Step>filter(_and, Step.class);
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
    CharSequence _addCodeBlock = this.addCodeBlock(step);
    _builder.append(_addCodeBlock, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String format(final Step step) {
    String _xblockexpression = null;
    {
      String result = this._stepNameProvider.nameOf(step);
      String _firstWord = Strings.getFirstWord(result);
      String _plus = ObjectExtensions.operator_plus("(", _firstWord);
      String _plus_1 = ObjectExtensions.operator_plus(_plus, ")");
      String _replaceFirst = result.replaceFirst(_plus_1, "<strong>$1</strong>");
      result = _replaceFirst;
      String _plus_2 = ObjectExtensions.operator_plus(" ", result);
      String _replaceAll = _plus_2.replaceAll("\"(.*?)\"", "<code>$1</code>");
      result = _replaceAll;
      String _markdown2Html = this.markdown2Html(result);
      String _result = result = _markdown2Html;
      _xblockexpression = (_result);
    }
    return _xblockexpression;
  }
  
  public CharSequence addCodeBlock(final Step step) {
    StepExpression _stepExpression = step.getStepExpression();
    XBlockExpression _blockExpression = _stepExpression==null?(XBlockExpression)null:_stepExpression.getBlockExpression();
    final EList<XExpression> expressions = _blockExpression==null?(EList<XExpression>)null:_blockExpression.getExpressions();
    boolean _equals = ObjectExtensions.operator_equals(expressions, null);
    if (_equals) {
      return "";
    }
    Iterable<XStringLiteral> _filter = IterableExtensions.<XStringLiteral>filter(expressions, XStringLiteral.class);
    for (final XStringLiteral expr : _filter) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<pre>");
      String _value = expr.getValue();
      String _normalize = this._whiteSpaceNormalizer.normalize(_value);
      String _codeToHtml = this.codeToHtml(_normalize);
      _builder.append(_codeToHtml, "");
      _builder.append("</pre>");
      return _builder;
    }
    return null;
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
