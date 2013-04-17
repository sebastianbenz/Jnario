/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.tests.unit.doc

import java.util.List
import org.jnario.doc.FilterExtractor

describe FilterExtractor {
	
	def filterExtractions {
		| input 									| resultString 				|
		| "" 										| "" 						|
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
//		| "@filter(a(b*)a)"						| newArrayList("a(b*)a") 	|
		| "text @filter(bbb) text  @filter(.*)" | newArrayList("bbb", ".*") |
	}

	fact "should remove all filter annotations from a string"{
		filterExtractions.forEach[
			stringAfterExtract(input) => resultString
		]
	}
	
	fact "should extract and create filters"{
		filterCreation.forEach[
			extractedFilters(input) => resultingFilters
		]
	}
	
	def stringAfterExtract(String input){
		subject.apply(input).string
	}
	
	def List<String> extractedFilters(String input){
		subject.apply(input).filters.map[toString]
	}
}