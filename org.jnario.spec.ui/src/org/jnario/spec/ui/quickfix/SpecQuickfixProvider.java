/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.jnario.spec.ui.quickfix;

import static org.eclipse.xtext.ui.util.DisplayRunHelper.runAsyncInDisplayThread;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jdt.internal.ui.wizards.NewElementWizard;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtend.ide.quickfix.XtendQuickfixProvider;
import org.eclipse.xtend.ide.wizards.NewXtendClassWizard;
import org.eclipse.xtend.ide.wizards.NewXtendClassWizardPage;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class SpecQuickfixProvider extends XtendQuickfixProvider {

	@Inject Provider<NewXtendClassWizard> newXtendClassWizardProvider;
	
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
					
					if(reference == TypesPackage.Literals.JVM_PARAMETERIZED_TYPE_REFERENCE__TYPE){
						String issueString = xtextDocument.get(issue.getOffset(), issue.getLength());
						
						IModification modification = doFixMissingType(issueString);
						issueResolutionAcceptor.accept(issue, "New Xtend Class", "Create a new Xtend Class '" + issueString + "'", "xtend_file.png", modification);
					}
				}

				
			});
			super.createLinkingIssueResolutions(issue, issueResolutionAcceptor);
		}
	}
	
	
	private IModification doFixMissingType(final String typeName) {
		return new IModification() {
			
			public void apply(IModificationContext context) throws Exception {
				runAsyncInDisplayThread(new Runnable(){

					public void run() {
						IWorkbench workbench = PlatformUI.getWorkbench(); 
						Shell shell = workbench.getActiveWorkbenchWindow().getShell(); 
						NewElementWizard newXtendClassWizard = newXtendClassWizardProvider.get();
						newXtendClassWizard.addPages();
						newXtendClassWizard.init(workbench, new StructuredSelection());
						WizardDialog dialog = new WizardDialog(shell, newXtendClassWizard); 
						dialog.create(); 
						NewXtendClassWizardPage page = (NewXtendClassWizardPage) newXtendClassWizard.getStartingPage();
						page.setTypeName(typeName, false);
						dialog.open(); 
					}
					
				});
				
			}
		};
	}
}
