/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.ui.wizards;

import org.eclipse.jdt.internal.junit.wizards.NewTestCaseCreationWizard;
import org.jnario.ui.wizards.NewJnarioFileWizard;
import org.jnario.ui.wizards.NewJnarioFileWizardPageOne;

import com.google.inject.Inject;

/**
 * partially copied from {@link NewTestCaseCreationWizard}
 */
@SuppressWarnings("restriction")
public class NewSpecWizard extends NewJnarioFileWizard {

	@Inject
	private SpecCreator specUtil;
	
	private NewSpecWizardPageOne fPage1;
	private NewSpecWizardPageTwo fPage2;

	public NewSpecWizard() {
		super("Jnario Unit Spec");
	}

	/*
	 * @see Wizard#createPages
	 */
	@Override
	public void addPages() {
		super.addPages();
		fPage2= new NewSpecWizardPageTwo();
		fPage1= new NewSpecWizardPageOne(fPage2, specUtil);
		addPage(fPage1);
		fPage1.init(getSelection());
		addPage(fPage2);
	}

	@Override
	public NewJnarioFileWizardPageOne getFirstPage() {
		return fPage1;
	}

}
