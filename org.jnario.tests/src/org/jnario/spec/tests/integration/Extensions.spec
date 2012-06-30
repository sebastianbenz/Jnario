/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.integration

import static org.junit.Assert.*
import static extension org.jnario.jnario.test.util.SpecExecutor.*
import static org.jnario.jnario.test.util.ResultMatchers.*
import static org.jnario.spec.tests.integration.ExtensionExample.*

/*
 * Extensions can be used to share common setup and tear down behavior across different specifications.
 */
describe "Extensions"{

	fact "all setup and tear down methods in extensions will be executed"{
		execute('''
			package bootstrap

			import org.jnario.spec.tests.integration.ExtensionExample

			describe "Extension"{
				extension static ExtensionExample = new ExtensionExample()

				fact "test 1"{
					ExtensionExample::executedMethods += "ExtensionSpec#test1"
				}
				
				fact "test 2"{
					ExtensionExample::executedMethods += "ExtensionSpec#test2"
				}
			}
		''')
		 
		executedMethods =>
			   list("ExtensionExample#beforeClass", 
					"ExtensionExample#before",  
					"ExtensionSpec#test1",  
					"ExtensionExample#after",  
					"ExtensionExample#before",
					"ExtensionSpec#test2",  
					"ExtensionExample#after",
					"ExtensionExample#afterClass")
	}

}