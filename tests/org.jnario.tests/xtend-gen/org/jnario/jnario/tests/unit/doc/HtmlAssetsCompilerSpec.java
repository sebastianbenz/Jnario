package org.jnario.jnario.tests.unit.doc;

import com.google.inject.Inject;
import java.io.File;
import org.eclipse.xtext.util.Files;
import org.hamcrest.StringDescription;
import org.jnario.compiler.HtmlAssetsCompiler;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("HtmlAssetsCompiler")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = SpecTestCreator.class)
public class HtmlAssetsCompilerSpec {
  @Subject
  public HtmlAssetsCompiler subject;
  
  @Inject
  @Rule
  @Extension
  public TemporaryFolder _temporaryFolder;
  
  @Test
  @Named("compiles css & js files to specified folder")
  @Order(1)
  public void _compilesCssJsFilesToSpecifiedFolder() throws Exception {
    this.doCompile();
    File _file = this.file("js/prettify.js");
    boolean _exists = _file.exists();
    Assert.assertTrue("\nExpected file(\"js/prettify.js\").exists but"
     + "\n     file(\"js/prettify.js\") is " + new StringDescription().appendValue(_file).toString() + "\n", _exists);
    
    File _file_1 = this.file("css/prettify.css");
    boolean _exists_1 = _file_1.exists();
    Assert.assertTrue("\nExpected file(\"css/prettify.css\").exists but"
     + "\n     file(\"css/prettify.css\") is " + new StringDescription().appendValue(_file_1).toString() + "\n", _exists_1);
    
  }
  
  @Test
  @Named("does not override existing file")
  @Order(2)
  public void _doesNotOverrideExistingFile() throws Exception {
    this.mkdir("js");
    File _file = this.file("js/prettify.js");
    final String file = _file.toString();
    Files.writeStringIntoFile(file, "Hello World");
    this.doCompile();
    String _readFileIntoString = Files.readFileIntoString(file);
    boolean _doubleArrow = Should.operator_doubleArrow(_readFileIntoString, "Hello World");
    Assert.assertTrue("\nExpected readFileIntoString(file) => \"Hello World\" but"
     + "\n     readFileIntoString(file) is " + new StringDescription().appendValue(_readFileIntoString).toString()
     + "\n     file is " + new StringDescription().appendValue(file).toString() + "\n", _doubleArrow);
    
  }
  
  public boolean mkdir(final String name) {
    File _file = this.file(name);
    boolean _mkdir = _file.mkdir();
    return _mkdir;
  }
  
  public File file(final String path) {
    File _root = this._temporaryFolder.getRoot();
    String _absolutePath = _root.getAbsolutePath();
    String _plus = (_absolutePath + "/");
    String _plus_1 = (_plus + path);
    File _file = new File(_plus_1);
    return _file;
  }
  
  public boolean doCompile() {
    boolean _xblockexpression = false;
    {
      File _root = this._temporaryFolder.getRoot();
      String _absolutePath = _root.getAbsolutePath();
      this.subject.setOutputPath(_absolutePath);
      boolean _compile = this.subject.compile();
      _xblockexpression = (_compile);
    }
    return _xblockexpression;
  }
}
