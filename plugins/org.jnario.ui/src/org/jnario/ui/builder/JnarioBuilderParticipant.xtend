/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.ui.builder

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.core.resources.IContainer
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.xtend.ide.builder.XtendBuilderParticipant
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2
import org.eclipse.xtext.builder.EclipseSourceFolderProvider
import org.jnario.doc.HtmlAssets

class JnarioBuilderParticipant extends XtendBuilderParticipant {

	@Inject Provider<EclipseResourceFileSystemAccess2> fileSystemAccessProvider
	@Inject HtmlAssets htmlAssets
	@Inject EclipseSourceFolderProvider sourceFolders

	override build(IBuildContext context, IProgressMonitor monitor) throws CoreException {
		super.build(context, monitor)
		sourceFolders.getSourceFolders(context.builtProject).forEach [ source |
			if (context.relevantDeltas.exists[uri.toString.contains(source.makeProjectRelative)]) {
				htmlAssets.generate(createFsa(context, source))
			}
		]
	}

	def private createFsa(IBuildContext context, IContainer source) {
		val fsa = fileSystemAccessProvider.get();
		val builtProject = context.getBuiltProject();
		fsa.setProject(builtProject);
		fsa.setOutputConfigurations(getOutputConfigurations(context))
		fsa.setMonitor(new NullProgressMonitor)
		fsa.setPostProcessor(new NullFileCallBack)
		fsa.currentSource = source.makeProjectRelative
		return fsa
	}

	def private makeProjectRelative(IContainer source) {
		source.fullPath.makeRelativeTo(source.project.fullPath).toString

	}

}
