package org.jnario.jnario.documentation;

import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.jnario.documentation._20FactsAboutXtendSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * A great thing about Xtend is that it enables a more functional programming style,
 * with its native support for anonymous functions, the so called lambda expressions,
 * and its rich library of extension methods.
 */
@SuppressWarnings("all")
@Named("Functional Programming FTW")
@RunWith(ExampleGroupRunner.class)
public class _20FactsAboutXtendFunctionalProgrammingFTWSpec extends _20FactsAboutXtendSpec {
  /**
   * Xtend provides a rich set of extension methods for collections. Accessing elements
   * in lists.
   */
  @Test
  @Named("Simple access to list elements")
  @Order(14)
  public void _simpleAccessToListElements() throws Exception {
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
  @Named("\\\'+\\\' concatenates collections")
  @Order(15)
  public void _concatenatesCollections() throws Exception {
    List<Integer> _list = JnarioCollectionLiterals.<Integer>list(Integer.valueOf(1), Integer.valueOf(2));
    List<Integer> _list_1 = JnarioCollectionLiterals.<Integer>list(Integer.valueOf(3), Integer.valueOf(4));
    Iterable<Integer> _plus = Iterables.<Integer>concat(_list, _list_1);
    Iterable<Integer> _iterable = this.<Integer>iterable(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4));
    boolean _doubleArrow = this.<Integer>operator_doubleArrow(_plus, _iterable);
    Assert.assertTrue("\nExpected list(1, 2) + list(3, 4) => iterable(1, 2, 3, 4) but"
     + "\n     list(1, 2) + list(3, 4) is " + new StringDescription().appendValue(_plus).toString()
     + "\n     list(1, 2) is " + new StringDescription().appendValue(_list).toString()
     + "\n     list(3, 4) is " + new StringDescription().appendValue(_list_1).toString()
     + "\n     iterable(1, 2, 3, 4) is " + new StringDescription().appendValue(_iterable).toString() + "\n", _doubleArrow);
    
  }
  
  /**
   * Xtend has great support for lambda expressions. You can
   * declare an anonymous function by surrounding the lambda
   * expression by square brackets:
   * 
   * <pre class="prettyprint lang-spec">
   * var lambda = [String s | s.length]
   * </pre>
   * 
   * The parameter type can be omitted if the type can be coerced from
   * the expression on the left-hand side:
   * 
   * <pre class="prettyprint lang-spec">
   * var (String)=>int lambda = [s | s.length]
   * </pre>
   * 
   * Single parameter functions don't need a parameter declaration and the
   * parameter can be accessed via the implicit variable 'it':
   * 
   * <pre class="prettyprint lang-spec">
   * var (String)=>int lambda = [it.length]
   * </pre>
   * 
   * ...and we can even completely remove the 'it' variable:
   */
  @Test
  @Named("Concise Lambda Expressions")
  @Order(16)
  public void _conciseLambdaExpressions() throws Exception {
    final Function1<String,Integer> _function = new Function1<String,Integer>() {
        public Integer apply(final String it) {
          int _length = it.length();
          return Integer.valueOf(_length);
        }
      };
    Function1<? super String,? extends Integer> lambda = _function;
    Integer _apply = lambda.apply("hello");
    boolean _doubleArrow = Should.operator_doubleArrow(_apply, Integer.valueOf(5));
    Assert.assertTrue("\nExpected lambda.apply(\"hello\") => 5 but"
     + "\n     lambda.apply(\"hello\") is " + new StringDescription().appendValue(_apply).toString()
     + "\n     lambda is " + new StringDescription().appendValue(lambda).toString() + "\n", _doubleArrow);
    
  }
  
  /**
   * Lambda expressions are especially useful when working with
   * collections. For example, when performing the same assertion on each element
   * in a collection, the implicit `forEach` extension method is a lot more readable than
   * a loop:
   */
  @Test
  @Named("Better loops")
  @Order(17)
  public void _betterLoops() throws Exception {
    List<Integer> _list = JnarioCollectionLiterals.<Integer>list(Integer.valueOf(11), Integer.valueOf(17), Integer.valueOf(19));
    final Procedure1<Integer> _function = new Procedure1<Integer>() {
        public void apply(final Integer it) {
          boolean _greaterThan = ((it).intValue() > 10);
          Assert.assertTrue("\nExpected it > 10 but"
           + "\n     it is " + new StringDescription().appendValue((it).intValue()).toString() + "\n", _greaterThan);
          
        }
      };
    IterableExtensions.<Integer>forEach(_list, _function);
  }
  
  /**
   * The `filter` extension method is really helpful when you are only interested
   * in a subset of a collection. You can filter by type:
   */
  @Test
  @Named("Filter iterables by type")
  @Order(18)
  public void _filterIterablesByType() throws Exception {
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
  @Order(19)
  public void _orViaACustomPredicate() throws Exception {
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
   * reusing existing functions with lambda expressions. Here we are counting
   * all characters in a list of Strings using the `map` and `reduce` extension methods.
   */
  @Test
  @Named("Map/Reduce made easy")
  @Order(20)
  public void _mapReduceMadeEasy() throws Exception {
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
