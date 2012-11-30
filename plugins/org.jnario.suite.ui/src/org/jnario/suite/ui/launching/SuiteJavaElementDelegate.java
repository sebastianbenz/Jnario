/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.ui.launching;

import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.generator.IDerivedResourceMarkers;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.ui.launching.JavaElementDelegateJunitLaunch;
import org.jnario.suite.jvmmodel.SuiteClassNameProvider;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuiteFile;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class SuiteJavaElementDelegate extends JavaElementDelegateJunitLaunch {

	private final static Logger log = Logger.getLogger(SuiteJavaElementDelegate.class);
	
	@Inject
	private IJvmModelAssociations associations;

	@Inject private FileExtensionProvider fileExtensionProvider;
	@Inject private IResourceSetProvider resourceSetProvider;
	@Inject private SuiteClassNameProvider nameProvider;
	@Inject	private IDerivedResourceMarkers derivedResourceMarkers;

	
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
			Logger.getLogger(SuiteJavaElementDelegate.class).error(e);
		}
		return super.containsElementsSearchedFor(file);
	}
	
	protected IJavaElement getJavaElementForResource(IResource resource) {
		try {
			final URI uri = URI.createPlatformResourceURI(resource.getFullPath().toString(), true);
			String mainClassName = loadSuite(resource, uri);
			if(mainClassName == null){
				return null;
			}
			List<IFile> resources = derivedResourceMarkers.findDerivedResources(resource.getProject(), uri.toString());
			for (IFile file : resources) {
				if (file.getName().equals(mainClassName)){
					return JavaCore.create(file);
				}
			}
		} catch (CoreException e) {
			if (log.isDebugEnabled()) {
				log.debug(e.getMessage(), e);
			}
		}
		return null;
	}

	protected String loadSuite(IResource resource, final URI uri) {
		ResourceSet resourceSet = resourceSetProvider.get(resource.getProject());
		Resource r = resourceSet.getResource(uri, true);
		if(r == null || r.getContents().isEmpty()){
			return null;
		}
		SuiteFile suiteFile = Iterables.filter(r.getContents(), SuiteFile.class).iterator().next();
		if(suiteFile.getXtendClasses().isEmpty()){
			return null;
		}
		Suite suite = (Suite) suiteFile.getXtendClasses().get(0);
		return nameProvider.toJavaClassName(suite) + ".java";
	}
	
	@Override
	protected JvmIdentifiableElement findAssociatedJvmElement(EObject element) {
		if (element == null)
			return null;
		if (element instanceof XtendFile) {
			XtendFile specFile = (XtendFile) element;
			if(!specFile.getXtendClasses().isEmpty()){
				element = specFile.getXtendClasses().get(0);
			}
		}else{
			element = EcoreUtil2.getContainerOfType(element, XtendClass.class);
		}
		Set<EObject> elements = associations.getJvmElements(element);
		if (elements.isEmpty()) {
			return findAssociatedJvmElement(element.eContainer());
		}
		return super.findAssociatedJvmElement(element);
	}
}
