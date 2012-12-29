package org.jnario.jvmmodel

import com.google.inject.Inject
import com.google.inject.Provider
import java.util.NoSuchElementException
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.util.TypeReferences

import static org.jnario.jvmmodel.TestRuntimeProvider.*

class TestRuntimeProvider {
	
	Provider<JUnit4RuntimeSupport> junit4Support
	Provider<JUnit3RuntimeSupport> junit3Support
	
	static val JUNIT3_CLASS = "junit.framework.TestCase"
	static val JUNIT4_CLASS = "org.junit.rules.TestRule"
	
	extension TypeReferences typeReferences
	
	@Inject	new(TypeReferences typeReferences, Provider<JUnit3RuntimeSupport> junit3Support, Provider<JUnit4RuntimeSupport> junit4Support){
		this.typeReferences = typeReferences
		this.junit3Support = junit3Support
		this.junit4Support = junit4Support
	}
	
	def get(EObject context){
		if(getTypeForName(JUNIT4_CLASS, context) != null){
			return junit4Support.get
		}
		if(getTypeForName(JUNIT3_CLASS, context) != null){
			return junit3Support.get
		}
		throw new NoSuchElementException("Mandatory test library bundle 'org.junit' 3.8.x or 4.8.x not found on the classpath.")
	}
	
}