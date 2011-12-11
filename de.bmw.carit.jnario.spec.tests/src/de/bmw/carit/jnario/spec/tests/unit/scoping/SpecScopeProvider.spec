package de.bmw.carit.jnario.spec.tests.unit.scoping
			
import static org.junit.Assert.*
import de.bmw.carit.jnario.runner.InstantiateWith
import com.google.inject.Inject
import org.eclipse.xtext.scoping.IScopeProvider
import de.bmw.carit.jnario.spec.tests.util.SpecTestInstantiator
import static extension de.bmw.carit.jnario.tests.util.Query.*
import de.bmw.carit.jnario.spec.spec.SpecPackage
import de.bmw.carit.jnario.tests.util.ModelStore
import de.bmw.carit.jnario.spec.spec.ExampleGroup
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.naming.QualifiedName

@InstantiateWith(typeof(SpecTestInstantiator))
describe "SpecScopeProvider" {
	
	@Inject IScopeProvider fixture
	@Inject ModelStore modelStore
	
	it "should resolve Jvm type ExampleGroup target"{
		modelStore.parseSpec('
			package bootstrap
			
			import org.junit.Assert

			describe Assert{
			} 

		'    
		)
		val exampleGroup = modelStore.query.first(typeof(ExampleGroup))
		val scope = targetType(exampleGroup)
		contains(scope, "org.junit.Assert") 
		contains(scope, "Assert") 
	}    
	
	it "should resolve operations from surrounding ExampleGroup's target"{
		modelStore.parseSpec('
			package bootstrap
			
			import org.junit.Assert

			describe Assert{
				describe assertNotNull(String, Object){
					it "assertNotNull(String, Object)"{
					}
				}
			} 

		'    
		)
		val exampleGroup = modelStore.query.second(typeof(ExampleGroup))
		contains(targetOperation(exampleGroup), "assertNotNull(String, Object)") 
	}    
	
	def void contains(IScope scope, String element){
		val result = scope.getSingleElement(QualifiedName::create(element.split("//.")))
		assertNotNull("scope did not contain:" + element, result);
	}
	
	def void containsNot(IScope scope, String element){
		val result = scope.getSingleElement(QualifiedName::create(element.split("//.")))
		assertNull("scope did not contain:" + element, result);
	}
	
	def IScope targetType(EObject source){
		return fixture.getScope(source, SpecPackage::eINSTANCE.exampleGroup_TargetType)
	}
	
	def IScope targetOperation(EObject source){
		return fixture.getScope(source, SpecPackage::eINSTANCE.exampleGroup_TargetOperation)
	}
	
	def IScope throwsDeclaration(EObject source){
		return fixture.getScope(source, SpecPackage::eINSTANCE.example_Exception)
	}
			
}