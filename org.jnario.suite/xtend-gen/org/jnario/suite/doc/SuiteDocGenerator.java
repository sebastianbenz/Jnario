package org.jnario.suite.doc;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.Specification;
import org.jnario.doc.AbstractDocGenerator;
import org.jnario.doc.HtmlFile;
import org.jnario.suite.jvmmodel.SpecificationResolver;
import org.jnario.suite.jvmmodel.SuiteClassNameProvider;
import org.jnario.suite.suite.Heading;
import org.jnario.suite.suite.Reference;
import org.jnario.suite.suite.SpecReference;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuiteElement;

@SuppressWarnings("all")
public class SuiteDocGenerator extends AbstractDocGenerator {
  @Inject
  private SuiteClassNameProvider _suiteClassNameProvider;
  
  @Inject
  private SpecificationResolver _specificationResolver;
  
  public HtmlFile createHtmlFile(final XtendClass xtendClass) {
    HtmlFile _xblockexpression = null;
    {
      boolean _not = (!(xtendClass instanceof Suite));
      if (_not) {
        return HtmlFile.EMPTY_FILE;
      }
      final Suite suite = ((Suite) xtendClass);
      final Procedure1<HtmlFile> _function = new Procedure1<HtmlFile>() {
          public void apply(final HtmlFile it) {
            String _className = SuiteDocGenerator.this._suiteClassNameProvider.getClassName(suite);
            it.fileName = _className;
            String _describe = SuiteDocGenerator.this._suiteClassNameProvider.describe(suite);
            String _convertFromJavaString = Strings.convertFromJavaString(_describe, true);
            it.title = _convertFromJavaString;
            CharSequence _generateContent = SuiteDocGenerator.this.generateContent(suite);
            it.content = _generateContent;
            String _root = SuiteDocGenerator.this.root(suite);
            it.rootFolder = _root;
          }
        };
      HtmlFile _newHtmlFile = HtmlFile.newHtmlFile(_function);
      _xblockexpression = (_newHtmlFile);
    }
    return _xblockexpression;
  }
  
  public CharSequence generateContent(final Suite suite) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = suite.getName();
    String _trimFirstLine = org.jnario.util.Strings.trimFirstLine(_name);
    String _markdown2Html = this.markdown2Html(_trimFirstLine);
    _builder.append(_markdown2Html, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<ul>");
    _builder.newLine();
    {
      EList<SuiteElement> _elements = suite.getElements();
      for(final SuiteElement spec : _elements) {
        List<Specification> _resolveSpecs = this._specificationResolver.resolveSpecs(spec);
        CharSequence _generate = this.generate(spec, _resolveSpecs);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final Heading ref, final List<Specification> specs) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("</ul>\t");
    _builder.newLine();
    String _name = ref.getName();
    String _markdown2Html = this.markdown2Html(_name);
    _builder.append(_markdown2Html, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<ul>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final Reference ref, final List<Specification> specs) {
    StringConcatenation _builder = new StringConcatenation();
    {
      final Function1<Specification,Boolean> _function = new Function1<Specification,Boolean>() {
          public Boolean apply(final Specification it) {
            String _name = it.getName();
            boolean _notEquals = (!Objects.equal(_name, null));
            return Boolean.valueOf(_notEquals);
          }
        };
      Iterable<Specification> _filter = IterableExtensions.<Specification>filter(specs, _function);
      for(final Specification spec : _filter) {
        _builder.append("<li><a href=\"");
        String _linkTo = this.linkTo(ref, spec);
        _builder.append(_linkTo, "");
        _builder.append("\">");
        String _name = spec.getName();
        _builder.append(_name, "");
        _builder.append("</a> ");
        String _text = this.text(ref);
        _builder.append(_text, "");
        _builder.append("</li>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public String linkTo(final EObject context, final Specification spec) {
    String _root = this.root(context);
    String _packageName = spec.getPackageName();
    String _replace = _packageName.replace(".", "/");
    String _plus = (_root + _replace);
    String _plus_1 = (_plus + "/");
    String _className = this._suiteClassNameProvider.getClassName(spec);
    String _plus_2 = (_plus_1 + _className);
    String _plus_3 = (_plus_2 + ".html");
    return _plus_3;
  }
  
  public String text(final Reference ref) {
    boolean _matched = false;
    if (!_matched) {
      if (ref instanceof SpecReference) {
        final SpecReference _specReference = (SpecReference)ref;
        _matched=true;
        return _specReference.getText();
      }
    }
    return "";
  }
  
  public CharSequence generate(final EObject ref, final List<Specification> specs) {
    if (ref instanceof Heading) {
      return _generate((Heading)ref, specs);
    } else if (ref instanceof Reference) {
      return _generate((Reference)ref, specs);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ref, specs).toString());
    }
  }
}
