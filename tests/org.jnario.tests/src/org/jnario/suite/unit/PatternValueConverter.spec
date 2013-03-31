/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
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