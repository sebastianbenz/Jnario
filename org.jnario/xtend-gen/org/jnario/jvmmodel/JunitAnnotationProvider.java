package org.jnario.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.FeatureExamplesRunner;
import org.jnario.runner.FeatureRunner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("all")
public class JunitAnnotationProvider {
  @Inject
  private ExtendedJvmTypesBuilder _extendedJvmTypesBuilder;
  
  public JvmAnnotationReference getExampleGroupRunnerAnnotation(final EObject context) {
    JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(context, RunWith.class, ExampleGroupRunner.class);
    return _annotation;
  }
  
  public JvmAnnotationReference getFeatureRunner(final EObject context) {
    JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(context, RunWith.class, FeatureRunner.class);
    return _annotation;
  }
  
  public JvmAnnotationReference getFeatureExamplesRunner(final EObject context) {
    JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(context, RunWith.class, FeatureExamplesRunner.class);
    return _annotation;
  }
  
  public ArrayList<JvmAnnotationReference> getTestAnnotations(final EObject context, final JvmDeclaredType exception, final boolean isPending) {
    ArrayList<JvmAnnotationReference> _newArrayList = CollectionLiterals.<JvmAnnotationReference>newArrayList();
    final ArrayList<JvmAnnotationReference> annotations = _newArrayList;
    boolean _equals = Objects.equal(exception, null);
    if (_equals) {
      JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(context, Test.class);
      annotations.add(_annotation);
    } else {
      String _name = Test.class.getName();
      JvmAnnotationReference _annotation_1 = this._extendedJvmTypesBuilder.toAnnotation(context, _name, "expected", exception);
      annotations.add(_annotation_1);
    }
    if (isPending) {
      JvmAnnotationReference _annotation_2 = this._extendedJvmTypesBuilder.toAnnotation(context, Ignore.class);
      annotations.add(_annotation_2);
    }
    return annotations;
  }
  
  public JvmAnnotationReference getBeforeAnnotation(final EObject context, final boolean isBeforeAll) {
    JvmAnnotationReference _xifexpression = null;
    if (isBeforeAll) {
      JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(context, BeforeClass.class);
      _xifexpression = _annotation;
    } else {
      JvmAnnotationReference _beforeAnnotation = this.getBeforeAnnotation(context);
      _xifexpression = _beforeAnnotation;
    }
    return _xifexpression;
  }
  
  public JvmAnnotationReference getBeforeAnnotation(final EObject context) {
    JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(context, Before.class);
    return _annotation;
  }
  
  public JvmAnnotationReference getAfterAnnotation(final EObject context, final boolean isAfterAll) {
    if (isAfterAll) {
      JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(context, AfterClass.class);
      return _annotation;
    } else {
      JvmAnnotationReference _annotation_1 = this._extendedJvmTypesBuilder.toAnnotation(context, After.class);
      return _annotation_1;
    }
  }
}
