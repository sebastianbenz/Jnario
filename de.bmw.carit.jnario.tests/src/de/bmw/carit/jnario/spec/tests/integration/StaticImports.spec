package de.bmw.carit.jnario.spec.tests.integration

describe "StaticImports" {
 
	"should resolve static imports"{
		val spec = '
			package bootstrap
			
			import static org.junit.Assert.*
	
			describe "Example" {
			
				"should resolve static imports"{
					assertTrue(true) 
				} 
						
			}
		'
		val result = de::bmw::carit::jnario::tests::util::SpecExecutor::execute(spec)
		org::junit::Assert::assertThat(result, de::bmw::carit::jnario::common::test::util::ResultMatchers::successful)
	} 
			
}
	