/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.feature.ui.launching;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorPart;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class FeatureLaunchShortcutUtil {

	public static IStructuredSelection replaceWithJavaElementDelegates(IStructuredSelection selection) {
		Object[] originalSelection = selection.toArray();
		Object[] fakeSelection = new Object[originalSelection.length];
		for(int i = 0; i < originalSelection.length; i++) {
			Object original = originalSelection[i];
			if (original == null || original instanceof IJavaElement || original instanceof FeatureJavaElementDelegate || !(original instanceof IAdaptable)) {
				fakeSelection[i] = original;
			} else {
				IAdaptable adaptable = (IAdaptable) original;
				FeatureJavaElementDelegate javaElementDelegate = (FeatureJavaElementDelegate) adaptable.getAdapter(FeatureJavaElementDelegate.class);
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
		FeatureJavaElementDelegate javaElementDelegate = (FeatureJavaElementDelegate) editor.getAdapter(FeatureJavaElementDelegate.class);
		if (javaElementDelegate != null) {
			return new StructuredSelection(javaElementDelegate);
		}
		return null;
	}
}
