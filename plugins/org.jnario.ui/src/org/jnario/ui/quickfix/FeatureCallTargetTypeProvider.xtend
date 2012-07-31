package org.jnario.ui.quickfix

import org.eclipse.xtext.xbase.XMemberFeatureCall
import org.eclipse.xtext.xbase.XAbstractFeatureCall
import org.eclipse.xtext.xbase.typing.ITypeProvider
import com.google.inject.Inject

class FeatureCallTargetTypeProvider {
	
	@Inject extension ITypeProvider
	
	def targetType(XMemberFeatureCall featureCall){
		featureCall.targetFeature?.typeForIdentifiable?.type
	}
	
	def private targetFeature(XMemberFeatureCall featureCall){
		val memberCallTarget = featureCall.memberCallTarget
		if(!(memberCallTarget instanceof XAbstractFeatureCall)){
			return null
		}
		(memberCallTarget as XAbstractFeatureCall).feature
	}
	
}