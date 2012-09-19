package org.jnario.spec.report

import com.google.inject.Inject
import org.jnario.Executable
import org.jnario.report.Executable2ResultMatcher
import org.jnario.report.SpecExecution
import org.jnario.spec.naming.ExampleNameProvider

import static extension org.apache.commons.lang.StringEscapeUtils.*

class Spec2ResultMatcher implements Executable2ResultMatcher{
	
	@Inject extension ExampleNameProvider
	
	override matches(Executable executable, SpecExecution input) {
		val expectedClassName = executable.eContainer.toQualifiedJavaClassName
		val expectedName = executable.describe.escapeXml
		input.className == expectedClassName && input.name == expectedName
	}
	
}