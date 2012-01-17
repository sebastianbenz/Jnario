/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.ui.tests.util.builders;

import static de.bmw.carit.jnario.ui.tests.util.Workspaces.assumeRunningEclipse;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.xtext.builder.nature.ToggleXtextNatureAction;

@SuppressWarnings({ "nls", "restriction" })
public class ProjectBuilder extends AbstractBuilder<IProject>{

	private String name = "test";
	private String[] referencedProjects = new String[0];
	private ResourceBuilder[] children =  new ResourceBuilder[0];
	private IProject project;

	protected ProjectBuilder(String name) {
		name(name);
	}

	public static ProjectBuilder newProject() {
		return new ProjectBuilder("test");
	}

	public static ProjectBuilder newProject(String name) {
		return new ProjectBuilder(name);
	}

	public ProjectBuilder references(String... referencedProjects) {
		this.referencedProjects = referencedProjects;
		return this;
	}

	public ProjectBuilder with(ResourceBuilder... children) {
		this.children  = children;
		return this;
	}

	public ProjectBuilder name(String name) {
		this.name = name;
		return this;
	}

	public IProject build(IContainer dontCare) throws CoreException {
		assumeRunningEclipse();
		IProject project = createProject(name);
		setProjectReferences(project);
		new ToggleXtextNatureAction().toggleNature(project);
		for (ResourceBuilder resourceBuilder : children) {
			resourceBuilder.build(project);
		}
		return project;
	}

	private void setProjectReferences(IProject project) throws CoreException {
		IProjectDescription description = project.getDescription();
		IProject[] oldReferencedProjects = description.getReferencedProjects();
		IProject[] newReferencedProjects = new IProject[oldReferencedProjects.length + referencedProjects.length];
		System.arraycopy(oldReferencedProjects, 0, newReferencedProjects, 0, oldReferencedProjects.length);
		int i = oldReferencedProjects.length;
		for (String referencedProjectName : referencedProjects) {
			IProject referencedProject = getOrCreateReferencedProject(referencedProjectName);
			newReferencedProjects[i] = referencedProject;
			i++;
		}
		description.setReferencedProjects(newReferencedProjects);
		project.setDescription(description, monitor());
	}

	private NullProgressMonitor monitor() {
		return new NullProgressMonitor();
	}

	private IProject getOrCreateReferencedProject(String name) throws CoreException {
		IProject project = workspaceRoot().getProject(name);
		if (!project.exists()) {
			createProject(name);
		}
		return project;
	}

	private IProject createProject(String projectName) throws CoreException {
		project = workspaceRoot().getProject(projectName);
		if (project.exists()) {
			project.delete(true, monitor());
		}
		project.create(monitor());
		project.open(monitor());
		return project;
	}

	private IWorkspaceRoot workspaceRoot() {
		return ResourcesPlugin.getWorkspace().getRoot();
	}

	public IProject get() {
		return project;
	}

}
