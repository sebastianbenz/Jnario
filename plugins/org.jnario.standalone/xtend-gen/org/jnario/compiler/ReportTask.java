package org.jnario.compiler;

import com.google.common.base.Objects;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.types.Path;
import org.apache.tools.ant.types.Reference;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.compiler.CompilerMain;
import org.jnario.compiler.DocCompilerMain;

@SuppressWarnings("all")
public class ReportTask extends Task {
  /**
   * Set target for the generated Jnario reports. Default is "doc-gen".
   */
  private String _outputPath = "doc-gen";
  
  /**
   * Set target for the generated Jnario reports. Default is "doc-gen".
   */
  public String getOutputPath() {
    return this._outputPath;
  }
  
  /**
   * Set target for the generated Jnario reports. Default is "doc-gen".
   */
  public void setOutputPath(final String outputPath) {
    this._outputPath = outputPath;
  }
  
  /**
   * Set folder containing JUnit XML test results. Default is "test-reports".
   */
  private String _resultFolder = "test-reports";
  
  /**
   * Set folder containing JUnit XML test results. Default is "test-reports".
   */
  public String getResultFolder() {
    return this._resultFolder;
  }
  
  /**
   * Set folder containing JUnit XML test results. Default is "test-reports".
   */
  public void setResultFolder(final String resultFolder) {
    this._resultFolder = resultFolder;
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
    DocCompilerMain _docCompilerMain = new DocCompilerMain();
    final Procedure1<DocCompilerMain> _function = new Procedure1<DocCompilerMain>() {
        public void apply(final DocCompilerMain it) {
          String _outputPath = ReportTask.this.getOutputPath();
          it.setOutputPath(_outputPath);
          String _fileEncoding = ReportTask.this.getFileEncoding();
          it.setFileEncoding(_fileEncoding);
          String _string = ReportTask.this.sourcePath.toString();
          it.setSourcePath(_string);
          String _resultFolder = ReportTask.this.getResultFolder();
          it.setResultFolder(_resultFolder);
        }
      };
    final DocCompilerMain compiler = ObjectExtensions.<DocCompilerMain>operator_doubleArrow(_docCompilerMain, _function);
    int _compile = compiler.compile();
    boolean _equals = (_compile == CompilerMain.COMPILATION_ERROR);
    if (_equals) {
      BuildException _buildException = new BuildException("Error when generating Jnario report");
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
