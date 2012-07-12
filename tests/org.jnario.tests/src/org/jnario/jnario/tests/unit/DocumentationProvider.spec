/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
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