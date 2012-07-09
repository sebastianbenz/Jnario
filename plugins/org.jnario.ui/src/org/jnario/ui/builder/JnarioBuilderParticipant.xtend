package org.jnario.ui.builder

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.xtend.ide.builder.XtendBuilderParticipant
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2
import org.eclipse.xtext.builder.IXtextBuilderParticipant$IBuildContext
import org.jnario.doc.HtmlAssets
import static org.jnario.doc.DocOutputConfigurationProvider.*
import org.eclipse.core.runtime.NullProgressMonitor

class JnarioBuilderParticipant extends XtendBuilderParticipant {
	
	@Inject Provider<EclipseResourceFileSystemAccess2> fileSystemAccessProvider
	@Inject HtmlAssets htmlAssets
	
	override build(IBuildContext context, IProgressMonitor monitor) throws CoreException {
		super.build(context, monitor)
		htmlAssets.generate(createFsa(context))
	}
	
	def private createFsa(IBuildContext context){
		val fsa = fileSystemAccessProvider.get();
		val builtProject = context.getBuiltProject();
		fsa.setProject(builtProject);
		fsa.setOutputConfigurations(getOutputConfigurations(context))
		fsa.setMonitor(new NullProgressMonitor)
		fsa.setPostProcessor(new NullFileCallBack)
		return fsa
	}
	
}