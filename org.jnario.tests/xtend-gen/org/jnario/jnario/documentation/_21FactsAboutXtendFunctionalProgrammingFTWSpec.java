package org.jnario.jnario.documentation;

import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
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
@Named("Functional Programming FTW")
public class _21FactsAboutXtendFunctionalProgrammingFTWSpec extends _21FactsAboutXtendSpec {
  /**
   * Accessing elements in lists.
   */
  @Test
  @Named("Simple access to list elements")
  @Order(99)
  public void simpleAccessToListElements() throws Exception {
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
  
  /**
   * Here is another useful fact about Xtend, you can concatenate collections
   * using the `+` operator.
   */
  @Test
  @Named("Concatenate collections with +")
  @Order(99)
  public void concatenateCollectionsWith() throws Exception {
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
  
  @Test
  @Named("Concise Lambda Expressions")
  @Order(99)
  public void conciseLambdaExpressions() throws Exception {
    Function1<? super String,? extends String> shout = null;
    final Function1<String,String> _function = new Function1<String,String>() {
        public String apply(final String s) {
          String _upperCase = s.toUpperCase();
          return _upperCase;
        }
      };
    shout = _function;
    final Function1<String,String> _function_1 = new Function1<String,String>() {
        public String apply(final String s) {
          String _upperCase = s.toUpperCase();
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
    final Function1<String,String> _function_3 = new Function1<String,String>() {
        public String apply(final String it) {
          String _upperCase = it.toUpperCase();
          return _upperCase;
        }
      };
    shout = _function_3;
    String _apply = shout.apply("hello");
    boolean _doubleArrow = Should.operator_doubleArrow(_apply, "HELLO");
    Assert.assertTrue("\nExpected // apply the function to an object\n      shout.apply(\"hello\") => \"HELLO\" but"
     + "\n     // apply the function to an object\n      shout.apply(\"hello\") is " + new StringDescription().appendValue(_apply).toString()
     + "\n     // apply the function to an object\n      shout is " + new StringDescription().appendValue(shout).toString() + "\n", _doubleArrow);
    
  }
  
  /**
   * Lambda expressions are especially useful when working with
   * collections. For example, when applying side effects from a collection
   * it is often better to use the implicit `forEach` extension method
   * instead of a loop:
   */
  @Test
  @Named("Better loops")
  @Order(99)
  public void betterLoops() throws Exception {
    List<String> _list = JnarioCollectionLiterals.<String>list("red", "blue", "green");
    final Procedure1<String> _function = new Procedure1<String>() {
        public void apply(final String it) {
          InputOutput.println();
        }
      };
    IterableExtensions.<String>forEach(_list, _function);
  }
  
  /**
   * The `filter` extension method is really helpful when you are only interested
   * in a subset of a collection. You can filter by type:
   */
  @Test
  @Named("Filter iterables by type")
  @Order(99)
  public void filterIterablesByType() throws Exception {
    List<Object> _list = JnarioCollectionLiterals.<Object>list("a string", Integer.valueOf(42), Boolean.valueOf(true));
    Iterable<String> _filter = Iterables.<String>filter(_list, String.class);
    Iterable<String> _iterable = this.<String>iterable("a string");
    boolean _doubleArrow = this.<String>operator_doubleArrow(_filter, _iterable);
    Assert.assertTrue("\nExpected list(\"a string\", 42, true).filter(typeof(String)) => iterable(\"a string\") but"
     + "\n     list(\"a string\", 42, true).filter(typeof(String)) is " + new StringDescription().appendValue(_filter).toString()
     + "\n     list(\"a string\", 42, true) is " + new StringDescription().appendValue(_list).toString()
     + "\n     iterable(\"a string\") is " + new StringDescription().appendValue(_iterable).toString() + "\n", _doubleArrow);
    
  }
  
  /**
   * In this case we provide a lambda expressions that returns true for the
   * elements we are interested in:
   */
  @Test
  @Named("... or via a custom predicate")
  @Order(99)
  public void orViaACustomPredicate() throws Exception {
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
  
  /**
   * This examples demonstrates how you can realize complex operations by
   * composing different functions. Here we are counting all characters in a list of Strings using the
   * `map` and `reduce` extension methods.
   */
  @Test
  @Named("Map/Reduce made easy")
  @Order(99)
  public void mapReduceMadeEasy() throws Exception {
    final List<String> strings = JnarioCollectionLiterals.<String>list("red", "blue", "green");
    final Function1<String,Integer> _function = new Function1<String,Integer>() {
        public Integer apply(final String s) {
          int _length = s.length();
          return Integer.valueOf(_length);
        }
      };
    List<Integer> _map = ListExtensions.<String, Integer>map(strings, _function);
    final Function2<Integer,Integer,Integer> _function_1 = new Function2<Integer,Integer,Integer>() {
        public Integer apply(final Integer sum, final Integer size) {
          int _plus = ((sum).intValue() + (size).intValue());
          return Integer.valueOf(_plus);
        }
      };
    final Integer charCount = IterableExtensions.<Integer>reduce(_map, _function_1);
    boolean _doubleArrow = Should.operator_doubleArrow(charCount, Integer.valueOf(12));
    Assert.assertTrue("\nExpected charCount => 12 but"
     + "\n     charCount is " + new StringDescription().appendValue(charCount).toString() + "\n", _doubleArrow);
    
  }
}
