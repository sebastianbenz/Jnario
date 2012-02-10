package de.bmw.carit.jnario.spec.tests.integration2

describe "Example Tables"{
	
	example myExamples{
		| 		a		| 		b		|
		| "Hello World" | "HELLO WORLD" |
		| "Hallo" 		| "HALLO"		|
	}
	
	they "are iterable"{    
		myExamples.forEach[   
			assert a.toUpperCase == b   
		] 
	}        

	example myExampleWithClosures{
		| input | 			operation        | result |
		|   "a" | [String s | s.toUpperCase] |   "A"  |
		|   "B" | [String s | s.toLowerCase] |	 "b"  | 
	}  
	 
	they "support closures"{   
		myExampleWithClosures.forEach[
			assert operation.apply(input) == result
		]
	}          
     
}               