package org.jnario.jnario.tests.unit

import org.jnario.doc.DocumentationProvider

describe DocumentationProvider {
	
	var comment = ""
	val subject = new DocumentationProvider[comment]
	
	fact "returns null if no comment"{
		documentation(null) => nullValue
	}
	
	fact "returns comment"{
		documentation("Hello World") => "Hello World"
	}
	
	fact "'/*' can be escaped with '\'"{
		documentation("Hello \\/*World") => "Hello /*World"
	}
	
	fact "'\\/*' can be unescaped with '\'"{
		documentation("Hello \\\\/*World") => "Hello \\/*World"
	}
	
	fact "'*/' can also be escaped with '\'"{
		documentation("Hello \\*/World") => "Hello */World"
	}
	
	fact "'\\*/' can also be unescaped with '\'"{
		documentation("Hello \\\\*/World") => "Hello \\*/World"
	}
	
	def documentation(String doc){
		comment = doc
		subject.getDocumentation(null)
	}
	
}