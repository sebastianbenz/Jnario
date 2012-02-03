package de.bmw.carit.jnario.ui.launching;

import org.eclipse.jdt.junit.launcher.JUnitLaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;

public class JnarioJUnitLaunchShortcut extends JUnitLaunchShortcut {

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