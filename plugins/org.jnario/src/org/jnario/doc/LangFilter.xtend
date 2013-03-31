/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.doc

class LangFilter implements Filter{

	def static Filter create(String regex){
		return new LangFilter(regex)
	}	
	
	String language 
	
	new(String language){
		this.language = language
	}
	
	override String apply(String input){
		return input.replace('<pre class="prettyprint lang-spec">', '<pre class="prettyprint lang-' + language + '">')
	}
	
	override toString(){
		return "lang-" + language
	}
	
}