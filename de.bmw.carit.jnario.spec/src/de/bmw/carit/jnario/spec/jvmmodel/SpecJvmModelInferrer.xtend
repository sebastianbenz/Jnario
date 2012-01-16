package de.bmw.carit.jnario.spec.jvmmodel

import com.google.inject.Inject
import de.bmw.carit.jnario.common.jvmmodel.ExtendedJvmTypesBuilder
import de.bmw.carit.jnario.runner.Contains
import de.bmw.carit.jnario.runner.Named
import de.bmw.carit.jnario.spec.spec.Example
import de.bmw.carit.jnario.spec.spec.ExampleGroup
import de.bmw.carit.jnario.spec.spec.SpecFile
import de.bmw.carit.jnario.spec.spec.TestFunction
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmAnnotationReference
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xtend2.jvmmodel.Xtend2JvmModelInferrer
import org.eclipse.xtext.xtend2.xtend2.XtendField
import org.eclipse.xtext.xtend2.xtend2.XtendFunction
import de.bmw.carit.jnario.spec.spec.Before
import de.bmw.carit.jnario.spec.spec.After
import static de.bmw.carit.jnario.spec.jvmmodel.Constants.*
import static com.google.common.collect.Iterators.*
import static org.eclipse.xtext.EcoreUtil2.*
import de.bmw.carit.jnario.spec.naming.ExampleNameProvider

class SpecJvmModelInferrer extends Xtend2JvmModelInferrer {

	@Inject extension ExtendedJvmTypesBuilder
	
	@Inject extension TypeReferences

	@Inject extension ExampleNameProvider
	
	@Inject extension SpecAnnotationProvider annotationProvider
	
	@Inject extension ImplicitSubject 
	
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
		exampleGroup.toClass(exampleGroup.toJavaClassName) [
				spec.eResource.contents += it
				documentation = exampleGroup.documentation
				packageName = spec.^package
				if(superClass != null){
					superTypes += superClass.createTypeRef
				}
				if(isPrelinkingPhase){
					return
				}
				
				annotations += exampleGroup.toAnnotation(runnerAnnotation.key, runnerAnnotation.value)
				annotations += exampleGroup.toAnnotation(typeof(Named), exampleGroup.describe)
				exampleGroup.annotations.translateAnnotationsTo(it)
				
				for (field : exampleGroup.members.filter(typeof(XtendField))) {
						field.visibility = JvmVisibility::PROTECTED
						field.transform(it)
				}
				
				addImplicitSubject(exampleGroup)
				
				for (element : exampleGroup.members) {
					switch element {
						ExampleGroup: {
							subExamples += transform(spec, element, it, isPrelinkingPhase)
						}
						Example : {
							val annotations = element.getTestAnnotations()
							annotations += element.toAnnotation(typeof(Named), element.describe)
							members += toMethod(element, annotations)
						}
						XtendFunction: {
							element.transform(it)
						}
						Before:{
							val annotationType = element.getBeforeAnnotation()
							members += element.toMethod(annotationType, element.beforeAll)
						}
						After:{
							val annotationType = element.getAfterAnnotation()
							members += element.toMethod(annotationType, element.afterAll)
						}
					}
				}
				
				if(!subExamples.empty){
					annotations += exampleGroup.toAnnotation(typeof(Contains), subExamples);
				}
				computeInferredReturnTypes()
			]
						
	}
	
	def toMethod(TestFunction element, Class<?> annotation, boolean isStatic){
		val result = toMethod(element, newArrayList(element.toAnnotation(annotation)))
		result.setStatic(isStatic)	
		return result
	}
	
	def toMethod(TestFunction element, List<JvmAnnotationReference> annotations){
		element.toMethod(element.toMethodName, getTypeForName(Void::TYPE, element)) [
								documentation = element.documentation
								body = element.body
								element.annotations.translateAnnotationsTo(it)
								exceptions += typeof(Exception).getTypeForName(element)
								it.annotations.addAll(annotations)
							]
	}
	
	
}
