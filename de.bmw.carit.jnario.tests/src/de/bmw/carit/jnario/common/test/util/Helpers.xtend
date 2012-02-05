package de.bmw.carit.jnario.common.test.util

import org.eclipse.xtext.xbase.lib.Procedures
import org.junit.Assert

class Helpers {
	
	def static is(String actual, CharSequence expected){
		Assert::assertEquals(expected.toString().replaceAll("\r", ""), actual.replaceAll("\r", ""))
	}
 
	def static String errorMessage(Procedures$Procedure1<Boolean> proc){
		try{ 
			proc.apply(null)
			throw new AssertionError("expected AssertionError")
		}catch(AssertionError e){
			return e.message.trim 
		}
	} 
	
}