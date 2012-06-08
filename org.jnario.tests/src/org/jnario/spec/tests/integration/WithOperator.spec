package org.jnario.spec.tests.integration

import java.util.Stack

describe "Using Xtend's with Operator"{
	context "initialize fixtures"{
		val stackWithTwoElements = new Stack<String> => [
			add("red")
			add("blue")
		]
		fact stackWithTwoElements.size => 2
	}
	context "write multiple assertions"{
		fact "hello world" => [
			length => 11
			it should startWith("hello")
			it should endWith("world")
		]
	} 
}

