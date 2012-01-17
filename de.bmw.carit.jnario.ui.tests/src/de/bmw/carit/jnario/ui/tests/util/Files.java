/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.ui.tests.util;

import static com.google.common.base.Joiner.on;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.xtext.util.StringInputStream;

import com.google.common.base.Joiner;

public class Files {

	public static String contentsOf(IFile item) throws CoreException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(
				item.getContents()));
		StringBuilder sb = new StringBuilder();
		String line = null;

		while ((line = br.readLine()) != null) {
			sb.append(line + "\n");
		}

		br.close();
		String contents = sb.toString();
		return contents;
	}

	public static void setContent(IFile file, String... lines) throws CoreException {
		String newContent = Joiner.on("\n").join(lines);
		file.setContents(new StringInputStream(newContent ), true, true, new NullProgressMonitor());
		file.refreshLocal(1, new NullProgressMonitor());
	}


	public static IFile getFile(String file) {
		Path path = new Path(file);
		return getFile(path);
	}

	protected static IFile getFile(Path path) {
		return Files.workspace().getFile(path);
	}

	public static IWorkspaceRoot workspace() {
		return ResourcesPlugin.getWorkspace().getRoot();
	}

	public static IProject getProject(String name) {
		return workspace().getProject(name);
	}

	public static IFolder getFolder(String name) {
		return workspace().getFolder(new Path(name));
	}

	public static void setContent(Path path, String... lines) throws CoreException {
		setContent(getFile(path), lines);
	}
	
	public static void setContent(String name, String... lines) throws CoreException {
		setContent(getFile(name), lines);
	}

	public static String path(String...segments) {
		return on(File.separator).join(segments);
	}

	public static void createFolder(String targetFolder) throws CoreException {
		getFolder(targetFolder).create(true, true, new NullProgressMonitor());
	}

	public static void delete(String fileName) throws CoreException {
		workspace().getFile(new Path(fileName)).delete(true, new NullProgressMonitor());
	}

	public static void createFile(String name, String...lines) throws CoreException {
		Path path = new Path(name);
		createFile(path, lines);
	}

	public static void createFile(Path path, String... lines)
			throws CoreException {
		IFile file = getFile(path);	
		file.create(new StringInputStream(Joiner.on("\n").join(lines)), true, new NullProgressMonitor());
	}

}
