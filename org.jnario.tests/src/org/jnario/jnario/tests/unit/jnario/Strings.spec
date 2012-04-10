package org.jnario.jnario.tests.unit.jnario

import org.jnario.util.Strings
import static extension org.jnario.util.Strings.*

describe Strings{
	
	context startsWithWord{
		def examples{
			| string 		| word 		| result |
			| ""			| "hello"	| -1	 |
			| "hello hi"	| "hello"	| 0		 |
			| " hello"		| "hello"	| 1		 |
			| "\thello"		| "hello"	| 1		 |
			| "\t hello"	| "hello"	| 2		 |
			| "\t hell o"	| "hello"	| -1	 |
		}
		
		fact examples.forEach[string.startsWithWord(word) => result]
	}
	
}