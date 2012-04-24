/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.ui.wizards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.junit.Messages;
import org.eclipse.jdt.internal.junit.ui.IJUnitHelpContextIds;
import org.eclipse.jdt.internal.junit.ui.JUnitPlugin;
import org.eclipse.jdt.internal.junit.util.LayoutUtil;
import org.eclipse.jdt.internal.junit.wizards.WizardMessages;
import org.eclipse.jdt.junit.wizards.NewTestCaseWizardPageTwo;
import org.eclipse.jdt.ui.JavaElementLabelProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ContainerCheckedTreeViewer;

/**
 * partially copied from {@link NewTestCaseWizardPageTwo}
 */
@SuppressWarnings("restriction")
public class NewSpecWizardPageTwo extends WizardPage {

	private final static String PAGE_NAME= "NewTestCaseCreationWizardPage2"; //$NON-NLS-1$

	private IType fClassToTest;

	private ContainerCheckedTreeViewer fMethodsTree;
	private Button fSelectAllButton;
	private Button fDeselectAllButton;
	private Label fSelectedMethodsLabel;
	private Object[] fCheckedObjects;
	private boolean fCreateFinalStubs;
	private boolean fCreateTasks;

	/**
	 * Creates a new <code>NewTestCaseWizardPageTwo</code>.
	 */
	public NewSpecWizardPageTwo() {
		super(PAGE_NAME);
		setTitle("Test Contexts");
		setDescription("Select the methods for which test contexts should be created");
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite parent) {
		Composite container= new Composite(parent, SWT.NONE);
		GridLayout layout= new GridLayout();
		layout.numColumns= 2;
		container.setLayout(layout);

		createMethodsTreeControls(container);
		createSpacer(container);
		createButtonChoices(container);
		setControl(container);
		Dialog.applyDialogFont(container);
		PlatformUI.getWorkbench().getHelpSystem().setHelp(container, IJUnitHelpContextIds.NEW_TESTCASE_WIZARD_PAGE2);
	}

	private void createButtonChoices(Composite container) {
		GridLayout layout;
		GridData gd;
		Composite prefixContainer= new Composite(container, SWT.NONE);
		gd= new GridData();
		gd.horizontalAlignment = GridData.FILL;
		gd.horizontalSpan = 1;
		prefixContainer.setLayoutData(gd);

		layout = new GridLayout();
		layout.numColumns = 1;
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		prefixContainer.setLayout(layout);

	}


	private void createMethodsTreeControls(Composite container) {
		Label label= new Label(container, SWT.LEFT | SWT.WRAP);
		label.setFont(container.getFont());
		label.setText(WizardMessages.NewTestCaseWizardPageTwo_methods_tree_label);
		GridData gd = new GridData();
		gd.horizontalSpan = 2;
		label.setLayoutData(gd);

		fMethodsTree= new ContainerCheckedTreeViewer(container, SWT.BORDER);
		gd= new GridData(GridData.FILL_BOTH | GridData.GRAB_HORIZONTAL | GridData.GRAB_VERTICAL);
		gd.heightHint= 180;
		fMethodsTree.getTree().setLayoutData(gd);

		fMethodsTree.setLabelProvider(new JavaElementLabelProvider());
		fMethodsTree.setAutoExpandLevel(2);
		fMethodsTree.addCheckStateListener(new ICheckStateListener() {
			public void checkStateChanged(CheckStateChangedEvent event) {
				doCheckedStateChanged();
			}
		});
		fMethodsTree.addFilter(new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if (element instanceof IMethod) {
					IMethod method = (IMethod) element;
					return !method.getElementName().equals("<clinit>"); //$NON-NLS-1$
				}
				return true;
			}
		});


		Composite buttonContainer= new Composite(container, SWT.NONE);
		gd= new GridData(GridData.FILL_VERTICAL);
		buttonContainer.setLayoutData(gd);
		GridLayout buttonLayout= new GridLayout();
		buttonLayout.marginWidth= 0;
		buttonLayout.marginHeight= 0;
		buttonContainer.setLayout(buttonLayout);

		fSelectAllButton= new Button(buttonContainer, SWT.PUSH);
		fSelectAllButton.setText(WizardMessages.NewTestCaseWizardPageTwo_selectAll);
		gd= new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING);
		fSelectAllButton.setLayoutData(gd);
		fSelectAllButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				fMethodsTree.setCheckedElements((Object[]) fMethodsTree.getInput());
				doCheckedStateChanged();
			}
		});
		LayoutUtil.setButtonDimensionHint(fSelectAllButton);

		fDeselectAllButton= new Button(buttonContainer, SWT.PUSH);
		fDeselectAllButton.setText(WizardMessages.NewTestCaseWizardPageTwo_deselectAll);
		gd= new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING);
		fDeselectAllButton.setLayoutData(gd);
		fDeselectAllButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				fMethodsTree.setCheckedElements(new Object[0]);
				doCheckedStateChanged();
			}
		});
		LayoutUtil.setButtonDimensionHint(fDeselectAllButton);

		/* No of selected methods label */
		fSelectedMethodsLabel= new Label(container, SWT.LEFT);
		fSelectedMethodsLabel.setFont(container.getFont());
		doCheckedStateChanged();
		gd= new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan= 1;
		fSelectedMethodsLabel.setLayoutData(gd);

		Label emptyLabel= new Label(container, SWT.LEFT);
		gd= new GridData();
		gd.horizontalSpan= 1;
		emptyLabel.setLayoutData(gd);
	}

	private void createSpacer(Composite container) {
		Label spacer= new Label(container, SWT.NONE);
		GridData data= new GridData();
		data.horizontalSpan= 2;
		data.horizontalAlignment= GridData.FILL;
		data.verticalAlignment= GridData.BEGINNING;
		data.heightHint= 4;
		spacer.setLayoutData(data);
	}

	/**
	 * Sets the class under test.
	 *
	 * @param classUnderTest the class under test
	 */
	public void setClassUnderTest(IType classUnderTest) {
		fClassToTest= classUnderTest;
	}


	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#setVisible(boolean)
	 */
	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			if (fClassToTest == null) {
				return;
			}

			ArrayList<IType> types= null;
			try {
				ITypeHierarchy hierarchy= fClassToTest.newSupertypeHierarchy(null);
				IType[] superTypes;
				if (fClassToTest.isClass())
					superTypes= hierarchy.getAllSuperclasses(fClassToTest);
				else if (fClassToTest.isInterface())
					superTypes= hierarchy.getAllSuperInterfaces(fClassToTest);
				else
					superTypes= new IType[0];
				types= new ArrayList<IType>(superTypes.length+1);
				types.add(fClassToTest);
				types.addAll(Arrays.asList(superTypes));
			} catch(JavaModelException e) {
				JUnitPlugin.log(e);
			}
			if (types == null)
				types= new ArrayList<IType>();
			fMethodsTree.setContentProvider(new MethodsTreeContentProvider(types.toArray()));
			fMethodsTree.setInput(types.toArray());
			fMethodsTree.setSelection(new StructuredSelection(fClassToTest), true);
			doCheckedStateChanged();

			fMethodsTree.getControl().setFocus();
		}
	}

	/**
	 * Returns all checked methods in the methods tree.
	 *
	 * @return the checked methods
	 */
	public IMethod[] getCheckedMethods() {
		int methodCount= 0;
		for (int i = 0; i < fCheckedObjects.length; i++) {
			if (fCheckedObjects[i] instanceof IMethod)
				methodCount++;
		}
		IMethod[] checkedMethods= new IMethod[methodCount];
		int j= 0;
		for (int i = 0; i < fCheckedObjects.length; i++) {
			if (fCheckedObjects[i] instanceof IMethod) {
				checkedMethods[j]= (IMethod)fCheckedObjects[i];
				j++;
			}
		}
		return checkedMethods;
	}

	private static class MethodsTreeContentProvider implements ITreeContentProvider {
		private Object[] fTypes;
		private IMethod[] fMethods;
		private final Object[] fEmpty= new Object[0];

		public MethodsTreeContentProvider(Object[] types) {
			fTypes= types;
			Vector<IMethod> methods= new Vector<IMethod>();
			for (int i = types.length-1; i > -1; i--) {
				Object object = types[i];
				if (object instanceof IType) {
					IType type = (IType) object;
					try {
						IMethod[] currMethods= type.getMethods();
						for_currMethods:
						for (int j = 0; j < currMethods.length; j++) {
							IMethod currMethod = currMethods[j];
							int flags= currMethod.getFlags();
							if (!Flags.isPrivate(flags) && !Flags.isSynthetic(flags)) {
								for (int k = 0; k < methods.size(); k++) {
									IMethod m= methods.get(k);
									if (m.getElementName().equals(currMethod.getElementName())
										&& m.getSignature().equals(currMethod.getSignature())) {
										methods.set(k,currMethod);
										continue for_currMethods;
									}
								}
								methods.add(currMethod);
							}
						}
					} catch (JavaModelException e) {
						JUnitPlugin.log(e);
					}
				}
			}
			fMethods= new IMethod[methods.size()];
			methods.copyInto(fMethods);
		}

		/*
		 * @see ITreeContentProvider#getChildren(Object)
		 */
		public Object[] getChildren(Object parentElement) {
			if (parentElement instanceof IType) {
				IType parentType= (IType)parentElement;
				ArrayList<IMethod> result= new ArrayList<IMethod>(fMethods.length);
				for (int i= 0; i < fMethods.length; i++) {
					if (fMethods[i].getDeclaringType().equals(parentType)) {
						result.add(fMethods[i]);
					}
				}
				return result.toArray();
			}
			return fEmpty;
		}

		/*
		 * @see ITreeContentProvider#getParent(Object)
		 */
		public Object getParent(Object element) {
			if (element instanceof IMethod)
				return ((IMethod)element).getDeclaringType();
			return null;
		}

		/*
		 * @see ITreeContentProvider#hasChildren(Object)
		 */
		public boolean hasChildren(Object element) {
			return getChildren(element).length > 0;
		}

		/*
		 * @see IStructuredContentProvider#getElements(Object)
		 */
		public Object[] getElements(Object inputElement) {
			return fTypes;
		}

		/*
		 * @see IContentProvider#dispose()
		 */
		public void dispose() {
		}

		/*
		 * @see IContentProvider#inputChanged(Viewer, Object, Object)
		 */
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		public IMethod[] getAllMethods() {
			return fMethods;
		}
	}

	/**
	 * Returns true if the checkbox for creating tasks is checked.
	 *
	 * @return <code>true</code> is returned if tasks should be created
	 */
	public boolean isCreateTasks() {
		return fCreateTasks;
	}

	/**
	 * Returns true if the checkbox for final method stubs is checked.
	 * @return <code>true</code> is returned if methods should be created final
	 */
	public boolean getCreateFinalMethodStubsButtonSelection() {
		return fCreateFinalStubs;
	}

	private void doCheckedStateChanged() {
		Object[] checked= fMethodsTree.getCheckedElements();
		fCheckedObjects= checked;

		int checkedMethodCount= 0;
		for (Object element : checked) {
			if (element instanceof IMethod)
				checkedMethodCount++;
		}
		String label= ""; //$NON-NLS-1$
		if (checkedMethodCount == 1)
			label= Messages.format(WizardMessages.NewTestCaseWizardPageTwo_selected_methods_label_one, new Integer(checkedMethodCount));
		else
			label= Messages.format(WizardMessages.NewTestCaseWizardPageTwo_selected_methods_label_many, new Integer(checkedMethodCount));
		fSelectedMethodsLabel.setText(label);
	}

	/**
	 * Returns all the methods in the methods tree.
	 *
	 * @return all methods in the methods tree
	 */
	public IMethod[] getAllMethods() {
		return ((MethodsTreeContentProvider)fMethodsTree.getContentProvider()).getAllMethods();
	}



}
