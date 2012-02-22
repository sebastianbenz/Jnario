/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.spec.doc

import static extension java.lang.Character.*

class WhiteSpaceNormalizer {
	
	def String normalize(CharSequence input){
		if(input == null) return ""
		
		var Iterable<String> lines = input.toString.split("\n").toList
		var firstLine = lines.head
		while(firstLine.trim.length == 0){
			lines = lines.drop(1)
			firstLine = lines.head
		}
		val whitespace = whitespaceAtBeginning(firstLine)
		
		val result = new StringBuilder()
		lines.forEach[
			result.append(it.remove(whitespace))
			result.append("\n")
		]
		return result.toString().trim()
	}
	
	def whitespaceAtBeginning(String string){
		val whitespace = new StringBuilder()
		for(c : string.toCharArray){
			if(c.whitespace){
				whitespace.append(c)
			}else{
				return whitespace.toString
			}
		}
		return ""
	}
	
	def String remove(String input, String toReplace){
		if(input.length < toReplace.length){
			return input
		}
		var i = 0
		while(i < toReplace.length){
			if(input.charAt(i) != toReplace.charAt(i)){
				return input
			}
			i = i + 1
		}
		return input.substring(toReplace.length)
	}
	
}