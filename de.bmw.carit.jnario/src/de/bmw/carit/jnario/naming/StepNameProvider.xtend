package de.bmw.carit.jnario.naming

import de.bmw.carit.jnario.jnario.JnarioPackage
import de.bmw.carit.jnario.jnario.Step
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.nodemodel.ILeafNode

import static org.eclipse.xtext.nodemodel.util.NodeModelUtils.*
import de.bmw.carit.jnario.jnario.StepReference
class StepNameProvider {
	
	def nameOf(Step step){
		if(step instanceof StepReference) return nameOf(step as StepReference)
		return step.name?.trim
	}
	
	def String nameOf(StepReference ref){
		val referencedStep = ref.reference
		if(referencedStep == null){
			return null
		}
		if(!referencedStep.eIsProxy){
			return nameOf(referencedStep)
		}
		return referenceText(ref, JnarioPackage::eINSTANCE.stepReference_Reference)
	} 
	
	def referenceText(EObject obj, EReference ref){
		val nodes = findNodesForFeature(obj, ref)
		val leafs = nodes.filter(typeof(ILeafNode))
		return leafs.map[it.text].join.trim
	}
}