package de.bmw.carit.jnario.spec.jvmmodel

import com.google.inject.Inject
import de.bmw.carit.jnario.spec.spec.Context
import de.bmw.carit.jnario.spec.spec.Example
import de.bmw.carit.jnario.spec.spec.Member
import de.bmw.carit.jnario.spec.spec.Spec
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.junit.Before
import org.eclipse.xtext.common.types.util.TypeReferences

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

	/**
	 * Is called for each instance of the first argument's type contained in a resource.
	 * 
	 * @param element - the model to create one or more JvmDeclaredTypes from.
	 * @param acceptor - each created JvmDeclaredType without a container should be passed to the acceptor in order get attached to the
	 *                   current resource.
	 * @param isPreLinkingPhase - whether the method is called in a pre linking phase, i.e. when the global index isn't fully updated. You
	 *        must not rely on linking using the index if iPrelinkingPhase is <code>true</code>
	 */
	def dispatch void infer(Spec element, 
	                IAcceptor<JvmDeclaredType> acceptor, 
	                boolean isPrelinkingPhase) {
	    
		for( e : element.elements){
			acceptor.accept(element.toClass(element.fullyQualifiedName) [
		    	documentation = element.documentation
				for (feature : e.elements) {
			        switch feature {
			          Member : {
			            members += feature.toField(feature.name, feature.type)
			            if(feature.right != null){
			            	 members += feature.right.toMethod("setup" + feature.name.toFirstUpper, getTypeForName(Void::TYPE, feature))[
			            		body = feature.right
			            		annotations += feature.toAnnotation(typeof(Before))
			            	]
			            } 
			          }
			          Context : {
						members += feature.toClass(feature.fullyQualifiedName)[
							
						]
			          }
			          Example : {
			            members += feature.toMethod(feature.name, null) [
			              documentation = feature.documentation
			              body = feature.body
			            ]
			          }
			        }
			        
				}
			])
		}
	}
}
