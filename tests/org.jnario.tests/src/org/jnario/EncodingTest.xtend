package org.jnario

import org.eclipse.xtext.util.Strings

class EncodingTest {
	def static void main(String[] args) {
		println(Strings::convertToJavaString('''
		"hallö"'''))
	}
	
}