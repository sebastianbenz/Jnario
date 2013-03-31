/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.ui.wizards;

import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.internal.junit.ui.JUnitPlugin;
import org.eclipse.jdt.internal.junit.wizards.JUnitWizard;
import org.eclipse.jface.operation.IRunnableWithProgress;

@SuppressWarnings("restriction")
public abstract class NewJnarioFileWizard extends JUnitWizard {

	public NewJnarioFileWizard(String title) {
		super();
		setWindowTitle(title);
		initDialogSettings();
	}

	@Override
	protected void initializeDefaultPageImageDescriptor() {
		setDefaultPageImageDescriptor(JUnitPlugin.getImageDescriptor("wizban/newtest_wiz.png")); //$NON-NLS-1$
	}
	
	public abstract NewJnarioFileWizardPageOne getFirstPage();

	@Override
	public boolean performFinish() {
		IRunnableWithProgress runnable= getFirstPage().getRunnable();
		if (finishPage(runnable)) {
			IResource resource= getFirstPage().getResource();
			if (resource != null) {
				selectAndReveal(resource);
				openResource(resource);
			}
			return true;
		}
		return false;
	}

}