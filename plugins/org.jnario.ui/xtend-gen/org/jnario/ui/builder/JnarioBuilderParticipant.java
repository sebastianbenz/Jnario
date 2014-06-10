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
import java.util.Map;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.xtend.ide.builder.XtendBuilderParticipant;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.jnario.doc.HtmlAssets;
import org.jnario.ui.builder.NullFileCallBack;

@SuppressWarnings("all")
public class JnarioBuilderParticipant extends XtendBuilderParticipant {
  @Inject
  private Provider<EclipseResourceFileSystemAccess2> fileSystemAccessProvider;
  
  @Inject
  private HtmlAssets htmlAssets;
  
  public void build(final IXtextBuilderParticipant.IBuildContext context, final IProgressMonitor monitor) throws CoreException {
    super.build(context, monitor);
    EclipseResourceFileSystemAccess2 _createFsa = this.createFsa(context);
    this.htmlAssets.generate(_createFsa);
  }
  
  private EclipseResourceFileSystemAccess2 createFsa(final IXtextBuilderParticipant.IBuildContext context) {
    final EclipseResourceFileSystemAccess2 fsa = this.fileSystemAccessProvider.get();
    final IProject builtProject = context.getBuiltProject();
    fsa.setProject(builtProject);
    Map<String, OutputConfiguration> _outputConfigurations = this.getOutputConfigurations(context);
    fsa.setOutputConfigurations(_outputConfigurations);
    NullProgressMonitor _nullProgressMonitor = new NullProgressMonitor();
    fsa.setMonitor(_nullProgressMonitor);
    NullFileCallBack _nullFileCallBack = new NullFileCallBack();
    fsa.setPostProcessor(_nullFileCallBack);
    return fsa;
  }
}
