package de.bmw.carit.jnario.spec.jvmmodel

import com.google.inject.Inject
import de.bmw.carit.jnario.common.jvmmodel.ExtendedJvmTypesBuilder
import de.bmw.carit.jnario.runner.Contains
import de.bmw.carit.jnario.runner.ExampleGroupRunner
import de.bmw.carit.jnario.runner.Named
import de.bmw.carit.jnario.runner.Subject
import de.bmw.carit.jnario.spec.spec.Example
import de.bmw.carit.jnario.spec.spec.ExampleGroup
import de.bmw.carit.jnario.spec.spec.SpecFile
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.XFeatureCall
import org.eclipse.xtext.xbase.XMemberFeatureCall
import org.eclipse.xtext.xtend2.jvmmodel.Xtend2JvmModelInferrer
import org.eclipse.xtext.xtend2.xtend2.XtendField
import org.eclipse.xtext.xtend2.xtend2.XtendFunction
import org.junit.Test
import org.junit.runner.RunWith 
/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>		 
 */
class SpecJvmModelInferrer extends Xtend2JvmModelInferrer {

	@Inject extension ExtendedJvmTypesBuilder
	
	@Inject extension TypeReferences

	@Inject extension de.bmw.carit.jnario.spec.naming.ExampleNameProvider
	
	override void infer(EObject e, IAcceptor<JvmDeclaredType> acceptor, boolean isPrelinkingPhase) {
		if (!(e instanceof SpecFile)){
			return
		}
		val specFile = e as SpecFile
		
		if(specFile.xtendClass == null){
			return
		}
		
		transform(specFile as SpecFile, specFile.xtendClass as ExampleGroup, null, isPrelinkingPhase)
	}
	
	def transform(SpecFile spec, ExampleGroup exampleGroup, JvmGenericType superClass, boolean isPrelinkingPhase) {
		val List<JvmGenericType> subExamples = newArrayList()
		exampleGroup.toClass(exampleGroup.toJavaClassName, superClass) [
				spec.eResource.contents += it
				documentation = exampleGroup.documentation
				packageName = spec.^package
				
				if(isPrelinkingPhase){
					return
				}
				
				annotations += exampleGroup.toAnnotation(typeof(RunWith), typeof(ExampleGroupRunner))
				annotations += exampleGroup.toAnnotation(typeof(Named), exampleGroup.describe)
				exampleGroup.annotations.translateAnnotationsTo(it)
				
				for (element : exampleGroup.members) {
					switch element {
						XtendField : {
							element.visibility = JvmVisibility::PROTECTED
							element.transform(it)
						}
						ExampleGroup: {
							subExamples += transform(spec, element, it, isPrelinkingPhase)
						}
						Example : {
							val method = element.toMethod(element.toMethodName, getTypeForName(Void::TYPE, element)) [
								documentation = element.documentation
								annotations += exampleGroup.toAnnotation(typeof(Named), element.describe)
								if(element.exception == null){
									annotations += element.toAnnotation(typeof(Test))
								}else{
									annotations += element.toAnnotation(typeof(Test).name, "expected", element.exception)
								}
								body = element.body
								element.annotations.translateAnnotationsTo(it)
								exceptions += typeof(Exception).getTypeForName(element)
							]
							members += method
						}
						XtendFunction: {
							element.transform(it)
						}
					}
				}
				
				if(!subExamples.empty){
					annotations += exampleGroup.toAnnotation(typeof(Contains), subExamples);
				}
				computeInferredReturnTypes()
				addImplicitSubject(exampleGroup)
			]
						
	}
	
	def void addImplicitSubject(JvmGenericType type, ExampleGroup exampleGroup){
		val targetType = exampleGroup.targetType
		if(targetType == null) return;
		if(targetType.eIsProxy()) return;
		if(hasSubject(type)) return;
		if(neverUsesSubject(exampleGroup)) return;
		
		type.members.add(0, exampleGroup.toField("subject", targetType.createTypeRef)[
			annotations += exampleGroup.toAnnotation(typeof(Subject))
			visibility = JvmVisibility::PUBLIC
		])
	}
	
	def hasSubject(JvmGenericType type){
		type.members.filter(typeof(JvmField)).findFirst[simpleName == "subject"] != null
	}
	
	def neverUsesSubject(ExampleGroup exampleGroup){
		val allFeatureCalls = exampleGroup.eAllContents.filter(typeof(XMemberFeatureCall))
		null == allFeatureCalls.findFirst(XMemberFeatureCall call| {
			if(call.memberCallTarget == null) return false
			if(!(call.memberCallTarget instanceof XFeatureCall)) return false
			val featureCall = call.memberCallTarget as XFeatureCall
			return featureCall.concreteSyntaxFeatureName == "subject"
		})
	}
}
