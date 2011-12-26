package de.bmw.carit.jnario.spec.ui.launching;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtext.builder.DerivedResourceMarkers;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.common.types.util.jdt.JavaElementFinder;
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider;
import org.eclipse.xtext.xtend2.ui.launching.JavaElementDelegate;

import com.google.inject.Inject;

import de.bmw.carit.jnario.spec.naming.ExampleNameProvider;
import de.bmw.carit.jnario.spec.spec.ExampleGroup;
import de.bmw.carit.jnario.spec.spec.SpecFile;

@SuppressWarnings("restriction")
public class SpecJavaElementDelegate extends JavaElementDelegate {
	
	private static final Logger log = Logger.getLogger(SpecJavaElementDelegate.class);
	
	@Inject
	private DerivedResourceMarkers derivedResourceMarkers;
	
	@Inject
	private ExampleNameProvider nameProvider;
	
	@Inject
	private JavaElementFinder javaElementFinder;
	
	@Inject
	private IJvmTypeProvider.Factory typeProviderFactory;
	
	@Inject
	private XtextResourceSetProvider resourceSetProvider;
	
	protected IJavaElement getJavaElementForResource(IResource resource) {
		try {
			URI uri = URI.createPlatformResourceURI(resource.getFullPath().toString(), true);
			final String getSourcePath = uri.toString();
			List<IFile> resources = derivedResourceMarkers.findDerivedResources(resource.getProject(), getSourcePath);
			if(resources.size() == 0){
				return null;
			}
			if (resources.size() == 1){
				return JavaCore.create(resources.get(0));
			}
			ResourceSet resourceSet = resourceSetProvider.get(resource.getProject());
			Resource modelResource = resourceSet.getResource(uri, true);
			if(modelResource == null || modelResource.getContents().isEmpty()){
				return null;
			}
			SpecFile specFile = (SpecFile) modelResource.getContents().get(0);
			String javaClassName = nameProvider.toJavaClassName((ExampleGroup) specFile.getXtendClass());
			javaClassName = specFile.getPackage() + "." + javaClassName;
			IJvmTypeProvider typeProvider = typeProviderFactory.createTypeProvider(resourceSet);
			JvmType jvmType = typeProvider.findTypeByName(javaClassName);
			if(jvmType == null){
				return null;
			}
			return javaElementFinder.findElementFor(jvmType);
			
		} catch (CoreException e) {
			if (log.isDebugEnabled()) {
				log.debug(e.getMessage(), e);
			}
		}
		return null;
	}

}
