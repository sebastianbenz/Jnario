/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.ui.tests.util.builders;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;

public class Builders {
	
	public static IProject make(ProjectBuilder builder) throws CoreException{
		return builder.build(null);
	}
	
	public static ProjectBuilder project(String name){
		return ProjectBuilder.newProject(name);
	}
	
	public static FileBuilder file(String name){
		return FileBuilder.file(name);
	}

	public static ResourceBuilder app(String appName) {
		return file("app.app").with("name " + appName,
				"type OnlineService",
				"weight 700",
				"default-brand BMW",
				"default-localization de");
	}

}
