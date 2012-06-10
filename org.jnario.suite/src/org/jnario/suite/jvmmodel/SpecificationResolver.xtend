package org.jnario.suite.jvmmodel

import com.google.common.base.Predicates
import com.google.inject.Inject
import java.util.List
import java.util.regex.Pattern
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.scoping.IScopeProvider
import org.jnario.Specification
import org.jnario.suite.suite.PatternReference
import org.jnario.suite.suite.SpecReference
import org.jnario.suite.suite.Suite

import static java.util.Collections.*
import static org.eclipse.emf.ecore.util.EcoreUtil.*
import static org.jnario.suite.suite.SuitePackage$Literals.*
class SpecificationResolver {
	
	@Inject extension IScopeProvider scopeProvider
	@Inject extension IQualifiedNameConverter 
	
	def dispatch List<Specification> resolveSpecs(Suite suite){
		val notNull = Predicates::<Specification>notNull
		suite.specs.map[resolveSpecs].flatten.filter(notNull).toList
	}
	
	def dispatch List<Specification> resolveSpecs(SpecReference specRef){
		singletonList(specRef.spec)
	}
	
	def dispatch List<Specification> resolveSpecs(PatternReference specRef){
		val scope = getScope(specRef, SPEC_REFERENCE__SPEC)
		val pattern = Pattern::compile(specRef.pattern)
		val allElements = scope.allElements.filter[
			pattern.matcher(toString(it.qualifiedName)).matches
		]
		val specs = allElements.map[resolve(EObjectOrProxy, specRef)].filter(typeof(Specification))
		specs.toMap[packageName + "." + name].values.toList
	}
	
}