package demo;

import demo.TablesSpecAdditions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Tables")
public class TablesSpec {
  @Before
  public void _initTablesSpecAdditions() {
    additions = ExampleTable.create("additions", 
      java.util.Arrays.asList("a", "b", "sum"), 
      new TablesSpecAdditions(  java.util.Arrays.asList("1", "2", "3"), 1, 2, 3),
      new TablesSpecAdditions(  java.util.Arrays.asList("4", "5", "9"), 4, 5, 9),
      new TablesSpecAdditions(  java.util.Arrays.asList("10", "11", "20"), 10, 11, 20),
      new TablesSpecAdditions(  java.util.Arrays.asList("21", "21", "42"), 21, 21, 42)
    );
  }
  
  protected ExampleTable<TablesSpecAdditions> additions;
  
  @Test
  @Named("additions.forEach[ a + b => sum ]")
  @Order(99)
  public void _additionsForEachABSum() throws Exception {
    final Procedure1<TablesSpecAdditions> _function = new Procedure1<TablesSpecAdditions>() {
        public void apply(final TablesSpecAdditions it) {
          int _plus = (it.a + it.b);
          boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_plus), Integer.valueOf(it.sum));
          Assert.assertTrue("\nExpected a + b => sum but"
           + "\n     a + b is " + new StringDescription().appendValue(Integer.valueOf(_plus)).toString()
           + "\n     a is " + new StringDescription().appendValue(it.a).toString()
           + "\n     b is " + new StringDescription().appendValue(it.b).toString()
           + "\n     sum is " + new StringDescription().appendValue(Integer.valueOf(it.sum)).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<TablesSpecAdditions>forEach(this.additions, _function);
  }
}
