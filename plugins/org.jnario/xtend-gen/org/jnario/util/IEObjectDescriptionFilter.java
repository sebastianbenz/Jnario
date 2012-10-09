package org.jnario.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

import com.google.common.base.Predicate;

@Data
@SuppressWarnings("all")
public class IEObjectDescriptionFilter implements Predicate<IEObjectDescription> {
  private final EClass _type;
  
  public EClass getType() {
    return this._type;
  }
  
  public boolean apply(final IEObjectDescription input) {
    EClass _type = this.getType();
    EClass _eClass = input.getEClass();
    boolean _isSuperTypeOf = _type.isSuperTypeOf(_eClass);
    return _isSuperTypeOf;
  }
  
  public IEObjectDescriptionFilter(final EClass type) {
    super();
    this._type = type;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_type== null) ? 0 : _type.hashCode());
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
    IEObjectDescriptionFilter other = (IEObjectDescriptionFilter) obj;
    if (_type == null) {
      if (other._type != null)
        return false;
    } else if (!_type.equals(other._type))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
