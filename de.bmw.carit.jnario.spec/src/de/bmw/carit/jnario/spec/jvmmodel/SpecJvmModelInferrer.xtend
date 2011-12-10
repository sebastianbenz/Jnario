package de.bmw.carit.jnario.spec.jvmmodel

import com.google.inject.Inject
import de.bmw.carit.jnario.runner.ExampleGroupRunner
import de.bmw.carit.jnario.runner.Named
import de.bmw.carit.jnario.spec.naming.JavaNameProvider
import de.bmw.carit.jnario.spec.spec.Example
import de.bmw.carit.jnario.spec.spec.SpecFile
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.InternalEObject
import org.eclipse.xtext.common.types.JvmAnnotationTarget
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.typing.ITypeProvider
import org.eclipse.xtext.xtend2.resource.Xtend2Resource
import org.junit.Test
import org.junit.runner.RunWith

import static com.google.common.collect.Iterables.*
import org.eclipse.xtext.common.types.TypesPackage
import de.bmw.carit.jnario.spec.spec.ExampleGroup
import de.bmw.carit.jnario.runner.Contains
import java.util.List
import org.eclipse.xtext.common.types.JvmVisibility
import de.bmw.carit.jnario.common.jvmmodel.ExtendedJvmTypesBuilder
import org.eclipse.xtext.xtend2.xtend2.XtendField
import org.eclipse.xtext.xtend2.xtend2.XtendMember
import org.eclipse.xtext.xtend2.xtend2.XtendFunction
import org.eclipse.xtext.xtend2.jvmmodel.Xtend2JvmModelInferrer
import org.eclipse.xtext.xtend2.xtend2.XtendAnnotationTarget 
/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>		 
 */
class SpecJvmModelInferrer extends Xtend2JvmModelInferrer {

	@Inject extension ExtendedJvmTypesBuilder
	
	@Inject extension TypeReferences

	@Inject extension JavaNameProvider
	
	def dispatch void infer(EObject e, IAcceptor<JvmDeclaredType> acceptor, boolean prelinkingPhase) {
		for (EObject child : e.eContents()) {
			infer(child, acceptor, prelinkingPhase);
		}
	}
	
	def dispatch void infer(SpecFile spec, IAcceptor<JvmDeclaredType> acceptor, boolean isPrelinkingPhase) {
		if(spec.xtendClass == null){
			return 
		}
		infer(spec, spec.xtendClass as ExampleGroup, null, isPrelinkingPhase)
	}
	
	def infer(SpecFile spec, ExampleGroup exampleGroup, JvmGenericType superClass, boolean isPrelinkingPhase) {
		val List<JvmGenericType> subExamples = newArrayList()
		exampleGroup.toClass(exampleGroup.javaClassName, superClass) [
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
							subExamples += infer(spec, element, it, isPrelinkingPhase)
						}
						Example : {
							val method = element.toMethod(element.exampleMethodName, getTypeForName(Void::TYPE, element)) [
								documentation = element.documentation
								annotations += exampleGroup.toAnnotation(typeof(Named), element.describe)
								if(element.exception == null){
									annotations += element.toAnnotation(typeof(Test))
								}else{
										annotations += element.toAnnotation(typeof(Test).name, "expected", element.exception)
								}
								element.annotations.translateAnnotationsTo(it)
								body = element.body
							]
							val anyException = typeof(Exception).getTypeForName(element)
								if(anyException != null){
									method.exceptions += anyException
								}
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
			]
			
	}
	
}
