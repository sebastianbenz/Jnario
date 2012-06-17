/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.ui.wizards;

import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.internal.junit.ui.JUnitPlugin;
import org.eclipse.jdt.internal.junit.wizards.JUnitWizard;
import org.eclipse.jdt.internal.junit.wizards.NewTestCaseCreationWizard;
import org.eclipse.jface.operation.IRunnableWithProgress;

import com.google.inject.Inject;

/**
 * partially copied from {@link NewTestCaseCreationWizard}
 */
public class NewFeatureWizard extends JUnitWizard {

	@Inject
	private FeatureCreator featureCreator;
	
	private NewFeatureWizardPageOne fPage1;

	public NewFeatureWizard() {
		super();
		setWindowTitle("New Jnario Feature");
		initDialogSettings();
	}

	@Override
	protected void initializeDefaultPageImageDescriptor() {
		setDefaultPageImageDescriptor(JUnitPlugin.getImageDescriptor("wizban/newtest_wiz.png")); //$NON-NLS-1$
	}

	/*
	 * @see Wizard#createPages
	 */
	@Override
	public void addPages() {
		super.addPages();
		fPage1= new NewFeatureWizardPageOne(featureCreator);
		addPage(fPage1);
		fPage1.init(getSelection());
	}

	/*
	 * @see Wizard#performFinish
	 */
	@Override
	public boolean performFinish() {
		IRunnableWithProgress runnable= fPage1.getRunnable();
		if (finishPage(runnable)) {
			IResource resource= fPage1.getResource();
			if (resource != null) {
				selectAndReveal(resource);
				openResource(resource);
			}
			return true;
		}
		return false;
	}

}
