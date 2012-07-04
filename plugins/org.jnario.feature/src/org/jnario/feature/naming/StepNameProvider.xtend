/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.naming

import static extension org.jnario.util.Strings.*
import com.google.common.base.Strings
import org.jnario.feature.feature.FeaturePackage
import org.jnario.feature.feature.Step
import org.jnario.feature.feature.StepReference

import static org.jnario.feature.naming.StepNameProvider.*
import static org.jnario.util.Nodes.*
import org.jnario.feature.jvmmodel.StepArgumentsProvider
import org.jnario.feature.feature.Feature
import org.jnario.feature.feature.Scenario

/**
 * @author Sebastian Benz - Initial contribution and API
 * @author Birgit Engelmann
 */
class StepNameProvider {
 
	def dispatch nameOf(Step step){
		if(step == null){
			return "";
		}
		step.name?.trim 
	}
	
	def dispatch nameOf(StepReference ref){
		if(ref == null || ref.reference == null){
			null
		}else{
			textForFeature(ref, FeaturePackage::eINSTANCE.stepReference_Reference)
		}
	} 
	
	def getMethodName(Step step){
		var originalName = nameOf(step).firstLine.trim;
		return toFirstLower(convertToCamelCase(originalName));
	}
	
	def describe(Feature feature){
		feature.name.makeJunitConform
	}
	
	def describe(Scenario scenario){
		scenario.name.makeJunitConform
	}
	
	def describe(Step step){
		var name = nameOf(step)
		return name.firstLine.makeJunitConform
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
	
	def private removeArguments(String name){
		return StepArgumentsProvider::ARG_PATTERN.matcher(name).replaceAll('""')
	}
	
	def removeKeywordsAndArguments(String name){
		return name.firstLine.removeKeywords.removeArguments
	}
}