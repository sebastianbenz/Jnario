package de.bmw.carit.jnario.spec.jvmmodel;

import com.google.inject.Inject;
import de.bmw.carit.jnario.common.jvmmodel.ExtendedJvmTypesBuilder;
import de.bmw.carit.jnario.runner.ExampleGroupRunner;
import de.bmw.carit.jnario.spec.spec.After;
import de.bmw.carit.jnario.spec.spec.Before;
import de.bmw.carit.jnario.spec.spec.Example;
import java.util.ArrayList;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.junit.runner.RunWith;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("all")
public class SpecAnnotationProvider {
  @Inject
  private ExtendedJvmTypesBuilder _extendedJvmTypesBuilder;
  
  public Pair<Class<RunWith>,Class<ExampleGroupRunner>> getRunnerAnnotation() {
    Pair<Class<RunWith>,Class<ExampleGroupRunner>> _operator_mappedTo = ObjectExtensions.<Class<RunWith>, Class<ExampleGroupRunner>>operator_mappedTo(org.junit.runner.RunWith.class, de.bmw.carit.jnario.runner.ExampleGroupRunner.class);
    return _operator_mappedTo;
  }
  
  public ArrayList<JvmAnnotationReference> getTestAnnotations(final Example element) {
      ArrayList<JvmAnnotationReference> _newArrayList = CollectionLiterals.<JvmAnnotationReference>newArrayList();
      final ArrayList<JvmAnnotationReference> annotations = _newArrayList;
      JvmDeclaredType _exception = element.getException();
      boolean _operator_equals = ObjectExtensions.operator_equals(_exception, null);
      if (_operator_equals) {
        JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(element, org.junit.Test.class);
        CollectionExtensions.<JvmAnnotationReference>operator_add(annotations, _annotation);
      } else {
        String _name = org.junit.Test.class.getName();
        JvmDeclaredType _exception_1 = element.getException();
        JvmAnnotationReference _annotation_1 = this._extendedJvmTypesBuilder.toAnnotation(element, _name, "expected", _exception_1);
        CollectionExtensions.<JvmAnnotationReference>operator_add(annotations, _annotation_1);
      }
      boolean _isPending = element.isPending();
      if (_isPending) {
        JvmAnnotationReference _annotation_2 = this._extendedJvmTypesBuilder.toAnnotation(element, org.junit.Ignore.class);
        CollectionExtensions.<JvmAnnotationReference>operator_add(annotations, _annotation_2);
      }
      return annotations;
  }
  
  public Class<?> getBeforeAnnotation(final Before element) {
    boolean _isBeforeAll = element.isBeforeAll();
    if (_isBeforeAll) {
      return org.junit.BeforeClass.class;
    } else {
      return org.junit.Before.class;
    }
  }
  
  public Class<?> getAfterAnnotation(final After element) {
    boolean _isAfterAll = element.isAfterAll();
    if (_isAfterAll) {
      return org.junit.AfterClass.class;
    } else {
      return org.junit.After.class;
    }
  }
}
