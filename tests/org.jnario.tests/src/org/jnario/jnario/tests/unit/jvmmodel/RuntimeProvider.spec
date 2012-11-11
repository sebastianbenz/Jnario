package org.jnario.jnario.tests.unit.jvmmodel

import org.jnario.jvmmodel.RuntimeProvider
import static org.mockito.Mockito.*
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmTypeReference
import org.jnario.jvmmodel.JUnit3ModelEnhancer
import org.jnario.jvmmodel.JUnit4ModelEnhancer
import java.util.NoSuchElementException
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.SpecTestCreator
import com.google.inject.Inject
import com.google.inject.Provider

@CreateWith(typeof(SpecTestCreator))
describe RuntimeProvider{
	
	@Inject Provider<JUnit3ModelEnhancer> junit3Support
	@Inject Provider<JUnit4ModelEnhancer> junit4Support
	
	val resultingType = mock(typeof(JvmTypeReference)) 
	val typeReferences = mock(typeof(TypeReferences))
	val anyNotifier = mock(typeof(EObject)) 
	
	before subject = new RuntimeProvider(typeReferences, junit3Support, junit4Support)	
	
	fact "returns JUnit3 runtime provider if JUnit4 is not on classpath"{
		when(typeReferences.getTypeForName("junit.framework.TestCase", anyNotifier)).thenReturn(resultingType)
		subject.get(anyNotifier) => typeof(JUnit3ModelEnhancer)
	}
	
	fact "returns JUnit4 runtime provider if JUnit4 is on classpath"{
		when(typeReferences.getTypeForName("org.junit.Test", anyNotifier)).thenReturn(resultingType)
		subject.get(anyNotifier) => typeof(JUnit4ModelEnhancer)
	}

	fact "throws NoSuchElementException if JUnit is not on classpath"{
		subject.get(anyNotifier) throws NoSuchElementException
	}
}