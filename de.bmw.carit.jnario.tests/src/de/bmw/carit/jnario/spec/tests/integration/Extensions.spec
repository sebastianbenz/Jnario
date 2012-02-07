package de.bmw.carit.jnario.spec.tests.integration

import static extension de.bmw.carit.jnario.tests.util.SpecExecutor.*
import static de.bmw.carit.jnario.common.test.util.ResultMatchers.*
import static de.bmw.carit.jnario.spec.tests.integration.ExtensionExample.*
/*
 * Extensions can be used to share common setup and teardown behavior across different specifications.
 */
describe "Extensions"{

	it "all setup and tear down methods in extensions will be executed"{
		execute('''
			package bootstrap

			import de.bmw.carit.jnario.spec.tests.integration.ExtensionExample

			describe "Extension"{
				extension ExtensionExample = new ExtensionExample()

				it "test 1"{
					ExtensionExample::executedMethods += "ExtensionSpec#test1"
				}
				
				it "test 2"{
					ExtensionExample::executedMethods += "ExtensionSpec#test2"
				}
			}
		''')
		
		executedMethods.should.be(newArrayList(
			"ExtensionExample#beforeClass", 
			"ExtensionExample#before",  
			"ExtensionSpec#test1",  
			"ExtensionExample#after",  
			"ExtensionExample#before",
			"ExtensionSpec#test2",  
			"ExtensionExample#after",
			"ExtensionExample#afterClass"
		))
	}

}