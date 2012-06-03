package org.jnario.doc;

import java.io.InputStream;
import java.util.List;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
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
  
  private String filePath(final XtendClass xtendClass, final HtmlFile htmlFile) {
    String _plus = StringExtensions.operator_plus("/", htmlFile.fileName);
    final String fileName = ObjectExtensions.operator_plus(_plus, ".html");
    String _packageName = xtendClass.getPackageName();
    boolean _equals = ObjectExtensions.operator_equals(_packageName, null);
    if (_equals) {
      return fileName;
    }
    String _packageName_1 = xtendClass.getPackageName();
    String _replaceAll = _packageName_1.replaceAll("\\.", "/");
    String _plus_1 = ObjectExtensions.operator_plus("/", _replaceAll);
    return ObjectExtensions.operator_plus(_plus_1, fileName);
  }
  
  private void copy(final IFileSystemAccess fsa, final String targetFolder, final Iterable<String> files) {
    for (final String file : files) {
      String _plus = ObjectExtensions.operator_plus("/", targetFolder);
      String _plus_1 = ObjectExtensions.operator_plus(_plus, "/");
      String _plus_2 = ObjectExtensions.operator_plus(_plus_1, file);
      String _load = this.load(file);
      fsa.generateFile(_plus_2, DocOutputConfigurationProvider.DOC_OUTPUT, _load);
    }
  }
  
  private String load(final String file) {
    final InputStream inputStream = DocumentationSupport.class.getResourceAsStream(file);
    return Strings.convertStreamToString(inputStream);
  }
}
