/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.naming

import org.jnario.feature.feature.FeaturePackage
import org.jnario.feature.feature.Step
import org.jnario.feature.feature.StepReference
import org.jnario.util.Nodes

import static org.jnario.feature.naming.StepNameProvider.*
import com.google.common.base.Strings

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
			return null
		}
		return Nodes::textForFeature(ref, FeaturePackage::eINSTANCE.stepReference_Reference)
	} 

	
	def removeExtraCharacters(String string){
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
	
	def removeArguments(String name){
		return name.replaceAll("\"[^\"]*\"", "\"\"");
	}
	
	def removeKeywordsAndArguments(String name){
		return name.removeKeywords.removeArguments.removeExtraCharacters
	}
}