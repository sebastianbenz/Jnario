package de.bmw.carit.jnario.spec.ui.wizards;


import java.io.ByteArrayInputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IClassFile;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.internal.corext.util.JavaConventionsUtil;
import org.eclipse.jdt.internal.junit.BasicElementLabels;
import org.eclipse.jdt.internal.junit.JUnitCorePlugin;
import org.eclipse.jdt.internal.junit.Messages;
import org.eclipse.jdt.internal.junit.ui.JUnitPlugin;
import org.eclipse.jdt.internal.junit.util.CoreTestSearchEngine;
import org.eclipse.jdt.internal.junit.util.JUnitStatus;
import org.eclipse.jdt.internal.junit.util.JUnitStubUtility;
import org.eclipse.jdt.internal.junit.util.LayoutUtil;
import org.eclipse.jdt.internal.ui.dialogs.TextFieldNavigationHandler;
import org.eclipse.jdt.internal.ui.refactoring.contentassist.ControlContentAssistHelper;
import org.eclipse.jdt.internal.ui.refactoring.contentassist.JavaTypeCompletionProcessor;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.DialogField;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.StringDialogField;
import org.eclipse.jdt.junit.wizards.NewTestCaseWizardPageOne;
import org.eclipse.jdt.ui.IJavaElementSearchConstants;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jdt.ui.wizards.NewTypeWizardPage;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.SelectionDialog;


/**
 * partially copied from {@link NewTestCaseWizardPageOne}
 */
@SuppressWarnings("restriction")
public class NewSpecWizardPageOne extends NewTypeWizardPage {

	private final static String PAGE_NAME= "NewTestCaseCreationWizardPage"; //$NON-NLS-1$

	public final static String CLASS_UNDER_TEST= PAGE_NAME + ".classundertest"; //$NON-NLS-1$

	private NewSpecWizardPageTwo fPage2;

	private String fClassUnderTestText; // model
	private IType fClassUnderTest; // resolved model, can be null

	private Text fClassUnderTestControl; // control
	private IStatus fClassUnderTestStatus; // status

	private Button fClassUnderTestButton;

	private JavaTypeCompletionProcessor fClassToTestCompletionProcessor;

	private Link fLink;
	private Label fImage;
	private IResource fResource;

	private SpecCreator specUtil;

	private StringDialogField descriptionDialogField;


	public NewSpecWizardPageOne(NewSpecWizardPageTwo page2, SpecCreator specUtil) {
		super(true, PAGE_NAME);
		fPage2= page2;
		this.specUtil = specUtil;

		setTitle("Spec");
		setDescription("Select the name of the new Spec file. You have the options to specify\nthe description and/or the class under test.");

		fClassToTestCompletionProcessor= new JavaTypeCompletionProcessor(false, false, true);

		fClassUnderTestStatus= new JUnitStatus();

		fClassUnderTestText= ""; //$NON-NLS-1$
		
		descriptionDialogField = new StringDialogField();
		descriptionDialogField.setLabelText("Description:");
	}

	public void init(IStructuredSelection selection) {
		IJavaElement element= getInitialJavaElement(selection);

		initContainerPage(element);
		initTypePage(element);
		// put default class to test
		if (element != null) {
			IType classToTest= null;
			// evaluate the enclosing type
			IType typeInCompUnit= (IType) element.getAncestor(IJavaElement.TYPE);
			if (typeInCompUnit != null) {
				if (typeInCompUnit.getCompilationUnit() != null) {
					classToTest= typeInCompUnit;
				}
			} else {
				ICompilationUnit cu= (ICompilationUnit) element.getAncestor(IJavaElement.COMPILATION_UNIT);
				if (cu != null)
					classToTest= cu.findPrimaryType();
				else {
					if (element instanceof IClassFile) {
						try {
							IClassFile cf= (IClassFile) element;
							if (cf.isStructureKnown())
								classToTest= cf.getType();
						} catch(JavaModelException e) {
							JUnitPlugin.log(e);
						}
					}
				}
			}
			if (classToTest != null) {
				try {
					if (!CoreTestSearchEngine.isTestImplementor(classToTest)) {
						setClassUnderTest(classToTest.getFullyQualifiedName('.'));
					}
				} catch (JavaModelException e) {
					JUnitPlugin.log(e);
				}
			}
		}

		updateStatus(getStatusList());
	}




	/* (non-Javadoc)
	 * @see org.eclipse.jdt.ui.wizards.NewContainerWizardPage#handleFieldChanged(String)
	 */
	@Override
	protected void handleFieldChanged(String fieldName) {
		super.handleFieldChanged(fieldName);
		if (fieldName.equals(CONTAINER)) {
			fClassUnderTestStatus= classUnderTestChanged();
			if (fClassUnderTestButton != null && !fClassUnderTestButton.isDisposed()) {
				fClassUnderTestButton.setEnabled(getPackageFragmentRoot() != null);
			}

			updateBuildPathMessage();
		} 
		updateStatus(getStatusList());
	}


	protected IStatus[] getStatusList() {
		return new IStatus[] {
				fContainerStatus,
				fPackageStatus,
				fTypeNameStatus,
				fClassUnderTestStatus,
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
		createClassUnderTestControls(composite, nColumns);
		//createBuildPathConfigureControls(composite, nColumns);

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

	protected void createClassUnderTestControls(Composite composite, int nColumns) {
		Label classUnderTestLabel= new Label(composite, SWT.LEFT | SWT.WRAP);
		classUnderTestLabel.setFont(composite.getFont());
		classUnderTestLabel.setText(WizardMessages.NewTestCaseWizardPageOne_class_to_test_label);
		classUnderTestLabel.setLayoutData(new GridData());

		fClassUnderTestControl= new Text(composite, SWT.SINGLE | SWT.BORDER);
		fClassUnderTestControl.setEnabled(true);
		fClassUnderTestControl.setFont(composite.getFont());
		fClassUnderTestControl.setText(fClassUnderTestText);
		fClassUnderTestControl.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				internalSetClassUnderText(((Text) e.widget).getText());
			}
		});
		GridData gd= new GridData();
		gd.horizontalAlignment= GridData.FILL;
		gd.grabExcessHorizontalSpace= true;
		gd.horizontalSpan= nColumns - 2;
		fClassUnderTestControl.setLayoutData(gd);

		fClassUnderTestButton= new Button(composite, SWT.PUSH);
		fClassUnderTestButton.setText(WizardMessages.NewTestCaseWizardPageOne_class_to_test_browse);
		fClassUnderTestButton.setEnabled(getPackageFragmentRoot() != null);
		fClassUnderTestButton.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				classToTestButtonPressed();
			}
			public void widgetSelected(SelectionEvent e) {
				classToTestButtonPressed();
			}
		});
		gd= new GridData();
		gd.horizontalAlignment= GridData.FILL;
		gd.grabExcessHorizontalSpace= false;
		gd.horizontalSpan= 1;
		gd.widthHint = LayoutUtil.getButtonWidthHint(fClassUnderTestButton);
		fClassUnderTestButton.setLayoutData(gd);

		ControlContentAssistHelper.createTextContentAssistant(fClassUnderTestControl, fClassToTestCompletionProcessor);
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


	private void classToTestButtonPressed() {
		IType type= chooseClassToTestType();
		if (type != null) {
			setClassUnderTest(type.getFullyQualifiedName('.'));
		}
	}

	private IType chooseClassToTestType() {
		IPackageFragmentRoot root= getPackageFragmentRoot();
		if (root == null)
			return null;

		IJavaElement[] elements= new IJavaElement[] { root.getJavaProject() };
		IJavaSearchScope scope= SearchEngine.createJavaSearchScope(elements);

		try {
			SelectionDialog dialog= JavaUI.createTypeDialog(getShell(), getWizard().getContainer(), scope, IJavaElementSearchConstants.CONSIDER_CLASSES_AND_ENUMS, false, getClassUnderTestText());
			dialog.setTitle(WizardMessages.NewTestCaseWizardPageOne_class_to_test_dialog_title);
			dialog.setMessage(WizardMessages.NewTestCaseWizardPageOne_class_to_test_dialog_message);
			if (dialog.open() == Window.OK) {
				Object[] resultArray= dialog.getResult();
				if (resultArray != null && resultArray.length > 0)
					return (IType) resultArray[0];
			}
		} catch (JavaModelException e) {
			JUnitPlugin.log(e);
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jdt.ui.wizards.NewTypeWizardPage#packageChanged()
	 */
	@Override
	protected IStatus packageChanged() {
		IStatus status= super.packageChanged();
		fClassToTestCompletionProcessor.setPackageFragment(getPackageFragment());
		return status;
	}

	protected IStatus classUnderTestChanged() {
		JUnitStatus status= new JUnitStatus();

		fClassUnderTest= null;

		IPackageFragmentRoot root= getPackageFragmentRoot();
		if (root == null) {
			return status;
		}

		String classToTestName= getClassUnderTestText();
		if (classToTestName.length() == 0) {
			return status;
		}

		IStatus val= JavaConventionsUtil.validateJavaTypeName(classToTestName, root);
		if (val.getSeverity() == IStatus.ERROR) {
			status.setError(WizardMessages.NewTestCaseWizardPageOne_error_class_to_test_not_valid);
			return status;
		}

		IPackageFragment pack= getPackageFragment(); // can be null
		try {
			IType type= resolveClassNameToType(root.getJavaProject(), pack, classToTestName);
			if (type == null) {
				status.setError(WizardMessages.NewTestCaseWizardPageOne_error_class_to_test_not_exist);
				return status;
			}
			if (type.isInterface()) {
				status.setWarning(Messages.format(WizardMessages.NewTestCaseWizardPageOne_warning_class_to_test_is_interface, BasicElementLabels.getJavaElementName(classToTestName)));
			}

			if (pack != null && !JUnitStubUtility.isVisible(type, pack)) {
				status.setWarning(Messages.format(WizardMessages.NewTestCaseWizardPageOne_warning_class_to_test_not_visible, BasicElementLabels.getJavaElementName(classToTestName)));
			}
			fClassUnderTest= type;
			fPage2.setClassUnderTest(fClassUnderTest);
		} catch (JavaModelException e) {
			status.setError(WizardMessages.NewTestCaseWizardPageOne_error_class_to_test_not_valid);
		}
		return status;
	}

	/**
	 * Returns the content of the class to test text field.
	 *
	 * @return the name of the class to test
	 */
	public String getClassUnderTestText() {
		return fClassUnderTestText;
	}

	/**
	 * Returns the class to be tested.
	 *
	 * 	@return the class under test or <code>null</code> if the entered values are not valid
	 */
	public IType getClassUnderTest() {
		return fClassUnderTest;
	}

	/**
	 * Sets the name of the class under test.
	 *
	 * @param name The name to set
	 */
	public void setClassUnderTest(String name) {
		if (fClassUnderTestControl != null && !fClassUnderTestControl.isDisposed()) {
			fClassUnderTestControl.setText(name);
		}
		internalSetClassUnderText(name);
	}

	private void internalSetClassUnderText(String name) {
		fClassUnderTestText= name;
		fClassUnderTestStatus= classUnderTestChanged();
		handleFieldChanged(CLASS_UNDER_TEST);
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
		return super.canFlipToNextPage() && getClassUnderTest() != null;
	}

	private IType resolveClassNameToType(IJavaProject jproject, IPackageFragment pack, String classToTestName) throws JavaModelException {
		if (!jproject.exists()) {
			return null;
		}

		IType type= jproject.findType(classToTestName);

		// search in current package
		if (type == null && pack != null && !pack.isDefaultPackage()) {
			type= jproject.findType(pack.getElementName(), classToTestName);
		}

		// search in java.lang
		if (type == null) {
			type= jproject.findType("java.lang", classToTestName); //$NON-NLS-1$
		}
		return type;
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
			specFile = ((IFolder) res).getFile(getTypeName() + ".spec"); //$NON-NLS-1$
		try {
			String contents = specUtil.create(
					getJavaProject(), 
					descriptionDialogField.getText(), 
					getPackageFragment(),
					getClassUnderTestText(),
					fPage2.getCheckedMethods(),
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
