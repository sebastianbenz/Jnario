package org.jnario.suite.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.jnario.feature.naming.FeatureClassNameProvider;
import org.jnario.jvmmodel.JnarioNameProvider;
import org.jnario.spec.naming.ExampleNameProvider;
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
  
  protected String removePrefix(final Suite suite) {
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
  
  protected String _internalGetClassName(final Suite suite) {
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
  
  protected String _internalGetClassName(final EObject element) {
    JnarioNameProvider _classNameProvider = this.classNameProvider(element);
    String _javaClassName = _classNameProvider==null?(String)null:_classNameProvider.toJavaClassName(element);
    return _javaClassName;
  }
  
  protected String internalDescribe(final EObject eObject) {
    String _doDescribe = this.doDescribe(eObject);
    return _doDescribe;
  }
  
  protected String _doDescribe(final Suite suite) {
    String _removePrefix = this.removePrefix(suite);
    String _convertToJavaString = _removePrefix==null?(String)null:org.eclipse.xtext.util.Strings.convertToJavaString(_removePrefix, true);
    return _convertToJavaString;
  }
  
  protected String _doDescribe(final EObject element) {
    JnarioNameProvider _classNameProvider = this.classNameProvider(element);
    String _describe = _classNameProvider==null?(String)null:_classNameProvider.describe(element);
    return _describe;
  }
  
  private JnarioNameProvider classNameProvider(final EObject element) {
    JnarioNameProvider _xblockexpression = null;
    {
      Resource _eResource = element.eResource();
      final XtextResource resource = ((XtextResource) _eResource);
      boolean _equals = Objects.equal(resource, null);
      if (_equals) {
        return null;
      }
      final IResourceServiceProvider resourceServiceProvider = resource.getResourceServiceProvider();
      JnarioNameProvider _get = resourceServiceProvider.<JnarioNameProvider>get(JnarioNameProvider.class);
      _xblockexpression = (_get);
    }
    return _xblockexpression;
  }
  
  protected String internalToJavaClassName(final EObject eObject) {
    String _internalGetClassName = this.internalGetClassName(eObject);
    return _internalGetClassName;
  }
  
  protected String internalToFieldName(final EObject eObject) {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("Auto-generated function stub");
    throw _unsupportedOperationException;
  }
  
  protected String internalToMethodName(final EObject eObject) {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("Auto-generated function stub");
    throw _unsupportedOperationException;
  }
  
  protected String internalGetClassName(final EObject suite) {
    if (suite instanceof Suite) {
      return _internalGetClassName((Suite)suite);
    } else if (suite != null) {
      return _internalGetClassName(suite);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(suite).toString());
    }
  }
  
  protected String doDescribe(final EObject suite) {
    if (suite instanceof Suite) {
      return _doDescribe((Suite)suite);
    } else if (suite != null) {
      return _doDescribe(suite);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(suite).toString());
    }
  }
}
