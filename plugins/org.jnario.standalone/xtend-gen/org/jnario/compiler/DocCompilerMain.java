package org.jnario.compiler;

import com.google.common.base.Objects;
import com.google.common.io.Closeables;
import com.google.inject.Injector;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.compiler.CompilerMain;
import org.jnario.compiler.HtmlAssetsCompiler;
import org.jnario.compiler.JnarioDocCompiler;
import org.jnario.report.HashBasedSpec2ResultMapping;
import org.jnario.report.SpecResultParser;

@SuppressWarnings("all")
public class DocCompilerMain {
  public static void main(final String[] args) {
    boolean _or = false;
    boolean _equals = Objects.equal(args, null);
    if (_equals) {
      _or = true;
    } else {
      int _size = ((List<String>)Conversions.doWrapArray(args)).size();
      boolean _equals_1 = (_size == 0);
      _or = (_equals || _equals_1);
    }
    if (_or) {
      DocCompilerMain.printUsage();
      return;
    }
    DocCompilerMain _docCompilerMain = new DocCompilerMain();
    final Procedure1<DocCompilerMain> _function = new Procedure1<DocCompilerMain>() {
        public void apply(final DocCompilerMain it) {
          final Iterator<String> arguments = ((List<String>)Conversions.doWrapArray(args)).iterator();
          boolean _hasNext = arguments.hasNext();
          boolean _while = _hasNext;
          while (_while) {
            {
              String _next = arguments.next();
              final String argument = _next.trim();
              boolean _matched = false;
              if (!_matched) {
                boolean _or = false;
                boolean _equals = Objects.equal(argument, "-cp");
                if (_equals) {
                  _or = true;
                } else {
                  boolean _equals_1 = Objects.equal(argument, "-classpath");
                  _or = (_equals || _equals_1);
                }
                if (_or) {
                  _matched=true;
                  String _next_1 = arguments.next();
                  it.setClassPath(_next_1);
                }
              }
              if (!_matched) {
                if (Objects.equal(argument,"-d")) {
                  _matched=true;
                  String _next_2 = arguments.next();
                  it.setOutputPath(_next_2);
                }
              }
              if (!_matched) {
                if (Objects.equal(argument,"-results")) {
                  _matched=true;
                  String _next_3 = arguments.next();
                  it.setResultFolder(_next_3);
                }
              }
              if (!_matched) {
                if (Objects.equal(argument,"-encoding")) {
                  _matched=true;
                  String _next_4 = arguments.next();
                  it.setFileEncoding(_next_4);
                }
              }
              if (!_matched) {
                it.setSourcePath(argument);
              }
            }
            boolean _hasNext_1 = arguments.hasNext();
            _while = _hasNext_1;
          }
        }
      };
    ObjectExtensions.<DocCompilerMain>operator_doubleArrow(_docCompilerMain, _function);
  }
  
  private String _outputPath = "doc-gen";
  
  public String getOutputPath() {
    return this._outputPath;
  }
  
  public void setOutputPath(final String outputPath) {
    this._outputPath = outputPath;
  }
  
  private String _classPath = "";
  
  public String getClassPath() {
    return this._classPath;
  }
  
  public void setClassPath(final String classPath) {
    this._classPath = classPath;
  }
  
  private String _resultFolder = "";
  
  public String getResultFolder() {
    return this._resultFolder;
  }
  
  public void setResultFolder(final String resultFolder) {
    this._resultFolder = resultFolder;
  }
  
  private String _fileEncoding = "UTF-8";
  
  public String getFileEncoding() {
    return this._fileEncoding;
  }
  
  public void setFileEncoding(final String fileEncoding) {
    this._fileEncoding = fileEncoding;
  }
  
  private String _sourcePath = ".";
  
  public String getSourcePath() {
    return this._sourcePath;
  }
  
  public void setSourcePath(final String sourcePath) {
    this._sourcePath = sourcePath;
  }
  
  public int compile() {
    int _xblockexpression = (int) 0;
    {
      BasicConfigurator.configure();
      ISetup _get = CompilerMain.SETUPS.get(0);
      final Injector anyInjector = _get.createInjectorAndDoEMFRegistration();
      final ResourceSet resourceSet = anyInjector.<ResourceSet>getInstance(ResourceSet.class);
      this.generateCssAndJsFiles(anyInjector);
      int _generateDocs = this.generateDocs(resourceSet);
      _xblockexpression = (_generateDocs);
    }
    return _xblockexpression;
  }
  
  private int generateDocs(final ResourceSet resourceSet) {
    for (final ISetup setup : CompilerMain.SETUPS) {
      {
        final Injector injector = setup.createInjectorAndDoEMFRegistration();
        final JnarioDocCompiler jnarioCompiler = injector.<JnarioDocCompiler>getInstance(JnarioDocCompiler.class);
        String _outputPath = this.getOutputPath();
        jnarioCompiler.setOutputPath(_outputPath);
        String _classPath = this.getClassPath();
        jnarioCompiler.setClassPath(_classPath);
        String _fileEncoding = this.getFileEncoding();
        jnarioCompiler.setFileEncoding(_fileEncoding);
        String _sourcePath = this.getSourcePath();
        jnarioCompiler.setSourcePath(_sourcePath);
        jnarioCompiler.setResourceSet(resourceSet);
        HashBasedSpec2ResultMapping _createSpec2ResultMapping = this.createSpec2ResultMapping();
        jnarioCompiler.setExecutable2ResultMapping(_createSpec2ResultMapping);
        boolean _compile = jnarioCompiler.compile();
        boolean _not = (!_compile);
        if (_not) {
          return CompilerMain.COMPILATION_ERROR;
        }
      }
    }
    return CompilerMain.OK;
  }
  
  private static void printUsage() {
    InputOutput.<String>println("Usage: JnarioDocCompiler <options> <source directories>");
    InputOutput.<String>println("where possible options include:");
    InputOutput.<String>println("-d <directory>             Specify where to place generated documentation files");
    InputOutput.<String>println("-results <folder>          Specify folder containing JUnit XML test results");
    InputOutput.<String>println("-encoding <encoding>       Specify character encoding used by source files");
  }
  
  public HashBasedSpec2ResultMapping createSpec2ResultMapping() {
    ISetup _get = CompilerMain.SETUPS.get(2);
    Injector _createInjectorAndDoEMFRegistration = _get.createInjectorAndDoEMFRegistration();
    final HashBasedSpec2ResultMapping resultMapping = _createInjectorAndDoEMFRegistration.<HashBasedSpec2ResultMapping>getInstance(HashBasedSpec2ResultMapping.class);
    String _resultFolder = this.getResultFolder();
    File _file = new File(_resultFolder);
    final File reportFolder = _file;
    boolean _exists = reportFolder.exists();
    if (_exists) {
      this.addExecutionResults(resultMapping, reportFolder);
    }
    return resultMapping;
  }
  
  public boolean generateCssAndJsFiles(final Injector injector) {
    boolean _xblockexpression = false;
    {
      final HtmlAssetsCompiler assetsCompiler = injector.<HtmlAssetsCompiler>getInstance(HtmlAssetsCompiler.class);
      String _outputPath = this.getOutputPath();
      assetsCompiler.setOutputPath(_outputPath);
      boolean _compile = assetsCompiler.compile();
      _xblockexpression = (_compile);
    }
    return _xblockexpression;
  }
  
  public void addExecutionResults(final HashBasedSpec2ResultMapping resultMapping, final File reportFolder) {
    try {
      SpecResultParser _specResultParser = new SpecResultParser();
      final SpecResultParser specResultParser = _specResultParser;
      final Function1<File,Boolean> _function = new Function1<File,Boolean>() {
          public Boolean apply(final File it) {
            String _name = it.getName();
            boolean _endsWith = _name.endsWith("xml");
            return _endsWith;
          }
        };
      File[] _listFiles = reportFolder.listFiles(new FileFilter() {
          public boolean accept(File pathname) {
            return _function.apply(pathname);
          }
      });
      for (final File file : _listFiles) {
        {
          FileInputStream is = null;
          try {
            FileInputStream _fileInputStream = new FileInputStream(file);
            is = _fileInputStream;
            specResultParser.parse(is, resultMapping);
          } finally {
            Closeables.closeQuietly(is);
          }
        }
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
