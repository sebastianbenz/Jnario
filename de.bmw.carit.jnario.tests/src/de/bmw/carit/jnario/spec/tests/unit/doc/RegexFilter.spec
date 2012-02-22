package de.bmw.carit.jnario.spec.tests.unit.doc

import static extension de.bmw.carit.jnario.lib.ExampleTableIterators.*
import static extension de.bmw.carit.jnario.lib.Should.*

describe RegexFilter {

	def filteringExamples{
		| string 	| regex 	| result |
		| "hello"	|"e"		| "hllo" |
		| "aabbaa"	|"b*"		| "aaaa" |
		| "aa.aa"	|"\\."		| "aaaa" |
		| "\n'''.executesSuccessfully" | "\\.executesSuccessfully" | "\n'''" |
	}
	
	it "removes all matched elements"{
		filteringExamples.forEach[
			val filter = test::RegexFilter::create(regex)
			filter.apply(string).should.be(result)
		]
	}

}