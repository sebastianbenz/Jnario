package org.jnario.suite.conversion;

import com.google.common.base.Objects;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Exceptions;

@Data
@SuppressWarnings("all")
public class PatternValueConverter implements IValueConverter<String> {
  public String toString(final String string) throws ValueConverterException {
    String _xblockexpression = null;
    {
      String result = "";
      boolean _notEquals = (!Objects.equal(string, null));
      if (_notEquals) {
        String _plus = ("- \\" + string);
        String _plus_1 = (_plus + "\\");
        String _newLine = Strings.newLine();
        String _plus_2 = (_plus_1 + _newLine);
        result = _plus_2;
      }
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
  
  public String toValue(final String string, final INode node) throws ValueConverterException {
    try {
      String _substring = string.substring(1);
      String result = _substring.trim();
      int _length = result.length();
      int _minus = (_length - 1);
      String _substring_1 = result.substring(1, _minus);
      result = _substring_1;
      Pattern.compile(result);
      return result;
    } catch (final Throwable _t) {
      if (_t instanceof PatternSyntaxException) {
        final PatternSyntaxException e = (PatternSyntaxException)_t;
        String _message = e.getMessage();
        ValueConverterException _valueConverterException = new ValueConverterException(_message, node, e);
        throw _valueConverterException;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public PatternValueConverter() {
    super();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    PatternValueConverter other = (PatternValueConverter) obj;
    return true;
  }
}
