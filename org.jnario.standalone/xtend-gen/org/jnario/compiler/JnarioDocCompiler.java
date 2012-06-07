package org.jnario.compiler;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.io.File;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend.core.compiler.batch.XtendBatchCompiler;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.compiler.SeverityFilter;
import org.jnario.doc.AbstractDocGenerator;
import org.jnario.doc.DocOutputConfigurationProvider;

@SuppressWarnings("all")
public abstract class JnarioDocCompiler extends XtendBatchCompiler {
  private String _resultFolder;
  
  public String getResultFolder() {
    return this._resultFolder;
  }
  
  public void setResultFolder(final String resultFolder) {
    this._resultFolder = resultFolder;
  }
  
  @Inject
  private AbstractDocGenerator docGenerator;
  
  public boolean compile() {
    boolean _xblockexpression = false;
    {
      final ResourceSet resourceSet = this.loadXtendFiles();
      final File classDirectory = this.createTempDir("classes");
      this.installJvmTypeProvider(resourceSet, classDirectory);
      EcoreUtil.resolveAll(resourceSet);
      final List<Issue> issues = this.validate(resourceSet);
      final Iterable<Issue> errors = Iterables.<Issue>filter(issues, SeverityFilter.ERROR);
      final Iterable<Issue> warnings = Iterables.<Issue>filter(issues, SeverityFilter.WARNING);
      Iterable<Issue> _plus = Iterables.<Issue>concat(errors, warnings);
      this.reportIssues(_plus);
      boolean _isEmpty = IterableExtensions.isEmpty(errors);
      boolean _not = (!_isEmpty);
      if (_not) {
        return false;
      }
      this.generateDocumentation(resourceSet);
      _xblockexpression = (true);
    }
    return _xblockexpression;
  }
  
  public void generateDocumentation(final ResourceSet rs) {
    final JavaIoFileSystemAccess javaIoFileSystemAccess = this.javaIoFileSystemAccessProvider.get();
    javaIoFileSystemAccess.setOutputPath(DocOutputConfigurationProvider.DOC_OUTPUT, this.outputPath);
    EList<Resource> _resources = rs.getResources();
    for (final Resource r : _resources) {
      URI _uRI = r.getURI();
      String _fileExtension = _uRI.fileExtension();
      boolean _isValid = this.fileExtensionProvider.isValid(_fileExtension);
      if (_isValid) {
        this.docGenerator.doGenerate(r, javaIoFileSystemAccess);
      }
    }
  }
}
