/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.compiler;

import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.inject.Inject;
import com.google.inject.Injector;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.xtend.core.XtendStandaloneSetup;
import org.eclipse.xtend.core.compiler.batch.XtendBatchCompiler;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.common.types.descriptions.IStubGenerator;
import org.eclipse.xtext.common.types.descriptions.JvmTypesResourceDescriptionStrategy;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.mwe.NameBasedFilter;
import org.eclipse.xtext.mwe.PathTraverser;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.containers.FlatResourceSetBasedAllContainersState;
import org.eclipse.xtext.resource.impl.ResourceSetBasedResourceDescriptions;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.compiler.GeneratorConfig;
import org.eclipse.xtext.xbase.compiler.IGeneratorConfigProvider;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.feature.FeatureStandaloneSetup;
import org.jnario.spec.SpecStandaloneSetup;
import org.jnario.suite.SuiteStandaloneSetup;

@SuppressWarnings("all")
public class JnarioStandaloneCompiler extends XtendBatchCompiler {
  private final static Logger log = Logger.getLogger(JnarioStandaloneCompiler.class.getName());
  
  @Inject
  private IEncodingProvider.Runtime encodingProvider;
  
  @Inject
  private IStubGenerator stubGenerator;
  
  private List<Injector> injectors;
  
  private Map<String, Injector> injectorMap;
  
  public static JnarioStandaloneCompiler create() {
    XtendStandaloneSetup _xtendStandaloneSetup = new XtendStandaloneSetup();
    FeatureStandaloneSetup _featureStandaloneSetup = new FeatureStandaloneSetup();
    SpecStandaloneSetup _specStandaloneSetup = new SpecStandaloneSetup();
    SuiteStandaloneSetup _suiteStandaloneSetup = new SuiteStandaloneSetup();
    final List<? extends ISetup> setups = Collections.<ISetup>unmodifiableList(Lists.<ISetup>newArrayList(_xtendStandaloneSetup, _featureStandaloneSetup, _specStandaloneSetup, _suiteStandaloneSetup));
    return new JnarioStandaloneCompiler(setups);
  }
  
  public JnarioStandaloneCompiler(final List<? extends ISetup> setups) {
    final Function1<ISetup, Injector> _function = new Function1<ISetup, Injector>() {
      public Injector apply(final ISetup it) {
        return it.createInjectorAndDoEMFRegistration();
      }
    };
    List<Injector> _map = ListExtensions.map(setups, _function);
    this.injectors = _map;
    Injector _head = IterableExtensions.<Injector>head(this.injectors);
    _head.injectMembers(this);
    final Function1<Injector, Pair<String, Injector>> _function_1 = new Function1<Injector, Pair<String, Injector>>() {
      public Pair<String, Injector> apply(final Injector it) {
        Pair<String, Injector> _xblockexpression = null;
        {
          FileExtensionProvider _instance = it.<FileExtensionProvider>getInstance(FileExtensionProvider.class);
          final String fileExtension = _instance.getPrimaryFileExtension();
          _xblockexpression = Pair.<String, Injector>of(fileExtension, it);
        }
        return _xblockexpression;
      }
    };
    List<Pair<String, Injector>> _map_1 = ListExtensions.<Injector, Pair<String, Injector>>map(this.injectors, _function_1);
    HashMap<String, Injector> _newHashMap = CollectionLiterals.<String, Injector>newHashMap(((Pair<? extends String, ? extends Injector>[])Conversions.unwrapArray(_map_1, Pair.class)));
    this.injectorMap = _newHashMap;
  }
  
  protected ResourceSet loadXtendFiles(final ResourceSet resourceSet) {
    EList<Adapter> _eAdapters = resourceSet.eAdapters();
    _eAdapters.add(
      new FlatResourceSetBasedAllContainersState(resourceSet) {
        public Collection<URI> getContainedURIs(final String containerHandle) {
          EList<Resource> _resources = resourceSet.getResources();
          int _size = _resources.size();
          final ArrayList<URI> uris = Lists.<URI>newArrayListWithCapacity(_size);
          EList<Resource> _resources_1 = resourceSet.getResources();
          for (final Resource r : _resources_1) {
            URI _uRI = r.getURI();
            uris.add(_uRI);
          }
          return uris;
        }
      });
    String _fileEncoding = this.getFileEncoding();
    this.encodingProvider.setDefaultEncoding(_fileEncoding);
    final List<NameBasedFilter> nameBasedFilter = this.getNameBasedFilters();
    final PathTraverser pathTraverser = new PathTraverser();
    final List<String> sourcePathDirectories = this.getSourcePathDirectories();
    final Predicate<URI> _function = new Predicate<URI>() {
      public boolean apply(final URI src) {
        final Function1<NameBasedFilter, Boolean> _function = new Function1<NameBasedFilter, Boolean>() {
          public Boolean apply(final NameBasedFilter it) {
            return Boolean.valueOf(it.matches(src));
          }
        };
        return IterableExtensions.<NameBasedFilter>exists(nameBasedFilter, _function);
      }
    };
    final Multimap<String, URI> pathes = pathTraverser.resolvePathes(sourcePathDirectories, _function);
    Set<String> _keySet = pathes.keySet();
    final Procedure1<String> _function_1 = new Procedure1<String>() {
      public void apply(final String src) {
        final URI baseDir = URI.createFileURI((src + "/"));
        Joiner _on = Joiner.on("_");
        String[] _segments = baseDir.segments();
        final String identifier = _on.join(_segments);
        final URI platformResourceURI = URI.createPlatformResourceURI((identifier + "/"), true);
        URIConverter _uRIConverter = resourceSet.getURIConverter();
        Map<URI, URI> _uRIMap = _uRIConverter.getURIMap();
        _uRIMap.put(platformResourceURI, baseDir);
        Collection<URI> _get = pathes.get(src);
        for (final URI uri : _get) {
          {
            boolean _isDebugEnabled = JnarioStandaloneCompiler.log.isDebugEnabled();
            if (_isDebugEnabled) {
              JnarioStandaloneCompiler.log.debug((("load xtend file \'" + uri) + "\'"));
            }
            final URI uriToUse = uri.replacePrefix(baseDir, platformResourceURI);
            resourceSet.getResource(uriToUse, true);
          }
        }
      }
    };
    IterableExtensions.<String>forEach(_keySet, _function_1);
    return resourceSet;
  }
  
  public List<NameBasedFilter> getNameBasedFilters() {
    final Function1<Injector, NameBasedFilter> _function = new Function1<Injector, NameBasedFilter>() {
      public NameBasedFilter apply(final Injector it) {
        NameBasedFilter _xblockexpression = null;
        {
          final NameBasedFilter filter = new NameBasedFilter();
          FileExtensionProvider _instance = it.<FileExtensionProvider>getInstance(FileExtensionProvider.class);
          String _primaryFileExtension = _instance.getPrimaryFileExtension();
          filter.setExtension(_primaryFileExtension);
          _xblockexpression = filter;
        }
        return _xblockexpression;
      }
    };
    return ListExtensions.<Injector, NameBasedFilter>map(this.injectors, _function);
  }
  
  public File createStubs(final ResourceSet resourceSet) {
    final File outputDirectory = this.createTempDir("stubs");
    final JavaIoFileSystemAccess fileSystemAccess = this.javaIoFileSystemAccessProvider.get();
    String _string = outputDirectory.toString();
    fileSystemAccess.setOutputPath(_string);
    EList<Resource> _resources = resourceSet.getResources();
    ArrayList<Resource> _newArrayList = Lists.<Resource>newArrayList(_resources);
    final Procedure1<Resource> _function = new Procedure1<Resource>() {
      public void apply(final Resource it) {
        IResourceDescription.Manager _findResourceDescriptionManager = JnarioStandaloneCompiler.this.findResourceDescriptionManager(it);
        final IResourceDescription description = _findResourceDescriptionManager.getResourceDescription(it);
        JnarioStandaloneCompiler.this.stubGenerator.doGenerateStubs(fileSystemAccess, description);
      }
    };
    IterableExtensions.<Resource>forEach(_newArrayList, _function);
    return outputDirectory;
  }
  
  public IResourceDescription.Manager findResourceDescriptionManager(final Resource resource) {
    return this.<IResourceDescription.Manager>getInstance(resource, IResourceDescription.Manager.class);
  }
  
  public <T extends Object> T getInstance(final Resource resource, final Class<T> type) {
    URI _uRI = resource.getURI();
    String _fileExtension = _uRI.fileExtension();
    String _lowerCase = _fileExtension.toLowerCase();
    Injector _get = this.injectorMap.get(_lowerCase);
    return _get.<T>getInstance(type);
  }
  
  public void generateJavaFiles(final ResourceSet resourceSet) {
    final JavaIoFileSystemAccess javaIoFileSystemAccess = this.javaIoFileSystemAccessProvider.get();
    javaIoFileSystemAccess.setOutputPath(this.outputPath);
    javaIoFileSystemAccess.setWriteTrace(this.writeTraceFiles);
    final ResourceSetBasedResourceDescriptions resourceDescriptions = this.getResourceDescriptions(resourceSet);
    final Iterable<IEObjectDescription> exportedObjectsByType = resourceDescriptions.getExportedObjectsByType(TypesPackage.Literals.JVM_DECLARED_TYPE);
    boolean _isInfoEnabled = JnarioStandaloneCompiler.log.isInfoEnabled();
    if (_isInfoEnabled) {
      final int size = IterableExtensions.size(exportedObjectsByType);
      if ((size == 0)) {
        JnarioStandaloneCompiler.log.info((("No sources to compile in \'" + this.sourcePath) + "\'"));
      } else {
        String _xifexpression = null;
        if ((size == 1)) {
          _xifexpression = "file";
        } else {
          _xifexpression = "files";
        }
        String _plus = ((("Compiling " + Integer.valueOf(size)) + " source ") + _xifexpression);
        String _plus_1 = (_plus + " to ");
        String _plus_2 = (_plus_1 + this.outputPath);
        JnarioStandaloneCompiler.log.info(_plus_2);
      }
    }
    final Function1<IEObjectDescription, Boolean> _function = new Function1<IEObjectDescription, Boolean>() {
      public Boolean apply(final IEObjectDescription it) {
        String _userData = it.getUserData(JvmTypesResourceDescriptionStrategy.IS_NESTED_TYPE);
        return Boolean.valueOf(Objects.equal(_userData, null));
      }
    };
    Iterable<IEObjectDescription> _filter = IterableExtensions.<IEObjectDescription>filter(exportedObjectsByType, _function);
    final Procedure1<IEObjectDescription> _function_1 = new Procedure1<IEObjectDescription>() {
      public void apply(final IEObjectDescription eObjectDescription) {
        EObject _eObjectOrProxy = eObjectDescription.getEObjectOrProxy();
        final JvmDeclaredType jvmGenericType = ((JvmDeclaredType) _eObjectOrProxy);
        Resource _eResource = jvmGenericType.eResource();
        final JvmModelGenerator generator = JnarioStandaloneCompiler.this.<JvmModelGenerator>getInstance(_eResource, JvmModelGenerator.class);
        Resource _eResource_1 = jvmGenericType.eResource();
        final IGeneratorConfigProvider generatorConfig = JnarioStandaloneCompiler.this.<IGeneratorConfigProvider>getInstance(_eResource_1, IGeneratorConfigProvider.class);
        Resource _eResource_2 = jvmGenericType.eResource();
        final IQualifiedNameProvider nameProvider = JnarioStandaloneCompiler.this.<IQualifiedNameProvider>getInstance(_eResource_2, IQualifiedNameProvider.class);
        GeneratorConfig _get = generatorConfig.get(jvmGenericType);
        final CharSequence generatedType = generator.generateType(jvmGenericType, _get);
        final QualifiedName qualifiedName = nameProvider.getFullyQualifiedName(jvmGenericType);
        boolean _isDebugEnabled = JnarioStandaloneCompiler.log.isDebugEnabled();
        if (_isDebugEnabled) {
          String _javaFileName = JnarioStandaloneCompiler.this.getJavaFileName(qualifiedName);
          String _plus = ((("write \'" + JnarioStandaloneCompiler.this.outputPath) + File.separator) + _javaFileName);
          String _plus_1 = (_plus + "\'");
          JnarioStandaloneCompiler.log.debug(_plus_1);
        }
        String _javaFileName_1 = JnarioStandaloneCompiler.this.getJavaFileName(qualifiedName);
        javaIoFileSystemAccess.generateFile(_javaFileName_1, generatedType);
      }
    };
    IterableExtensions.<IEObjectDescription>forEach(_filter, _function_1);
  }
  
  public String getJavaFileName(final QualifiedName typeName) {
    List<String> _segments = typeName.getSegments();
    String _concat = Strings.concat("/", _segments);
    return (_concat + ".java");
  }
}
