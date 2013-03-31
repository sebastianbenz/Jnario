package org.jnario.doc;

import com.google.common.base.Objects;
import org.eclipse.xtend.core.xtend.XtendTypeDeclaration;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.jnario.doc.DocOutputConfigurationProvider;
import org.jnario.doc.HtmlFile;
import org.jnario.util.Strings;
import org.jnario.util.XtendTypes;

@SuppressWarnings("all")
public class HtmlFileBuilder {
  public void generate(final XtendTypeDeclaration context, final IFileSystemAccess fsa, final HtmlFile htmlFile) {
    CharSequence _name = htmlFile.getName();
    boolean _equals = Objects.equal(_name, null);
    if (_equals) {
      return;
    }
    final CharSequence content = htmlFile.toText();
    String _filePath = this.filePath(context, htmlFile);
    fsa.generateFile(_filePath, DocOutputConfigurationProvider.DOC_OUTPUT, content);
  }
  
  public String toHtmlFileName(final CharSequence nameWithoutExtension) {
    String result = nameWithoutExtension.toString();
    char _charAt = "_".charAt(0);
    String _trim = Strings.trim(result, _charAt);
    return (_trim + ".html");
  }
  
  private String filePath(final XtendTypeDeclaration xtendClass, final HtmlFile htmlFile) {
    CharSequence _name = htmlFile.getName();
    String _htmlFileName = _name==null?(String)null:this.toHtmlFileName(_name);
    final String fileName = ("/" + _htmlFileName);
    String _packageName = XtendTypes.packageName(xtendClass);
    boolean _equals = Objects.equal(_packageName, null);
    if (_equals) {
      return fileName;
    }
    String _packageName_1 = XtendTypes.packageName(xtendClass);
    String _replaceAll = _packageName_1.replaceAll("\\.", "/");
    String _plus = ("/" + _replaceAll);
    return (_plus + fileName);
  }
}
