package org.jnario.suite.conversion;

import com.google.common.base.Objects;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.suite.conversion.SuiteValueConverter;

@SuppressWarnings("all")
public class TextValueConverter extends SuiteValueConverter {
  private final String prefix;
  
  private final String postfix;
  
  public TextValueConverter(final String prefix, final String postfix) {
    super(new Function0<Character>() {
      public Character apply() {
        char _charAt = ":".charAt(0);
        return _charAt;
      }
    }.apply());
    this.prefix = prefix;
    this.postfix = postfix;
  }
  
  public String toString(final String value) throws ValueConverterException {
    String _string = super.toString(value);
    String _plus = (this.prefix + _string);
    String _plus_1 = (_plus + this.postfix);
    return _plus_1;
  }
  
  public String toValue(final String input, final INode node) throws ValueConverterException {
    String string = super.toValue(input, node);
    String result = "";
    boolean _notEquals = (!Objects.equal(string, null));
    if (_notEquals) {
      int _length = this.prefix.length();
      int _length_1 = string.length();
      int _length_2 = this.postfix.length();
      int _minus = (_length_1 - _length_2);
      String _substring = string.substring(_length, _minus);
      String _trim = _substring.trim();
      result = _trim;
    }
    return result;
  }
}
