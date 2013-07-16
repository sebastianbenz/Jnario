/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.naming

import com.google.common.base.Strings
import org.eclipse.xtend.core.xtend.XtendPackage
import org.jnario.feature.feature.Feature
import org.jnario.feature.feature.FeaturePackage
import org.jnario.feature.feature.Scenario
import org.jnario.feature.feature.Step
import org.jnario.feature.feature.StepReference

import static org.eclipse.xtext.util.Strings.*
import static org.jnario.util.Nodes.*

import static extension org.jnario.util.Strings.*

/**
 * @author Sebastian Benz - Initial contribution and API
 * @author Birgit Engelmann
 */
class StepNameProvider {
 
	def dispatch nameOf(Step step){
		if(step == null || step.getName == null){
			return null
		}
		// restore Given, Then, When keywords
		textForFeature(step, XtendPackage::eINSTANCE.xtendTypeDeclaration_Name)
	}
	
	def dispatch nameOf(StepReference ref){
		if(ref == null){
			null
		}else{
			textForFeature(ref, FeaturePackage::eINSTANCE.stepReference_Reference)
		}
	} 
	
	def getMethodName(Step step){
		var originalName = nameOf(step).firstLine.trim;
		return org.jnario.util.Strings.toMethodName(originalName);
	}
	
	def describe(Feature feature){
		feature.name.makeJunitConform
	}
		
	def describe(Scenario scenario){
		scenario.name.makeJunitConform
	}
	
	def describe(Step step){
		var name = new StringBuilder(nameOf(step))
		if(step.pending){
			markAsPending(name)
		}
		return name.toString.firstLine.makeJunitConform
	}
	
	def removeKeywords(String name){
		if(Strings::isNullOrEmpty(name)){
			return ""
		}
		var index = name.indexOf(" ")
		if(index == -1){
			return ""
		}
		return name.substring(index + 1)
	}
	
	def removeArguments(String text){
		var name = text.firstLine
		ArgumentsHelper::removeArgumentValues(name).trim
	}
}