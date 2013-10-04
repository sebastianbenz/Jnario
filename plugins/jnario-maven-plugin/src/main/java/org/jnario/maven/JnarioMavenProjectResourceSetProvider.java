package org.jnario.maven;

import org.apache.maven.project.MavenProject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend.maven.MavenProjectAdapter;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Provider;

public class JnarioMavenProjectResourceSetProvider implements Provider<ResourceSet> {

	private XtextResourceSet rs;

	public JnarioMavenProjectResourceSetProvider(MavenProject project) {
		super();
		rs = new XtextResourceSet();
		MavenProjectAdapter.install(rs, project);
	}

	public ResourceSet get() {
		return rs;
	}
}
