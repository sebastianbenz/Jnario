package org.jnario.report

import com.google.inject.Inject
import java.util.Map
import org.eclipse.xtext.xbase.lib.Pair
import org.jnario.Executable
import org.jnario.jvmmodel.JnarioNameProvider

import static extension org.apache.commons.lang.StringEscapeUtils.*
import org.jnario.report.SpecExecution

class HashBasedSpec2ResultMapping implements SpecExecutionAcceptor{

	val Map<Pair<String, String>, SpecExecution> results = newHashMap
	extension JnarioNameProvider nameProvider

	@Inject	new(JnarioNameProvider nameProvider){
		this.nameProvider = nameProvider
	}

	def SpecExecution getResult(Executable executable){
		val result = results.get(executable?.asKey)
		if(result == null){
			SpecExecution::NO_EXECUTION
		}else{
			result
		}
	}
	
	def private asKey(Executable executable){
		val expectedClassName = executable.eContainer.toQualifiedJavaClassName
		val expectedName = executable.describe.escapeXml
		expectedClassName -> expectedName
	}

	override accept(SpecExecution result) {
		results.put(result.className -> result.name, result)
	}
	
} 