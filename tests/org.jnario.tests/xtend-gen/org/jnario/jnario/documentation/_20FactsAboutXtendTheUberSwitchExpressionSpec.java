package org.jnario.jnario.documentation;

import com.google.common.base.Objects;
import java.util.List;
import org.hamcrest.StringDescription;
import org.jnario.jnario.documentation._20FactsAboutXtendSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Xtend's switch expression is greatly improved over the one from Java.
 * There is no fall through which means only one case is
 * evaluated at most and it is not limited to certain
 * values but can be used for any object.
 */
@SuppressWarnings("all")
@Named("The Uber-Switch Expression")
@RunWith(ExampleGroupRunner.class)
public class _20FactsAboutXtendTheUberSwitchExpressionSpec extends _20FactsAboutXtendSpec {
  /**
   * Cases support arbitrary expressions, if they evaluate to a boolean value, it will
   * be used as result, otherwise, the evaluation result will be compared using `Object#equals(Object)`.
   */
  @Test
  @Named("Supports case expressions")
  @Order(9)
  public void _supportsCaseExpressions() throws Exception {
    final String myString = "Hello";
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      int _length = myString.length();
      boolean _greaterThan = (_length > 5);
      if (_greaterThan) {
        _matched=true;
        _switchResult = "a long string.";
      }
    }
    if (!_matched) {
      if (Objects.equal(myString,"some")) {
        _matched=true;
        _switchResult = "It\'s some string.";
      }
    }
    if (!_matched) {
      _switchResult = "It\'s another short string.";
    }
    boolean _doubleArrow = Should.operator_doubleArrow(_switchResult, "It\'s another short string.");
    Assert.assertTrue("\nExpected switch myString {\n        case myString.length > 5 : \"a long string.\"\n        case \'some\'              : \"It\'s some string.\"\n        default                  : \"It\'s another short string.\"\n      } \n      \n      =>  \"It\'s another short string.\" but"
     + "\n     switch myString {\n        case myString.length > 5 : \"a long string.\"\n        case \'some\'              : \"It\'s some string.\"\n        default                  : \"It\'s another short string.\"\n      } is " + new StringDescription().appendValue(_switchResult).toString() + "\n", _doubleArrow);
    
  }
  
  /**
   * You can also write type guards in the case statements. Note that
   * on the right-hand side of the case statement you can directly
   * access the features of the guarded type without an explicit cast;
   */
  @Test
  @Named("...and type guards [with type inference]")
  @Order(10)
  public void _andTypeGuardsWithTypeInference() throws Exception {
    List<Integer> _list = JnarioCollectionLiterals.<Integer>list(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3));
    final Object x = ((Object) _list);
    int _switchResult = (int) 0;
    boolean _matched = false;
    if (!_matched) {
      if (x instanceof String) {
        final String _string = (String)x;
        int _length = _string.length();
        boolean _greaterThan = (_length > 0);
        if (_greaterThan) {
          _matched=true;
          int _length_1 = _string.length();
          _switchResult = _length_1;
        }
      }
    }
    if (!_matched) {
      if (x instanceof List) {
        final List<?> _list_1 = (List<?>)x;
        _matched=true;
        int _size = _list_1.size();
        _switchResult = _size;
      }
    }
    if (!_matched) {
      int _minus = (-1);
      _switchResult = _minus;
    }
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_switchResult), Integer.valueOf(3));
    Assert.assertTrue("\nExpected switch x {\n        String case x.length > 0 : x.length // length from String \n        List<?>                  : x.size    // size from List\n        default : -1\n      } \n      \n      => 3 but"
     + "\n     switch x {\n        String case x.length > 0 : x.length // length from String \n        List<?>                  : x.size    // size from List\n        default : -1\n      } is " + new StringDescription().appendValue(Integer.valueOf(_switchResult)).toString() + "\n", _doubleArrow);
    
  }
}
