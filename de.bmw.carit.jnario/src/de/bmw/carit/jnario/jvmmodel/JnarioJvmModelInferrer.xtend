package de.bmw.carit.jnario.jvmmodel

import com.google.inject.Inject
import de.bmw.carit.jnario.jnario.Jnario
import de.bmw.carit.jnario.jnario.Scenario
import de.bmw.carit.jnario.jnario.Step
import de.bmw.carit.jnario.runner.ScenarioRunner
import de.bmw.carit.jnario.naming.JavaNameProvider
import java.util.Iterator
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.XVariableDeclaration
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.typing.ITypeProvider
import org.junit.Test
import de.bmw.carit.jnario.runner.Named
import org.junit.runner.RunWith

import static com.google.common.collect.Iterators.*
import static com.google.common.collect.Sets.*



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
	
	@Inject	extension TypeReferences

	@Inject extension ITypeProvider
	
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
   	def dispatch void infer(Jnario jnario, IAcceptor<JvmDeclaredType> acceptor, boolean isPrelinkingPhase) {
		for(scenario: jnario.scenarios){
			acceptor.accept(
				scenario.toClass(scenario.name.javaClassName) [
					annotations += scenario.toAnnotation(typeof(RunWith), typeof(ScenarioRunner))
					packageName = jnario.packageName
					documentation = scenario.documentation
					scenario.generateVariables(it)
					for (step : scenario.getSteps) {
						transform(step, it)
					}
				]
			)
		}
   	}

	def generateVariables(Scenario scenario, JvmGenericType inferredJvmType) {
		var Iterator<EObject> eAllContents = scenario.eAllContents();
		var allVariables = filter(eAllContents, typeof(XVariableDeclaration))
		var declaredVariables = newHashSet("");
		while(allVariables.hasNext){
			var currentDec = allVariables.next();
			if(!declaredVariables.contains(currentDec.getQualifiedName())){
				declaredVariables.add(currentDec.getQualifiedName());
				
				var JvmTypeReference type;
				if (currentDec.getType() != null) {
					type = currentDec.getType();
				} else {
					if(currentDec.getRight() != null){
						type = getType(currentDec.getRight());
					}
					else{
						//for examples
						type = getType(currentDec, true);
					}
				}
				
				if(type != null){
					inferredJvmType.members += scenario.toField(currentDec.simpleName, type)
				}
			}
		}
	}

	def transform(Step step, JvmGenericType inferredJvmType) {
		if(step.getCode() != null){
			var operation = toMethod(step, step.name.javaMethodName, getTypeForName(Void::TYPE, step))[
				body = step.code.blockExpression
			]
			inferredJvmType.members += operation
			operation.annotations += step.toAnnotation(typeof(Test))
			operation.annotations += step.toAnnotation(typeof(Named), step.name.trim)
		}
	}



}
