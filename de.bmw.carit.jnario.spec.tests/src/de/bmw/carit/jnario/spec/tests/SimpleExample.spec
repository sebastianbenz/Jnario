package de.bmw.carit.jnario.spec.tests

describe "SimpleExample" {
 
	it "should pass"{
		val spec = '
			package bootstrap
	
			describe "Example" {
			
				it "should pass"{
						org::junit::Assert::assertTrue(true) 
				} 
						
			}
		'
		val result = de::bmw::carit::jnario::spec::tests::util::SpecExecutor::execute(spec)
		org::junit::Assert::assertThat(result, org::junit::experimental::results::ResultMatchers::successful)
	} 
	
	it "should fail"{
		val spec = '
			package bootstrap

			describe "Example" {
			
				it "should fail"{
						org::junit::Assert::assertFalse("reason of failure", true)
				} 
						
			}
		'
		val result = de::bmw::carit::jnario::spec::tests::util::SpecExecutor::execute(spec)
		org::junit::Assert::assertThat(result, org::junit::experimental::results::ResultMatchers::hasSingleFailureContaining("reason of failure"))
	}
			
}
	