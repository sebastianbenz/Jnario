/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.ui.tests.util.builders;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;

public class FolderBuilder extends AbstractBuilder<IFolder> implements ResourceBuilder{

	private final String folderName;
	private ResourceBuilder[] children = new ResourceBuilder[0];

	public FolderBuilder(String folderName) {
		this.folderName = folderName;
	}

	public static FolderBuilder folder(String folderName) {
		return new FolderBuilder(folderName);
	}

	public IFolder build(IContainer container) throws CoreException {
		result = container.getFolder(new Path(folderName));
		result.create(true, true, new NullProgressMonitor());
		for (ResourceBuilder child : children) {
			child.build(result);
		}
		return result;
	}

	public FolderBuilder with(ResourceBuilder... children) {
		this.children = children;
		return this;
	}

}
