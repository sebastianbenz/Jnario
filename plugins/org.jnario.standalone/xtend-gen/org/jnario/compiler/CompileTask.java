package org.jnario.compiler;

import com.google.common.base.Objects;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.types.Path;
import org.apache.tools.ant.types.Reference;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.compiler.CompilerMain;

@SuppressWarnings("all")
public class CompileTask extends Task {
  /**
   * Set target for the generated Java source. Default is "xtend-gen".
   */
  private String _outputPath = "xtend-gen";
  
  /**
   * Set target for the generated Java source. Default is "xtend-gen".
   */
  public String getOutputPath() {
    return this._outputPath;
  }
  
  /**
   * Set target for the generated Java source. Default is "xtend-gen".
   */
  public void setOutputPath(final String outputPath) {
    this._outputPath = outputPath;
  }
  
  private Path classPath = null;
  
  /**
   * Set the temporary folder to use. Default is a temporary folder obtained via System::getProperty("java.io.tmpdir").
   */
  private String _tempDirectory = new Function0<String>() {
    public String apply() {
      String _property = System.getProperty("java.io.tmpdir");
      return _property;
    }
  }.apply();
  
  /**
   * Set the temporary folder to use. Default is a temporary folder obtained via System::getProperty("java.io.tmpdir").
   */
  public String getTempDirectory() {
    return this._tempDirectory;
  }
  
  /**
   * Set the temporary folder to use. Default is a temporary folder obtained via System::getProperty("java.io.tmpdir").
   */
  public void setTempDirectory(final String tempDirectory) {
    this._tempDirectory = tempDirectory;
  }
  
  /**
   * The spec encoding. Default is UTF-8.
   */
  private String _fileEncoding = "UTF-8";
  
  /**
   * The spec encoding. Default is UTF-8.
   */
  public String getFileEncoding() {
    return this._fileEncoding;
  }
  
  /**
   * The spec encoding. Default is UTF-8.
   */
  public void setFileEncoding(final String fileEncoding) {
    this._fileEncoding = fileEncoding;
  }
  
  private Path sourcePath = null;
  
  public void execute() throws BuildException {
    CompilerMain _compilerMain = new CompilerMain();
    final Procedure1<CompilerMain> _function = new Procedure1<CompilerMain>() {
        public void apply(final CompilerMain it) {
          String _outputPath = CompileTask.this.getOutputPath();
          it.setOutputPath(_outputPath);
          String _string = CompileTask.this.classPath.toString();
          it.setClassPath(_string);
          String _tempDirectory = CompileTask.this.getTempDirectory();
          it.setTempDirectory(_tempDirectory);
          String _fileEncoding = CompileTask.this.getFileEncoding();
          it.setFileEncoding(_fileEncoding);
          String _string_1 = CompileTask.this.sourcePath.toString();
          it.setSourcePath(_string_1);
        }
      };
    final CompilerMain compiler = ObjectExtensions.<CompilerMain>operator_doubleArrow(_compilerMain, _function);
    int _compile = compiler.compile();
    boolean _equals = (_compile == CompilerMain.COMPILATION_ERROR);
    if (_equals) {
      BuildException _buildException = new BuildException("Error when compiling Jnario specs");
      throw _buildException;
    }
  }
  
  /**
   * Set the sourcepath to use by reference.
   * 
   * @param r a reference to an existing sourcepath.
   */
  public void setSourcepathRef(final Reference r) {
    Path _createSourcepath = this.createSourcepath();
    _createSourcepath.setRefid(r);
  }
  
  /**
   * Set the sourcepath to be used when compiling the Jnario specs.
   * 
   * @param s an Ant Path object containing the sourcepath.
   */
  public void setSourcepath(final Path s) {
    Path _createSourcepath = this.createSourcepath();
    _createSourcepath.append(s);
  }
  
  /**
   * Set the classpath to use by reference.
   * 
   * @param r a reference to an existing classpath.
   */
  public void setClasspathRef(final Reference r) {
    Path _createClasspath = this.createClasspath();
    _createClasspath.setRefid(r);
  }
  
  /**
   * Set the classpath to be used when compiling the Jnario specs.
   * 
   * @param s an Ant Path object containing the classpath.
   */
  public void setClasspath(final Path s) {
    Path _createClasspath = this.createClasspath();
    _createClasspath.append(s);
  }
  
  private Path createClasspath() {
    Path _xblockexpression = null;
    {
      boolean _equals = Objects.equal(this.classPath, null);
      if (_equals) {
        Project _project = this.getProject();
        Path _path = new Path(_project);
        this.classPath = _path;
      }
      _xblockexpression = (this.classPath);
    }
    return _xblockexpression;
  }
  
  private Path createSourcepath() {
    Path _xblockexpression = null;
    {
      boolean _equals = Objects.equal(this.sourcePath, null);
      if (_equals) {
        Project _project = this.getProject();
        Path _path = new Path(_project);
        this.sourcePath = _path;
      }
      _xblockexpression = (this.sourcePath);
    }
    return _xblockexpression;
  }
}
