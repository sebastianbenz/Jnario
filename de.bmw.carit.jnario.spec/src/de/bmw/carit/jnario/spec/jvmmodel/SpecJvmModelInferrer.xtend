package de.bmw.carit.jnario.spec.jvmmodel

import com.google.inject.Inject
import de.bmw.carit.jnario.spec.naming.JavaNameProvider
import de.bmw.carit.jnario.spec.spec.Example
import de.bmw.carit.jnario.spec.spec.Field
import de.bmw.carit.jnario.spec.spec.SpecFile
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.typing.ITypeProvider
import org.junit.Test
import org.junit.runner.RunWith
import de.bmw.carit.jnario.runner.JnarioRunner
import de.bmw.carit.jnario.runner.Named
 
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
	@Inject extension JvmTypesBuilder
  
  	@Inject extension IQualifiedNameProvider
  	
  	@Inject extension TypeReferences

	@Inject extension JavaNameProvider
	
	@Inject extension ITypeProvider
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
	    
		for( exampleGroup : spec.getElements){
			acceptor.accept(spec.toClass(exampleGroup.javaClassName) [
		    	documentation = spec.documentation
		    	packageName = spec.getPackageName
		    	annotations += spec.toAnnotation(typeof(RunWith), typeof(JnarioRunner))
		    	for(a : exampleGroup.annotations){
			    	annotations += spec.toAnnotation(a.annotationType.qualifiedName)
		    	}
		    	annotations += spec.toAnnotation(typeof(Named), exampleGroup.javaClassAnnotationValue)
				for (element : exampleGroup.elements) {
			        switch element {
			          de.bmw.carit.jnario.spec.spec.Field : {
			          	val initMethodName = "create" + element.getName.toFirstUpper
			          	val field = element.toField(element.getName, element.getType)
			            members += field
			            field.final = true
				        field.initialization[im |
				        	 initMethodName + "()"
				        ]
			            val initCode = element.getRight
			            if(initCode != null){
			            	 members += initCode.toMethod(initMethodName, initCode.expectedType)[
			            		body = initCode
			            	]
			            } 
			          }
			          Example : {
			            members += element.toMethod(element.exampleMethodName, getTypeForName(Void::TYPE, element)) [
			              documentation = element.documentation
			              annotations += spec.toAnnotation(typeof(Named), element.getName)
			              annotations += element.toAnnotation(typeof(Test))
			              body = element.body
			            ]
			          }
			        }
			        
				}
			])
		}
	}
}
