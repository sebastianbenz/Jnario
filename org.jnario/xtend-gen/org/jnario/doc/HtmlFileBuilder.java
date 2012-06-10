/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
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
  
  private String filePath(final XtendClass xtendClass, final HtmlFile htmlFile) {
    String _plus = ("/" + htmlFile.fileName);
    final String fileName = (_plus + ".html");
    String _packageName = xtendClass.getPackageName();
    boolean _equals = Objects.equal(_packageName, null);
    if (_equals) {
      return fileName;
    }
    String _packageName_1 = xtendClass.getPackageName();
    String _replaceAll = _packageName_1.replaceAll("\\.", "/");
    String _plus_1 = ("/" + _replaceAll);
    return (_plus_1 + fileName);
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
