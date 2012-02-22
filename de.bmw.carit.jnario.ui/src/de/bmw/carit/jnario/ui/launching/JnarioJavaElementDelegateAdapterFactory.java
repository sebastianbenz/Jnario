/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.ui.launching;

import org.eclipse.core.resources.IResource;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.xtext.xtend2.ui.launching.JavaElementDelegate;
import org.eclipse.xtext.xtend2.ui.launching.JavaElementDelegateAdapterFactory;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author Sebastian Benz - Initial contribution and API
 * @author Birgit Engelmann
 */
public class JnarioJavaElementDelegateAdapterFactory extends
		JavaElementDelegateAdapterFactory {

	@Inject
	private Provider<JavaElementDelegate> delegateProvider;
	
	public Object getAdapter(Object adaptableObject, @SuppressWarnings("rawtypes")  Class adapterType) {
		if (JnarioJavaElementDelegate.class.equals(adapterType)) {
			if (adaptableObject instanceof IFileEditorInput) {
				JavaElementDelegate result = delegateProvider.get();
				result.initializeWith((IFileEditorInput) adaptableObject);
				return result;
			}
			if (adaptableObject instanceof IResource) {
				JavaElementDelegate result = delegateProvider.get();
				result.initializeWith((IResource) adaptableObject);
				return result;
			}
			if (adaptableObject instanceof IEditorPart) {
				JavaElementDelegate result = delegateProvider.get();
				result.initializeWith((IEditorPart) adaptableObject);
				return result;
			}
		}
		if (adaptableObject instanceof JnarioJavaElementDelegate) {
			return ((JavaElementDelegate) adaptableObject).getAdapter(adapterType);
		}
		return null;
	}
	
	@SuppressWarnings("rawtypes")
	public Class[] getAdapterList() {
		return new Class[] { JnarioJavaElementDelegate.class };
	}
	
}
