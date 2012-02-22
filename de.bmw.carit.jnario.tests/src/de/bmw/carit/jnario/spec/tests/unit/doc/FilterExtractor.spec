package de.bmw.carit.jnario.spec.tests.unit.doc

import test.FilterExtractor
import java.util.List

describe FilterExtractor {
	
	def filterExtractions {
		| input 									| resultString 				|
		| null 										| "" 						|
		| "string" 									| "string" 					|
		| "@filter(bbb)" 							| "" 						|
		| "text @filter(bbb) text" 					| "text text" 				|
		| "text@filter(bbb) text" 					| "text@filter(bbb) text" 	|
		| "text @filter(bbb) text @filter(.*) text" | "text text text" 			|
	}
	
	def filterCreation {
		| input 								| resultingFilters 			|
		| null 									| <String>emptyList 		|
		| "string" 								| <String>emptyList 		|
		| "@filter(bbb)" 						| newArrayList("bbb") 		|
//		| "@filter(a(b*)a)"						| newArrayList("a(b*)a") 		|
		| "text @filter(bbb) text  @filter(.*)" | newArrayList("bbb", ".*") |
	}

	it "should remove all filter annotations from a string"{
		filterExtractions.forEach[
			stringAfterExtract(input).should.be(resultString)
		]
	}
	
	it "should extract and create filters"{
		filterCreation.forEach[
			extractedFilters(input).should.be(resultingFilters)
		]
	}
	
	def stringAfterExtract(String input){
		subject.apply(input).string
	}
	
	def List<String> extractedFilters(String input){
		subject.apply(input).filters.map[toString]
	}
}