/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.ui.tests.util.builders;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.xtext.util.StringInputStream;

import com.google.common.base.Joiner;

@SuppressWarnings("nls")
public class FileBuilder extends AbstractBuilder<IFile> implements ResourceBuilder {
	

	private static final String LINEBREAK = "\n";
	private String content = "";
	private String name;

	protected FileBuilder(String name, String content) {
		this(name);
		this.content = content;
	}
	

	protected FileBuilder(String name) {
		this.name  = name;
	}

	public static FileBuilder file(String name) {
		return new FileBuilder(name);
	}
	
	public FileBuilder with(String... lines){
		content = Joiner.on(LINEBREAK).join(lines);
		return this;
	}

	/* (non-Javadoc)
	 * @see de.bmw.rhmi.tests.util.ResourceBuilder#build(org.eclipse.core.resources.IContainer)
	 */
	public IFile build(IContainer container) throws CoreException {
		result = container.getFile(new Path(name));
		result.create(getInputStream(), true, new NullProgressMonitor());
		return result;
	}

	protected StringInputStream getInputStream() {
		return new StringInputStream(content);
	}


	public static FileBuilder resourceFile(String name) {
		return new FileBuilder(name + ".strings", "SID_SAMPLE=\"Text sampl\"");
	}


	public static FileBuilder sampleImage(String name) {
		return new FileBuilder(name, "dummy content");
	}
}
