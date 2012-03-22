/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.jvmmodel

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.jnario.feature.feature.StepReference
import org.jnario.feature.feature.Scenario
import org.eclipse.xtend.core.xtend.XtendField
import java.util.HashSet
import org.eclipse.emf.common.util.EList
import org.jnario.feature.feature.Background
import org.eclipse.xtend.core.xtend.XtendMember
import org.jnario.feature.feature.Step

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
class StepReferenceFieldCreator {

	def copyXtendMemberForReferences(EObject objectWithReference){
		val refs = EcoreUtil2::getAllContentsOfType(objectWithReference, typeof(StepReference))
		if(!refs.empty){
			for(ref: refs){
				if(ref.reference?.stepExpression != null){
					val stepReference = ref as StepReference
					val fieldNames = stepReference.existingFieldNamesForContainerOfStepReference
					val members = stepReference.reference.membersOfReferencedStep
					objectWithReference.copyFields(members, fieldNames)					
				}
			}
		}		
   	}
   	
   	def getExistingFieldNamesForContainerOfStepReference(StepReference ref){
   		val refScenario = EcoreUtil2::getContainerOfType(ref, typeof(Scenario))
		var HashSet<String> fieldNames
		if(refScenario != null)
			fieldNames = refScenario.members.existingFieldNames
		else{
			val refBackground = EcoreUtil2::getContainerOfType(ref, typeof(Background))
			if(refBackground != null){
				fieldNames = refBackground.members.existingFieldNames
			}
		}
		return fieldNames
   	}
   	
   	def getExistingFieldNames(EList<XtendMember> members){
   		val fieldNames = new HashSet<String>
   		for(member: members){
			if(member instanceof XtendField){
				val field = member as XtendField
				fieldNames.add(field.name)
			}
		}
		return fieldNames
   	}
   	
   	def getMembersOfReferencedStep(Step step){
   		val scenario = EcoreUtil2::getContainerOfType(step, typeof(Scenario))
		var EList<XtendMember> members
		if(scenario != null){
			members = scenario.members
		}else{   							
			val refBackground = EcoreUtil2::getContainerOfType(step, typeof(Background))
			members = refBackground.members
		}
   	}
   	
   	def copyFields(EObject objectWithReference, EList<XtendMember> members, HashSet<String> fieldNames){
   		for(member: members){
			if(member instanceof XtendField){
				val field = member as XtendField
				if(!fieldNames.contains(field.name)){
					val copiedMember = EcoreUtil2::cloneWithProxies(field)
					if(objectWithReference instanceof Scenario){
						val scen = objectWithReference as Scenario	
						scen.members += copiedMember
					}
					if(objectWithReference instanceof Background){
						val back = objectWithReference as Background
						back.members += copiedMember
					}
					fieldNames.add(field.name)
				}
			}
		}
   	}
}