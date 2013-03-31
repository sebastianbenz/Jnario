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
	
	@Inject Provider<NewXtendClassWizard> newXtendClassWizardProvider;
	
	@Override
	public void putXtendOnClasspath(Issue issue,
			IssueResolutionAcceptor acceptor) {
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
