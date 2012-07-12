/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.resource

import java.util.Collection
import org.eclipse.xtext.resource.DerivedStateAwareResourceDescriptionManager
import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.xtext.resource.IResourceDescription$Delta
import org.eclipse.xtext.resource.IResourceDescriptions

import static org.jnario.suite.resource.SuiteResourceDescriptionManager.*

class SuiteResourceDescriptionManager extends DerivedStateAwareResourceDescriptionManager {
	
	static val FILE_EXTENSIONS = newHashSet("suite", "spec", "feature") 
	
	override isAffected(Collection<Delta> deltas, IResourceDescription candidate, IResourceDescriptions context) {
		if(super.isAffected(deltas, candidate, context)){
			return true
		}
		
		return !deltas.filter[it.isNewSpec].empty
	}

	def isNewSpec(Delta delta){
		delta.^new != null && FILE_EXTENSIONS.contains(delta.uri.fileExtension)
	}
	
}