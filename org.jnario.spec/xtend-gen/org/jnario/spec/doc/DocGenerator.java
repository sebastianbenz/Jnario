package org.jnario.spec.doc;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.ExampleColumn;
import org.jnario.ExampleRow;
import org.jnario.ExampleTable;
import org.jnario.doc.AbstractDocGenerator;
import org.jnario.doc.Filter;
import org.jnario.doc.FilterExtractor;
import org.jnario.doc.FilteringResult;
import org.jnario.doc.HtmlFile;
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.Example;
import org.jnario.spec.spec.ExampleGroup;

@SuppressWarnings("all")
public class DocGenerator extends AbstractDocGenerator {
  @Inject
  private ExampleNameProvider _exampleNameProvider;
  
  @Inject
  private ExtendedJvmTypesBuilder _extendedJvmTypesBuilder;
  
  @Inject
  private FilterExtractor _filterExtractor;
  
  public HtmlFile createHtmlFile(final XtendClass xtendClass) {
    HtmlFile _xblockexpression = null;
    {
      boolean _not = (!(xtendClass instanceof ExampleGroup));
      if (_not) {
        return HtmlFile.EMPTY_FILE;
      }
      final ExampleGroup exampleGroup = ((ExampleGroup) xtendClass);
      final Procedure1<HtmlFile> _function = new Procedure1<HtmlFile>() {
          public void apply(final HtmlFile it) {
            String _javaClassName = DocGenerator.this._exampleNameProvider.toJavaClassName(exampleGroup);
            it.fileName = _javaClassName;
            String _asTitle = DocGenerator.this.asTitle(exampleGroup);
            it.title = _asTitle;
            CharSequence _generateContent = DocGenerator.this.generateContent(exampleGroup);
            it.content = _generateContent;
          }
        };
      HtmlFile _newHtmlFile = HtmlFile.newHtmlFile(_function);
      _xblockexpression = (_newHtmlFile);
    }
    return _xblockexpression;
  }
  
  private CharSequence generateContent(final ExampleGroup exampleGroup) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateDoc = this.generateDoc(exampleGroup);
    _builder.append(_generateDoc, "");
    _builder.newLineIfNotEmpty();
    StringConcatenation _generateMembers = this.generateMembers(exampleGroup, 1);
    _builder.append(_generateMembers, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private StringConcatenation generateMembers(final ExampleGroup exampleGroup, final int level) {
    StringConcatenation _stringConcatenation = new StringConcatenation();
    final StringConcatenation result = _stringConcatenation;
    boolean inList = false;
    EList<XtendMember> _members = exampleGroup.getMembers();
    final Function1<XtendMember,Boolean> _function = new Function1<XtendMember,Boolean>() {
        public Boolean apply(final XtendMember it) {
          boolean _or = false;
          boolean _or_1 = false;
          if ((it instanceof Example)) {
            _or_1 = true;
          } else {
            _or_1 = ((it instanceof Example) || (it instanceof ExampleGroup));
          }
          if (_or_1) {
            _or = true;
          } else {
            _or = (_or_1 || (it instanceof ExampleTable));
          }
          return Boolean.valueOf(_or);
        }
      };
    final Iterable<XtendMember> members = IterableExtensions.<XtendMember>filter(_members, _function);
    for (final XtendMember member : members) {
      {
        final boolean isExampleGroup = (member instanceof ExampleGroup);
        boolean _and = false;
        if (!inList) {
          _and = false;
        } else {
          boolean _not = (!isExampleGroup);
          _and = (inList && _not);
        }
        if (_and) {
          result.append("<li>");
          CharSequence _generate = this.generate(member, level);
          result.append(_generate);
          result.append("</li>");
        } else {
          boolean _and_1 = false;
          boolean _not_1 = (!inList);
          if (!_not_1) {
            _and_1 = false;
          } else {
            boolean _not_2 = (!isExampleGroup);
            _and_1 = (_not_1 && _not_2);
          }
          if (_and_1) {
            result.append("<ul>");
            result.append("<li>");
            CharSequence _generate_1 = this.generate(member, level);
            result.append(_generate_1);
            result.append("</li>");
            inList = true;
          } else {
            boolean _and_2 = false;
            if (!inList) {
              _and_2 = false;
            } else {
              _and_2 = (inList && isExampleGroup);
            }
            if (_and_2) {
              result.append("</ul>");
              CharSequence _generate_2 = this.generate(member, level);
              result.append(_generate_2);
              inList = false;
            } else {
              boolean _and_3 = false;
              boolean _not_3 = (!inList);
              if (!_not_3) {
                _and_3 = false;
              } else {
                _and_3 = (_not_3 && isExampleGroup);
              }
              if (_and_3) {
                CharSequence _generate_3 = this.generate(member, level);
                result.append(_generate_3);
              }
            }
          }
        }
      }
    }
    if (inList) {
      result.append("</ul>");
    }
    return result;
  }
  
  private CharSequence generateDoc(final EObject eObject) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _documentation = this._extendedJvmTypesBuilder.getDocumentation(eObject);
      boolean _notEquals = (!Objects.equal(_documentation, null));
      if (_notEquals) {
        String _documentation_1 = this._extendedJvmTypesBuilder.getDocumentation(eObject);
        String _markdown2Html = this.markdown2Html(_documentation_1);
        _builder.append(_markdown2Html, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final XtendMember member, final int level) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _generate(final Example example, final int level) {
    CharSequence _xblockexpression = null;
    {
      String docString = this._extendedJvmTypesBuilder.getDocumentation(example);
      List<Filter> filters = CollectionLiterals.<Filter>emptyList();
      boolean _notEquals = (!Objects.equal(docString, null));
      if (_notEquals) {
        final FilteringResult filterResult = this._filterExtractor.apply(docString);
        List<Filter> _filters = filterResult.getFilters();
        filters = _filters;
        String _string = filterResult.getString();
        docString = _string;
        String _markdown2Html = this.markdown2Html(docString);
        docString = _markdown2Html;
      }
      StringConcatenation _builder = new StringConcatenation();
      {
        String _name = example.getName();
        boolean _notEquals_1 = (!Objects.equal(_name, null));
        if (_notEquals_1) {
          _builder.append("<p ");
          String _name_1 = example.getName();
          String _generateId = this.generateId(_name_1);
          _builder.append(_generateId, "");
          _builder.append(">");
          _builder.newLineIfNotEmpty();
          _builder.append("<strong>");
          String _describe = this._exampleNameProvider.describe(example);
          String _convertToText = this.convertToText(_describe);
          _builder.append(_convertToText, "");
          _builder.append("</strong>");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("<p>");
          _builder.newLine();
        }
      }
      _builder.append(docString, "");
      _builder.newLineIfNotEmpty();
      {
        boolean _and = false;
        boolean _isPending = example.isPending();
        boolean _not = (!_isPending);
        if (!_not) {
          _and = false;
        } else {
          XExpression _body = example.getBody();
          boolean _notEquals_2 = (!Objects.equal(_body, null));
          _and = (_not && _notEquals_2);
        }
        if (_and) {
          CharSequence _codeBlock = this.toCodeBlock(example, filters);
          _builder.append(_codeBlock, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("</p>");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public CharSequence toCodeBlock(final Example example, final List<Filter> filters) {
    CharSequence _xblockexpression = null;
    {
      String prefix = "<pre class=\"prettyprint lang-spec\">";
      String _apply = this.apply(filters, prefix);
      prefix = _apply;
      XExpression _implementation = example.getImplementation();
      final String code = this.toXtendCode(_implementation, filters);
      int _length = code.length();
      boolean _equals = (_length == 0);
      if (_equals) {
        StringConcatenation _builder = new StringConcatenation();
        return _builder;
      }
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(prefix, "");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append(code, "");
      _builder_1.append("</pre>");
      _xblockexpression = (_builder_1);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generate(final ExampleTable table, final int level) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<h4 ");
    String _fieldName = this._exampleNameProvider.toFieldName(table);
    String _generateId = this.generateId(_fieldName);
    _builder.append(_generateId, "");
    _builder.append(">");
    String _fieldName_1 = this._exampleNameProvider.toFieldName(table);
    String _convertToTitle = this.convertToTitle(_fieldName_1);
    _builder.append(_convertToTitle, "");
    _builder.append("</h4>");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>");
    CharSequence _generateDoc = this.generateDoc(table);
    _builder.append(_generateDoc, "");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("<table class=\"table table-striped table-bordered table-condensed\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<thead>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<tr>");
    _builder.newLine();
    {
      EList<ExampleColumn> _columns = table.getColumns();
      for(final ExampleColumn headingCell : _columns) {
        _builder.append("\t\t");
        _builder.append("<th>");
        String _name = headingCell.getName();
        _builder.append(_name, "		");
        _builder.append("</th>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</thead>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<tbody>");
    _builder.newLine();
    {
      EList<ExampleRow> _rows = table.getRows();
      for(final ExampleRow row : _rows) {
        _builder.append("\t");
        _builder.append("<tr>");
        _builder.newLine();
        {
          EList<XExpression> _cells = row.getCells();
          for(final XExpression cell : _cells) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<td>");
            List<Filter> _emptyList = CollectionLiterals.<Filter>emptyList();
            String _xtendCode = this.toXtendCode(cell, _emptyList);
            _builder.append(_xtendCode, "		");
            _builder.append("</td>");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("</tr>");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("</tbody>");
    _builder.newLine();
    _builder.append("</table>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final ExampleGroup exampleGroup, final int level) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<");
    String _heading = this.heading(level);
    _builder.append(_heading, "");
    _builder.append(" ");
    String _name = exampleGroup.getName();
    String _generateId = this.generateId(_name);
    _builder.append(_generateId, "");
    _builder.append(">");
    String _asTitle = this.asTitle(exampleGroup);
    _builder.append(_asTitle, "");
    _builder.append("</");
    String _heading_1 = this.heading(level);
    _builder.append(_heading_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("<p>");
    CharSequence _generateDoc = this.generateDoc(exampleGroup);
    _builder.append(_generateDoc, "");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    int _plus = (level + 1);
    StringConcatenation _generateMembers = this.generateMembers(exampleGroup, _plus);
    _builder.append(_generateMembers, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String heading(final int level) {
    return "h3";
  }
  
  protected String _asTitle(final ExampleGroup exampleGroup) {
    String _describe = this._exampleNameProvider.describe(exampleGroup);
    String _convertToTitle = this.convertToTitle(_describe);
    return _convertToTitle;
  }
  
  protected String _asTitle(final Example example) {
    String _describe = this._exampleNameProvider.describe(example);
    String _convertToTitle = this.convertToTitle(_describe);
    return _convertToTitle;
  }
  
  public CharSequence generate(final XtendMember example, final int level) {
    if (example instanceof Example) {
      return _generate((Example)example, level);
    } else if (example instanceof ExampleTable) {
      return _generate((ExampleTable)example, level);
    } else if (example instanceof ExampleGroup) {
      return _generate((ExampleGroup)example, level);
    } else if (example != null) {
      return _generate(example, level);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(example, level).toString());
    }
  }
  
  public String asTitle(final XtendMember example) {
    if (example instanceof Example) {
      return _asTitle((Example)example);
    } else if (example instanceof ExampleGroup) {
      return _asTitle((ExampleGroup)example);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(example).toString());
    }
  }
}
