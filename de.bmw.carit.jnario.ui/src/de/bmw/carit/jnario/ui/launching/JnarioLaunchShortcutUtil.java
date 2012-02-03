package de.bmw.carit.jnario.ui.launching;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorPart;

public class JnarioLaunchShortcutUtil {

	public static IStructuredSelection replaceWithJavaElementDelegates(IStructuredSelection selection) {
		Object[] originalSelection = selection.toArray();
		Object[] fakeSelection = new Object[originalSelection.length];
		for(int i = 0; i < originalSelection.length; i++) {
			Object original = originalSelection[i];
			if (original == null || original instanceof IJavaElement || original instanceof JnarioJavaElementDelegate || !(original instanceof IAdaptable)) {
				fakeSelection[i] = original;
			} else {
				IAdaptable adaptable = (IAdaptable) original;
				JnarioJavaElementDelegate javaElementDelegate = (JnarioJavaElementDelegate) adaptable.getAdapter(JnarioJavaElementDelegate.class);
				if (javaElementDelegate != null) {
					fakeSelection[i] = javaElementDelegate;
				} else {
					fakeSelection[i] = original;
				}
			}
		}
		StructuredSelection newSelection = new StructuredSelection(fakeSelection);
		return newSelection;
	}
	
	public static IStructuredSelection toSelectionWithJavaElementDelegates(IEditorPart editor) {
		JnarioJavaElementDelegate javaElementDelegate = (JnarioJavaElementDelegate) editor.getAdapter(JnarioJavaElementDelegate.class);
		if (javaElementDelegate != null) {
			return new StructuredSelection(javaElementDelegate);
		}
		return null;
	}
}
