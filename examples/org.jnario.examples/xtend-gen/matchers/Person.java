package matchers;

import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.Pure;

@Data
@SuppressWarnings("all")
public class Person {
  private final String _name;
  
  private final int _age;
  
  public String toString() {
    String _name = this.getName();
    String _plus = (_name + "(");
    int _age = this.getAge();
    String _plus_1 = (_plus + Integer.valueOf(_age));
    return (_plus_1 + ")");
  }
  
  public Person(final String name, final int age) {
    super();
    this._name = name;
    this._age = age;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this._name== null) ? 0 : this._name.hashCode());
    result = prime * result + this._age;
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
    Person other = (Person) obj;
    if (this._name == null) {
      if (other._name != null)
        return false;
    } else if (!this._name.equals(other._name))
      return false;
    if (other._age != this._age)
      return false;
    return true;
  }
  
  @Pure
  public String getName() {
    return this._name;
  }
  
  @Pure
  public int getAge() {
    return this._age;
  }
}
