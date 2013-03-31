/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.ui.wizards;


import org.eclipse.jdt.junit.wizards.NewTestCaseWizardPageOne;
import org.jnario.ui.wizards.JnarioFileCreator;
import org.jnario.ui.wizards.NewJnarioFileWizardPageOne;

/**
 * partially copied from {@link NewTestCaseWizardPageOne}
 */
public class NewSuiteWizardPageOne extends NewJnarioFileWizardPageOne {

	public NewSuiteWizardPageOne(JnarioFileCreator featureCreator) {
		super(featureCreator);
	}
	
	protected String title() {
		return "Suite";
	}

	@Override
	protected String fileExtension() {
		return "suite";
	}

}
