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
package org.jnario.generator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;

import com.google.inject.Inject;

/**
 * @author Sebastian Benz
 *
 */
public class JnarioJavaIoFileSystemAccess extends JavaIoFileSystemAccess {

	@Inject
	private JnarioEncodingProvider encodingProvider;
	
	/* (non-Javadoc)
	 * @see org.eclipse.xtext.generator.JavaIoFileSystemAccess#getEncoding(org.eclipse.emf.common.util.URI)
	 */
	@Override
	protected String getEncoding(URI fileURI) {
		return encodingProvider.getEncoding(fileURI.fileExtension(), super.getEncoding(fileURI));
	}
	
}
