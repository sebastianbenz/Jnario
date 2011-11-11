package de.bmw.carit.jnario.jvmmodel

import com.google.inject.Inject
import de.bmw.carit.jnario.jnario.Scenario
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.xbase.typing.ITypeProvider
import org.eclipse.xtext.xbase.XVariableDeclaration

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class JnarioJvmModelInferrer extends AbstractModelInferrer {

    /**
     * conveninence API to build and initialize JvmTypes and their members.
     */
	@Inject extension JvmTypesBuilder
	@Inject extension IQualifiedNameProvider
	@Inject ITypeProvider typeProvider

	/**
	 * Is called for each instance of the first argument's type contained in a resource.
	 * 
	 * @param element - the model to create one or more JvmDeclaredTypes from.
	 * @param acceptor - each created JvmDeclaredType without a container should be passed to the acceptor in order get attached to the
	 *                   current resource.
	 * @param isPreLinkingPhase - whether the method is called in a pre linking phase, i.e. when the global index isn't fully updated. You
	 *        must not rely on linking using the index if iPrelinkingPhase is <code>true</code>
	 */
   	def dispatch infer(Scenario scenario, IAcceptor<JvmDeclaredType> acceptor, boolean isPrelinkingPhase) {
   		
   		// Here you explain how your model is mapped to Java elements, by writing the actual translation code.
   		// An example based on the initial hellow world example could look like this:
   		
//   		acceptor.accept(element.toClass("my.company.greeting.MyGreetings") [
//   			for (greeting : element.greetings) {
//   				members += greeting.toMethod(greeting.name, greeting.newTypeRef(typeof(String))) [
//   					it.body ['''
//   						return "Hello «greeting.name»";
//   					''']
//   				]
//   			}
//   		])
		TypesFactory::eINSTANCE.createJvmVoid
		acceptor.accept(
			scenario.toClass("Scenario" + scenario.name.extractValidName)[
				members += scenario.toConstructor("blubb")[]
			]
		)
	}
	
	def newVoidRef() {
		var reference = TypesFactory::eINSTANCE.createJvmParameterizedTypeReference()
		reference.setType(TypesFactory::eINSTANCE.createJvmVoid())
		reference
	}
	
	def  extractValidName(String originalName){
		var name = "";
		var words = originalName.split(" ")
		for(String word: words){
			// make first letter upper case and join them to name
			var firstLetter = "" + word.charAt(0)
			firstLetter = firstLetter.toUpperCase()
			name = name + firstLetter + word.substring(1)
		}
		
		var indexOfSentenceEnd = name.lastIndexOf(".")
		if(indexOfSentenceEnd > -1){
			name = name.substring(0, indexOfSentenceEnd)
		}
		
		var firstLetter = "" + name.charAt(0)
		firstLetter = firstLetter.toLowerCase()
		name = firstLetter + name.substring(1)
		
		name = name.replaceAll("[^A-Za-z0-9_]","")
	}
}
