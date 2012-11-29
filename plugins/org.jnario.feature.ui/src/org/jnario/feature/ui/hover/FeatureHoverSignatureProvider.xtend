package org.jnario.feature.ui.hover

import org.eclipse.xtend.ide.hover.XtendHoverSignatureProvider
import org.eclipse.emf.ecore.EObject
import org.jnario.feature.feature.Step
import com.google.inject.Inject
import org.jnario.feature.naming.StepNameProvider

class FeatureHoverSignatureProvider extends XtendHoverSignatureProvider {
	
	@Inject extension StepNameProvider  
	
//	override getSignature(EObject object) {
//		switch object{
//			Step: getSignature(object)
//			default: super.getSignature(object)
//		}
//	} 
//	
//	
	
	def getSignature(Step step){
		nameOf(step)
	}	
}