package org.jnario.jvmmodel

import org.jnario.jvmmodel.TestRuntimeSupport
import org.eclipse.xtext.common.types.JvmGenericType
import org.jnario.Specification
import org.jnario.runner.Contains
import com.google.inject.Inject
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtend.core.xtend.XtendMember
import org.eclipse.xtext.common.types.JvmOperation
import org.jnario.Executable
import org.jnario.runner.ExampleGroupRunner
import org.eclipse.xtend.core.xtend.XtendClass
import org.jnario.runner.FeatureRunner
import java.util.Collection
import java.util.List

class JUnit4RuntimeSupport implements TestRuntimeSupport {
	
	val static RUN_WITH = "org.junit.runner.RunWith"
	 
	@Inject extension JvmTypesBuilder 
	
	override addChildren(Specification context, JvmGenericType parent, Collection<JvmGenericType> children) {
		parent.annotations += context.toAnnotation(typeof(Contains), children);
	}

	override afterAllMethod(XtendMember after, JvmOperation operation) {
		operation.annotations += after.toAnnotation("org.junit.AfterClass")
	}
	
	override afterMethod(XtendMember after, JvmOperation operation) {
		operation.annotations += after.toAnnotation("org.junit.After")
	}
	
	override beforeAllMethod(XtendMember before, JvmOperation operation) {
		operation.annotations += before.toAnnotation("org.junit.BeforeClass")
	}
	
	override beforeMethod(XtendMember before, JvmOperation operation) {
		operation.annotations += before.toAnnotation("org.junit.Before")
	}

	override markAsPending(Executable element, JvmOperation operation) {
		operation.annotations += element.toAnnotation("org.junit.Ignore")
	}

	override updateExampleGroup(XtendClass exampleGroup, JvmGenericType inferredType) {
		inferredType.annotations += exampleGroup.toAnnotation(RUN_WITH, typeof(ExampleGroupRunner));
	}

	override markAsTestMethod(Executable element, JvmOperation operation) {
		operation.annotations += element.toAnnotation("org.junit.Test")
	}
	
	override updateFeature(XtendClass feature, JvmGenericType inferredType, List<JvmGenericType> scenarios) {
		inferredType.annotations += feature.toAnnotation(RUN_WITH, typeof(FeatureRunner));
	}
	
	override updateScenario(XtendClass scenario, JvmGenericType inferredType) {
		inferredType.annotations += scenario.toAnnotation(RUN_WITH, typeof(FeatureRunner));
	}

	override updateSuite(XtendClass exampleGroup, JvmGenericType inferredType) {
		inferredType.annotations += exampleGroup.toAnnotation(RUN_WITH, typeof(ExampleGroupRunner));
	}
	
}