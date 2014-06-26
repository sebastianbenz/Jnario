package org.jnario.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
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
  
  @Inject
  private TypeReferences typeReferences;
  
  public void addChildren(final Specification context, final JvmGenericType parent, final Collection<JvmTypeReference> children) {
    boolean _isEmpty = children.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<JvmAnnotationReference> _annotations = parent.getAnnotations();
      JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(context, Contains.class, children);
      this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
    }
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
    JvmTypeReference _typeForName = this.getTypeForName(ExampleGroupRunner.class, exampleGroup);
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(exampleGroup, JUnit4RuntimeSupport.RUN_WITH, _typeForName);
    this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
  }
  
  public void markAsTestMethod(final Executable element, final JvmOperation operation) {
    EList<JvmAnnotationReference> _annotations = operation.getAnnotations();
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(element, "org.junit.Test");
    this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
  }
  
  public void updateFeature(final XtendClass feature, final JvmGenericType inferredType, final List<JvmTypeReference> scenarios) {
    EList<JvmAnnotationReference> _annotations = inferredType.getAnnotations();
    JvmTypeReference _typeForName = this.getTypeForName(FeatureRunner.class, feature);
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(feature, JUnit4RuntimeSupport.RUN_WITH, _typeForName);
    this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
  }
  
  public void updateScenario(final XtendClass scenario, final JvmGenericType inferredType) {
    EList<JvmAnnotationReference> _annotations = inferredType.getAnnotations();
    JvmTypeReference _typeForName = this.getTypeForName(FeatureRunner.class, scenario);
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(scenario, JUnit4RuntimeSupport.RUN_WITH, _typeForName);
    this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
  }
  
  public void updateSuite(final XtendClass exampleGroup, final JvmGenericType inferredType) {
    EList<JvmAnnotationReference> _annotations = inferredType.getAnnotations();
    JvmTypeReference _typeForName = this.getTypeForName(ExampleGroupRunner.class, exampleGroup);
    JvmAnnotationReference _annotation = this._jvmTypesBuilder.toAnnotation(exampleGroup, JUnit4RuntimeSupport.RUN_WITH, _typeForName);
    this._jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
  }
  
  public JvmTypeReference getTypeForName(final Class<?> type, final Notifier context) {
    JvmTypeReference _xblockexpression = null;
    {
      final JvmTypeReference result = this.typeReferences.getTypeForName(type, context);
      boolean _equals = Objects.equal(result, null);
      if (_equals) {
        String _name = type.getName();
        String _plus = ("Jnario runtime could not be resolved: " + _name);
        throw new IllegalStateException(_plus);
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
}
