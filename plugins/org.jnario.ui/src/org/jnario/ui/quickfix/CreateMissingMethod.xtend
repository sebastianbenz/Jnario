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
import org.eclipse.jdt.core.IType
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable
import org.eclipse.xtext.common.types.xtext.ui.JdtHyperlink
import org.eclipse.jdt.core.IJavaElement
import org.eclipse.xtext.xbase.compiler.ImportManager

class CreateMissingMethod {
	
	extension IJavaElementFinder elementProvider
	extension ITypeProvider typeProvider
	extension IXtendJvmAssociations jvmAssociations
	extension MethodBuilderProvider methodBuilderProvider
	
	@Inject new(IJavaElementFinder elementProvider, ITypeProvider typeProvider, IXtendJvmAssociations jvmAssociations, MethodBuilderProvider methodBuilderProvider){
		this.elementProvider = elementProvider
		this.typeProvider = typeProvider
		this.jvmAssociations = jvmAssociations
		this.methodBuilderProvider = methodBuilderProvider
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
		return call.targetJavaElement.isReadOnly
	}
	
	def IModification createModification(XMemberFeatureCall call, String methodName) { 
		if(isXtendClass(call)){
			val methodBuilder = newXtendMethodBuilder(methodName)
			methodBuilder.configureWith(call)
			return new CreateXtendMethod(methodBuilder)
		}else{
			val methodBuilder = newJavaMethodBuilder(methodName)
			methodBuilder.configureWith(call)
			return new CreateJavaMethod(methodBuilder, call.targetJavaElement as IType)
		}
	}
	
	def private configureWith(XtendMethodBuilder methodBuilder, XMemberFeatureCall call){
		methodBuilder.featureCall = call
	}
	
	def private targetJavaElement(XMemberFeatureCall call){
		findElementFor(call.targetType)
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

@Data
class CreateJavaMethod implements IModification{
	
	XtendMethodBuilder methodBuilder
	IType type
	
	override apply(IModificationContext context) throws Exception {
		generateMethod.openInEditor
	}
	
	def private generateMethod(){
		val content = new StringBuilderBasedAppendable
		methodBuilder.build(content)
		type.createMethod(content.toString, null, true, new NullProgressMonitor)
	}
	
	def private openInEditor(IJavaElement element){
		val link = new JdtHyperlink()
		link.javaElement = element
		link.open
	}
}

@Data
class CreateXtendMethod implements IModification{
	
	XtendMethodBuilder methodBuilder
	
	override apply(IModificationContext context) throws Exception {
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
}

