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
import org.eclipse.xtend.core.xtend.XtendMember
import org.jnario.feature.feature.Step
import java.util.Set
import java.util.List
import org.eclipse.xtend.core.xtend.XtendClass
import org.jnario.feature.feature.Background
import static org.eclipse.xtext.EcoreUtil2.*
import org.jnario.feature.feature.Feature

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
class StepReferenceFieldCreator {

	def copyXtendMemberForReferences(EObject objectWithReference){
		val refs = getAllContentsOfType(objectWithReference, typeof(StepReference))
		for(ref: refs){
			if(ref.reference?.stepExpression != null){
				val fieldNames = ref.existingFieldNamesForContainerOfStepReference
				val members = ref.reference.membersOfReferencedStep
				objectWithReference.copyFields(members, fieldNames)					
			}
		}
   	}
   	
   	def getExistingFieldNamesForContainerOfStepReference(StepReference ref){
   		ref.membersOfReferencedStep.existingFieldNames
   	}
   	
   	def getExistingFieldNames(Iterable<XtendMember> members){
   		members.filter(typeof(XtendField)).map[name].toSet
   	}
   	
   	def getMembersOfReferencedStep(Step step){
   		val scenario = getContainerOfType(step, typeof(Scenario))
		if(scenario == null){
			return <XtendMember>emptyList
		}
		var members = scenario.members
		if(scenario instanceof Background){
			return members
		}
		val feature = getContainerOfType(scenario, typeof(Feature))
		if(feature.background == null){
			return members
		}
		return members + feature.background.members
		
   	}
   	
   	def copyFields(EObject objectWithReference, Iterable<XtendMember> members, Set<String> fieldNames){
   		if(!(objectWithReference instanceof XtendClass)){
   			return
   		}
   		val type = objectWithReference as XtendClass
   		for(field: members.filter(typeof(XtendField))){
			if(!fieldNames.contains(field.name)){
				val copiedMember = copy(field)
				type.members += copiedMember as XtendField
				fieldNames += field.name
			}
		}
   	}
}