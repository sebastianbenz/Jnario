
@InstantiateWith(typeof(SpecTestInstantiator))
describe SpecScopeProvider {
	
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
		contains(targetOperation(exampleGroup), "assertNotNull") 
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
		return subject.getScope(source, SpecPackage::eINSTANCE.exampleGroup_TargetType)
	}
	
	def IScope targetOperation(EObject source){
		return subject.getScope(source, SpecPackage::eINSTANCE.exampleGroup_TargetOperation)
	}
	
	def IScope throwsDeclaration(EObject source){
		return subject.getScope(source, SpecPackage::eINSTANCE.example_Exception)
	}
			
}