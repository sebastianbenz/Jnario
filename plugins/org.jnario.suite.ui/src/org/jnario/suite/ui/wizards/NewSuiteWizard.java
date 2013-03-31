/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.ui.wizards;

import org.jnario.ui.wizards.NewJnarioFileWizard;
import org.jnario.ui.wizards.NewJnarioFileWizardPageOne;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class NewSuiteWizard extends NewJnarioFileWizard {

	@Inject
	private SuiteCreator featureCreator;
	
	private NewJnarioFileWizardPageOne fPage1;

	public NewSuiteWizard() {
		super("New Jnario Suite");
	}

	/*
	 * @see Wizard#createPages
	 */
	@Override
	public void addPages() {
		super.addPages();
		fPage1= new NewSuiteWizardPageOne(featureCreator);
		addPage(fPage1);
		fPage1.init(getSelection());
	}

	@Override
	public NewJnarioFileWizardPageOne getFirstPage() {
		return fPage1;
	}

}
