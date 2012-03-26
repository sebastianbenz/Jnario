package org.jnario.spec.doc

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
	
	override key() {
		return "lang"
	}
	
}