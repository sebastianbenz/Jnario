/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.doc;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendTypeDeclaration;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.jnario.Specification;
import org.jnario.doc.AbstractDocGenerator;
import org.jnario.doc.HtmlFile;
import org.jnario.doc.HtmlFileBuilder;
import org.jnario.report.Executable2ResultMapping;
import org.jnario.suite.jvmmodel.SpecResolver;
import org.jnario.suite.jvmmodel.SuiteClassNameProvider;
import org.jnario.suite.suite.Reference;
import org.jnario.suite.suite.SpecReference;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuiteFile;
import org.jnario.util.Strings;
import org.jnario.util.XtendTypes;

@SuppressWarnings("all")
public class SuiteDocGenerator extends AbstractDocGenerator {
  @Inject
  @Extension
  private SuiteClassNameProvider _suiteClassNameProvider;
  
  @Inject
  @Extension
  private SpecResolver _specResolver;
  
  @Inject
  @Extension
  private HtmlFileBuilder _htmlFileBuilder;
  
  public void doGenerate(final Resource input, final IFileSystemAccess fsa, final Executable2ResultMapping spec2ResultMapping) {
    this.initResultMapping(spec2ResultMapping);
    EList<EObject> _contents = input.getContents();
    Iterable<SuiteFile> _filter = Iterables.<SuiteFile>filter(_contents, SuiteFile.class);
    final Procedure1<SuiteFile> _function = new Procedure1<SuiteFile>() {
      public void apply(final SuiteFile it) {
        final HtmlFile htmlFile = SuiteDocGenerator.this.createHtmlFile(it);
        EList<XtendTypeDeclaration> _xtendTypes = it.getXtendTypes();
        XtendTypeDeclaration _head = IterableExtensions.<XtendTypeDeclaration>head(_xtendTypes);
        SuiteDocGenerator.this._htmlFileBuilder.generate(_head, fsa, htmlFile);
      }
    };
    IterableExtensions.<SuiteFile>forEach(_filter, _function);
  }
  
  public HtmlFile createHtmlFile(final SuiteFile file) {
    HtmlFile _xblockexpression = null;
    {
      EList<XtendTypeDeclaration> _xtendTypes = file.getXtendTypes();
      final Iterable<Suite> suites = Iterables.<Suite>filter(_xtendTypes, Suite.class);
      boolean _isEmpty = IterableExtensions.isEmpty(suites);
      if (_isEmpty) {
        return HtmlFile.EMPTY_FILE;
      }
      final Suite rootSuite = IterableExtensions.<Suite>head(suites);
      final Procedure1<HtmlFile> _function = new Procedure1<HtmlFile>() {
        public void apply(final HtmlFile it) {
          String _javaClassName = SuiteDocGenerator.this._suiteClassNameProvider.toJavaClassName(rootSuite);
          it.setName(_javaClassName);
          String _describe = SuiteDocGenerator.this._suiteClassNameProvider.describe(rootSuite);
          String _decode = SuiteDocGenerator.this.decode(_describe);
          it.setTitle(_decode);
          CharSequence _generateContent = SuiteDocGenerator.this.generateContent(suites);
          it.setContent(_generateContent);
          String _root = SuiteDocGenerator.this.root(rootSuite);
          it.setRootFolder(_root);
          CharSequence _pre = SuiteDocGenerator.this.pre(file, "lang-suite");
          it.setSourceCode(_pre);
          String _fileName = SuiteDocGenerator.this.fileName(file);
          it.setFileName(_fileName);
          String _executionStateClass = SuiteDocGenerator.this.executionStateClass(rootSuite);
          it.setExecutionStatus(_executionStateClass);
        }
      };
      _xblockexpression = (HtmlFile.newHtmlFile(_function));
    }
    return _xblockexpression;
  }
  
  public HtmlFile createHtmlFile(final XtendClass file) {
    HtmlFile _xblockexpression = null;
    {
      final Suite suite = ((Suite) file);
      final Procedure1<HtmlFile> _function = new Procedure1<HtmlFile>() {
        public void apply(final HtmlFile it) {
          String _javaClassName = SuiteDocGenerator.this._suiteClassNameProvider.toJavaClassName(suite);
          it.setName(_javaClassName);
          String _describe = SuiteDocGenerator.this._suiteClassNameProvider.describe(suite);
          String _decode = SuiteDocGenerator.this.decode(_describe);
          it.setTitle(_decode);
          CharSequence _generateContent = SuiteDocGenerator.this.generateContent(suite);
          it.setContent(_generateContent);
          String _root = SuiteDocGenerator.this.root(suite);
          it.setRootFolder(_root);
          CharSequence _pre = SuiteDocGenerator.this.pre(file, "lang-suite");
          it.setSourceCode(_pre);
          String _fileName = SuiteDocGenerator.this.fileName(file);
          it.setFileName(_fileName);
          String _executionStateClass = SuiteDocGenerator.this.executionStateClass(suite);
          it.setExecutionStatus(_executionStateClass);
        }
      };
      _xblockexpression = (HtmlFile.newHtmlFile(_function));
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
            CharSequence _title = this.title(suite);
            _builder.append(_title, "");
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
  
  public CharSequence title(final Suite suite) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = suite.getName();
    final String title = Strings.firstLine(_name);
    _builder.newLineIfNotEmpty();
    _builder.append("<span");
    String _id = this.id(title);
    _builder.append(_id, "");
    _builder.append(" class=\"suite ");
    String _executionStateClass = this.executionStateClass(suite);
    _builder.append(_executionStateClass, "");
    _builder.append("\">");
    String _markdown2Html = this.markdown2Html(title);
    _builder.append(_markdown2Html, "");
    _builder.append("</span>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String desc(final Suite suite) {
    String _name = suite.getName();
    String _trimFirstLine = Strings.trimFirstLine(_name);
    return this.markdown2Html(_trimFirstLine);
  }
  
  public CharSequence generateContent(final Suite suite) {
    StringConcatenation _builder = new StringConcatenation();
    String _desc = this.desc(suite);
    _builder.append(_desc, "");
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
            _builder.append("\t");
            CharSequence _generate = this.generate(spec);
            _builder.append(_generate, "\t");
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
        _builder.append("<li><a class=\"specref ");
        String _executionStateClass = this.executionStateClass(spec);
        _builder.append(_executionStateClass, "");
        _builder.append("\" href=\"");
        String _linkTo = this.linkTo(ref, spec);
        _builder.append(_linkTo, "");
        _builder.append("\">");
        String _describe = this._suiteClassNameProvider.describe(spec);
        _builder.append(_describe, "");
        _builder.append("</a>");
        String _executionState = this.executionState(spec);
        _builder.append(_executionState, "");
        String _text = this.text(ref);
        _builder.append(_text, "");
        _builder.append("</li>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public String linkTo(final EObject context, final Specification spec) {
    String _xblockexpression = null;
    {
      String _xifexpression = null;
      String _packageName = XtendTypes.packageName(spec);
      boolean _equals = Objects.equal(_packageName, null);
      if (_equals) {
        _xifexpression = "";
      } else {
        String _packageName_1 = XtendTypes.packageName(spec);
        _xifexpression = _packageName_1.replace(".", "/");
      }
      final String path = _xifexpression;
      String _root = this.root(context);
      String _plus = (_root + path);
      String _plus_1 = (_plus + "/");
      String _javaClassName = this._suiteClassNameProvider.toJavaClassName(spec);
      String _htmlFileName = this.htmlFileName(_javaClassName);
      _xblockexpression = ((_plus_1 + _htmlFileName));
    }
    return _xblockexpression;
  }
  
  public String text(final Reference ref) {
    boolean _matched = false;
    if (!_matched) {
      if (ref instanceof SpecReference) {
        String _text = ((SpecReference)ref).getText();
        String _trim = null;
        if (_text!=null) {
          _trim=_text.trim();
        }
        boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_trim);
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
          _matched=true;
          String _text_1 = ((SpecReference)ref).getText();
          String result = this.markdown2Html(_text_1);
          int _length = result.length();
          int _minus = (_length - 4);
          String _substring = result.substring(3, _minus);
          result = _substring;
          return (": " + result);
        }
      }
    }
    return "";
  }
}
