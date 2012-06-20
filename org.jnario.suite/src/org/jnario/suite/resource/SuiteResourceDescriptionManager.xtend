package org.jnario.suite.resource

import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.xtext.resource.IResourceDescription$Delta
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionManager
import org.jnario.suite.suite.SuitePackage
import org.eclipse.xtext.resource.DerivedStateAwareResourceDescriptionManager

class SuiteResourceDescriptionManager extends DerivedStateAwareResourceDescriptionManager {
	
	override isAffected(Delta delta, IResourceDescription candidate) throws IllegalArgumentException {
		if(candidate.getExportedObjectsByType(SuitePackage::eINSTANCE.patternReference).empty){
			return super.isAffected(delta, candidate)
		}
	}
	
}