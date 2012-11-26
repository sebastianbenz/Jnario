package org.jnario.spec.doc;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtend.core.xtend.XtendPackage.Literals;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.ExampleTable;
import org.jnario.doc.AbstractDocGenerator;
import org.jnario.doc.Filter;
import org.jnario.doc.FilterExtractor;
import org.jnario.doc.FilteringResult;
import org.jnario.doc.HtmlFile;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.Example;
import org.jnario.spec.spec.ExampleGroup;

@SuppressWarnings("all")
public class SpecDocGenerator extends AbstractDocGenerator {
  @Inject
  private ExampleNameProvider _exampleNameProvider;
  
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
            String _javaClassName = SpecDocGenerator.this._exampleNameProvider.toJavaClassName(exampleGroup);
            it.setName(_javaClassName);
            String _asTitle = SpecDocGenerator.this.asTitle(exampleGroup);
            it.setTitle(_asTitle);
            CharSequence _generateContent = SpecDocGenerator.this.generateContent(exampleGroup);
            it.setContent(_generateContent);
            String _root = SpecDocGenerator.this.root(exampleGroup);
            it.setRootFolder(_root);
            EObject _eContainer = xtendClass.eContainer();
            CharSequence _pre = SpecDocGenerator.this.pre(_eContainer, "lang-spec");
            it.setSourceCode(_pre);
            String _fileName = SpecDocGenerator.this.fileName(xtendClass);
            it.setFileName(_fileName);
            String _executionStateClass = SpecDocGenerator.this.executionStateClass(exampleGroup);
            it.setExecutionStatus(_executionStateClass);
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
      String _documentation = this.documentation(eObject);
      boolean _notEquals = (!Objects.equal(_documentation, null));
      if (_notEquals) {
        String _documentation_1 = this.documentation(eObject);
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
      String docString = this.documentation(example);
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
          _builder.append("<p");
          String _name_1 = example.getName();
          String _id = this.id(_name_1);
          _builder.append(_id, "");
          _builder.append(" class=\"example ");
          String _executionStateClass = this.executionStateClass(example);
          _builder.append(_executionStateClass, "");
          _builder.append("\"><strong>");
          String _describe = this._exampleNameProvider.describe(example);
          String _decode = this.decode(_describe);
          _builder.append(_decode, "");
          _builder.append("</strong></p>");
          _builder.newLineIfNotEmpty();
        } else {
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
          boolean _eIsSet = example.eIsSet(Literals.XTEND_FUNCTION__EXPRESSION);
          _and = (_not && _eIsSet);
        }
        if (_and) {
          String _codeBlock = this.toCodeBlock(example, filters);
          _builder.append(_codeBlock, "");
          _builder.newLineIfNotEmpty();
          String _errorMessage = this.errorMessage(example);
          _builder.append(_errorMessage, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public String toCodeBlock(final Example example, final List<Filter> filters) {
    String _xblockexpression = null;
    {
      String prefix = "<pre class=\"prettyprint lang-spec linenums\">";
      String _apply = this.apply(filters, prefix);
      prefix = _apply;
      XExpression _expression = example.getExpression();
      final String code = this.serialize(_expression, filters);
      int _length = code.length();
      boolean _equals = (_length == 0);
      if (_equals) {
        return "";
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(prefix, "");
      _builder.newLineIfNotEmpty();
      _builder.append(code, "");
      _builder.append("</pre>");
      _xblockexpression = (_builder.toString());
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generate(final ExampleTable table, final int level) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p");
    String _fieldName = this._exampleNameProvider.toFieldName(table);
    String _id = this.id(_fieldName);
    _builder.append(_id, "");
    _builder.append("><strong>");
    String _fieldName_1 = this._exampleNameProvider.toFieldName(table);
    String _title = this.toTitle(_fieldName_1);
    _builder.append(_title, "");
    _builder.append("</strong></p>");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDoc = this.generateDoc(table);
    _builder.append(_generateDoc, "");
    _builder.newLineIfNotEmpty();
    CharSequence _generate = super.generate(table);
    _builder.append(_generate, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generate(final ExampleGroup exampleGroup, final int level) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _greaterThan = (level > 1);
      if (_greaterThan) {
        _builder.append("<div class=\"level\">");
        _builder.newLine();
      }
    }
    _builder.append("<h");
    String _header = this.header(exampleGroup, level);
    _builder.append(_header, "");
    _builder.append(" class=\"exampleGroup ");
    String _executionStateClass = this.executionStateClass(exampleGroup);
    _builder.append(_executionStateClass, "");
    _builder.append("\" ");
    String _describe = this._exampleNameProvider.describe(exampleGroup);
    String _id = this.id(_describe);
    _builder.append(_id, "");
    _builder.append(">");
    String _asTitle = this.asTitle(exampleGroup);
    _builder.append(_asTitle, "");
    _builder.append("</h");
    String _header_1 = this.header(exampleGroup, level);
    _builder.append(_header_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    CharSequence _generateDoc = this.generateDoc(exampleGroup);
    _builder.append(_generateDoc, "");
    _builder.newLineIfNotEmpty();
    int _plus = (level + 1);
    StringConcatenation _generateMembers = this.generateMembers(exampleGroup, _plus);
    _builder.append(_generateMembers, "");
    _builder.newLineIfNotEmpty();
    {
      boolean _greaterThan_1 = (level > 1);
      if (_greaterThan_1) {
        _builder.append("</div>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  private String header(final ExampleGroup exampleGroup, final int level) {
    String _xifexpression = null;
    boolean _lessEqualsThan = (level <= 1);
    if (_lessEqualsThan) {
      _xifexpression = "3";
    } else {
      String _xifexpression_1 = null;
      boolean _equals = (level == 2);
      if (_equals) {
        _xifexpression_1 = "4";
      } else {
        _xifexpression_1 = "5";
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  protected String _asTitle(final ExampleGroup exampleGroup) {
    String _describe = this._exampleNameProvider.describe(exampleGroup);
    String _title = this.toTitle(_describe);
    return _title;
  }
  
  protected String _asTitle(final Example example) {
    String _describe = this._exampleNameProvider.describe(example);
    String _title = this.toTitle(_describe);
    return _title;
  }
  
  public CharSequence generate(final XtendMember example, final int level) {
    if (example instanceof Example) {
      return _generate((Example)example, level);
    } else if (example instanceof ExampleGroup) {
      return _generate((ExampleGroup)example, level);
    } else if (example instanceof ExampleTable) {
      return _generate((ExampleTable)example, level);
    } else if (example != null) {
      return _generate(example, level);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(example, level).toString());
    }
  }
  
  public String asTitle(final EObject example) {
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
