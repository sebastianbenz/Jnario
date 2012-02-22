/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.naming

import de.bmw.carit.jnario.jnario.JnarioPackage
import de.bmw.carit.jnario.jnario.Step
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.nodemodel.ILeafNode

import static org.eclipse.xtext.nodemodel.util.NodeModelUtils.*
import de.bmw.carit.jnario.jnario.StepReference

/**
 * @author Sebastian Benz - Initial contribution and API
 * @author Birgit Engelmann
 */
class StepNameProvider {
	
	private static String MULTILINE = "\\\\( |\t)*\r?\n?( |\t)*"
	
	def nameOf(Step step){
		if(step instanceof StepReference) return nameOf(step as StepReference)
		return step.name?.removeExtraCharacters
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
	
	def removeExtraCharacters(String string){
		return string.trim.replace("\"", "\\\"").replaceAll(MULTILINE," ")
	}
}