package org.jnario.jvmmodel;

import com.google.inject.Inject;
import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("all")
public class JunitAnnotationProvider {
  @Inject
  private ExtendedJvmTypesBuilder _extendedJvmTypesBuilder;
  
  public JvmAnnotationReference getExampleGroupRunnerAnnotation(final EObject context) {
    JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(context, org.junit.runner.RunWith.class, org.jnario.runner.ExampleGroupRunner.class);
    return _annotation;
  }
  
  public JvmAnnotationReference getFeatureRunner(final EObject context) {
    JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(context, org.junit.runner.RunWith.class, org.jnario.runner.FeatureRunner.class);
    return _annotation;
  }
  
  public JvmAnnotationReference getFeatureExamplesRunner(final EObject context) {
    JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(context, org.junit.runner.RunWith.class, org.jnario.runner.FeatureExamplesRunner.class);
    return _annotation;
  }
  
  public ArrayList<JvmAnnotationReference> getTestAnnotations(final EObject context, final JvmDeclaredType exception, final boolean isPending) {
      ArrayList<JvmAnnotationReference> _newArrayList = CollectionLiterals.<JvmAnnotationReference>newArrayList();
      final ArrayList<JvmAnnotationReference> annotations = _newArrayList;
      boolean _operator_equals = ObjectExtensions.operator_equals(exception, null);
      if (_operator_equals) {
        JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(context, org.junit.Test.class);
        CollectionExtensions.<JvmAnnotationReference>operator_add(annotations, _annotation);
      } else {
        String _name = org.junit.Test.class.getName();
        JvmAnnotationReference _annotation_1 = this._extendedJvmTypesBuilder.toAnnotation(context, _name, "expected", exception);
        CollectionExtensions.<JvmAnnotationReference>operator_add(annotations, _annotation_1);
      }
      if (isPending) {
        JvmAnnotationReference _annotation_2 = this._extendedJvmTypesBuilder.toAnnotation(context, org.junit.Ignore.class);
        CollectionExtensions.<JvmAnnotationReference>operator_add(annotations, _annotation_2);
      }
      return annotations;
  }
  
  public JvmAnnotationReference getBeforeAnnotation(final EObject context, final boolean isBeforeAll) {
    JvmAnnotationReference _xifexpression = null;
    if (isBeforeAll) {
      JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(context, org.junit.BeforeClass.class);
      _xifexpression = _annotation;
    } else {
      JvmAnnotationReference _beforeAnnotation = this.getBeforeAnnotation(context);
      _xifexpression = _beforeAnnotation;
    }
    return _xifexpression;
  }
  
  public JvmAnnotationReference getBeforeAnnotation(final EObject context) {
    JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(context, org.junit.Before.class);
    return _annotation;
  }
  
  public JvmAnnotationReference getAfterAnnotation(final EObject context, final boolean isAfterAll) {
    if (isAfterAll) {
      JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(context, org.junit.AfterClass.class);
      return _annotation;
    } else {
      JvmAnnotationReference _annotation_1 = this._extendedJvmTypesBuilder.toAnnotation(context, org.junit.After.class);
      return _annotation_1;
    }
  }
}
