/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.generator;


public class JnarioEncodingProvider{

	public String getEncoding(String fileExtension, String defaultEncoding) {
		if("html".equals(fileExtension)){
			return "UTF8";
		}
		return defaultEncoding;
	}

}
