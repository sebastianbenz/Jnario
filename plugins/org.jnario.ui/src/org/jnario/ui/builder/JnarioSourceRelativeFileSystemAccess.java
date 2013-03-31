/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/**
 * 
 */
package org.jnario.ui.builder;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.xtend.ide.builder.SourceRelativeFileSystemAccess;
import org.jnario.generator.JnarioEncodingProvider;

import com.google.inject.Inject;

/**
 * @author Sebastian Benz
 *
 */
@SuppressWarnings("restriction")
public class JnarioSourceRelativeFileSystemAccess extends
		SourceRelativeFileSystemAccess {
	
	@Inject
	private JnarioEncodingProvider encodingProvider;
	
	@Override
	protected String getEncoding(IFile file) throws CoreException {
		String charset;
		try {
			charset = file.getCharset(true);
		} catch (CoreException e) {
			throw new RuntimeException(e);
		}
		return encodingProvider.getEncoding(file.getFileExtension(), charset);
	}
}
