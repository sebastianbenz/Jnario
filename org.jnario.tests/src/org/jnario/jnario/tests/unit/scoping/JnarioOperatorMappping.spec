/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.tests.unit.scoping

import org.jnario.scoping.JnarioOperatorMappping
import org.jnario.runner.InstantiateWith
import org.jnario.jnario.test.util.SpecTestInstantiator
import static org.eclipse.xtext.naming.QualifiedName.*

@InstantiateWith(typeof(SpecTestInstantiator))
describe JnarioOperatorMappping{
	
	context getMethodName{
		def mappings {
			| operator        | method          |
			| null            | null            |
			| "xxxx"          | null            |
			| "should be"     | "should_be"     |
			| "should not be" | "should_be"     |
			| "+"             | "operator_plus" |
		}
		fact "word after should is mapped to method name"{
			mappings.forEach[subject.getMethodName(toQualifiedName(operator)) => toQualifiedName(method)]
		}
	}
	
	context getOperator{
		def mappings {
			| method          | operator        |
			| null            | null            |
			| "xxxx"          | null            |
			| "operator_plus" | "+"             |
			| "should_be"     | "should be"     |
		}
		fact "word after should is mapped to method name"{
			mappings.forEach[subject.getOperator(toQualifiedName(method)) => toQualifiedName(operator)]
		}
	}
	
	def toQualifiedName(String name){
		if(name == null){
			return null
		}else{
			return create(name)
		}
	}

}