package de.bmw.carit.jnario.naming

import de.bmw.carit.jnario.jnario.Step
import de.bmw.carit.jnario.jnario.Ref
import static org.eclipse.xtext.nodemodel.util.NodeModelUtils.*
import de.bmw.carit.jnario.jnario.JnarioPackage
import org.eclipse.xtext.nodemodel.ILeafNode
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
class StepNameProvider {
	
	def nameOf(Step step){
		if(step instanceof Ref) return nameOf(step as Ref)
		return step.name?.trim
	}
	
	def String nameOf(Ref ref){
		val referencedStep = ref.reference
		if(referencedStep == null){
			return null
		}
		if(!referencedStep.eIsProxy){
			return nameOf(referencedStep)
		}
		return referenceText(ref, JnarioPackage::eINSTANCE.ref_Reference)
	} 
	
	def referenceText(EObject obj, EReference ref){
		val nodes = findNodesForFeature(obj, ref)
		val leafs = nodes.filter(typeof(ILeafNode))
		return leafs.map[it.text].join.trim
	}
}