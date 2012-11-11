package org.jnario.jvmmodel

import org.jnario.jvmmodel.TestRuntimeSupport
import org.eclipse.xtext.common.types.JvmGenericType
import org.jnario.Specification
import org.eclipse.xtend.core.xtend.XtendMember
import org.eclipse.xtext.common.types.JvmOperation
import org.jnario.Executable
import org.eclipse.xtend.core.xtend.XtendClass
import java.util.Collection

class JUnit3RuntimeSupport implements TestRuntimeSupport {
	
	override afterAllMethod(XtendMember before, JvmOperation operation) {
		// implement me
	}
	
	override afterMethod(XtendMember before, JvmOperation operation) {
		// implement me
	}
	
	override beforeAllMethod(XtendMember before, JvmOperation operation) {
		// implement me
	}
	
	override beforeMethod(XtendMember before, JvmOperation operation) {
		// implement me
	}
	
	override markAsPending(Executable element, JvmOperation operation) {
		// implement me
	}
	
	override addChildren(Specification context, JvmGenericType parent, Collection<JvmGenericType> children) {
		// implement me
	}
	
	override updateExampleGroup(XtendClass exampleGroup, JvmGenericType inferredType) {
		// implement me
	}

	override markAsTestMethod(Executable element, JvmOperation operation) {
		// implement me
	}
	
	override updateFeature(XtendClass exampleGroup, JvmGenericType inferredType) {
		// implement me
	}
	

	override updateSuite(XtendClass exampleGroup, JvmGenericType inferredType) {
		// implement me
	}
	
}