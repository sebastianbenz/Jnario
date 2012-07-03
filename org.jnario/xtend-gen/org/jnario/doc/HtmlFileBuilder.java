package org.jnario.doc;

import com.google.common.base.Objects;
import java.io.InputStream;
import java.util.List;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.jnario.doc.DocOutputConfigurationProvider;
import org.jnario.doc.DocumentationSupport;
import org.jnario.doc.HtmlFile;
import org.jnario.util.Strings;

@SuppressWarnings("all")
public class HtmlFileBuilder {
  public void generate(final XtendClass context, final IFileSystemAccess fsa, final HtmlFile htmlFile) {
    List<String> _cssFiles = htmlFile.getCssFiles();
    this.copy(fsa, "css", _cssFiles);
    List<String> _jsFiles = htmlFile.getJsFiles();
    this.copy(fsa, "js", _jsFiles);
    final CharSequence content = htmlFile.toText();
    String _filePath = this.filePath(context, htmlFile);
    fsa.generateFile(_filePath, DocOutputConfigurationProvider.DOC_OUTPUT, content);
  }
  
  public String toHtmlFileName(final CharSequence nameWithoutExtension) {
    String _xblockexpression = null;
    {
      String result = nameWithoutExtension.toString();
      boolean _startsWith = result.startsWith("_");
      if (_startsWith) {
        String _substring = result.substring(1);
        result = _substring;
      }
      String _plus = (result + ".html");
      _xblockexpression = (_plus);
    }
    return _xblockexpression;
  }
  
  private String filePath(final XtendClass xtendClass, final HtmlFile htmlFile) {
    CharSequence _name = htmlFile.getName();
    String _htmlFileName = this.toHtmlFileName(_name);
    final String fileName = ("/" + _htmlFileName);
    String _packageName = xtendClass.getPackageName();
    boolean _equals = Objects.equal(_packageName, null);
    if (_equals) {
      return fileName;
    }
    String _packageName_1 = xtendClass.getPackageName();
    String _replaceAll = _packageName_1.replaceAll("\\.", "/");
    String _plus = ("/" + _replaceAll);
    return (_plus + fileName);
  }
  
  private void copy(final IFileSystemAccess fsa, final String targetFolder, final Iterable<String> files) {
    for (final String file : files) {
      String _plus = ("/" + targetFolder);
      String _plus_1 = (_plus + "/");
      String _plus_2 = (_plus_1 + file);
      String _load = this.load(file);
      fsa.generateFile(_plus_2, DocOutputConfigurationProvider.DOC_OUTPUT, _load);
    }
  }
  
  private String load(final String file) {
    final InputStream inputStream = DocumentationSupport.class.getResourceAsStream(file);
    return Strings.convertStreamToString(inputStream);
  }
}
