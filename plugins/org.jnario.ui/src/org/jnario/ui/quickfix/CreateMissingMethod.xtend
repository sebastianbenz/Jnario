package org.jnario.ui.quickfix

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.util.jdt.IJavaElementFinder
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.xbase.XAbstractFeatureCall
import org.eclipse.xtext.xbase.XMemberFeatureCall
import org.eclipse.xtext.xbase.typing.ITypeProvider
import org.eclipse.xtext.ui.editor.model.edit.IModification
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext
import org.eclipse.xtend.core.jvmmodel.IXtendJvmAssociations
import org.eclipse.xtext.xbase.resource.XbaseResource

class CreateMissingMethod {
	
	extension IJavaElementFinder elementProvider
	extension ITypeProvider typeProvider
	extension IXtendJvmAssociations jvmAssociations
	
	@Inject new(IJavaElementFinder elementProvider, ITypeProvider typeProvider, IXtendJvmAssociations jvmAssociations){
		this.elementProvider = elementProvider
		this.typeProvider = typeProvider
		this.jvmAssociations = jvmAssociations
	}
		
	def apply(Issue issue, IssueResolutionAcceptor issueResolutionAcceptor, XMemberFeatureCall featureCall, String issueString){
		if(!featureCall.hasMissingMethod){
			return
		}
		if(featureCall.receiverIsReadOnly){
			return
		}
		val modification = createModification(featureCall, issueString)
		issueResolutionAcceptor.accept(issue, "create Method '" + issueString + "' in " + featureCall.targetType?.simpleName, "", null, modification)
	}

	def hasMissingMethod(XMemberFeatureCall featureCall){
		if(featureCall.targetType.isUnknown){
			return false
		}
		featureCall.feature?.eIsProxy
	}
	
	def boolean receiverIsReadOnly(XMemberFeatureCall call) {
		val targetType = call.targetType
		val javaElement = findElementFor(targetType)
		return javaElement.isReadOnly
	}
	
	def IModification createModification(XMemberFeatureCall call, String methodName) { 
		if(isXtendClass(call)){
			return new CreateXtendMethod
		}else{
			return new CreateJavaMethod
		}
	}
	
	def private isXtendClass(XMemberFeatureCall call) {
		return call.targetType.eResource instanceof XbaseResource
	}

	def private targetType(XMemberFeatureCall featureCall){
		featureCall.targetFeature?.typeForIdentifiable?.type
	}
	
	def private targetFeature(XMemberFeatureCall featureCall){
		val memberCallTarget = featureCall.memberCallTarget
		if(!(memberCallTarget instanceof XAbstractFeatureCall)){
			return null
		}
		(memberCallTarget as XAbstractFeatureCall).feature
	}

	def private isUnknown(EObject obj){
		obj == null || obj.eIsProxy
	}
}

class CreateJavaMethod implements IModification{
	override apply(IModificationContext context) throws Exception {
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
}

class CreateXtendMethod implements IModification{
	override apply(IModificationContext context) throws Exception {
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
}

