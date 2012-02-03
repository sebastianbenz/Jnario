package de.bmw.carit.jnario.spec.ui.launching;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;

public class SpecJUnitLaunchShortcut extends org.eclipse.jdt.junit.launcher.JUnitLaunchShortcut {

	@Override
	public void launch(ISelection selection, String mode) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection newSelection = SpecLaunchShortcutUtil.replaceWithJavaElementDelegates((IStructuredSelection) selection);
			super.launch(newSelection, mode);
		}
	}
	
	@Override
	public void launch(IEditorPart editor, String mode) {
		IStructuredSelection selection = SpecLaunchShortcutUtil.toSelectionWithJavaElementDelegates(editor);
		if (selection != null) {
			launch(selection, mode);
		} else {
			super.launch(editor, mode);
		}
	}
	
}