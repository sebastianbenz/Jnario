/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.ui.launching;


import static com.google.common.collect.Iterables.filter;

import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.util.jdt.IJavaElementFinder;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.ui.launching.JavaElementDelegateJunitLaunch;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeatureFile;

import com.google.inject.Inject;

/**
 * @author Sebastian Benz - Initial contribution and API
 * @author Birgit Engelmann
 */
public class FeatureJavaElementDelegate extends JavaElementDelegateJunitLaunch {
	
	private static final Logger log = Logger.getLogger(FeatureJavaElementDelegate.class);
	
	@Inject
	private IJvmModelAssociations associations;
	
	@Inject
	private IJavaElementFinder elementFinder;

	@Override
	protected boolean containsElementsSearchedFor(IFile file) {
		IJavaElement element = JavaCore.create(file);
		if (element == null || !element.exists() || ! (element instanceof ICompilationUnit)) {
			return false;
		}
		try {
			ICompilationUnit cu = (ICompilationUnit) element;
			for (IType type : cu.getAllTypes()) {
				IAnnotation annotation= type.getAnnotation("RunWith"); //$NON-NLS-1$
				if (annotation.exists())
					return true;
			}
		} catch (JavaModelException e) {
			log.error(e);
		}
		return super.containsElementsSearchedFor(file);
	}
	
	@Override
	protected IJavaElement findJavaElement(XtextResource resource, int offset) {
		IJavaElement result = super.findJavaElement(resource, offset);
		if(result != null){
			return result;
		}
		for (FeatureFile featureFile : filter(resource.getContents(), FeatureFile.class)) {
			JvmIdentifiableElement jvmElement = findAssociatedJvmElement(featureFile);
			if (jvmElement != null){
				result = elementFinder.findElementFor(jvmElement);
				break;
			}
		}
		return result;
	}
	
	@Override
	protected JvmIdentifiableElement findAssociatedJvmElement(EObject element) {
		if (element == null)
			return null;
		element = EcoreUtil2.getContainerOfType(element, FeatureFile.class);
		if(element == null){
			return null;
		}
		for (XtendClass xtendClass : ((FeatureFile)element).getXtendClasses()) {
			return super.findAssociatedJvmElement(xtendClass);
		}
		return null;
	}
}
