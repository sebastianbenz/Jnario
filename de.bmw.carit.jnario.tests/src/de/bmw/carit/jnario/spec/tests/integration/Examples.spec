package de.bmw.carit.jnario.spec.tests.integration

describe "Examples"{
	
	example myExamples{
		| 		a		| 		b		|
		| "Hello World" | "HELLO WORLD" |
		| "Hallo" 		| "HALLO"		|
	}
	
	it "are iterable"{
		myExamples.forEach[
			assert a.toUpperCase == b
		]
	}

	ExampleTable<ExampleEntry> myExamples = new ExampleTable(
		newArrayList(
			new ExampleEntry("Hello World", "HELLO WORLD"),
			new ExampleEntry("Hallo", "HALLO")
		)
	)
		
}