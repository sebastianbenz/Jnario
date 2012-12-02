package org.jnario.jvmmodel;

import java.util.Collection;
import java.util.List;

import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmOperation;
import org.jnario.Executable;
import org.jnario.Specification;

public interface TestRuntimeSupport {
	
	void updateExampleGroup(XtendClass exampleGroup, JvmGenericType inferredType);
	void updateSuite(XtendClass suite, JvmGenericType inferredType);
	void updateFeature(XtendClass feature, JvmGenericType inferredType, List<JvmGenericType> scenarios);
	void updateScenario(XtendClass scenario, JvmGenericType inferredType);
	void addChildren(Specification context, JvmGenericType parent, Collection<JvmGenericType> children);

	void markAsTestMethod(Executable element, JvmOperation operation);
	void markAsPending(Executable element, JvmOperation operation);
	
	void beforeMethod(XtendMember before, JvmOperation operation);
	void beforeAllMethod(XtendMember before, JvmOperation operation);
	
	void afterMethod(XtendMember after, JvmOperation operation);
	void afterAllMethod(XtendMember afterAll, JvmOperation operation);

}
