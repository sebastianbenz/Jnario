package de.bmw.carit.jnario.spec.tests.integration

describe "SimpleExample" {
 
	"should pass"{
		val spec = '
			package bootstrap
	
			describe "Example" {
			
				"should pass"{
						org::junit::Assert::assertTrue(true) 
				} 
						
			}
		'
		val result = de::bmw::carit::jnario::tests::util::SpecExecutor::execute(spec)
		org::junit::Assert::assertThat(result, de::bmw::carit::jnario::common::test::util::ResultMatchers::successful)
	} 
	
	"should fail"{
		val spec = '
			package bootstrap

			describe "Example" {
			
				"should fail"{
						org::junit::Assert::assertFalse("reason of failure", true)
				} 
						
			}
		'
		val result = de::bmw::carit::jnario::tests::util::SpecExecutor::execute(spec)
		org::junit::Assert::assertThat(result, de::bmw::carit::jnario::common::test::util::ResultMatchers::hasSingleFailureContaining("reason of failure"))
	}
			
}
	