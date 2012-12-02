package org.jnario.jvmmodel

import org.jnario.jvmmodel.TestRuntimeSupport
import org.eclipse.xtext.common.types.JvmGenericType
import org.jnario.Specification
import org.jnario.runner.Contains
import com.google.inject.Inject
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtend.core.xtend.XtendMember
import org.eclipse.xtext.common.types.JvmOperation
import org.junit.Before
import org.junit.BeforeClass
import org.junit.After
import org.junit.AfterClass
import org.jnario.Executable
import org.junit.Ignore
import org.jnario.runner.ExampleGroupRunner
import org.eclipse.xtend.core.xtend.XtendClass
import org.junit.runner.RunWith
import org.junit.Test
import org.jnario.runner.FeatureRunner
import java.util.Collection
import java.util.List

class JUnit4RuntimeSupport implements TestRuntimeSupport {
	 
	@Inject extension JvmTypesBuilder 
	
	override addChildren(Specification context, JvmGenericType parent, Collection<JvmGenericType> children) {
		parent.annotations += context.toAnnotation(typeof(Contains), children);
	}

	override afterAllMethod(XtendMember after, JvmOperation operation) {
		operation.annotations += after.toAnnotation(typeof(AfterClass))
	}
	
	override afterMethod(XtendMember after, JvmOperation operation) {
		operation.annotations += after.toAnnotation(typeof(After))
	}
	
	override beforeAllMethod(XtendMember before, JvmOperation operation) {
		operation.annotations += before.toAnnotation(typeof(BeforeClass))
	}
	
	override beforeMethod(XtendMember before, JvmOperation operation) {
		operation.annotations += before.toAnnotation(typeof(Before))
	}

	override markAsPending(Executable element, JvmOperation operation) {
		operation.annotations += element.toAnnotation(typeof(Ignore))
	}

	override updateExampleGroup(XtendClass exampleGroup, JvmGenericType inferredType) {
		inferredType.annotations += exampleGroup.toAnnotation(typeof(RunWith), typeof(ExampleGroupRunner));
	}

	override markAsTestMethod(Executable element, JvmOperation operation) {
		operation.annotations += element.toAnnotation(typeof(Test))
	}
	
	override updateFeature(XtendClass feature, JvmGenericType inferredType, List<JvmGenericType> scenarios) {
		inferredType.annotations += feature.toAnnotation(typeof(RunWith), typeof(FeatureRunner));
	}
	
	override updateScenario(XtendClass scenario, JvmGenericType inferredType) {
		inferredType.annotations += scenario.toAnnotation(typeof(RunWith), typeof(FeatureRunner));
	}

	override updateSuite(XtendClass exampleGroup, JvmGenericType inferredType) {
		inferredType.annotations += exampleGroup.toAnnotation(typeof(RunWith), typeof(ExampleGroupRunner));
	}
	
}