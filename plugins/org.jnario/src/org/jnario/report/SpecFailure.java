package org.jnario.report;

import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class SpecFailure {
  private final String _message;
  
  public String getMessage() {
    return this._message;
  }
  
  private final String _type;
  
  public String getType() {
    return this._type;
  }
  
  private final String _stacktrace;
  
  public String getStacktrace() {
    return this._stacktrace;
  }
  
  public SpecFailure(final String message, final String type, final String stacktrace) {
    super();
    this._message = message;
    this._type = type;
    this._stacktrace = stacktrace;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_message== null) ? 0 : _message.hashCode());
    result = prime * result + ((_type== null) ? 0 : _type.hashCode());
    result = prime * result + ((_stacktrace== null) ? 0 : _stacktrace.hashCode());
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
    SpecFailure other = (SpecFailure) obj;
    if (_message == null) {
      if (other._message != null)
        return false;
    } else if (!_message.equals(other._message))
      return false;
    if (_type == null) {
      if (other._type != null)
        return false;
    } else if (!_type.equals(other._type))
      return false;
    if (_stacktrace == null) {
      if (other._stacktrace != null)
        return false;
    } else if (!_stacktrace.equals(other._stacktrace))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    return _message + "\n" + _stacktrace;
  }
}
