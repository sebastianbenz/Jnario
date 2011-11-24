package bootstrap
			
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
import org.eclipse.emf.ecore.EReference

@InstantiateWith(typeof(SpecTestInstantiator))
describe "SpecScopeProvider" {
	
	@Inject IScopeProvider fixture
	@Inject ModelStore modelStore
	
	it "should resolve target of ExampleGroup"{
		modelStore.parseSpec('
			package bootstrap
			
			import org.junit.Assert

			describe Assert{
			} 

		'    
		)
		val exampleGroup = modelStore.query.first(typeof(ExampleGroup))
		val scope = targetScope(exampleGroup, SpecPackage::eINSTANCE.exampleGroup_Target)
		scope.should.contain("org.junit.Assert") 
	}    
	
	def Iterable<String> targetScope(EObject source, EReference ref){
		val scope = fixture.getScope(source, ref)
		return scope.allElements.map[qualifiedName.toString]
	}
			
}