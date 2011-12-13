package de.bmw.carit.jnario.jvmmodel

import com.google.inject.Inject
import de.bmw.carit.jnario.jnario.Given
import de.bmw.carit.jnario.jnario.Jnario
import de.bmw.carit.jnario.jnario.Scenario
import de.bmw.carit.jnario.jnario.Step
import de.bmw.carit.jnario.jnario.Then
import de.bmw.carit.jnario.jnario.When
import de.bmw.carit.jnario.naming.JavaNameProvider
import de.bmw.carit.jnario.runner.JnarioRunner
import de.bmw.carit.jnario.runner.Named
import de.bmw.carit.jnario.runner.Order
import java.util.HashMap
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
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
import org.junit.runner.RunWith

import static com.google.common.collect.Iterators.*
import static com.google.common.collect.Sets.*
import org.eclipse.xtext.xtend2.jvmmodel.Xtend2JvmModelInferrer




/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class JnarioJvmModelInferrer extends Xtend2JvmModelInferrer {

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
    override void infer(EObject object, IAcceptor<JvmDeclaredType> acceptor, boolean isPrelinkingPhase) {
    	var jnario = object as Jnario
   		if(jnario != null){
//			for(scenario: jnario.xtendClass){
				val className = jnario.name.javaClassName + jnario.xtendClass.name.javaClassName
				
				if(!(jnario.xtendClass as Scenario).examples.empty){
					//annotations += scenario.toAnnotation(typeof(RunWith), typeof(JnarioExamplesRunner))
					(jnario.xtendClass as Scenario).createExampleClass(jnario, "Examples" + className)
				}
				
				acceptor.accept(
					(jnario.xtendClass as Scenario).infer(jnario, className)
				)
//			}
		}
   	}
   	
   	def infer(Scenario scenario, Jnario jnario, String className){
   		scenario.toClass(className) [
			annotations += scenario.toAnnotation(typeof(RunWith), typeof(JnarioRunner))
			annotations += scenario.toAnnotation(typeof(Named), scenario.name.trim)
			packageName = jnario.^package
			documentation = scenario.documentation
			val variables = scenario.generateVariables
			var hasBackground = false
			if(jnario.background != null){
				hasBackground = true
			}
			if(hasBackground){
				val backgroundVariables = jnario.background.generateVariables
				variables.putAll(backgroundVariables)
			}
			
			for(variable: variables.keySet){
				var type = variables.get(variable)
				members += scenario.toField(variable, type)
			}
			
			var order = 0
			if(hasBackground){
				for (step : jnario.background.steps) {
					transform(step, it, order)
					for(and: step.and){
						order = transform(and, it, order)
					}			
				}
			}
			
			for (step : scenario.getSteps) {
				order = transform(step, it, order)
				if(step instanceof Given){
					var given = step as Given
					for(and: given.and){
						order = transform(and, it, order)
					}
				}else if(step instanceof When){
					var when = step as When
					for(and: when.and){
						order = transform(and, it, order)
					}
				}else{
					var then = step as Then
					for(and: then.and){
						order = transform(and, it, order)
					}
				}				
			}
		]
   	}
   	
   	def createExampleClass(Scenario scenario, Jnario jnario, String className){
   		
   	}

	def generateVariables(EObject object){
		var eAllContents = object.eAllContents;
		var allVariables = filter(eAllContents, typeof(XVariableDeclaration))
		var declaredVariables = newHashSet("");
		var variablesMap = new HashMap<String, JvmTypeReference>()
		while(allVariables.hasNext){
			var currentDec = allVariables.next();
			if(!declaredVariables.contains(currentDec.qualifiedName)){
				declaredVariables.add(currentDec.qualifiedName);
				
				var JvmTypeReference type;
				if (currentDec.type != null) {
					type = currentDec.type;
				} else {
					if(currentDec.right!= null){
						type = getType(currentDec.right);
					}else{
						//for examples
						type = getType(currentDec, true);
					}
				}
				if(type != null){
					variablesMap.put(currentDec.simpleName, type)
				}
			}
		}
		variablesMap
	}

	def transform(Step step, JvmGenericType inferredJvmType, int order) {
		if(step.getCode() != null){
			var operation = toMethod(step, step.name.javaMethodName, getTypeForName(Void::TYPE, step))[
					
//					var copiedExpression = EcoreUtil::copy(step.code.blockExpression)
//					var rs = step.code.blockExpression.eResource
//					rs.getContents.add(copiedExpression)
//					body = copiedExpression
					body = step.code.blockExpression
			]	
			inferredJvmType.members += operation
			operation.annotations += step.toAnnotation(typeof(Test))
			operation.annotations += step.toAnnotation(typeof(Order), order.intValue)
			operation.annotations += step.toAnnotation(typeof(Named), step.name.trim)
		}
		order + 1
	}

	def generateExampleConstructor(){
		
	}
	
	def generateExampleClass(){
		
	}

}
