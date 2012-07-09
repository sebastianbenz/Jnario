package org.jnario.compiler;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.jnario.compiler.JnarioDocCompiler;
import org.jnario.doc.DocOutputConfigurationProvider;
import org.jnario.doc.HtmlAssets;

@SuppressWarnings("all")
public class HtmlAssetsCompiler extends JnarioDocCompiler {
  @Inject
  private Provider<JavaIoFileSystemAccess> filesystemAccessProvider;
  
  @Inject
  private HtmlAssets htmlAssets;
  
  public boolean compile() {
    final JavaIoFileSystemAccess fsa = this.filesystemAccessProvider.get();
    fsa.setOutputPath(DocOutputConfigurationProvider.ASSET_OUTPUT, this.outputPath);
    this.htmlAssets.generate(fsa);
    return true;
  }
}
