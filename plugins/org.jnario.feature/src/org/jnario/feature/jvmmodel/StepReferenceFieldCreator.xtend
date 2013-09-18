/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.jvmmodel

import com.google.inject.Inject
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.core.xtend.XtendClass
import org.eclipse.xtend.core.xtend.XtendField
import org.eclipse.xtend.core.xtend.XtendMember
import org.jnario.feature.feature.Scenario
import org.jnario.feature.feature.StepReference
import org.jnario.util.SourceAdapter

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
class StepReferenceFieldCreator {

	@Inject extension VisibleMembersCalculator
	@Inject extension ExpressionCopier

	def copyXtendMemberForReferences(Scenario scenario){
		val refs = scenario.steps.filter(typeof(StepReference)).filter[reference?.expression != null]
		val fieldNames = scenario.existingFieldNamesForContainerOfStepReference
		for(ref: refs){
			val members = ref.reference.allVisibleMembers
			scenario.copyFields(members, fieldNames)					
		}
   	}
   	
   	def private getExistingFieldNamesForContainerOfStepReference(Scenario scenario){
   		scenario.allVisibleMembers.existingFieldNames
   	}
   	
   	def private getExistingFieldNames(Iterable<XtendMember> members){
   		members.filter(typeof(XtendField)).filter[it != null].map[name].toSet
   	}
   	
   	def private void copyFields(EObject objectWithReference, Iterable<XtendMember> members, Set<String> fieldNames){
   		if(!(objectWithReference instanceof XtendClass)){
   			return
   		}
   		val type = objectWithReference as XtendClass
   		val newFields = <XtendField>newArrayList
   		for(field: members.filter(typeof(XtendField))){
			if(!fieldNames.contains(field.name)){
				val copiedMember = cloneWithProxies(field)
				SourceAdapter::adapt(copiedMember, field);
				newFields += copiedMember as XtendField
				fieldNames += field.name
			}
		}
		type.members.addAll(newFields)
   	}
}