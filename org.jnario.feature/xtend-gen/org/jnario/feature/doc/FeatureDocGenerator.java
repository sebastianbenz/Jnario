package org.jnario.feature.doc;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.xtend.RichString;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.doc.AbstractDocGenerator;
import org.jnario.doc.HtmlFile;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepExpression;
import org.jnario.feature.naming.JavaNameProvider;
import org.jnario.feature.naming.StepNameProvider;

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
            String _removeKeywords = FeatureDocGenerator.this._stepNameProvider.removeKeywords(_name);
            it.title = _removeKeywords;
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
    _builder.append(_description, "");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    {
      Background _background = feature.getBackground();
      boolean _notEquals = (!Objects.equal(_background, null));
      if (_notEquals) {
        _builder.append("<h3>Background</h3>");
        _builder.newLine();
        {
          Background _background_1 = feature.getBackground();
          EList<XtendMember> _steps = _background_1.getSteps();
          Iterable<Step> _filter = Iterables.<Step>filter(_steps, Step.class);
          for(final Step step : _filter) {
            CharSequence _generate = this.generate(step);
            _builder.append(_generate, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      EList<XtendMember> _members = feature.getMembers();
      Iterable<Scenario> _filter_1 = Iterables.<Scenario>filter(_members, Scenario.class);
      for(final Scenario scenario : _filter_1) {
        CharSequence _generate_1 = this.generate(scenario);
        _builder.append(_generate_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generate(final Scenario scenario) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<h3>");
    String _name = scenario.getName();
    String _removeKeywords = this._stepNameProvider.removeKeywords(_name);
    _builder.append(_removeKeywords, "");
    _builder.append("</h3>");
    _builder.newLineIfNotEmpty();
    {
      EList<XtendMember> _steps = scenario.getSteps();
      Iterable<Step> _filter = Iterables.<Step>filter(_steps, Step.class);
      for(final Step step : _filter) {
        CharSequence _generate = this.generate(step);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generate(final Step step) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>");
    String _nameOf = this._stepNameProvider.nameOf(step);
    String _replaceAll = _nameOf.replaceAll("\"(.*)\"", "<code>$1</code>");
    _builder.append(_replaceAll, "");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    CharSequence _addCodeBlock = this.addCodeBlock(step);
    _builder.append(_addCodeBlock, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence addCodeBlock(final Step step) {
    StepExpression _stepExpression = step.getStepExpression();
    XBlockExpression _blockExpression = _stepExpression==null?(XBlockExpression)null:_stepExpression.getBlockExpression();
    final EList<XExpression> expressions = _blockExpression==null?(EList<XExpression>)null:_blockExpression.getExpressions();
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(expressions, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _isEmpty = expressions.isEmpty();
      _and = (_notEquals && _isEmpty);
    }
    if (_and) {
      return "";
    }
    XExpression _get = expressions.get(0);
    TreeIterator<EObject> _eAllContents = _get.eAllContents();
    final Iterator<RichString> richStrings = Iterators.<RichString>filter(_eAllContents, RichString.class);
    StringConcatenation _builder = new StringConcatenation();
    {
      List<RichString> _list = IteratorExtensions.<RichString>toList(richStrings);
      for(final RichString string : _list) {
        _builder.append("<pre>");
        String _serialize = this.serialize(string);
        _builder.append(_serialize, "");
        _builder.append("</pre>");
        _builder.newLineIfNotEmpty();
      }
    }
    final Procedure1<RichString> _function = new Procedure1<RichString>() {
        public void apply(final RichString it) {
        }
      };
    IteratorExtensions.<RichString>forEach(richStrings, _function);
    return null;
  }
}
