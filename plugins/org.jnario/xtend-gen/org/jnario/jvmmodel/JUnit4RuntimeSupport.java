package org.jnario.jvmmodel;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.Executable;
import org.jnario.Specification;
import org.jnario.jvmmodel.TestRuntimeSupport;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.FeatureRunner;

@SuppressWarnings("all")
public class JUnit4RuntimeSupport implements TestRuntimeSupport {
  private final static String RUN_WITH = "org.junit.runner.RunWith";
  
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  public void addChildren(final Specification context, final JvmGenericType parent, final Collection<JvmGenericType> children) {
    EList<JvmAnnotationReference> _annotations = parent.getAnnotations();
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(context, Contains.class, children);
    this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
  }
  
  public void afterAllMethod(final XtendMember after, final JvmOperation operation) {
    EList<JvmAnnotationReference> _annotations = operation.getAnnotations();
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(after, "org.junit.AfterClass");
    this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
  }
  
  public void afterMethod(final XtendMember after, final JvmOperation operation) {
    EList<JvmAnnotationReference> _annotations = operation.getAnnotations();
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(after, "org.junit.After");
    this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
  }
  
  public void beforeAllMethod(final XtendMember before, final JvmOperation operation) {
    EList<JvmAnnotationReference> _annotations = operation.getAnnotations();
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(before, "org.junit.BeforeClass");
    this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
  }
  
  public void beforeMethod(final XtendMember before, final JvmOperation operation) {
    EList<JvmAnnotationReference> _annotations = operation.getAnnotations();
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(before, "org.junit.Before");
    this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
  }
  
  public void markAsPending(final Executable element, final JvmOperation operation) {
    EList<JvmAnnotationReference> _annotations = operation.getAnnotations();
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(element, "org.junit.Ignore");
    this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
  }
  
  public void updateExampleGroup(final XtendClass exampleGroup, final JvmGenericType inferredType) {
    EList<JvmAnnotationReference> _annotations = inferredType.getAnnotations();
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(exampleGroup, JUnit4RuntimeSupport.RUN_WITH, ExampleGroupRunner.class);
    this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
  }
  
  public void markAsTestMethod(final Executable element, final JvmOperation operation) {
    EList<JvmAnnotationReference> _annotations = operation.getAnnotations();
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(element, "org.junit.Test");
    this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
  }
  
  public void updateFeature(final XtendClass feature, final JvmGenericType inferredType, final List<JvmGenericType> scenarios) {
    EList<JvmAnnotationReference> _annotations = inferredType.getAnnotations();
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(feature, JUnit4RuntimeSupport.RUN_WITH, FeatureRunner.class);
    this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
  }
  
  public void updateScenario(final XtendClass scenario, final JvmGenericType inferredType) {
    EList<JvmAnnotationReference> _annotations = inferredType.getAnnotations();
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(scenario, JUnit4RuntimeSupport.RUN_WITH, FeatureRunner.class);
    this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
  }
  
  public void updateSuite(final XtendClass exampleGroup, final JvmGenericType inferredType) {
    EList<JvmAnnotationReference> _annotations = inferredType.getAnnotations();
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(exampleGroup, JUnit4RuntimeSupport.RUN_WITH, ExampleGroupRunner.class);
    this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
  }
}
