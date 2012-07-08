/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.ui.wizards;

import org.jnario.ui.wizards.NewJnarioFileWizard;
import org.jnario.ui.wizards.NewJnarioFileWizardPageOne;

import com.google.inject.Inject;

public class NewFeatureWizard extends NewJnarioFileWizard {

	@Inject
	private FeatureCreator featureCreator;
	
	private NewJnarioFileWizardPageOne fPage1;

	public NewFeatureWizard() {
		super("New Jnario Feature");
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

	@Override
	public NewJnarioFileWizardPageOne getFirstPage() {
		return fPage1;
	}

}
