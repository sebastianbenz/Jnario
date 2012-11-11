package org.jnario.jvmmodel;

import java.util.Collection;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmOperation;
import org.jnario.Executable;
import org.jnario.Specification;
import org.jnario.jvmmodel.SpecJvmModelProcessor;

@SuppressWarnings("all")
public class JUnit3ModelEnhancer implements SpecJvmModelProcessor {
  public void afterAllMethod(final XtendMember before, final JvmOperation operation) {
  }
  
  public void afterMethod(final XtendMember before, final JvmOperation operation) {
  }
  
  public void beforeAllMethod(final XtendMember before, final JvmOperation operation) {
  }
  
  public void beforeMethod(final XtendMember before, final JvmOperation operation) {
  }
  
  public void markAsPending(final Executable element, final JvmOperation operation) {
  }
  
  public void addChildren(final Specification context, final JvmGenericType parent, final Collection<JvmGenericType> children) {
  }
  
  public void updateExampleGroup(final XtendClass exampleGroup, final JvmGenericType inferredType) {
  }
  
  public void markAsTestMethod(final Executable element, final JvmOperation operation) {
  }
  
  public void updateFeature(final XtendClass exampleGroup, final JvmGenericType inferredType) {
  }
  
  public void updateSuite(final XtendClass exampleGroup, final JvmGenericType inferredType) {
  }
}
