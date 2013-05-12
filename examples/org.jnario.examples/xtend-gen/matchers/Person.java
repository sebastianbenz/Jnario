package matchers;

import org.eclipse.xtend.lib.Data;

@Data
@SuppressWarnings("all")
public class Person {
  private final String _name;
  
  public String getName() {
    return this._name;
  }
  
  private final int _age;
  
  public int getAge() {
    return this._age;
  }
  
  public String toString() {
    String _name = this.getName();
    String _plus = (_name + "(");
    int _age = this.getAge();
    String _plus_1 = (_plus + Integer.valueOf(_age));
    String _plus_2 = (_plus_1 + ")");
    return _plus_2;
  }
  
  public Person(final String name, final int age) {
    super();
    this._name = name;
    this._age = age;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_name== null) ? 0 : _name.hashCode());
    result = prime * result + _age;
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
    Person other = (Person) obj;
    if (_name == null) {
      if (other._name != null)
        return false;
    } else if (!_name.equals(other._name))
      return false;
    if (other._age != _age)
      return false;
    return true;
  }
}
