package org.jnario.doc;

import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.jnario.util.Strings;

import com.google.common.base.Objects;

@SuppressWarnings("all")
public class HtmlFileBuilder {
  public void generate(final XtendClass context, final IFileSystemAccess fsa, final HtmlFile htmlFile) {
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
  
  private String filePath(final XtendClass xtendClass, final HtmlFile htmlFile) {
    CharSequence _name = htmlFile.getName();
    String _htmlFileName = _name==null?(String)null:this.toHtmlFileName(_name);
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
}
