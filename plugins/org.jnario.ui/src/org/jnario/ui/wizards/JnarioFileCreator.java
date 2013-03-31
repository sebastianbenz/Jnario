/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.ui.wizards;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;

public abstract class JnarioFileCreator {

	public JnarioFileCreator() {
		super();
	}

	protected String keyword(){
		// overide to implement
		return "";
	}

	public String create(IJavaProject javaProject, String description, IPackageFragment packageFragment, IProgressMonitor monitor) {
		StringBuffer sb = new StringBuffer();
		if(packageFragment.getElementName() != null && !packageFragment.getElementName().equals("")){
			sb.append("package ");
			sb.append(packageFragment.getElementName());
			sb.append("\n\n");
		}
		
		sb.append(keyword() + description + "\n");
		return sb.toString();
	}

}