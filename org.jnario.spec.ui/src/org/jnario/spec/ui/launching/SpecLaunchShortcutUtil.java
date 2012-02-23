/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.ui.launching;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorPart;

public class SpecLaunchShortcutUtil {

	public static IStructuredSelection replaceWithJavaElementDelegates(IStructuredSelection selection) {
		Object[] originalSelection = selection.toArray();
		Object[] fakeSelection = new Object[originalSelection.length];
		for(int i = 0; i < originalSelection.length; i++) {
			Object original = originalSelection[i];
			if (original == null || original instanceof IJavaElement || original instanceof SpecJavaElementDelegate || !(original instanceof IAdaptable)) {
				fakeSelection[i] = original;
			} else {
				IAdaptable adaptable = (IAdaptable) original;
				SpecJavaElementDelegate javaElementDelegate = (SpecJavaElementDelegate) adaptable.getAdapter(SpecJavaElementDelegate.class);
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
		SpecJavaElementDelegate javaElementDelegate = (SpecJavaElementDelegate) editor.getAdapter(SpecJavaElementDelegate.class);
		if (javaElementDelegate != null) {
			return new StructuredSelection(javaElementDelegate);
		}
		return null;
	}
}
