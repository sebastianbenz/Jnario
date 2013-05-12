package matchers;

import matchers.Person;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.hamcrest.StringDescription;
import org.jnario.lib.Assert;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("Matchers")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class MatchersSpec {
  @Test
  @Named("Using Hamcrest")
  @Order(1)
  public void _usingHamcrest() throws Exception {
    Person _person = new Person("Frodo", 4);
    final Person personOfAgeFour = _person;
    Person _person_1 = new Person("Bilbo", 5);
    final Person personOfAgeFive = _person_1;
    Function1<Person,Boolean> _underAge = this.underAge();
    Boolean _should_be = this.<Person>should_be(personOfAgeFour, _underAge);
    Assert.assertFalse("\nExpected personOfAgeFour should not be underAge but"
     + "\n     personOfAgeFour is " + new StringDescription().appendValue(personOfAgeFour).toString() + "\n", _should_be);
    
    Function1<Person,Boolean> _olderThan = this.olderThan(personOfAgeFive);
    Boolean _should_be_1 = this.<Person>should_be(personOfAgeFour, _olderThan);
    Assert.assertTrue("\nExpected personOfAgeFour should be olderThan(personOfAgeFive) but"
     + "\n     personOfAgeFour is " + new StringDescription().appendValue(personOfAgeFour).toString()
     + "\n     personOfAgeFive is " + new StringDescription().appendValue(personOfAgeFive).toString() + "\n", _should_be_1);
    
  }
  
  public Function1<Person,Boolean> olderThan(final Person p) {
    final Function1<Person,Boolean> _function = new Function1<Person,Boolean>() {
        public Boolean apply(final Person other) {
          int _age = other.getAge();
          int _age_1 = p.getAge();
          boolean _greaterThan = (_age > _age_1);
          return _greaterThan;
        }
      };
    return _function;
  }
  
  public Function1<Person,Boolean> underAge() {
    final Function1<Person,Boolean> _function = new Function1<Person,Boolean>() {
        public Boolean apply(final Person p) {
          int _age = p.getAge();
          boolean _lessThan = (_age < 18);
          return _lessThan;
        }
      };
    return _function;
  }
  
  public <T extends Object> Boolean should_be(final T obj, final Function1<T,Boolean> func) {
    Boolean _apply = func.apply(obj);
    return _apply;
  }
}
