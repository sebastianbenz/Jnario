package de.bmw.carit.jnario.lib;

import static org.junit.Assert.fail;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class Expectations {

	public static void expect(Class<? extends Exception> exceptionType, Procedure1<Object> proc){
		try {
			proc.apply(null);
			fail("Expected " + exceptionType.getName() + " but none was thrown.");
		} catch (Exception e) {
			if(!exceptionType.isInstance(e)){
				throw new UnexpectedExceptionError(exceptionType, e);
			}
		}
	}

}
