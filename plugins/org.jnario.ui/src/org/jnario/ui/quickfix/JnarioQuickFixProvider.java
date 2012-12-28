/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/**
 * 
 */
package org.jnario.ui.quickfix;

import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;
import static org.eclipse.xtext.ui.util.DisplayRunHelper.runAsyncInDisplayThread;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.internal.ui.wizards.NewClassCreationWizard;
import org.eclipse.jdt.internal.ui.wizards.NewElementWizard;
import org.eclipse.jdt.internal.ui.wizards.NewInterfaceCreationWizard;
import org.eclipse.jdt.ui.wizards.NewClassWizardPage;
import org.eclipse.jdt.ui.wizards.NewInterfaceWizardPage;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtend.ide.quickfix.XtendQuickfixProvider;
import org.eclipse.xtend.ide.wizards.NewXtendClassWizard;
import org.eclipse.xtend.ide.wizards.NewXtendClassWizardPage;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.validation.IssueCodes;
import org.jnario.ui.buildpath.JnarioLibClasspathAdder;
import org.jnario.validation.JnarioIssueCodes;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author Sebastian Benz
 *
 */
@SuppressWarnings({ "restriction"})
public class JnarioQuickFixProvider extends XtendQuickfixProvider{

	@Inject
	private IJavaProjectProvider projectProvider;
	
	@Inject
	private JnarioLibClasspathAdder jnarioLibAdder;
	
	@Inject UndefinedMethodFix createMissingMethod;
	
	@Inject
	private NewTypePageConfigurer newTypePageConfigurer;
	
	@Inject Provider<NewXtendClassWizard> newXtendClassWizardProvider;
	
	@Override
	public void putXtendOnClasspath(Issue issue,
			IssueResolutionAcceptor acceptor) {
	}
	
	@Fix(IssueCodes.INCOMPATIBLE_TYPES)
	public void fixIncompatibleTypes(final Issue issue, IssueResolutionAcceptor acceptor) {
		fixUndefinedMethod(issue, acceptor);
	}
	
	@Fix(IssueCodes.INVALID_NUMBER_OF_ARGUMENTS)
	public void fixInvalidNumberOfArguments(final Issue issue, IssueResolutionAcceptor acceptor) {
		fixUndefinedMethod(issue, acceptor);
	}
	
	protected void createXtendLinkingIssueResolutions(final Issue issue, final IssueResolutionAcceptor issueResolutionAcceptor) {
		super.createXtendLinkingIssueResolutions(issue, issueResolutionAcceptor);
		fixUndefinedMethod(issue, issueResolutionAcceptor);
	}

	protected void fixUndefinedMethod(final Issue issue,
			final IssueResolutionAcceptor issueResolutionAcceptor) {
		final IModificationContext modificationContext = getModificationContextFactory().createModificationContext(issue);
		final IXtextDocument xtextDocument = modificationContext.getXtextDocument();
		if(xtextDocument != null){
			xtextDocument.modify(new IUnitOfWork.Void<XtextResource>(){
				@Override
				public void process(XtextResource state) throws Exception {
					EObject eObject = state.getEObject(issue.getUriToProblem().fragment());
					XMemberFeatureCall memberFeatureCall = getContainerOfType(eObject, XMemberFeatureCall.class);
					if(memberFeatureCall == null){
						return;
					}
					createMissingMethod.apply(issue, issueResolutionAcceptor, memberFeatureCall);
				}
			});
		}
	}
	
	@Override
	public void createLinkingIssueResolutions(final Issue issue,
			final IssueResolutionAcceptor issueResolutionAcceptor) {
		final IModificationContext modificationContext = getModificationContextFactory().createModificationContext(
				issue);
		final IXtextDocument xtextDocument = modificationContext.getXtextDocument();
		if (xtextDocument != null) {
			xtextDocument.readOnly(new IUnitOfWork.Void<XtextResource>() {
				@Override
				public void process(XtextResource state) throws Exception {
					EObject target = state.getEObject(issue.getUriToProblem().fragment());
					EReference reference = getUnresolvedEReference(issue, target);
					if (reference == null)
						return;
					
					if( reference == XbasePackage.Literals.XCONSTRUCTOR_CALL__CONSTRUCTOR ||
						reference == XbasePackage.Literals.XTYPE_LITERAL__TYPE ||
						reference == TypesPackage.Literals.JVM_PARAMETERIZED_TYPE_REFERENCE__TYPE){
						URI context = state.getURI();
						String issueString = getIssueString(issue, xtextDocument);
						issueResolutionAcceptor.accept(
								issue, 
								"Create Xtend class", 
								"Opens the new Xtend class wizard to create the type '" + issueString + "'", 
								"xtend_file.png", openNewXtendClassWizardFor(context, issueString));
						issueResolutionAcceptor.accept(issue, 
								"Create Java class", 
								"Opens the new Java class wizard to create the type '" + issueString + "'", 
								"java_file.gif", 
								openNewJavaClassWizardFor(context, issueString));
						issueResolutionAcceptor.accept(issue, 
								"Create Java Interface", 
								"Opens the new Java interface wizard to create the type '" + issueString + "'", 
								"java_interface.gif", 
								openNewJavaInterfaceWizardFor(context, issueString));
					}
				}


			});
			super.createLinkingIssueResolutions(issue, issueResolutionAcceptor);
		}
	}
	
	private IModification openNewJavaInterfaceWizardFor(final URI contextUri, final String typeName) {
		return new IModification() {
			public void apply(IModificationContext context) throws Exception {
				runAsyncInDisplayThread(new Runnable(){

					public void run() {
						NewInterfaceWizardPage classWizardPage = new NewInterfaceWizardPage();
						NewInterfaceCreationWizard wizard = new NewInterfaceCreationWizard(classWizardPage, false);
						WizardDialog dialog = createWizardDialog(wizard); 
						newTypePageConfigurer.configure(classWizardPage, contextUri, typeName);
						dialog.open(); 
					}
				});
			}
		};
	}
	
	private IModification openNewJavaClassWizardFor(final URI contextUri, final String typeName) {
		return new IModification() {
			public void apply(IModificationContext context) throws Exception {
				runAsyncInDisplayThread(new Runnable(){

					public void run() {
						NewClassWizardPage classWizardPage = new NewClassWizardPage();
						NewClassCreationWizard wizard = new NewClassCreationWizard(classWizardPage, false);
						WizardDialog dialog = createWizardDialog(wizard); 
						newTypePageConfigurer.configure(classWizardPage, contextUri, typeName);
						dialog.open(); 
					}
				});
			}
		};
	}

	private IModification openNewXtendClassWizardFor(final URI contextUri, final String typeName) {
		return new IModification() {
			public void apply(IModificationContext context) throws Exception {
				runAsyncInDisplayThread(new Runnable(){

					public void run() {
						NewElementWizard newXtendClassWizard = newXtendClassWizardProvider.get();
						WizardDialog dialog = createWizardDialog(newXtendClassWizard); 
						NewXtendClassWizardPage page = (NewXtendClassWizardPage) newXtendClassWizard.getStartingPage();
						newTypePageConfigurer.configure(page, contextUri, typeName);
						dialog.open(); 
					}
				});
			}
		};
	}
	
	private WizardDialog createWizardDialog(
			NewElementWizard newXtendClassWizard) {
		IWorkbench workbench = PlatformUI.getWorkbench(); 
		Shell shell = workbench.getActiveWorkbenchWindow().getShell(); 
		newXtendClassWizard.init(workbench, new StructuredSelection());
		WizardDialog dialog = new WizardDialog(shell, newXtendClassWizard);
		dialog.create(); 
		return dialog;
	}
	
	@Fix(JnarioIssueCodes.JNARIO_LIB_NOT_ON_CLASSPATH)
	public void putJnarioOnClasspath(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Add Jnario libs to classpath", "Add Jnario libs to classpath", "fix_indent.gif", new ISemanticModification() {
			public void apply(EObject element, IModificationContext context) throws Exception {
				ResourceSet resourceSet = element.eResource().getResourceSet();
				IJavaProject javaProject = projectProvider.getJavaProject(resourceSet);
				jnarioLibAdder.addLibsToClasspath(javaProject, new NullProgressMonitor());
			}
		});
	}
	
	protected String getIssueString(final Issue issue, final IXtextDocument xtextDocument)
			throws BadLocationException {
		return xtextDocument.get(issue.getOffset(), issue.getLength());
	}
}
