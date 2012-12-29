package org.jnario.jnario.tests.unit.jvmmodel

import com.google.inject.Inject
import com.google.inject.Provider
import java.util.NoSuchElementException
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.util.TypeReferences
import org.jnario.jnario.test.util.SpecTestCreator
import org.jnario.jvmmodel.JUnit3RuntimeSupport
import org.jnario.jvmmodel.JUnit4RuntimeSupport
import org.jnario.jvmmodel.TestRuntimeProvider
import org.jnario.runner.CreateWith

import static org.mockito.Mockito.*

import static extension org.jnario.lib.Should.*

@CreateWith(typeof(SpecTestCreator))
describe TestRuntimeProvider{
	
	@Inject Provider<JUnit3RuntimeSupport> junit3Support
	@Inject Provider<JUnit4RuntimeSupport> junit4Support
	
	val resultingType = mock(typeof(JvmTypeReference)) 
	val typeReferences = mock(typeof(TypeReferences))
	val anyNotifier = mock(typeof(EObject)) 
	
	before subject = new TestRuntimeProvider(typeReferences, junit3Support, junit4Support)	
	
	fact "returns JUnit3 runtime provider if JUnit4 is not on classpath"{
		when(typeReferences.getTypeForName("junit.framework.TestCase", anyNotifier)).thenReturn(resultingType)
		subject.get(anyNotifier) => typeof(JUnit3RuntimeSupport)
	}
	
	fact "returns JUnit4 runtime provider if JUnit4 is on classpath"{
		when(typeReferences.getTypeForName("org.junit.rules.TestRule", anyNotifier)).thenReturn(resultingType)
		subject.get(anyNotifier) => typeof(JUnit4RuntimeSupport)
	}

	fact "throws NoSuchElementException if JUnit is not on classpath"{
		subject.get(anyNotifier) throws NoSuchElementException
	}
}