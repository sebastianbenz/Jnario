/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.ui.builder;

import org.eclipse.core.resources.IFile;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2.IFileCallback;

public class NullFileCallBack implements IFileCallback {
	
	public void afterFileUpdate(IFile file) {
	}

	public void afterFileCreation(IFile file) {
	}

	public boolean beforeFileDeletion(IFile file) {
		return true;
	}

}
