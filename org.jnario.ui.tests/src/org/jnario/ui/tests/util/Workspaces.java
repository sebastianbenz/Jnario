/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.ui.tests.util;

import junit.framework.Assert;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.junit.Assume;

public class Workspaces {

	private Workspaces() {
		// not intended to be instantiated
	}

	public static void cleanWorkspace() throws CoreException {
		IProject[] projects = root().getProjects();
		for (IProject project : projects) {
			if (project.exists() && project.isAccessible()) {
				try {
					project.delete(true, true, monitor());
				} catch (CoreException ex) {
					ex.printStackTrace();
					Assert.fail(ex.getMessage());
				}
			}
		}
	}

	public static IWorkspaceRoot root() {
		return ResourcesPlugin.getWorkspace().getRoot();
	}

	public static IProgressMonitor monitor() {
		return new NullProgressMonitor();
	}

	public static void closeWelcomePage() throws InterruptedException {
		if (PlatformUI.getWorkbench().getIntroManager().getIntro() != null) {
			PlatformUI
					.getWorkbench()
					.getIntroManager()
					.closeIntro(
							PlatformUI.getWorkbench().getIntroManager()
									.getIntro());
		}
	}

	public static void waitForAutoBuild() {
		wait(ResourcesPlugin.FAMILY_AUTO_REFRESH);
		wait(ResourcesPlugin.FAMILY_AUTO_BUILD);
	}

	private static void wait(Object jobFamily) {
		boolean wasInterrupted = false;
		do {
			try {
				Job.getJobManager().join(jobFamily, null);
				wasInterrupted = false;
			} catch (OperationCanceledException e) {
				wasInterrupted = true;
			} catch (InterruptedException e) {
				wasInterrupted = true;
			}
		} while (wasInterrupted);
	}

	public static IWorkbenchPage getActivePage() {
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage activePage = window.getActivePage();
		return activePage;
	}

	public static void setAutoBuild(boolean enabled) {
		IWorkspace ws = ResourcesPlugin.getWorkspace();
		IWorkspaceDescription desc = ws.getDescription();
		desc.setAutoBuilding(enabled);
		try {
			ws.setDescription(desc);
		} catch (CoreException ex) {
			ex.printStackTrace();
			Assert.fail("Exception while setting autobuild: " + ex.getMessage());
		}

	}

	public static void closeAllOpenEditors() {
		IWorkbench workbench = PlatformUI.getWorkbench();
		if (workbench != null && workbench.getActiveWorkbenchWindow() != null) {
			final IWorkbenchPage activePage = workbench
					.getActiveWorkbenchWindow().getActivePage();
			if (activePage != null) {
				activePage
						.closeEditors(activePage.getEditorReferences(), false);
			}
		}
	}

	public static void assumeRunningEclipse() {
		Assume.assumeTrue(Platform.isRunning());
	}

	public static IEditorPart activeEditor() {
		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
		IWorkbenchPage page = win.getActivePage();
		return page.getActiveEditor();
	}

}
