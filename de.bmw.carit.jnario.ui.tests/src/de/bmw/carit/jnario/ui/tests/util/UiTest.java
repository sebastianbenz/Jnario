package de.bmw.carit.jnario.ui.tests.util;

import static de.bmw.carit.jnario.ui.tests.util.Workspaces.cleanWorkspace;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.resource.IExternalContentSupport;
import org.eclipse.xtext.resource.IExternalContentSupport.IExternalContentProvider;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.junit.After;
import org.junit.Rule;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

import de.bmw.carit.jnario.JnarioUiInjectorProvider;
import de.bmw.carit.jnario.tests.util.JnarioTestRunner;
import de.bmw.carit.jnario.ui.tests.util.builders.Builders;
import de.bmw.carit.jnario.ui.tests.util.builders.ProjectBuilder;

@RunWith(JnarioTestRunner.class)
@InjectWith(JnarioUiInjectorProvider.class)
public abstract class UiTest {

	@Rule public UiTestRule uiTest = new UiTestRule();
	
	@Inject
	private IResourceSetProvider resourceSetProvider;
	
	@Inject
	private IExternalContentSupport externalContentSupport;

	@Inject
	private IExternalContentProvider contentProvider;

	protected IProject project;
	private ResourceSet resourceSet;

	@After
	public void tearDown() throws CoreException{
		cleanWorkspace();
	}
	
	protected IProject make(ProjectBuilder projectBuilder) throws CoreException{
		project = Builders.make(projectBuilder);
		resourceSet = resourceSetProvider.get(project);
		externalContentSupport.configureResourceSet(resourceSet, contentProvider);
		return project;
	}

	protected Resource load(String path) {
		URI uri = URI.createPlatformResourceURI(path, true);
		Resource resource = resourceSet.getResource(uri, true);
		return resource;
	}
	
	protected void loadProject(String name) throws CoreException {
		Files.getProject(name).accept(new IResourceVisitor() {
			
			public boolean visit(IResource resource) throws CoreException {
				if (resource instanceof IFile) {
					try{
						load(resource.getFullPath().toString());
					}catch (Exception e) {
					}
				}
				return true;
			}
		});
	}

}
