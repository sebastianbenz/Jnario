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

/**
 * @author Sebastian Benz - Initial contribution and API
 * @author Birgit Engelmann
 */
class StepNameProvider {
 
	private static String MULTILINE = "\\\\( |\t)*\r?\n?( |\t)*"
	
	def nameOf(Step step){
		if(step == null){
			return "";
		}
		if(step instanceof StepReference){
			nameOf(step as StepReference)
		} else{
			step.name 
		}?.removeExtraCharacters
	}
	
	def String nameOf(StepReference ref){
		if(ref.reference == null){
			null
		}else{
			textForFeature(ref, FeaturePackage::eINSTANCE.stepReference_Reference)
		}
	} 
	
	def getMethodName(Step step){
		var originalName = nameOf(step);
		val index = originalName .lastIndexOf('\n');
		if(index != -1){
			originalName = originalName.substring(0, index - 1).trim(); 
		}
		return toFirstLower(convertToCamelCase(originalName));
	}
	
	def describe(Step step){
		var name = nameOf(step)
		
		val index = name.indexOfNewLine
		if(index != -1){
			name = name.substring(0, index)	
		}
		return name
	}
	
	
	def private removeExtraCharacters(String string){
		return string.trim.replace("\"", "\\\"").replaceAll(MULTILINE,"")
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
		return name.removeKeywords.removeArguments.removeExtraCharacters
	}
}