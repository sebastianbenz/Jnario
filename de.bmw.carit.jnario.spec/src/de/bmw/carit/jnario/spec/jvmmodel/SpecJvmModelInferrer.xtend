package de.bmw.carit.jnario.spec.jvmmodel

import com.google.inject.Inject
import de.bmw.carit.jnario.spec.spec.Context
import de.bmw.carit.jnario.spec.spec.Example
import de.bmw.carit.jnario.spec.spec.Member
import de.bmw.carit.jnario.spec.spec.SpecFile
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.junit.Before
import org.eclipse.xtext.common.types.util.TypeReferences
import org.junit.Test
import de.bmw.carit.jnario.spec.naming.JavaNameProvider

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
	/**
	 * Is called for each instance of the first argument's type contained in a resource.
	 * 
	 * @param element - the model to create one or more JvmDeclaredTypes from.
	 * @param acceptor - each created JvmDeclaredType without a container should be passed to the acceptor in order get attached to the
	 *                   current resource.
	 * @param isPreLinkingPhase - whether the method is called in a pre linking phase, i.e. when the global index isn't fully updated. You
	 *        must not rely on linking using the index if iPrelinkingPhase is <code>true</code>
	 */
	def dispatch void infer(de.bmw.carit.jnario.spec.spec.SpecFile spec, 
	                IAcceptor<JvmDeclaredType> acceptor, 
	                boolean isPrelinkingPhase) {
	    
		for( exampleGroup : spec.getElements){
			acceptor.accept(spec.toClass(exampleGroup.javaClassName) [
		    	documentation = spec.documentation
		    	packageName = spec.getPackageName
				for (element : exampleGroup.elements) {
			        switch element {
			          Member : {
			            members += element.toField(element.name, element.type)
			            val initCode = element.right
			            if(initCode != null){
			            	 members += initCode.toMethod("setup" + element.name.toFirstUpper, getTypeForName(Void::TYPE, element))[
			            		body = initCode
			            		annotations += element.toAnnotation(typeof(Before))
			            	]
			            } 
			          }
//			          Context : {[
//							return null
//						]
//			          }
			          Example : {
			            members += element.toMethod(element.name, getTypeForName(Void::TYPE, element)) [
			              documentation = element.documentation
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
