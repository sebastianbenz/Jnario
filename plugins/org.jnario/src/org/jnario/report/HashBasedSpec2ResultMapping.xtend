package org.jnario.report

import com.google.inject.Inject
import java.util.List
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.xbase.lib.Pair
import org.jnario.Executable
import org.jnario.jvmmodel.ExecutableProvider
import org.jnario.jvmmodel.JnarioNameProvider

class HashBasedSpec2ResultMapping implements SpecExecutionAcceptor, Executable2ResultMapping{

	val results = <Pair<String, String>, SpecExecution>newHashMap
	extension JnarioNameProvider nameProvider

	@Inject	new(JnarioNameProvider nameProvider){
		this.nameProvider = nameProvider
	}

	override SpecExecution getResult(Executable executable){
		if(executable == null){
			return new NotRun("", "")
		}
		var result = results.get(executable.asKey)
		if(result != null){
			return result
		}
		result = executable.calculateResult
		accept(result)
		result
	}

	def private SpecExecution calculateResult(Executable specification){
		val children = specification.executables
		val results = children.map[result].toList
		specification.createResult(results)
	}
	
	def private SpecExecution createResult(Executable specification, Iterable<SpecExecution> children){
		val specId = specification.asKey
		if(children.areNotExecuted){
			return new NotRun(specId.key, specId.value)
		}
		
		val executionTime = children.executionTime
		val failures = children.map[failures].flatten
		if(failures.empty){
			new Passed(specId.key, specId.value, executionTime)
		}else{
			new Failed(specId.key, specId.value, executionTime, failures)
		}
	}
	
	def private executionTime(Iterable<SpecExecution> results){
		results.fold(0.0)[sum, result | sum + result.executionTimeInSeconds]
	}
	
	def private areNotExecuted(Iterable<SpecExecution> executions) {
		executions.empty || !executions.filter(typeof(NotRun)).empty
	}
	
	def private asKey(Executable executable){
		val expectedClassName = executable.toQualifiedJavaClassName
		val expectedName = executable.describe
		val key = expectedClassName -> expectedName
		key
	}
	
	def private List<? extends Executable> executables(Executable element){
		val resource = element.eResource as XtextResource
		if(resource == null){
			return emptyList
		}
		val resourceServiceProvider = resource.resourceServiceProvider
		resourceServiceProvider.get(typeof(ExecutableProvider)).getExecutables(element)
	}

	override accept(SpecExecution result) {
		val key = result.className -> result.name
		results.put(key, result)
	}
	
} 