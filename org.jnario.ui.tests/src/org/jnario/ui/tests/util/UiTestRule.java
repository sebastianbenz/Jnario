/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.ui.tests.util;

import static org.jnario.ui.tests.util.Workspaces.assumeRunningEclipse;
import static org.jnario.ui.tests.util.Workspaces.cleanWorkspace;
import static org.jnario.ui.tests.util.Workspaces.closeAllOpenEditors;
import static org.jnario.ui.tests.util.Workspaces.closeWelcomePage;
import static org.jnario.ui.tests.util.Workspaces.waitForAutoBuild;

import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

public class UiTestRule implements MethodRule {

	public Statement apply(final Statement base, FrameworkMethod method, Object target) {
		prepareWorkspace();
		return new Statement() {
			
			@Override
			public void evaluate() throws Throwable {
				base.evaluate();
				closeAllOpenEditors();
			}
		};
	}
	
	public void prepareWorkspace() {
		assumeRunningEclipse();
		try{
			closeWelcomePage();
			cleanWorkspace();
			waitForAutoBuild();
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	

}
