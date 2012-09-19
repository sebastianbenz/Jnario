package org.jnario.suite.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.naming.FeatureClassNameProvider;
import org.jnario.jvmmodel.JnarioNameProvider;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.suite.suite.Suite;
import org.jnario.util.Strings;

@SuppressWarnings("all")
public class SuiteClassNameProvider extends JnarioNameProvider {
  private ExampleNameProvider exampleNameProvider;
  
  private FeatureClassNameProvider featureNameProvider;
  
  @Inject
  public SuiteClassNameProvider(final ExampleNameProvider exampleNameProvider, final FeatureClassNameProvider featureNameProvider) {
    this.exampleNameProvider = exampleNameProvider;
    this.featureNameProvider = featureNameProvider;
  }
  
  private final static String POSTFIX = "Suite";
  
  public String removePrefix(final Suite suite) {
    String _xblockexpression = null;
    {
      String _name = suite.getName();
      String name = Strings.firstLine(_name);
      boolean _isNullOrEmpty = com.google.common.base.Strings.isNullOrEmpty(name);
      if (_isNullOrEmpty) {
        return null;
      }
      int _lastIndexOf = name.lastIndexOf("#");
      int _plus = (_lastIndexOf + 1);
      String _substring = name.substring(_plus);
      String _trim = _substring.trim();
      name = _trim;
      String _xifexpression = null;
      boolean _isNullOrEmpty_1 = com.google.common.base.Strings.isNullOrEmpty(name);
      if (_isNullOrEmpty_1) {
        return null;
      } else {
        _xifexpression = name;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  protected String _getClassName(final Suite suite) {
    String _xblockexpression = null;
    {
      final String name = this.removePrefix(suite);
      boolean _equals = Objects.equal(name, null);
      if (_equals) {
        return null;
      }
      String _className = Strings.toClassName(name);
      String _plus = (_className + SuiteClassNameProvider.POSTFIX);
      _xblockexpression = (_plus);
    }
    return _xblockexpression;
  }
  
  protected String _getClassName(final ExampleGroup element) {
    String _javaClassName = this.exampleNameProvider.toJavaClassName(element);
    return _javaClassName;
  }
  
  protected String _getClassName(final Feature element) {
    String _className = this.featureNameProvider.getClassName(element);
    return _className;
  }
  
  protected String _getClassName(final EObject element) {
    EClass _eClass = element.eClass();
    String _name = _eClass.getName();
    String _plus = ("Cannot get class name for " + _name);
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException(_plus);
    throw _unsupportedOperationException;
  }
  
  public String describe(final EObject eObject) {
    String _doDescribe = this.doDescribe(eObject);
    return _doDescribe;
  }
  
  protected String _doDescribe(final Suite suite) {
    String _removePrefix = this.removePrefix(suite);
    String _convertToJavaString = _removePrefix==null?(String)null:org.eclipse.xtext.util.Strings.convertToJavaString(_removePrefix, true);
    return _convertToJavaString;
  }
  
  protected String _doDescribe(final ExampleGroup element) {
    String _describe = this.exampleNameProvider.describe(element);
    return _describe;
  }
  
  protected String _doDescribe(final Feature element) {
    String _name = element.getName();
    return _name;
  }
  
  protected String _doDescribe(final EObject element) {
    EClass _eClass = element.eClass();
    String _name = _eClass.getName();
    String _plus = ("Cannot describe " + _name);
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException(_plus);
    throw _unsupportedOperationException;
  }
  
  public String toJavaClassName(final EObject eObject) {
    String _className = this.getClassName(eObject);
    return _className;
  }
  
  public String getClassName(final EObject element) {
    if (element instanceof Feature) {
      return _getClassName((Feature)element);
    } else if (element instanceof ExampleGroup) {
      return _getClassName((ExampleGroup)element);
    } else if (element instanceof Suite) {
      return _getClassName((Suite)element);
    } else if (element != null) {
      return _getClassName(element);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element).toString());
    }
  }
  
  public String doDescribe(final EObject element) {
    if (element instanceof Feature) {
      return _doDescribe((Feature)element);
    } else if (element instanceof ExampleGroup) {
      return _doDescribe((ExampleGroup)element);
    } else if (element instanceof Suite) {
      return _doDescribe((Suite)element);
    } else if (element != null) {
      return _doDescribe(element);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element).toString());
    }
  }
}
