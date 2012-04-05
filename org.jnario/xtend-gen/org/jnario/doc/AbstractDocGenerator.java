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
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.jnario.doc.Filter;
import org.jnario.doc.HtmlFile;
import org.jnario.doc.HtmlFileBuilder;
import org.jnario.doc.WhiteSpaceNormalizer;
import org.pegdown.PegDownProcessor;

@SuppressWarnings("all")
public class AbstractDocGenerator implements IGenerator {
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
      {
        final XtendClass xtendClass = file.getXtendClass();
        final HtmlFile htmlFile = xtendClass==null?(HtmlFile)null:this.createHtmlFile(xtendClass);
        if (xtendClass!=null) this._htmlFileBuilder.generate(xtendClass, fsa, htmlFile);
      }
    }
  }
  
  public HtmlFile createHtmlFile(final XtendClass xtendClass) {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException();
    throw _unsupportedOperationException;
  }
  
  public String convertToTitle(final String string) {
    String _convertToText = this.convertToText(string);
    String _firstUpper = Strings.toFirstUpper(_convertToText);
    return _firstUpper;
  }
  
  public String convertToText(final String string) {
    String _convertFromJavaString = Strings.convertFromJavaString(string, true);
    return _convertFromJavaString;
  }
  
  public String markdown2Html(final String string) {
    String _markdownToHtml = this._pegDownProcessor.markdownToHtml(string);
    String _replaceAll = _markdownToHtml.replaceAll("<pre><code>", "<pre class=\"prettyprint\">");
    String _replaceAll_1 = _replaceAll.replaceAll("</pre></code>", "</pre>");
    return _replaceAll_1;
  }
  
  protected String _toXtendCode(final XExpression expr, final List<Filter> filters) {
    String _serialize = this.serialize(expr);
    String _normalize = this._whiteSpaceNormalizer.normalize(_serialize);
    String _html = this.toHtml(_normalize);
    return _html.trim();
  }
  
  protected String _toXtendCode(final XBlockExpression expr, final List<Filter> filters) {
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
    String _normalize = this._whiteSpaceNormalizer.normalize(code);
    return this.toHtml(_normalize);
  }
  
  public String codeToHtml(final String code) {
    String _normalize = this._whiteSpaceNormalizer.normalize(code);
    String _html = this.toHtml(_normalize);
    return _html;
  }
  
  public String toHtml(final String input) {
    String _replaceAll = input.replaceAll("<", "&lt;");
    String _replaceAll_1 = _replaceAll.replaceAll(">", "&gt;");
    return _replaceAll_1;
  }
  
  public String serialize(final EObject obj) {
    final ICompositeNode node = NodeModelUtils.getNode(obj);
    return node.getText();
  }
  
  public String generateId(final String id) {
    String _replaceAll = id==null?(String)null:id.replaceAll("\\W", "_");
    String _plus = ("id=\"" + _replaceAll);
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
  
  public String root(final XtendClass xtendClass) {
    final XtendFile specFile = EcoreUtil2.<XtendFile>getContainerOfType(xtendClass, XtendFile.class);
    XtendClass _xtendClass = specFile.getXtendClass();
    final String packageName = _xtendClass.getPackageName();
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
  
  public String toXtendCode(final XExpression expr, final List<Filter> filters) {
    if (expr instanceof XBlockExpression) {
      return _toXtendCode((XBlockExpression)expr, filters);
    } else if (expr != null) {
      return _toXtendCode(expr, filters);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expr, filters).toString());
    }
  }
}
