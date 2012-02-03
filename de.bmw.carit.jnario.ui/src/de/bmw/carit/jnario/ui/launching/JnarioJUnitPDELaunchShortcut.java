package de.bmw.carit.jnario.ui.launching;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.pde.ui.launcher.JUnitWorkbenchLaunchShortcut;
import org.eclipse.ui.IEditorPart;

public class JnarioJUnitPDELaunchShortcut extends JUnitWorkbenchLaunchShortcut {

	@Override
	public void launch(ISelection selection, String mode) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection newSelection = JnarioLaunchShortcutUtil.replaceWithJavaElementDelegates((IStructuredSelection) selection);
			super.launch(newSelection, mode);
		}
	}
	
	@Override
	public void launch(IEditorPart editor, String mode) {
		IStructuredSelection selection = JnarioLaunchShortcutUtil.toSelectionWithJavaElementDelegates(editor);
		if (selection != null) {
			launch(selection, mode);
		} else {
			super.launch(editor, mode);
		}
	}
}
