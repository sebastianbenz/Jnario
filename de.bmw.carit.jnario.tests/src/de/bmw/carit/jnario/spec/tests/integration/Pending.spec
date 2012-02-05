package de.bmw.carit.jnario.spec.tests.integration

import static org.junit.Assert.*
import static de.bmw.carit.jnario.common.test.util.ResultMatchers.*
import static org.hamcrest.CoreMatchers.*
import static de.bmw.carit.jnario.tests.util.SpecExecutor.*

describe "Pending"{
	
	"ignores empty examples during example runs"{
		val spec = '
			package bootstrap

			import org.junit.*

			describe "Pending" {

				"has no implementation in block expression"{
				} 
				
				"has no body"
						
			}
		'
		assertThat(execute(spec), ignoreCountIs(2))
	}
	
}