package org.jnario.doc;

import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.doc.HtmlAssets;

@SuppressWarnings("all")
public class HtmlFile {
  public static HtmlFile EMPTY_FILE = new Function0<HtmlFile>() {
    public HtmlFile apply() {
      HtmlFile _htmlFile = new HtmlFile();
      return _htmlFile;
    }
  }.apply();
  
  public static HtmlFile newHtmlFile(final Procedure1<HtmlFile> initializer) {
    HtmlFile _htmlFile = new HtmlFile();
    final HtmlFile htmlFile = _htmlFile;
    initializer.apply(htmlFile);
    return htmlFile;
  }
  
  private HtmlAssets _assets = new Function0<HtmlAssets>() {
    public HtmlAssets apply() {
      HtmlAssets _htmlAssets = new HtmlAssets();
      return _htmlAssets;
    }
  }.apply();
  
  public HtmlAssets getAssets() {
    return this._assets;
  }
  
  public void setAssets(final HtmlAssets assets) {
    this._assets = assets;
  }
  
  private CharSequence _name = "";
  
  public CharSequence getName() {
    return this._name;
  }
  
  public void setName(final CharSequence name) {
    this._name = name;
  }
  
  private CharSequence _title = "";
  
  public CharSequence getTitle() {
    return this._title;
  }
  
  public void setTitle(final CharSequence title) {
    this._title = title;
  }
  
  private CharSequence _content = "";
  
  public CharSequence getContent() {
    return this._content;
  }
  
  public void setContent(final CharSequence content) {
    this._content = content;
  }
  
  private String _rootFolder = "";
  
  public String getRootFolder() {
    return this._rootFolder;
  }
  
  public void setRootFolder(final String rootFolder) {
    this._rootFolder = rootFolder;
  }
  
  public CharSequence toText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html lang=\"en\">");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("<meta charset=\"utf-8\">");
    _builder.newLine();
    _builder.append("<title>");
    CharSequence _title = this.getTitle();
    _builder.append(_title, "");
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
    _builder.append("<meta name=\"description\" content=\"\">");
    _builder.newLine();
    _builder.append("<meta name=\"author\" content=\"Jnario\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<!-- Le HTML5 shim, for IE6-8 support of HTML elements -->");
    _builder.newLine();
    _builder.append("<!--[if lt IE 9]>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<![endif]-->");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<!-- Le styles -->");
    _builder.newLine();
    {
      HtmlAssets _assets = this.getAssets();
      List<String> _cssFiles = _assets.getCssFiles();
      for(final String cssFile : _cssFiles) {
        _builder.append("<link rel=\"stylesheet\" href=\"");
        String _rootFolder = this.getRootFolder();
        _builder.append(_rootFolder, "");
        _builder.append(cssFile, "");
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      HtmlAssets _assets_1 = this.getAssets();
      List<String> _jsFiles = _assets_1.getJsFiles();
      for(final String jsFile : _jsFiles) {
        _builder.append("<script type=\"text/javascript\" src=\"");
        String _rootFolder_1 = this.getRootFolder();
        _builder.append(_rootFolder_1, "");
        _builder.append(jsFile, "");
        _builder.append("\"></script>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</head>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<body onload=\"prettyPrint()\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"container\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<div class=\"content\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<div class=\"page-header\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<h1>");
    CharSequence _title_1 = this.getTitle();
    _builder.append(_title_1, "				");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<div class=\"row\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<div class=\"span12\">");
    _builder.newLine();
    CharSequence _content = this.getContent();
    _builder.append(_content, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</div> <!-- /content -->");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<footer>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<p><small>Generated by <a href=\"http://www.jnario.org\">Jnario</a>.</small></p>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</footer>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<!-- /container -->");
    _builder.newLine();
    _builder.newLine();
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
}
