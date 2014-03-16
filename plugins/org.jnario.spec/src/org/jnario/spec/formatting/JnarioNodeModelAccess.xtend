package org.jnario.spec.formatting

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.nodemodel.ILeafNode
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.xbase.formatting.NodeModelAccess

class JnarioNodeModelAccess extends NodeModelAccess{
	
	override ILeafNode nodeForKeyword(EObject obj, String kw) {
		val node = NodeModelUtils.findActualNodeFor(obj)
		if(node == null){
			return null
		}
		node.asTreeIterable.findFirst[semanticElement == obj && grammarElement instanceof Keyword && text == kw] as ILeafNode
	}
}