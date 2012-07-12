/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.ui.buildpath;

import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.internal.ui.JavaPluginImages;
import org.eclipse.jdt.ui.wizards.IClasspathContainerPage;
import org.eclipse.jdt.ui.wizards.NewElementWizardPage;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

@SuppressWarnings("restriction")
public class JnarioContainerWizardPage extends NewElementWizardPage implements IClasspathContainerPage  {

	private IClasspathEntry containerEntry;

	public JnarioContainerWizardPage() {
		super("JnarioClassPathContainer"); //$NON-NLS-1$
		setTitle("Jnario Library");
		setImageDescriptor(JavaPluginImages.DESC_WIZBAN_ADD_LIBRARY);
		setDescription("This read-only container manages the Jnario dependencies.");
		this.containerEntry = JavaCore.newContainerEntry(JnarioContainerInitializer.JNARIO_LIBRARY_PATH);
	}

	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new FillLayout());
		Label label = new Label(composite, SWT.NONE);
		String aboutText = NLS.bind("This library provides all required and convenient dependency for Jnario projects.\n\nContainer includes:\n{0}\n", containedBundles());
		label.setText(aboutText);
		setControl(composite);
	}

	private String containedBundles() {
		StringBuilder builder = new StringBuilder();
		for (String bundleId : JnarioContainerInitializer.BUNDLE_IDS_TO_INCLUDE) {
			builder.append("\t").append(bundleId).append("\n");
		}
		return builder.toString();
	}

	public boolean finish() {
		return true;
	}

	public IClasspathEntry getSelection() {
		return containerEntry;

	}

	public void setSelection(IClasspathEntry containerEntry) {
		//do nothing
	}
	
}
