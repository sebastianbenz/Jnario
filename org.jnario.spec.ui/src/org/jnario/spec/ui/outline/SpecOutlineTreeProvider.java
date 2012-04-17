/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.ui.outline;

import static com.google.common.collect.Iterables.filter;

import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.ide.outline.XtendOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.jnario.spec.spec.ExampleGroup;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class SpecOutlineTreeProvider extends XtendOutlineTreeProvider {

	@Override
	protected void createFeatureNodes(IOutlineNode parentNode, XtendClass xtendClass) {
		super.createFeatureNodes(parentNode, xtendClass);
		if (xtendClass instanceof ExampleGroup) {
			ExampleGroup exampleGroup = (ExampleGroup) xtendClass;
			for (ExampleGroup child : filter(exampleGroup.getMembers(), ExampleGroup.class)) {
				EObjectNode classNode = createEObjectNode(parentNode, child);
				createFeatureNodes(classNode, child);
			}
		}
	}
	
	protected boolean _isLeaf(ExampleGroup element) {
		return element.getMembers().isEmpty();
	}
	
}
