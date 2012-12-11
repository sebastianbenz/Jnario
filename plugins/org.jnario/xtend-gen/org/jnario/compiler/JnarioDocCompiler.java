package org.jnario.compiler;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.inject.Inject;
import java.io.File;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend.core.compiler.batch.XtendBatchCompiler;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.mwe.NameBasedFilter;
import org.eclipse.xtext.mwe.PathTraverser;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.jnario.doc.AbstractDocGenerator;
import org.jnario.doc.DocOutputConfigurationProvider;
import org.jnario.report.Executable2ResultMapping;

@SuppressWarnings("all")
public class JnarioDocCompiler extends XtendBatchCompiler {
  private ResourceSet _resourceSet;
  
  public ResourceSet getResourceSet() {
    return this._resourceSet;
  }
  
  public void setResourceSet(final ResourceSet resourceSet) {
    this._resourceSet = resourceSet;
  }
  
  private Executable2ResultMapping resultMapping;
  
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
    ResourceSet _loadResources = this.loadResources();
    this.setResourceSet(_loadResources);
    ResourceSet _resourceSet = this.getResourceSet();
    this.generateDocumentation(_resourceSet, this.resultMapping);
    return true;
  }
  
  @Inject
  public Executable2ResultMapping setExecutable2ResultMapping(final Executable2ResultMapping resultMapping) {
    Executable2ResultMapping _resultMapping = this.resultMapping = resultMapping;
    return _resultMapping;
  }
  
  public ResourceSet loadResources() {
    ResourceSet _xblockexpression = null;
    {
      ResourceSet _resourceSet = this.getResourceSet();
      boolean _equals = Objects.equal(_resourceSet, null);
      if (_equals) {
        ResourceSet _get = this.resourceSetProvider.get();
        this.setResourceSet(_get);
      }
      ResourceSet _resourceSet_1 = this.getResourceSet();
      Map<Object,Object> _loadOptions = _resourceSet_1.getLoadOptions();
      String _fileEncoding = this.getFileEncoding();
      _loadOptions.put(XtextResource.OPTION_ENCODING, _fileEncoding);
      NameBasedFilter _nameBasedFilter = new NameBasedFilter();
      final NameBasedFilter nameBasedFilter = _nameBasedFilter;
      String _primaryFileExtension = this.fileExtensionProvider.getPrimaryFileExtension();
      nameBasedFilter.setExtension(_primaryFileExtension);
      PathTraverser _pathTraverser = new PathTraverser();
      final PathTraverser pathTraverser = _pathTraverser;
      List<String> _sourcePathDirectories = this.getSourcePathDirectories();
      String _plus = ("source directories: " + _sourcePathDirectories);
      InputOutput.<String>println(_plus);
      List<String> _sourcePathDirectories_1 = this.getSourcePathDirectories();
      final Function1<URI,Boolean> _function = new Function1<URI,Boolean>() {
          public Boolean apply(final URI input) {
            final boolean matches = nameBasedFilter.matches(input);
            if (matches) {
              String _plus = ("loading resource: " + input);
              InputOutput.<String>println(_plus);
              ResourceSet _resourceSet = JnarioDocCompiler.this.getResourceSet();
              _resourceSet.getResource(input, true);
            }
            return matches;
          }
        };
      pathTraverser.resolvePathes(_sourcePathDirectories_1, new Predicate<URI>() {
          public boolean apply(URI input) {
            return _function.apply(input);
          }
      });
      final File classDirectory = this.createTempDir("classes");
      ResourceSet _resourceSet_2 = this.getResourceSet();
      this.installJvmTypeProvider(_resourceSet_2, classDirectory);
      ResourceSet _resourceSet_3 = this.getResourceSet();
      EcoreUtil.resolveAll(_resourceSet_3);
      ResourceSet _resourceSet_4 = this.getResourceSet();
      _xblockexpression = (_resourceSet_4);
    }
    return _xblockexpression;
  }
  
  public void generateDocumentation(final ResourceSet rs, final Executable2ResultMapping executable2ResultMapping) {
    final JavaIoFileSystemAccess javaIoFileSystemAccess = this.javaIoFileSystemAccessProvider.get();
    javaIoFileSystemAccess.setOutputPath(DocOutputConfigurationProvider.DOC_OUTPUT, this.outputPath);
    EList<Resource> _resources = rs.getResources();
    for (final Resource r : _resources) {
      URI _uRI = r.getURI();
      String _fileExtension = _uRI.fileExtension();
      boolean _isValid = this.fileExtensionProvider.isValid(_fileExtension);
      if (_isValid) {
        this.docGenerator.doGenerate(r, javaIoFileSystemAccess, executable2ResultMapping);
      }
    }
  }
}
