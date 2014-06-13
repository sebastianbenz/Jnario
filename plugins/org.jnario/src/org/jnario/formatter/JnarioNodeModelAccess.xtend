package org.jnario.formatter 

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.nodemodel.ILeafNode
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.xbase.formatting.NodeModelAccess

class JnarioNodeModelAccess extends NodeModelAccess{
	
	override nodesForKeyword(EObject obj, String kw) {
		val node = NodeModelUtils.findActualNodeFor(obj)
		if(node == null){
			return #[]
		}
		val leafNode = node.asTreeIterable.findFirst[semanticElement == obj && grammarElement instanceof Keyword && text == kw] as ILeafNode
		if (leafNode === null) #[] else #[leafNode] 
	}
	
}