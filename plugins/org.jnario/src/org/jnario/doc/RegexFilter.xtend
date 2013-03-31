/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.doc

import java.util.regex.Pattern

class RegexFilter implements Filter{

	def static Filter create(String regex){
		return new RegexFilter(regex)
	}	
	
	String regex 
	Pattern pattern
	
	new(String regex){
		this.regex = regex
		pattern = Pattern::compile(regex, Pattern::DOTALL)
	}
	
	override String apply(String input){
		return pattern.matcher(input).replaceAll("")
	}
	
	override toString(){
		return  regex
	}
}