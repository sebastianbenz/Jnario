/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.compiler;

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
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.jnario.doc.AbstractDocGenerator;
import org.jnario.doc.DocOutputConfigurationProvider;
import org.jnario.report.Executable2ResultMapping;

@SuppressWarnings("all")
public class JnarioDocCompiler extends XtendBatchCompiler {
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
  
  @Inject
  private IEncodingProvider.Runtime encodingProvider;
  
  private ResourceSet resourceSet;
  
  public boolean compile() {
    this.loadResources();
    this.generateDocumentation(this.resultMapping);
    return true;
  }
  
  @Inject
  public Executable2ResultMapping setExecutable2ResultMapping(final Executable2ResultMapping resultMapping) {
    return this.resultMapping = resultMapping;
  }
  
  public ResourceSet loadResources() {
    ResourceSet _xblockexpression = null;
    {
      ResourceSet _get = this.resourceSetProvider.get();
      this.resourceSet = _get;
      String _fileEncoding = this.getFileEncoding();
      this.encodingProvider.setDefaultEncoding(_fileEncoding);
      Map<Object,Object> _loadOptions = this.resourceSet.getLoadOptions();
      String _fileEncoding_1 = this.getFileEncoding();
      _loadOptions.put(XtextResource.OPTION_ENCODING, _fileEncoding_1);
      final NameBasedFilter nameBasedFilter = new NameBasedFilter();
      String _primaryFileExtension = this.fileExtensionProvider.getPrimaryFileExtension();
      nameBasedFilter.setExtension(_primaryFileExtension);
      final PathTraverser pathTraverser = new PathTraverser();
      List<String> _sourcePathDirectories = this.getSourcePathDirectories();
      final Predicate<URI> _function = new Predicate<URI>() {
        public boolean apply(final URI input) {
          final boolean matches = nameBasedFilter.matches(input);
          if (matches) {
            JnarioDocCompiler.this.resourceSet.getResource(input, true);
          }
          return matches;
        }
      };
      pathTraverser.resolvePathes(_sourcePathDirectories, _function);
      final File classDirectory = this.createTempDir("classes");
      this.installJvmTypeProvider(this.resourceSet, classDirectory);
      EcoreUtil.resolveAll(this.resourceSet);
      _xblockexpression = this.resourceSet;
    }
    return _xblockexpression;
  }
  
  public void generateDocumentation(final Executable2ResultMapping executable2ResultMapping) {
    final JavaIoFileSystemAccess javaIoFileSystemAccess = this.javaIoFileSystemAccessProvider.get();
    javaIoFileSystemAccess.setOutputPath(DocOutputConfigurationProvider.DOC_OUTPUT, this.outputPath);
    EList<Resource> _resources = this.resourceSet.getResources();
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
