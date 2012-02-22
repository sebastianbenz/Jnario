/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.spec.ui.wizards;

import static com.google.common.collect.Iterables.filter;
import static org.eclipse.xtext.util.Strings.isEmpty;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider.Factory;
import org.eclipse.xtext.common.types.access.jdt.JdtTypeProviderFactory;
import org.eclipse.xtext.common.types.util.jdt.IJavaElementFinder;
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider;

import com.google.inject.Inject;

import de.bmw.carit.jnario.spec.naming.OperationNameProvider;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class SpecCreator {
	
	private final OperationNameProvider nameProvider;
	
	private final Factory typeProviderFactory;
	
	private final IJavaElementFinder javaElementFinder;
	
	private XtextResourceSetProvider resourceSetProvider;

	@Inject
	public SpecCreator(JdtTypeProviderFactory typeProviderFactory, OperationNameProvider nameProvider, IJavaElementFinder javaElementFinder, XtextResourceSetProvider resourceSetProvider){
		this.typeProviderFactory = typeProviderFactory;
		this.nameProvider = nameProvider;
		this.javaElementFinder = javaElementFinder;
		this.resourceSetProvider = resourceSetProvider;
	}

	public String create(IJavaProject javaProject, String description,
			IPackageFragment packageFragment, String classUnderTest, IMethod[] contextMethods, IProgressMonitor monitor) {
		IJvmTypeProvider typeProvider = createTypeProvider(javaProject);
		StringBuffer sb = new StringBuffer();
		if(packageFragment.getElementName() != null && !packageFragment.getElementName().equals("")){
			sb.append("package ");
			sb.append(packageFragment.getElementName());
			sb.append("\n\n");
		}
		if(!isEmpty(classUnderTest)) {
			addImport(sb, classUnderTest);
			sb.append("\n");
		}
		
		sb.append("describe ");
		if(!isEmpty(classUnderTest)){
			sb.append(stripPackage(classUnderTest));
			sb.append(" ");
		}
		if(!isEmpty(description)){
			sb.append("\"");
			sb.append(description);
			sb.append("\"");
		}
		
		if(isEmpty(classUnderTest) && isEmpty(description)){
			sb.append("\"\"");
		}
		
		sb.append("{\n");
		for (IMethod method : contextMethods) {
			sb.append("\n\tcontext ");
			sb.append(signature(method, typeProvider));
			sb.append("{\n\t\t\n\t}\n");
		}
		sb.append("\n}");
		return sb.toString();
	}

	protected IJvmTypeProvider createTypeProvider(IJavaProject javaProject) {
		ResourceSet resourceSet = resourceSetProvider.get(javaProject.getProject());
		return typeProviderFactory.createTypeProvider(resourceSet);
	}
	
	private String signature(IMethod method, IJvmTypeProvider typeProvider) {
		String typeName = method.getClassFile().getType().getFullyQualifiedName();
		JvmGenericType type = (JvmGenericType) typeProvider.findTypeByName(typeName);
		for (JvmOperation operation : filter(type.getMembers(), JvmOperation.class)) {
			IJavaElement javaElement = javaElementFinder.findElementFor(operation);
			if(javaElement.equals(method)){
				return nameProvider.apply(operation).getFirstSegment();
			}
		}
		throw new IllegalStateException("Could not resolve JVM identifiable for " + method);
	}

	private Object stripPackage(Object superType) {
		return superType.toString().replaceAll("^(\\w+\\.)*", "") ;
	}

	private void addImport(StringBuffer sb, Object object) {
		sb.append("import ");
		sb.append(removeGenerics(object));
		sb.append("\n");
	}

	private String removeGenerics(Object object) {
		return object.toString().replaceAll("<.*>$", "");
	}

}
