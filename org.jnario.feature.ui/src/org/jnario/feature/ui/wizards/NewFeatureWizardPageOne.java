/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.ui.wizards;


import java.io.ByteArrayInputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.junit.JUnitCorePlugin;
import org.eclipse.jdt.internal.junit.util.JUnitStatus;
import org.eclipse.jdt.internal.junit.util.JUnitStubUtility;
import org.eclipse.jdt.internal.ui.dialogs.TextFieldNavigationHandler;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.DialogField;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.StringDialogField;
import org.eclipse.jdt.junit.wizards.NewTestCaseWizardPageOne;
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


/**
 * partially copied from {@link NewTestCaseWizardPageOne}
 */
public class NewFeatureWizardPageOne extends NewTypeWizardPage {

	private final static String PAGE_NAME= "NewTestCaseCreationWizardPage"; //$NON-NLS-1$

	private Link fLink;
	private Label fImage;
	private IResource fResource;

	private FeatureCreator featureCreator;

	private StringDialogField descriptionDialogField;


	public NewFeatureWizardPageOne(FeatureCreator featureCreator) {
		super(true, PAGE_NAME);
		this.featureCreator = featureCreator;

		setTitle("Spec");
		setDescription("Select the name of the new Feature file.");

		descriptionDialogField = new StringDialogField();
		descriptionDialogField.setLabelText("Feature:");
	}

	public void init(IStructuredSelection selection) {
		IJavaElement element= getInitialJavaElement(selection);
		initContainerPage(element);
		initTypePage(element);
		updateStatus(getStatusList());
	}




	/* (non-Javadoc)
	 * @see org.eclipse.jdt.ui.wizards.NewContainerWizardPage#handleFieldChanged(String)
	 */
	@Override
	protected void handleFieldChanged(String fieldName) {
		super.handleFieldChanged(fieldName);
		if (fieldName.equals(CONTAINER)) {
			updateBuildPathMessage();
		} 
		updateStatus(getStatusList());
	}


	protected IStatus[] getStatusList() {
		return new IStatus[] {
				fContainerStatus,
				fPackageStatus,
				fTypeNameStatus,
				fModifierStatus,
				fSuperClassStatus
		};
	}


	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);

		Composite composite= new Composite(parent, SWT.NONE);

		int nColumns= 4;

		GridLayout layout= new GridLayout();
		layout.numColumns= nColumns;
		composite.setLayout(layout);
		createContainerControls(composite, nColumns);
		createPackageControls(composite, nColumns);
		createTypeNameControls(composite, nColumns);
		createSeparator(composite, nColumns);
		createDescriptionControls(composite, nColumns);

		setControl(composite);

		//set default and focus
		Dialog.applyDialogFont(composite);

		setFocus();
	}


	private void createDescriptionControls(Composite composite, int nColumns) {
		descriptionDialogField.setText("");
		descriptionDialogField.doFillIntoGrid(composite, nColumns - 1);
		DialogField.createEmptySpace(composite);

		Text text= descriptionDialogField.getTextControl(null);
		org.eclipse.jdt.internal.ui.wizards.dialogfields.LayoutUtil.setWidthHint(text, getMaxFieldWidth());
		TextFieldNavigationHandler.install(text);
	}
	
	private void updateBuildPathMessage() {
		if (fLink == null || fLink.isDisposed()) {
			return;
		}

		String message= null;
		IPackageFragmentRoot root= getPackageFragmentRoot();
		if (root != null) {
			IJavaProject project= root.getJavaProject();
			if (project.exists()) {
					if (!JUnitStubUtility.is50OrHigher(project)) {
						message= WizardMessages.NewTestCaseWizardPageOne_linkedtext_java5required;
					}
			}
		}
		fLink.setVisible(message != null);
		fImage.setVisible(message != null);

		if (message != null) {
			fLink.setText(message);
		}
	}



	/**
	 * The method is called when the container has changed to validate if the project
	 * is suited for the JUnit test class. Clients can override to modify or remove that validation.
	 *
	 * @return the status of the validation
	 */
	protected IStatus validateIfJUnitProject() {
		JUnitStatus status= new JUnitStatus();
		IPackageFragmentRoot root= getPackageFragmentRoot();
		if (root != null) {
			try {
				IJavaProject project= root.getJavaProject();
				if (project.exists()) {
					if (!JUnitStubUtility.is50OrHigher(project)) {
						status.setError(WizardMessages.NewTestCaseWizardPageOne_error_java5required);
						return status;
					}
					if (project.findType(JUnitCorePlugin.JUNIT4_ANNOTATION_NAME) == null) {
						status.setWarning(WizardMessages.NewTestCaseWizardPageOne__error_junit4NotOnbuildpath);
						return status;
					}
				}
			} catch (JavaModelException e) {
			}
		}
		return status;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.IWizardPage#canFlipToNextPage()
	 */
	@Override
	public boolean canFlipToNextPage() {
		return false;
	}

	public void createType(IProgressMonitor monitor){
		if(monitor == null){
			monitor = new NullProgressMonitor();
		}
		if(!getPackageFragment().exists()) {
			try {
				getPackageFragmentRoot().createPackageFragment(getPackageFragment().getElementName(), true, monitor);
			} catch (JavaModelException e) {
				displayError("Could not create package", e.getMessage());
			}
		}
		IResource res = getPackageFragment().getResource();
		IFile specFile = null;
			specFile = ((IFolder) res).getFile(getTypeName() + ".feature"); //$NON-NLS-1$
		try {
			String contents = featureCreator.create(
					getJavaProject(), 
					descriptionDialogField.getText(), 
					getPackageFragment(),
					monitor);
			specFile.create(new ByteArrayInputStream(contents.getBytes()), true, monitor);
			this.fResource = specFile;
		} catch (CoreException e) {
			displayError("Could not create Spec", e.getMessage());
		}
	}

	public IResource getResource() {
		return fResource;
	}
	
	private void displayError(final String title, final String message) {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				MessageDialog
				.openError(getShell(),title, message);
			}
		});
	}
	
}
