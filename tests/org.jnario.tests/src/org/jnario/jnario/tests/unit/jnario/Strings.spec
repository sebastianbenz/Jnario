/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.tests.unit.jnario

import org.jnario.util.Strings
import static extension org.jnario.util.Strings.*

describe Strings{
	
	context startsWithWord{
		def examples{
			| string 		| word 		| index  |
			| ""			| "hello"	| -1	 |
			| "hello hi"	| "hello"	|  0	 |
			| " hello"		| "hello"	|  1	 |
			| "\thello"		| "hello"	|  1	 |
			| "\t hello"	| "hello"	|  2	 |
			| "\t hell o"	| "hello"	| -1	 |
		}
		
		fact examples.forEach[string.startsWithWord(word) => index]
	}
	
	context makeJunitConform{
		def examples{
			| string 				| result 			|
			| null					| null				|
			| "hello"				| "hello"			|
			| "hello "				| "hello"			|
			| "hello\n\tworld"		| "hello world"		|
			| "hello(param)"		| "hello[param]"	|
			| "hello #world#"		| "hello -world-"		|
		}
		
		fact examples.forEach[string.makeJunitConform => result]
	}
	
	context trim{
		def examples{
			| string 				| result 			|
			| null					| null				|
			| ""					| ""				|
			| "_hello"				| "hello"			|
			| "hello_world_"		| "hello_world"		|
			| "_hello_"				| "hello"			|
			| "__hello__"			| "hello"			|
			| "____"				| ""				|
		}
		
		fact "removes the specified leading and trailing character"{
			examples.forEach[string.trim('_'.charAt(0)) => result]
		}
	}
}