/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.util;

import static org.eclipse.xtext.nodemodel.util.NodeModelUtils.findNodesForFeature;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.nodemodel.INode;

public class Nodes {
	
	public static String textForFeature(EObject eObject, EStructuralFeature feature){
		List<INode> nodes = findNodesForFeature(eObject, feature);
		StringBuilder sb = new StringBuilder();
		for (INode node : nodes) {
			sb.append(node.getText());
		}
		return sb.toString().trim();
	}

}
