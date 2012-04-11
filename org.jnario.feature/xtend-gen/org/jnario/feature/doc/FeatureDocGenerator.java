package org.jnario.feature.doc;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.core.xtend.RichString;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.ExampleTable;
import org.jnario.doc.AbstractDocGenerator;
import org.jnario.doc.HtmlFile;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepExpression;
import org.jnario.feature.naming.JavaNameProvider;
import org.jnario.feature.naming.StepNameProvider;
import org.jnario.util.Strings;

@SuppressWarnings("all")
public class FeatureDocGenerator extends AbstractDocGenerator {
  @Inject
  private JavaNameProvider _javaNameProvider;
  
  @Inject
  private StepNameProvider _stepNameProvider;
  
  public HtmlFile createHtmlFile(final XtendClass xtendClass) {
    HtmlFile _xblockexpression = null;
    {
      boolean _not = (!(xtendClass instanceof Feature));
      if (_not) {
        return HtmlFile.EMPTY_FILE;
      }
      final Feature feature = ((Feature) xtendClass);
      final Procedure1<HtmlFile> _function = new Procedure1<HtmlFile>() {
          public void apply(final HtmlFile it) {
            String _className = FeatureDocGenerator.this._javaNameProvider.getClassName(feature);
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
    String _markdown2Html = this.markdown2Html(_description);
    _builder.append(_markdown2Html, "");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    {
      EList<XtendMember> _members = feature.getMembers();
      for(final XtendMember member : _members) {
        CharSequence _generate = this.generate(member);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final Background bg) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<h3>Background</h3>");
    _builder.newLine();
    {
      EList<XtendMember> _steps = bg.getSteps();
      Iterable<Step> _filter = Iterables.<Step>filter(_steps, Step.class);
      for(final Step step : _filter) {
        CharSequence _generate = this.generate(step);
        _builder.append(_generate, "");
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
    EList<XtendMember> _steps = scenario.getSteps();
    Iterable<Step> _filter = Iterables.<Step>filter(_steps, Step.class);
    CharSequence _generate = this.generate(_filter);
    _builder.append(_generate, "");
    _builder.newLineIfNotEmpty();
    {
      EList<ExampleTable> _examples = scenario.getExamples();
      boolean _isEmpty = _examples.isEmpty();
      boolean _not = (!_isEmpty);
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
        EList<XtendMember> _and = step.getAnd();
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
    _builder.append("<p>");
    String _format = this.format(step);
    _builder.append(_format, "");
    _builder.append("</p>");
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
      String _plus = ("(" + _firstWord);
      String _plus_1 = (_plus + ")");
      String _replaceFirst = result.replaceFirst(_plus_1, "**$1**");
      result = _replaceFirst;
      String _replaceAll = result.replaceAll("\"(.*)\"", "<code>$1</code>");
      result = _replaceAll;
      String _markdown2Html = this.markdown2Html(result);
      _xblockexpression = (_markdown2Html);
    }
    return _xblockexpression;
  }
  
  public CharSequence addCodeBlock(final Step step) {
    CharSequence _xblockexpression = null;
    {
      StepExpression _stepExpression = step.getStepExpression();
      XBlockExpression _blockExpression = _stepExpression==null?(XBlockExpression)null:_stepExpression.getBlockExpression();
      final EList<XExpression> expressions = _blockExpression==null?(EList<XExpression>)null:_blockExpression.getExpressions();
      boolean _or = false;
      boolean _equals = Objects.equal(expressions, null);
      if (_equals) {
        _or = true;
      } else {
        boolean _isEmpty = expressions.isEmpty();
        _or = (_equals || _isEmpty);
      }
      if (_or) {
        return "";
      }
      final XExpression firstExpr = expressions.get(0);
      boolean _not = (!(firstExpr instanceof RichString));
      if (_not) {
        return "";
      }
      final RichString richString = ((RichString) firstExpr);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<pre>");
      String _serialize = this.serialize(richString);
      String _replace = _serialize.replace("\'\'\'", "");
      String _codeToHtml = this.codeToHtml(_replace);
      _builder.append(_codeToHtml, "");
      _builder.append("</pre>");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public CharSequence generate(final Object bg) {
    if (bg instanceof Background) {
      return _generate((Background)bg);
    } else if (bg instanceof Scenario) {
      return _generate((Scenario)bg);
    } else if (bg instanceof Step) {
      return _generate((Step)bg);
    } else if (bg instanceof Iterable) {
      return _generate((Iterable<Step>)bg);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(bg).toString());
    }
  }
}
