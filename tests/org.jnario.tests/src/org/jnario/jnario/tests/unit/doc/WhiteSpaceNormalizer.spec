/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.tests.unit.doc

import org.jnario.doc.WhiteSpaceNormalizer

import static extension org.jnario.lib.ExampleTableIterators.*
import static extension org.jnario.lib.Should.*

describe WhiteSpaceNormalizer{

	def examples {
		| input 					| result 			|
		| null						| ""				|
		| ""						| ""				|
		| " "						| ""				|
		| "\thello"					| "hello" 			|
		| "\thello\n\tworld" 		| "hello\nworld"	|
		| "\t\thello\n\t\tworld" 	| "hello\nworld"	|
		| "\t\thello\n\tworld" 		| "hello\n\tworld"	|
		| "\n\t\thello\n\tworld" 	| "hello\n\tworld"	|
		| "\n\t\thello\n\tworld\n" 	| "hello\n\tworld"	|
	}
	
	fact "should remove trailing whitespace"{
		examples.forEach[
			subject.normalize(input) => result
		]
	}
	
}