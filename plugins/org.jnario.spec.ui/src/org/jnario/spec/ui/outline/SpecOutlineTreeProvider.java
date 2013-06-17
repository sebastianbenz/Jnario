/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.ui.outline;

import static com.google.common.collect.Iterables.filter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.jvmmodel.IXtendJvmAssociations;
import org.eclipse.xtend.core.xtend.XtendTypeDeclaration;
import org.eclipse.xtend.ide.outline.XtendFeatureNode;
import org.eclipse.xtend.ide.outline.XtendOutlineTreeProvider;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.jnario.ExampleCell;
import org.jnario.ExampleTable;
import org.jnario.spec.spec.ExampleGroup;

import com.google.inject.Inject;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class SpecOutlineTreeProvider extends XtendOutlineTreeProvider {

	@Inject
	private IXtendJvmAssociations associations;
	
	@Override
	protected void createFeatureNodes(IOutlineNode parentNode,
			XtendTypeDeclaration xtendClass) {
		super.createFeatureNodes(parentNode, xtendClass);
		if (xtendClass instanceof ExampleGroup) {
			ExampleGroup exampleGroup = (ExampleGroup) xtendClass;
			for (ExampleGroup child : filter(exampleGroup.getMembers(), ExampleGroup.class)) {
				EObjectNode classNode = createNode(parentNode, child);
				createFeatureNodes(classNode, child);
			}
		}
	}
	
	@Override
	protected XtendFeatureNode createNodeForFeature(IOutlineNode parentNode,
			JvmDeclaredType inferredType, JvmFeature jvmFeature,
			EObject semanticFeature, int inheritanceDepth) {
		if(jvmFeature instanceof JvmConstructor){
			return null;
		}
		EObject sourceElement = associations.getPrimarySourceElement(jvmFeature);
		if(sourceElement instanceof ExampleCell){
			return null;
		}
		if(sourceElement instanceof ExampleTable){
			return null;
		}
		return super.createNodeForFeature(parentNode, inferredType, jvmFeature,
				semanticFeature, inheritanceDepth);
	}
	
	protected boolean _isLeaf(ExampleGroup element) {
		return element.getMembers().isEmpty();
	}
	
}
