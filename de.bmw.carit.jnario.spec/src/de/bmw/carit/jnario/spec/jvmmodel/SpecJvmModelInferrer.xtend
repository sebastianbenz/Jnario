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
/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class SpecJvmModelInferrer extends AbstractModelInferrer {

    /**
     * conveninence API to build and initialize JvmTypes and their members.
     */
	@Inject extension ExtendedJvmTypesBuilder
  
  	@Inject extension IQualifiedNameProvider
  	
  	@Inject extension TypeReferences

	@Inject extension JavaNameProvider
	
	@Inject extension ITypeProvider
	
	@Inject extension TypesFactory 
	/**
	 * Is called for each instance of the first argument's type contained in a resource.
	 * 
	 * @param element - the model to create one or more JvmDeclaredTypes from.
	 * @param acceptor - each created JvmDeclaredType without a container should be passed to the acceptor in order get attached to the
	 *                   current resource.
	 * @param isPreLinkingPhase - whether the method is called in a pre linking phase, i.e. when the global index isn't fully updated. You
	 *        must not rely on linking using the index if iPrelinkingPhase is <code>true</code>
	 */
	def dispatch void infer(SpecFile spec,  
	                IAcceptor<JvmDeclaredType> acceptor, 
	                boolean isPrelinkingPhase) {
		if(spec.xtendClass == null){
			return 
		}
		associate(spec, infer(spec, spec.xtendClass as ExampleGroup, null, acceptor))
	}
	
	def infer(SpecFile spec, ExampleGroup exampleGroup, JvmGenericType superClass, IAcceptor<JvmDeclaredType> acceptor) {
		val List<JvmGenericType> subExamples = newArrayList()
		val newClass = exampleGroup.toClass(exampleGroup.javaClassName, superClass) [
		    	documentation = exampleGroup.documentation
		    	packageName = spec.^package
		    	annotations += exampleGroup.toAnnotation(typeof(RunWith), typeof(ExampleGroupRunner))
		    	annotations += exampleGroup.toAnnotation(typeof(Named), exampleGroup.describe)
		    	addAnnotations(exampleGroup)
				for (element : exampleGroup.members) {
			        switch element {
			          XtendField : {
			          	val field = element.toField(element.name, element.type)[
			          		visibility = JvmVisibility::PROTECTED
			            	addAnnotations(element)	
			            	setInitializer(element.initialValue)
			          	]
			            members += field
			          }
			          ExampleGroup: {
			          	subExamples += infer(spec, element, it, acceptor)
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
			              addAnnotations(element)
			              body = element.body
			            ]
			            val anyException = typeof(Exception).getTypeForName(element)
			              if(anyException != null){
				              method.exceptions += anyException
			              }
			            members += method
			          }
			          XtendFunction: {
			          	var returnType = element.returnType;
						if(returnType == null){
							returnType = element.expression.expectedType
						}
			          	val method = element.toMethod(element.name, element.returnType) [
			              documentation = element.documentation
			              for(t : element.typeParameters){
			              	typeParameters += t
			              }
			              for (p : element.parameters) {
               				 parameters += p.toParameter(p.name, p.parameterType)
              			  }
              			  addAnnotations(element)
			              body = element.expression
			              val anyException = typeof(Exception).getTypeForName(element)
			              if(anyException != null){
				              exceptions += anyException
			              }
			            ]
			            members += method
			          }
			        }
				}
			]
			acceptor.accept(newClass)
			
			if(!subExamples.empty){
				newClass.annotations += exampleGroup.toAnnotation(typeof(Contains), subExamples);
			}
			newClass.computeInferredReturnTypes    
			return newClass
	}
	
	def addAnnotations(JvmAnnotationTarget target, XtendMember member){
		var result = member.annotations as Iterable<XAnnotation>
		if(member.annotations.empty && member.annotationInfo != null){
			result = concat(result, member.annotationInfo.annotations)
		}
		result.translateAnnotationsTo(target)
	}
	
	def void computeInferredReturnTypes(JvmGenericType inferredJvmType) {
		var operations = inferredJvmType.getDeclaredOperations();
		for (jvmOperation : operations) {
			if (!jvmOperation.eIsSet(TypesPackage::eINSTANCE.jvmOperation_ReturnType))
				jvmOperation.setReturnType(getTypeProxy(jvmOperation));
		}
	}
	
	
	def getTypeProxy(EObject  pointer) {
		var typeReference = createJvmParameterizedTypeReference();
		val eResource = pointer.eResource();
		var fragment = eResource.getURIFragment(pointer);
		var uri = eResource.getURI();
		uri = uri.appendFragment(Xtend2Resource::FRAGMENT_PREFIX + fragment);
		var internalEObject = typeReference as InternalEObject
		internalEObject.eSetProxyURI(uri);
		return typeReference;
	}
}
