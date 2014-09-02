package org.jnario.util;

import com.google.common.base.Predicate;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class IEObjectDescriptionFilter implements Predicate<IEObjectDescription> {
  private final EClass _type;
  
  public boolean apply(final IEObjectDescription input) {
    EClass _type = this.getType();
    EClass _eClass = input.getEClass();
    return _type.isSuperTypeOf(_eClass);
  }
  
  public IEObjectDescriptionFilter(final EClass type) {
    super();
    this._type = type;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this._type== null) ? 0 : this._type.hashCode());
    return result;
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    IEObjectDescriptionFilter other = (IEObjectDescriptionFilter) obj;
    if (this._type == null) {
      if (other._type != null)
        return false;
    } else if (!this._type.equals(other._type))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
  
  @Pure
  public EClass getType() {
    return this._type;
  }
}
