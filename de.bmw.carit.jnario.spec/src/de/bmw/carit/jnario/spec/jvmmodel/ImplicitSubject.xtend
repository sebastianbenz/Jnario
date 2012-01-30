package de.bmw.carit.jnario.spec.jvmmodel

import com.google.inject.Inject
import de.bmw.carit.jnario.common.jvmmodel.ExtendedJvmTypesBuilder
import de.bmw.carit.jnario.runner.Subject
import de.bmw.carit.jnario.spec.spec.ExampleGroup
import java.util.Iterator
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.XFeatureCall
import org.eclipse.xtext.xbase.XMemberFeatureCall

import static extension com.google.common.collect.Iterators.*
import static extension com.google.common.collect.Iterables.*
import static de.bmw.carit.jnario.spec.jvmmodel.Constants.*
import static extension com.google.common.base.Predicates.*
import static org.eclipse.xtext.EcoreUtil2.*
import org.eclipse.xtext.xtend2.xtend2.XtendFunction
import de.bmw.carit.jnario.spec.spec.TestFunction


/**
 * @author Sebastian Benz
 */
class ImplicitSubject {
	
	@Inject extension ExtendedJvmTypesBuilder
	
	@Inject extension TypeReferences
	
	def void addImplicitSubject(JvmGenericType type, ExampleGroup exampleGroup){
		val targetType = exampleGroup.resolveTargetType()
		if(targetType == null || targetType.eIsProxy()) return;
		if(type.hasSubject()) return;
		if(exampleGroup.neverUsesSubject()) return;
		
		type.members.add(0, exampleGroup.toField(SUBJECT_FIELD_NAME, targetType.createTypeRef)[
			annotations += exampleGroup.toAnnotation(typeof(Subject))
			visibility = JvmVisibility::PUBLIC
		])
	}
	
	def JvmDeclaredType resolveTargetType(ExampleGroup exampleGroup){
		if(exampleGroup.targetType != null){
			return exampleGroup.targetType
		}
		val parentGroup = getContainerOfType(exampleGroup.eContainer, typeof(ExampleGroup))
		if(parentGroup == null){
			return null
		}
		return resolveTargetType(parentGroup)
	}
	
	def boolean hasSubject(JvmGenericType type){
		val fields = type.members.filter(typeof(JvmField))
		val subjectField = fields.findFirst[simpleName == SUBJECT_FIELD_NAME]
		if(subjectField != null){
			return true
		}
		val extendedClass = type.extendedClass?.type
		if(extendedClass == null){
			return false
		}
		return hasSubject(extendedClass as JvmGenericType)		
	}
	
	def neverUsesSubject(ExampleGroup exampleGroup){
		var Iterator<XMemberFeatureCall> allFeatureCalls = emptyIterator
		val members = exampleGroup.members
		for(example : members.filter(typeof(XtendFunction))){
			allFeatureCalls = concat(allFeatureCalls, example.eAllContents.filter(typeof(XMemberFeatureCall)))
		}
		for(example : members.filter(typeof(TestFunction))){
			allFeatureCalls = concat(allFeatureCalls, example.eAllContents.filter(typeof(XMemberFeatureCall)))
		}
		return null == allFeatureCalls.findFirst(XMemberFeatureCall call| {
			if(call.memberCallTarget == null) return false
			if(!(call.memberCallTarget instanceof XFeatureCall)) return false
			val featureCall = call.memberCallTarget as XFeatureCall
			return featureCall.concreteSyntaxFeatureName == SUBJECT_FIELD_NAME
		})
	}
	
}
