package org.jnario.ui.wizards;

import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.internal.junit.ui.JUnitPlugin;
import org.eclipse.jdt.internal.junit.wizards.JUnitWizard;
import org.eclipse.jface.operation.IRunnableWithProgress;

@SuppressWarnings("restriction")
public abstract class NewJnarioFileWizard extends JUnitWizard {

	public NewJnarioFileWizard(String title) {
		super();
		setWindowTitle(title);
		initDialogSettings();
	}

	@Override
	protected void initializeDefaultPageImageDescriptor() {
		setDefaultPageImageDescriptor(JUnitPlugin.getImageDescriptor("wizban/newtest_wiz.png")); //$NON-NLS-1$
	}
	
	public abstract NewJnarioFileWizardPageOne getFirstPage();

	@Override
	public boolean performFinish() {
		IRunnableWithProgress runnable= getFirstPage().getRunnable();
		if (finishPage(runnable)) {
			IResource resource= getFirstPage().getResource();
			if (resource != null) {
				selectAndReveal(resource);
				openResource(resource);
			}
			return true;
		}
		return false;
	}

}