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
		| "\n\t\thello\n\tworld\n" 	| "hello\n\tworld\n"|
		| "\thello\n\t" 			| "hello\n"			|
		| "\thello\t" 				| "hello\t"			|
	}
	
	fact "should remove trailing whitespace"{
		examples.forEach[
			subject.normalize(input) => result
		]
	}
	
	fact "Linebreak at the end"{
		subject.normalize(
		'''
		hello
		world
		''') => "hello\nworld\n"
	}
	
	fact "Linebreak at the end with trailing tabs"{
		subject.normalize("\n\t\t\t\t\t hello\n\t\t\t\t\t world\n\t\t\t\t\t") => "hello\nworld\n"
	}
	
	fact "No linebreak at the end"{
		subject.normalize(
		'''
		hello
		world''') => "hello\nworld"
	}
	
}