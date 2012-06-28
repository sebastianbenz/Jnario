package org.jnario.doc;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.ExampleColumn;
import org.jnario.ExampleRow;
import org.jnario.ExampleTable;
import org.jnario.doc.Filter;
import org.jnario.doc.HtmlFile;
import org.jnario.doc.HtmlFileBuilder;
import org.jnario.doc.WhiteSpaceNormalizer;
import org.pegdown.PegDownProcessor;

@SuppressWarnings("all")
public abstract class AbstractDocGenerator implements IGenerator {
  @Inject
  private WhiteSpaceNormalizer _whiteSpaceNormalizer;
  
  @Inject
  private PegDownProcessor _pegDownProcessor;
  
  @Inject
  private HtmlFileBuilder _htmlFileBuilder;
  
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    EList<EObject> _contents = input.getContents();
    Iterable<XtendFile> _filter = Iterables.<XtendFile>filter(_contents, XtendFile.class);
    for (final XtendFile file : _filter) {
      EList<XtendClass> _xtendClasses = file.getXtendClasses();
      final Procedure1<XtendClass> _function = new Procedure1<XtendClass>() {
          public void apply(final XtendClass it) {
            HtmlFile _createHtmlFile = AbstractDocGenerator.this.createHtmlFile(it);
            AbstractDocGenerator.this._htmlFileBuilder.generate(it, fsa, _createHtmlFile);
          }
        };
      IterableExtensions.<XtendClass>forEach(_xtendClasses, _function);
    }
  }
  
  public HtmlFile createHtmlFile(final XtendClass xtendClass) {
    return HtmlFile.EMPTY_FILE;
  }
  
  public String toTitle(final String string) {
    String _decode = this.decode(string);
    String _firstUpper = Strings.toFirstUpper(_decode);
    return _firstUpper;
  }
  
  public String decode(final String string) {
    String _xtrycatchfinallyexpression = null;
    try {
      String _convertFromJavaString = Strings.convertFromJavaString(string, true);
      _xtrycatchfinallyexpression = _convertFromJavaString;
    } catch (final Throwable _t) {
      if (_t instanceof IllegalArgumentException) {
        final IllegalArgumentException e = (IllegalArgumentException)_t;
        String _xblockexpression = null;
        {
          e.printStackTrace();
          _xblockexpression = (string);
        }
        _xtrycatchfinallyexpression = _xblockexpression;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
  
  public String markdown2Html(final String string) {
    String _xblockexpression = null;
    {
      boolean _equals = Objects.equal(string, null);
      if (_equals) {
        return "";
      }
      String _normalize = this._whiteSpaceNormalizer.normalize(string);
      String _markdownToHtml = this._pegDownProcessor.markdownToHtml(_normalize);
      String _replaceAll = _markdownToHtml.replaceAll("<pre><code>", "<pre class=\"prettyprint\">");
      String _replaceAll_1 = _replaceAll.replaceAll("</pre></code>", "</pre>");
      _xblockexpression = (_replaceAll_1);
    }
    return _xblockexpression;
  }
  
  protected String _serialize(final XExpression expr, final List<Filter> filters) {
    String _serialize = this.serialize(expr);
    String _codeToHtml = this.codeToHtml(_serialize);
    return _codeToHtml.trim();
  }
  
  protected String _serialize(final XBlockExpression expr, final List<Filter> filters) {
    String _serialize = this.serialize(expr);
    String code = _serialize.trim();
    String _apply = this.apply(filters, code);
    code = _apply;
    int _length = code.length();
    boolean _equals = (_length == 0);
    if (_equals) {
      return "";
    }
    int _length_1 = code.length();
    int _minus = (_length_1 - 1);
    String _substring = code.substring(1, _minus);
    code = _substring;
    return this.codeToHtml(code);
  }
  
  public String codeToHtml(final String code) {
    String _normalize = this._whiteSpaceNormalizer.normalize(code);
    String _html = this.toHtml(_normalize);
    String _replace = _html.replace("\t", "  ");
    return _replace;
  }
  
  public String toHtml(final String input) {
    String _replaceAll = input.replaceAll("<", "&lt;");
    String _replaceAll_1 = _replaceAll.replaceAll(">", "&gt;");
    return _replaceAll_1;
  }
  
  public String serialize(final EObject obj) {
    final ICompositeNode node = NodeModelUtils.getNode(obj);
    boolean _equals = Objects.equal(node, null);
    if (_equals) {
      return "";
    }
    return node.getText();
  }
  
  public String id(final String id) {
    String _replaceAll = id==null?(String)null:id.replaceAll("\\W", "_");
    String _plus = (" id=\"" + _replaceAll);
    return (_plus + "\"");
  }
  
  public String apply(final List<Filter> filters, final String input) {
    String result = input;
    for (final Filter filter : filters) {
      String _apply = filter.apply(result);
      result = _apply;
    }
    return result;
  }
  
  public String root(final EObject xtendClass) {
    final XtendFile specFile = EcoreUtil2.<XtendFile>getContainerOfType(xtendClass, XtendFile.class);
    final String packageName = specFile.getPackage();
    boolean _equals = Objects.equal(packageName, null);
    if (_equals) {
      return "";
    }
    final String[] fragments = packageName.split("\\.");
    final Function1<String,String> _function = new Function1<String,String>() {
        public String apply(final String s) {
          return "../";
        }
      };
    final List<String> path = ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(fragments)), _function);
    return IterableExtensions.join(path, "");
  }
  
  public CharSequence generate(final ExampleTable table) {
    StringConcatenation _builder = new StringConcatenation();
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
            String _serialize = this.serialize(cell, _emptyList);
            _builder.append(_serialize, "		");
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
  
  public String serialize(final XExpression expr, final List<Filter> filters) {
    if (expr instanceof XBlockExpression) {
      return _serialize((XBlockExpression)expr, filters);
    } else if (expr != null) {
      return _serialize(expr, filters);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expr, filters).toString());
    }
  }
}
