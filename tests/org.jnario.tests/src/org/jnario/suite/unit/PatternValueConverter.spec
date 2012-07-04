package org.jnario.suite.unit

import org.jnario.suite.conversion.PatternValueConverter
import static org.eclipse.xtext.util.Strings.*

describe PatternValueConverter {
	
	context toString(String){
		def examples{
			| input 			| result 			|
			| null				| "\\\\" 			|
			| ""				| "\\\\"			|
			| "apattern"		| "\\apattern\\"	|
		}
		fact examples.forEach[subject.toString(input) => result + newLine]
	}
	
	context toValue(String, INode){
		def examples{
			| input 			| result 		|
			| null				| null			|
			| ""				| null			|
			| "\\apattern\\"	| "apattern"		|
		}
		fact examples.forEach[subject.toValue(input, null) => result]
	}

} 