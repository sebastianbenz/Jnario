package org.jnario.jnario.documentation;

import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.hamcrest.StringDescription;
import org.jnario.jnario.documentation._21FactsAboutXtendSpec;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Functional programming FTW")
public class _21FactsAboutXtendFunctionalProgrammingFTWSpec extends _21FactsAboutXtendSpec {
  @Test
  @Named("Closures are great")
  @Order(99)
  public void closuresAreGreat() throws Exception {
    Function1<? super String,? extends String> shout = null;
    final Function1<String,String> _function = new Function1<String,String>() {
        public String apply(final String s) {
          String _upperCase = s.toUpperCase();
          return _upperCase;
        }
      };
    shout = _function;
    final Function1<String,String> _function_1 = new Function1<String,String>() {
        public String apply(final String it) {
          String _upperCase = it.toUpperCase();
          return _upperCase;
        }
      };
    shout = _function_1;
    final Function1<String,String> _function_2 = new Function1<String,String>() {
        public String apply(final String it) {
          String _upperCase = it.toUpperCase();
          return _upperCase;
        }
      };
    shout = _function_2;
    String _apply = shout.apply("hello");
    boolean _doubleArrow = Should.operator_doubleArrow(_apply, "HELLO");
    Assert.assertTrue("\nExpected shout.apply(\"hello\") => \"HELLO\" but"
     + "\n     shout.apply(\"hello\") is " + new StringDescription().appendValue(_apply).toString()
     + "\n     shout is " + new StringDescription().appendValue(shout).toString() + "\n", _doubleArrow);
    
  }
  
  /**
   * Accessing elements in lists.
   */
  @Test
  @Named("Heads or tails")
  @Order(99)
  public void headsOrTails() throws Exception {
    final List<String> colors = JnarioCollectionLiterals.<String>list("red", "blue", "green");
    String _head = IterableExtensions.<String>head(colors);
    boolean _doubleArrow = Should.operator_doubleArrow(_head, "red");
    Assert.assertTrue("\nExpected colors.head => \"red\" but"
     + "\n     colors.head is " + new StringDescription().appendValue(_head).toString()
     + "\n     colors is " + new StringDescription().appendValue(colors).toString() + "\n", _doubleArrow);
    
    Iterable<String> _tail = IterableExtensions.<String>tail(colors);
    Iterable<String> _iterable = this.<String>iterable("blue", "green");
    boolean _doubleArrow_1 = this.<String>operator_doubleArrow(_tail, _iterable);
    Assert.assertTrue("\nExpected colors.tail => iterable(\"blue\", \"green\") but"
     + "\n     colors.tail is " + new StringDescription().appendValue(_tail).toString()
     + "\n     colors is " + new StringDescription().appendValue(colors).toString()
     + "\n     iterable(\"blue\", \"green\") is " + new StringDescription().appendValue(_iterable).toString() + "\n", _doubleArrow_1);
    
    String _last = IterableExtensions.<String>last(colors);
    boolean _doubleArrow_2 = Should.operator_doubleArrow(_last, "green");
    Assert.assertTrue("\nExpected colors.last => \"green\" but"
     + "\n     colors.last is " + new StringDescription().appendValue(_last).toString()
     + "\n     colors is " + new StringDescription().appendValue(colors).toString() + "\n", _doubleArrow_2);
    
    boolean _isEmpty = colors.isEmpty();
    boolean _doubleArrow_3 = Should.operator_doubleArrow(Boolean.valueOf(_isEmpty), Boolean.valueOf(false));
    Assert.assertTrue("\nExpected colors.empty => false but"
     + "\n     colors.empty is " + new StringDescription().appendValue(Boolean.valueOf(_isEmpty)).toString()
     + "\n     colors is " + new StringDescription().appendValue(colors).toString() + "\n", _doubleArrow_3);
    
  }
  
  @Test
  @Named("Filtering by type")
  @Order(99)
  public void filteringByType() throws Exception {
    List<Object> _list = JnarioCollectionLiterals.<Object>list("a string", Integer.valueOf(42), Boolean.valueOf(true));
    Iterable<String> _filter = Iterables.<String>filter(_list, String.class);
    Iterable<String> _iterable = this.<String>iterable("a string");
    boolean _doubleArrow = this.<String>operator_doubleArrow(_filter, _iterable);
    Assert.assertTrue("\nExpected list(\"a string\", 42, true).filter(typeof(String)) => iterable(\"a string\") but"
     + "\n     list(\"a string\", 42, true).filter(typeof(String)) is " + new StringDescription().appendValue(_filter).toString()
     + "\n     list(\"a string\", 42, true) is " + new StringDescription().appendValue(_list).toString()
     + "\n     iterable(\"a string\") is " + new StringDescription().appendValue(_iterable).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("Filtering with predicates")
  @Order(99)
  public void filteringWithPredicates() throws Exception {
    List<String> _list = JnarioCollectionLiterals.<String>list("red", "blue", "green");
    final Function1<String,Boolean> _function = new Function1<String,Boolean>() {
        public Boolean apply(final String it) {
          boolean _startsWith = it.startsWith("b");
          return Boolean.valueOf(_startsWith);
        }
      };
    Iterable<String> _filter = IterableExtensions.<String>filter(_list, _function);
    List<String> _list_1 = JnarioCollectionLiterals.<String>list("blue");
    boolean _doubleArrow = this.<String>operator_doubleArrow(_filter, _list_1);
    Assert.assertTrue("\nExpected list(\"red\", \"blue\", \"green\").filter[startsWith(\"b\")] => list(\"blue\") but"
     + "\n     list(\"red\", \"blue\", \"green\").filter[startsWith(\"b\")] is " + new StringDescription().appendValue(_filter).toString()
     + "\n     list(\"red\", \"blue\", \"green\") is " + new StringDescription().appendValue(_list).toString()
     + "\n     list(\"blue\") is " + new StringDescription().appendValue(_list_1).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("Map & Reduce")
  @Order(99)
  public void mapReduce() throws Exception {
    List<String> _list = JnarioCollectionLiterals.<String>list("red", "blue", "green");
    final Function1<String,String> _function = new Function1<String,String>() {
        public String apply(final String it) {
          String _upperCase = it.toUpperCase();
          return _upperCase;
        }
      };
    List<String> _map = ListExtensions.<String, String>map(_list, _function);
    List<String> _list_1 = JnarioCollectionLiterals.<String>list("RED", "BLUE", "GREEN");
    boolean _doubleArrow = this.<String>operator_doubleArrow(_map, _list_1);
    Assert.assertTrue("\nExpected list(\"red\", \"blue\", \"green\").map[toUpperCase] => list(\"RED\", \"BLUE\", \"GREEN\") but"
     + "\n     list(\"red\", \"blue\", \"green\").map[toUpperCase] is " + new StringDescription().appendValue(_map).toString()
     + "\n     list(\"red\", \"blue\", \"green\") is " + new StringDescription().appendValue(_list).toString()
     + "\n     list(\"RED\", \"BLUE\", \"GREEN\") is " + new StringDescription().appendValue(_list_1).toString() + "\n", _doubleArrow);
    
    List<Integer> _list_2 = JnarioCollectionLiterals.<Integer>list(Integer.valueOf(5), Integer.valueOf(3), Integer.valueOf(1));
    final Function2<Integer,Integer,Integer> _function_1 = new Function2<Integer,Integer,Integer>() {
        public Integer apply(final Integer result, final Integer element) {
          int _plus = ((result).intValue() + (element).intValue());
          return Integer.valueOf(_plus);
        }
      };
    Integer _reduce = IterableExtensions.<Integer>reduce(_list_2, _function_1);
    boolean _doubleArrow_1 = Should.operator_doubleArrow(_reduce, Integer.valueOf(9));
    Assert.assertTrue("\nExpected list(5, 3, 1).reduce[result, element | result + element] => 9 but"
     + "\n     list(5, 3, 1).reduce[result, element | result + element] is " + new StringDescription().appendValue(_reduce).toString()
     + "\n     list(5, 3, 1) is " + new StringDescription().appendValue(_list_2).toString() + "\n", _doubleArrow_1);
    
  }
  
  @Test
  @Named("Flatten collections")
  @Order(99)
  public void flattenCollections() throws Exception {
    List<String> _list = JnarioCollectionLiterals.<String>list("red", "blue");
    List<String> _list_1 = JnarioCollectionLiterals.<String>list("yellow", "green");
    List<List<String>> _list_2 = JnarioCollectionLiterals.<List<String>>list(_list, _list_1);
    Iterable<String> _flatten = Iterables.<String>concat(_list_2);
    Iterable<String> _iterable = this.<String>iterable("red", "blue", "yellow", "green");
    boolean _doubleArrow = this.<String>operator_doubleArrow(_flatten, _iterable);
    Assert.assertTrue("\nExpected list(list(\"red\", \"blue\"), list(\"yellow\", \"green\")).flatten => iterable(\"red\", \"blue\", \"yellow\", \"green\") but"
     + "\n     list(list(\"red\", \"blue\"), list(\"yellow\", \"green\")).flatten is " + new StringDescription().appendValue(_flatten).toString()
     + "\n     list(list(\"red\", \"blue\"), list(\"yellow\", \"green\")) is " + new StringDescription().appendValue(_list_2).toString()
     + "\n     list(\"red\", \"blue\") is " + new StringDescription().appendValue(_list).toString()
     + "\n     list(\"yellow\", \"green\") is " + new StringDescription().appendValue(_list_1).toString()
     + "\n     iterable(\"red\", \"blue\", \"yellow\", \"green\") is " + new StringDescription().appendValue(_iterable).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("Concatenating collections")
  @Order(99)
  public void concatenatingCollections() throws Exception {
    List<String> _list = JnarioCollectionLiterals.<String>list("red", "blue");
    List<String> _list_1 = JnarioCollectionLiterals.<String>list("yellow", "green");
    Iterable<String> _plus = Iterables.<String>concat(_list, _list_1);
    Iterable<String> _iterable = this.<String>iterable("red", "blue", "yellow", "green");
    boolean _doubleArrow = this.<String>operator_doubleArrow(_plus, _iterable);
    Assert.assertTrue("\nExpected list(\"red\", \"blue\") + list(\"yellow\", \"green\") => iterable(\"red\", \"blue\", \"yellow\", \"green\") but"
     + "\n     list(\"red\", \"blue\") + list(\"yellow\", \"green\") is " + new StringDescription().appendValue(_plus).toString()
     + "\n     list(\"red\", \"blue\") is " + new StringDescription().appendValue(_list).toString()
     + "\n     list(\"yellow\", \"green\") is " + new StringDescription().appendValue(_list_1).toString()
     + "\n     iterable(\"red\", \"blue\", \"yellow\", \"green\") is " + new StringDescription().appendValue(_iterable).toString() + "\n", _doubleArrow);
    
  }
}
