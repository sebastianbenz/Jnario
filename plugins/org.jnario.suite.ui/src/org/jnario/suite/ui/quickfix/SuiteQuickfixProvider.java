/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.jnario.suite.ui.quickfix;

import static org.eclipse.xtext.ui.util.DisplayRunHelper.runAsyncInDisplayThread;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.Issue;
import org.jnario.feature.ui.wizards.NewFeatureWizard;
import org.jnario.spec.ui.wizards.NewSpecWizard;
import org.jnario.suite.suite.SuitePackage;
import org.jnario.suite.ui.wizards.NewSuiteWizard;
import org.jnario.ui.quickfix.JnarioQuickFixProvider;
import org.jnario.ui.wizards.NewJnarioFileWizard;
import org.jnario.ui.wizards.NewJnarioFileWizardPageOne;
import org.jnario.util.Strings;

import com.google.inject.Inject;
import com.google.inject.Provider;
@SuppressWarnings("restriction")
public class SuiteQuickfixProvider extends JnarioQuickFixProvider {

	@Inject Provider<NewSpecWizard> newSpecWizardProvider;
	@Inject Provider<NewFeatureWizard> newFeatureWizardProvider;
	@Inject Provider<NewSuiteWizard> newSuiteWizardProvider;

	@Inject
	private IJavaProjectProvider projectProvider;
	
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
					
					if(reference == SuitePackage.Literals.SPEC_REFERENCE__SPEC){
						String issueString = xtextDocument.get(issue.getOffset(), issue.getLength());

						IJavaProject javaProject = projectProvider.getJavaProject(target.eResource().getResourceSet());
						String path = target.eResource().getURI().trimSegments(1).toPlatformString(true);
						IPackageFragment packageFragmentRoot = javaProject.findPackageFragment(new Path(path));
						IPackageFragmentRoot root = (IPackageFragmentRoot) packageFragmentRoot.getAncestor(IJavaElement.PACKAGE_FRAGMENT_ROOT);
						issueString = issueString.substring(1, issueString.length()-1);
						issueResolutionAcceptor.accept(
								issue, 
								"New Spec", 
								"Create a new Jnario Specification '" + issueString + "'", 
								"spec_file.png", 
								doFixMissingSpecification(root, packageFragmentRoot, issueString, newSpecWizardProvider));
						issueResolutionAcceptor.accept(
								issue, 
								"New Feature", 
								"Create a new Jnario Feature '" + issueString + "'", 
								"feature_file.png", 
								doFixMissingSpecification(root, packageFragmentRoot, issueString, newFeatureWizardProvider));
						issueResolutionAcceptor.accept(
								issue, 
								"New Suite", 
								"Create a new Jnario Suite '" + issueString + "'", 
								"suite_file.png", 
								doFixMissingSpecification(root, packageFragmentRoot, issueString, newSuiteWizardProvider));
					}
				}
				
			});
			super.createLinkingIssueResolutions(issue, issueResolutionAcceptor);
		}
	}

	private IModification doFixMissingSpecification(
							final IPackageFragmentRoot root, 
							final IPackageFragment packageFragment, 
							final String issueString, 
							final Provider<? extends NewJnarioFileWizard> wizardProvider) {
		return new IModification() {
			
			public void apply(IModificationContext context) throws Exception {
				runAsyncInDisplayThread(new Runnable(){

					public void run() {
						IWorkbench workbench = PlatformUI.getWorkbench(); 
						Shell shell = workbench.getActiveWorkbenchWindow().getShell(); 
						NewJnarioFileWizard wizard = wizardProvider.get();
						wizard.init(workbench, new StructuredSelection());
						WizardDialog dialog = new WizardDialog(shell, wizard); 
						dialog.create(); 
						NewJnarioFileWizardPageOne page = wizard.getFirstPage();
						page.setPackageFragment(packageFragment, true);
						page.setPackageFragmentRoot(root, true);
						page.setTypeName(Strings.toClassName(issueString), true);
						page.setSpecDescription(issueString);
						dialog.open(); 
					}
					
				});
				
			}
		};
	}
	
}
