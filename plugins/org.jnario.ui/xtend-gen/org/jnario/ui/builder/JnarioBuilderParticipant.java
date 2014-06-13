/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.ui.builder;

import com.google.inject.Inject;
import com.google.inject.Provider;
import java.util.List;
import java.util.Map;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtend.ide.builder.XtendBuilderParticipant;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.builder.EclipseSourceFolderProvider;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.doc.HtmlAssets;
import org.jnario.ui.builder.NullFileCallBack;

@SuppressWarnings("all")
public class JnarioBuilderParticipant extends XtendBuilderParticipant {
  @Inject
  private Provider<EclipseResourceFileSystemAccess2> fileSystemAccessProvider;
  
  @Inject
  private HtmlAssets htmlAssets;
  
  @Inject
  private EclipseSourceFolderProvider sourceFolders;
  
  public void build(final IXtextBuilderParticipant.IBuildContext context, final IProgressMonitor monitor) throws CoreException {
    super.build(context, monitor);
    IProject _builtProject = context.getBuiltProject();
    List<? extends IContainer> _sourceFolders = this.sourceFolders.getSourceFolders(_builtProject);
    final Procedure1<IContainer> _function = new Procedure1<IContainer>() {
      public void apply(final IContainer source) {
        List<IResourceDescription.Delta> _relevantDeltas = JnarioBuilderParticipant.this.getRelevantDeltas(context);
        final Function1<IResourceDescription.Delta, Boolean> _function = new Function1<IResourceDescription.Delta, Boolean>() {
          public Boolean apply(final IResourceDescription.Delta it) {
            URI _uri = it.getUri();
            String _string = _uri.toString();
            String _makeProjectRelative = JnarioBuilderParticipant.this.makeProjectRelative(source);
            return Boolean.valueOf(_string.contains(_makeProjectRelative));
          }
        };
        boolean _exists = IterableExtensions.<IResourceDescription.Delta>exists(_relevantDeltas, _function);
        if (_exists) {
          EclipseResourceFileSystemAccess2 _createFsa = JnarioBuilderParticipant.this.createFsa(context, source);
          JnarioBuilderParticipant.this.htmlAssets.generate(_createFsa);
        }
      }
    };
    IterableExtensions.forEach(_sourceFolders, _function);
  }
  
  private EclipseResourceFileSystemAccess2 createFsa(final IXtextBuilderParticipant.IBuildContext context, final IContainer source) {
    final EclipseResourceFileSystemAccess2 fsa = this.fileSystemAccessProvider.get();
    final IProject builtProject = context.getBuiltProject();
    fsa.setProject(builtProject);
    Map<String, OutputConfiguration> _outputConfigurations = this.getOutputConfigurations(context);
    fsa.setOutputConfigurations(_outputConfigurations);
    NullProgressMonitor _nullProgressMonitor = new NullProgressMonitor();
    fsa.setMonitor(_nullProgressMonitor);
    NullFileCallBack _nullFileCallBack = new NullFileCallBack();
    fsa.setPostProcessor(_nullFileCallBack);
    String _makeProjectRelative = this.makeProjectRelative(source);
    fsa.setCurrentSource(_makeProjectRelative);
    return fsa;
  }
  
  private String makeProjectRelative(final IContainer source) {
    IPath _fullPath = source.getFullPath();
    IProject _project = source.getProject();
    IPath _fullPath_1 = _project.getFullPath();
    IPath _makeRelativeTo = _fullPath.makeRelativeTo(_fullPath_1);
    return _makeRelativeTo.toString();
  }
}
