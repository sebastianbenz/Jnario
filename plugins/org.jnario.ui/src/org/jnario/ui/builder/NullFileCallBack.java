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
