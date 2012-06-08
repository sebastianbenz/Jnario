package org.jnario.suite.conversion;

import com.google.common.base.Objects;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

@Data
@SuppressWarnings("all")
public class LinkValueConverter implements IValueConverter<String> {
  private final String _prefix;
  
  public String getPrefix() {
    return this._prefix;
  }
  
  private final String _postfix;
  
  public String getPostfix() {
    return this._postfix;
  }
  
  public String toString(final String value) throws ValueConverterException {
    String _prefix = this.getPrefix();
    String _plus = (_prefix + value);
    String _postfix = this.getPostfix();
    String _plus_1 = (_plus + _postfix);
    return _plus_1;
  }
  
  public String toValue(final String string, final INode node) throws ValueConverterException {
    String result = "";
    boolean _notEquals = (!Objects.equal(string, null));
    if (_notEquals) {
      String _prefix = this.getPrefix();
      int _length = _prefix.length();
      int _length_1 = string.length();
      String _postfix = this.getPostfix();
      int _length_2 = _postfix.length();
      int _minus = (_length_1 - _length_2);
      String _substring = string.substring(_length, _minus);
      String _trim = _substring.trim();
      result = _trim;
    }
    return result;
  }
  
  public LinkValueConverter(final String prefix, final String postfix) {
    super();
    this._prefix = prefix;
    this._postfix = postfix;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_prefix== null) ? 0 : _prefix.hashCode());
    result = prime * result + ((_postfix== null) ? 0 : _postfix.hashCode());
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
    LinkValueConverter other = (LinkValueConverter) obj;
    if (_prefix == null) {
      if (other._prefix != null)
        return false;
    } else if (!_prefix.equals(other._prefix))
      return false;
    if (_postfix == null) {
      if (other._postfix != null)
        return false;
    } else if (!_postfix.equals(other._postfix))
      return false;
    return true;
  }
}
