/**
 * 
 */
package org.jnario.ui.quickfix;

import static org.eclipse.xtext.ui.util.DisplayRunHelper.runAsyncInDisplayThread;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaProject;
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
import org.eclipse.xtext.xbase.XbasePackage;
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
					
					if(reference == XbasePackage.Literals.XCONSTRUCTOR_CALL__CONSTRUCTOR || 
							reference == TypesPackage.Literals.JVM_PARAMETERIZED_TYPE_REFERENCE__TYPE){
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
}
