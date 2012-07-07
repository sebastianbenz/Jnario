package org.jnario.suite.doc;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.Specification;
import org.jnario.doc.AbstractDocGenerator;
import org.jnario.doc.HtmlFile;
import org.jnario.doc.HtmlFileBuilder;
import org.jnario.suite.jvmmodel.SpecResolver;
import org.jnario.suite.jvmmodel.SuiteClassNameProvider;
import org.jnario.suite.suite.Reference;
import org.jnario.suite.suite.SpecReference;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuiteFile;

@SuppressWarnings("all")
public class SuiteDocGenerator extends AbstractDocGenerator {
  @Inject
  private SuiteClassNameProvider _suiteClassNameProvider;
  
  @Inject
  private SpecResolver _specResolver;
  
  @Inject
  private HtmlFileBuilder _htmlFileBuilder;
  
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    EList<EObject> _contents = input.getContents();
    Iterable<SuiteFile> _filter = Iterables.<SuiteFile>filter(_contents, SuiteFile.class);
    final Procedure1<SuiteFile> _function = new Procedure1<SuiteFile>() {
        public void apply(final SuiteFile it) {
          final HtmlFile htmlFile = SuiteDocGenerator.this.createHtmlFile(it);
          EList<XtendClass> _xtendClasses = it.getXtendClasses();
          XtendClass _head = IterableExtensions.<XtendClass>head(_xtendClasses);
          SuiteDocGenerator.this._htmlFileBuilder.generate(_head, fsa, htmlFile);
        }
      };
    IterableExtensions.<SuiteFile>forEach(_filter, _function);
  }
  
  public HtmlFile createHtmlFile(final SuiteFile file) {
    HtmlFile _xblockexpression = null;
    {
      EList<XtendClass> _xtendClasses = file.getXtendClasses();
      final Iterable<Suite> suites = Iterables.<Suite>filter(_xtendClasses, Suite.class);
      boolean _isEmpty = IterableExtensions.isEmpty(suites);
      if (_isEmpty) {
        return HtmlFile.EMPTY_FILE;
      }
      final Procedure1<HtmlFile> _function = new Procedure1<HtmlFile>() {
          public void apply(final HtmlFile it) {
            Suite _head = IterableExtensions.<Suite>head(suites);
            String _className = SuiteDocGenerator.this._suiteClassNameProvider.getClassName(_head);
            it.setName(_className);
            Suite _head_1 = IterableExtensions.<Suite>head(suites);
            String _describe = SuiteDocGenerator.this._suiteClassNameProvider.describe(_head_1);
            String _convertFromJavaString = Strings.convertFromJavaString(_describe, true);
            it.setTitle(_convertFromJavaString);
            CharSequence _generateContent = SuiteDocGenerator.this.generateContent(suites);
            it.setContent(_generateContent);
            Suite _head_2 = IterableExtensions.<Suite>head(suites);
            String _root = SuiteDocGenerator.this.root(_head_2);
            it.setRootFolder(_root);
          }
        };
      HtmlFile _newHtmlFile = HtmlFile.newHtmlFile(_function);
      _xblockexpression = (_newHtmlFile);
    }
    return _xblockexpression;
  }
  
  public HtmlFile createHtmlFile(final XtendClass file) {
    HtmlFile _xblockexpression = null;
    {
      final Suite suite = ((Suite) file);
      final Procedure1<HtmlFile> _function = new Procedure1<HtmlFile>() {
          public void apply(final HtmlFile it) {
            String _className = SuiteDocGenerator.this._suiteClassNameProvider.getClassName(suite);
            it.setName(_className);
            String _describe = SuiteDocGenerator.this._suiteClassNameProvider.describe(suite);
            String _convertFromJavaString = Strings.convertFromJavaString(_describe, true);
            it.setTitle(_convertFromJavaString);
            CharSequence _generateContent = SuiteDocGenerator.this.generateContent(suite);
            it.setContent(_generateContent);
            String _root = SuiteDocGenerator.this.root(suite);
            it.setRootFolder(_root);
          }
        };
      HtmlFile _newHtmlFile = HtmlFile.newHtmlFile(_function);
      _xblockexpression = (_newHtmlFile);
    }
    return _xblockexpression;
  }
  
  public CharSequence generateContent(final Iterable<Suite> suites) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Suite suite : suites) {
        {
          Suite _head = IterableExtensions.<Suite>head(suites);
          boolean _equals = Objects.equal(suite, _head);
          boolean _not = (!_equals);
          if (_not) {
            String _name = suite.getName();
            String _firstLine = org.jnario.util.Strings.firstLine(_name);
            String _markdown2Html = this.markdown2Html(_firstLine);
            _builder.append(_markdown2Html, "");
            _builder.newLineIfNotEmpty();
          }
        }
        CharSequence _generateContent = this.generateContent(suite);
        _builder.append(_generateContent, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateContent(final Suite suite) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<span");
    String _name = suite.getName();
    String _replace = _name.replace("#", "");
    String _id = this.id(_replace);
    _builder.append(_id, "");
    _builder.append(">");
    String _name_1 = suite.getName();
    String _trimFirstLine = org.jnario.util.Strings.trimFirstLine(_name_1);
    String _markdown2Html = this.markdown2Html(_trimFirstLine);
    _builder.append(_markdown2Html, "");
    _builder.append("</span>");
    _builder.newLineIfNotEmpty();
    {
      EList<Reference> _elements = suite.getElements();
      boolean _isEmpty = _elements.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("<ul>");
        _builder.newLine();
        {
          EList<Reference> _elements_1 = suite.getElements();
          for(final Reference spec : _elements_1) {
            CharSequence _generate = this.generate(spec);
            _builder.append(_generate, "");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("</ul>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence generate(final Reference ref) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<Specification> _resolveSpecs = this._specResolver.resolveSpecs(ref);
      for(final Specification spec : _resolveSpecs) {
        _builder.append("<li><a href=\"");
        String _linkTo = this.linkTo(ref, spec);
        _builder.append(_linkTo, "");
        _builder.append("\">");
        String _describe = this._suiteClassNameProvider.describe(spec);
        _builder.append(_describe, "");
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
    String _htmlFileName = this.htmlFileName(_className);
    String _plus_2 = (_plus_1 + _htmlFileName);
    return _plus_2;
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
}
