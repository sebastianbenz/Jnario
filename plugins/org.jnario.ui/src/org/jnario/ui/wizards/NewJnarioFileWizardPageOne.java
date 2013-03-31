/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.ui.wizards;

import java.io.ByteArrayInputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.ui.dialogs.TextFieldNavigationHandler;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.DialogField;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.LayoutUtil;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.StringDialogField;
import org.eclipse.jdt.ui.wizards.NewTypeWizardPage;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Text;

@SuppressWarnings("restriction")
public abstract class NewJnarioFileWizardPageOne extends NewTypeWizardPage {

	private static final String PAGE_NAME = "NewTestCaseCreationWizardPage";
	private Link fLink;
	private Label fImage;
	private IResource fResource;
	private JnarioFileCreator featureCreator;
	private StringDialogField descriptionDialogField;

	public NewJnarioFileWizardPageOne(JnarioFileCreator featureCreator) {
		super(true, PAGE_NAME);
		this.featureCreator = featureCreator;

		setTitle("Jnario " + title());
		setDescription("Select the name of the new " + title() + " file.");

		descriptionDialogField = new StringDialogField();
		descriptionDialogField.setLabelText(title() + ":");
	}

	protected abstract String title();
	
	public void init(IStructuredSelection selection) {
		IJavaElement element = getInitialJavaElement(selection);
		initContainerPage(element);
		initTypePage(element);
		updateStatus(getStatusList());
	}

	@Override
	protected void handleFieldChanged(String fieldName) {
		super.handleFieldChanged(fieldName);
		if (fieldName.equals(CONTAINER)) {
			updateBuildPathMessage();
		}
		updateStatus(getStatusList());
	}

	protected IStatus[] getStatusList() {
		return new IStatus[] { fContainerStatus, fPackageStatus,
				fTypeNameStatus, fModifierStatus, fSuperClassStatus };
	}

	public void createControl(Composite parent) {
		initializeDialogUnits(parent);
	
		Composite composite = new Composite(parent, SWT.NONE);
	
		int nColumns = 4;
	
		GridLayout layout = new GridLayout();
		layout.numColumns = nColumns;
		composite.setLayout(layout);
		createContainerControls(composite, nColumns);
		createPackageControls(composite, nColumns);
		createTypeNameControls(composite, nColumns);
		createSeparator(composite, nColumns);
		createDescriptionControls(composite, nColumns);
	
		setControl(composite);
	
		// set default and focus
		Dialog.applyDialogFont(composite);
	
		setFocus();
	}

	protected void createDescriptionControls(Composite composite, int nColumns) {
		descriptionDialogField.setText("");
		descriptionDialogField.doFillIntoGrid(composite, nColumns - 1);
		DialogField.createEmptySpace(composite);
	
		Text text = descriptionDialogField.getTextControl(null);
		LayoutUtil.setWidthHint(text, getMaxFieldWidth());
		TextFieldNavigationHandler.install(text);
	}

	private void updateBuildPathMessage() {
		if (fLink == null || fLink.isDisposed()) {
			return;
		}
	
		String message = null;
		fLink.setVisible(message != null);
		fImage.setVisible(message != null);
	}


	@Override
	public boolean canFlipToNextPage() {
		return false;
	}

	public void createType(IProgressMonitor monitor) {
		if (monitor == null) {
			monitor = new NullProgressMonitor();
		}
		if (!getPackageFragment().exists()) {
			try {
				getPackageFragmentRoot().createPackageFragment(
						getPackageFragment().getElementName(), true, monitor);
			} catch (JavaModelException e) {
				displayError("Could not create package", e.getMessage());
			}
		}
		IResource res = getPackageFragment().getResource();
		IFile specFile = null;
		specFile = ((IFolder) res).getFile(getTypeName() + "." + fileExtension()); //$NON-NLS-1$
		try {
			String contents = featureCreator.create(getJavaProject(),
					descriptionDialogField.getText(), getPackageFragment(),
					monitor);
			specFile.create(new ByteArrayInputStream(contents.getBytes()),
					true, monitor);
			this.fResource = specFile;
		} catch (CoreException e) {
			displayError("Could not create " + title(), e.getMessage());
		}
	}

	protected abstract String fileExtension();

	public IResource getResource() {
		return fResource;
	}

	private void displayError(final String title, final String message) {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				MessageDialog.openError(getShell(), title, message);
			}
		});
	}

	public void setSpecDescription(String text) {
		descriptionDialogField.setText(text);
	}

	public String getDescriptionFieldValue() {
		return descriptionDialogField.getText();
	}
}