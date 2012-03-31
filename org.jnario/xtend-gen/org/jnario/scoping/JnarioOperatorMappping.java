package org.jnario.scoping;

import com.google.common.base.Objects;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.scoping.featurecalls.OperatorMapping;

@SuppressWarnings("all")
public class JnarioOperatorMappping extends OperatorMapping {
  private static String PREFIX = "should";
  
  private static String PREFIX_WITH_SEPARATOR = new Function0<String>() {
    public String apply() {
      String _plus = (JnarioOperatorMappping.PREFIX + " ");
      return _plus;
    }
  }.apply();
  
  private static String METHOD_PREFIX = new Function0<String>() {
    public String apply() {
      String _plus = (JnarioOperatorMappping.PREFIX + "_");
      return _plus;
    }
  }.apply();
  
  public QualifiedName getMethodName(final QualifiedName operator) {
    QualifiedName _xblockexpression = null;
    {
      boolean _equals = Objects.equal(operator, null);
      if (_equals) {
        return null;
      }
      final String name = operator.getFirstSegment();
      boolean _startsWith = name.startsWith(JnarioOperatorMappping.PREFIX_WITH_SEPARATOR);
      if (_startsWith) {
        final int index = name.lastIndexOf(" ");
        int _minus = (-1);
        boolean _notEquals = (index != _minus);
        if (_notEquals) {
          int _plus = (index + 1);
          String _substring = name.substring(_plus);
          final String methodName = (JnarioOperatorMappping.METHOD_PREFIX + _substring);
          return QualifiedName.create(methodName);
        }
      }
      QualifiedName _methodName = super.getMethodName(operator);
      _xblockexpression = (_methodName);
    }
    return _xblockexpression;
  }
  
  public QualifiedName getOperator(final QualifiedName methodName) {
    boolean _equals = Objects.equal(methodName, null);
    if (_equals) {
      return null;
    }
    final String name = methodName.getFirstSegment();
    boolean _startsWith = name.startsWith(JnarioOperatorMappping.METHOD_PREFIX);
    boolean _not = (!_startsWith);
    if (_not) {
      return super.getOperator(methodName);
    }
    int _length = JnarioOperatorMappping.METHOD_PREFIX.length();
    final String operator = name.substring(_length);
    String _plus = (JnarioOperatorMappping.PREFIX_WITH_SEPARATOR + operator);
    return QualifiedName.create(_plus);
  }
}
