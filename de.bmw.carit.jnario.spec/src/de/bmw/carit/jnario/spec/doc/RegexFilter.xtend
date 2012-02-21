package de.bmw.carit.jnario.spec.doc

import java.util.regex.Pattern

class RegexFilter implements Filter{
	
	def static create(String regex){
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
		return regex
	}
	
}