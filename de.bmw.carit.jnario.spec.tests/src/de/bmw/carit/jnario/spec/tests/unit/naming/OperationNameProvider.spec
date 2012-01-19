package de.bmw.carit.jnario.spec.tests.unit.naming

import com.google.inject.Inject
import de.bmw.carit.jnario.runner.InstantiateWith
import de.bmw.carit.jnario.spec.naming.OperationNameProvider
import de.bmw.carit.jnario.tests.util.SpecTestInstantiator
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.resource.XtextResourceSet
import org.junit.Before



@InstantiateWith(typeof(SpecTestInstantiator))
describe OperationNameProvider{
	
	@Inject OperationNameProvider subject
	
	@Inject	TypeReferences typeReferences
	
	Map<String, JvmOperation> operations
	
	@Before
	def void setup(){
		val contextType = typeof(OperationNamesExample)
		val r = new XtextResourceSet().createResource(URI::createURI("dummy.spec"))
		val eObject = EcoreFactory::eINSTANCE.createEObject
		r.contents += eObject
		val type = typeReferences.findDeclaredType(contextType, eObject) as JvmGenericType 
		val jvmOperations = type.members.filter(typeof(JvmOperation))
		operations = jvmOperations.toMap[simpleName]
	}
	
	it "should name methods similar to JavaDoc links"{
		nameOf("simpleOperation").should.be("simpleOperation")
		nameOf("operationWithSingleArgument").should.be("operationWithSingleArgument(String)")
		nameOf("operationWithMultipleArguments").should.be("operationWithMultipleArguments(String, Object, int)")
		nameOf("operationWithTypedArguments").should.be("operationWithTypedArguments(List<String>, List<? extends String>)")
		nameOf("operationWithVarArg").should.be("operationWithVarArg(String[])")
	}
	
	def String nameOf(String operationName){
		val op = operations.get(operationName)
		subject.apply(op).toString
	}
	
}