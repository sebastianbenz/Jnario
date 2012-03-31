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
