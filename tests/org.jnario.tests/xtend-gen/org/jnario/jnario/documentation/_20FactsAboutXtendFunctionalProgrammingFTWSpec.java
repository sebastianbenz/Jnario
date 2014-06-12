/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.documentation;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
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
@Named("Functional Programming FTW")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class _20FactsAboutXtendFunctionalProgrammingFTWSpec extends _20FactsAboutXtendSpec {
  /**
   * Xtend provides a rich set of extension methods for collections. Accessing elements
   * in lists.
   */
  @Test
  @Named("Simple access to list elements")
  @Order(1)
  public void _simpleAccessToListElements() throws Exception {
    final List<String> colors = JnarioCollectionLiterals.<String>list("red", "blue", "green");
    String _head = IterableExtensions.<String>head(colors);
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_head, "red");
    Assert.assertTrue("\nExpected colors.head => \"red\" but"
     + "\n     colors.head is " + new org.hamcrest.StringDescription().appendValue(_head).toString()
     + "\n     colors is " + new org.hamcrest.StringDescription().appendValue(colors).toString() + "\n", _doubleArrow);
    
    Iterable<String> _tail = IterableExtensions.<String>tail(colors);
    boolean _doubleArrow_1 = this.<String>operator_doubleArrow(_tail, Collections.<String>unmodifiableList(Lists.<String>newArrayList("blue", "green")));
    Assert.assertTrue("\nExpected colors.tail => #[\"blue\", \"green\"] but"
     + "\n     colors.tail is " + new org.hamcrest.StringDescription().appendValue(_tail).toString()
     + "\n     colors is " + new org.hamcrest.StringDescription().appendValue(colors).toString()
     + "\n     #[\"blue\", \"green\"] is " + new org.hamcrest.StringDescription().appendValue(Collections.<String>unmodifiableList(Lists.<String>newArrayList("blue", "green"))).toString() + "\n", _doubleArrow_1);
    
    String _last = IterableExtensions.<String>last(colors);
    boolean _doubleArrow_2 = Should.<String>operator_doubleArrow(_last, "green");
    Assert.assertTrue("\nExpected colors.last => \"green\" but"
     + "\n     colors.last is " + new org.hamcrest.StringDescription().appendValue(_last).toString()
     + "\n     colors is " + new org.hamcrest.StringDescription().appendValue(colors).toString() + "\n", _doubleArrow_2);
    
    boolean _isEmpty = colors.isEmpty();
    Assert.assertTrue("\nExpected colors.empty => false but"
     + "\n     colors.empty is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_isEmpty)).toString()
     + "\n     colors is " + new org.hamcrest.StringDescription().appendValue(colors).toString() + "\n", Should.<Boolean>operator_doubleArrow(Boolean.valueOf(_isEmpty), false));
    
  }
  
  /**
   * Here is another useful fact about Xtend, you can concatenate collections
   * using the `+` operator.
   */
  @Test
  @Named("\\\'+\\\' concatenates collections")
  @Order(2)
  public void _concatenatesCollections() throws Exception {
    List<Integer> _list = JnarioCollectionLiterals.<Integer>list(Integer.valueOf(1), Integer.valueOf(2));
    List<Integer> _list_1 = JnarioCollectionLiterals.<Integer>list(Integer.valueOf(3), Integer.valueOf(4));
    Iterable<Integer> _plus = Iterables.<Integer>concat(_list, _list_1);
    Assert.assertTrue("\nExpected list(1, 2) + list(3, 4) => #[1, 2, 3, 4] but"
     + "\n     list(1, 2) + list(3, 4) is " + new org.hamcrest.StringDescription().appendValue(_plus).toString()
     + "\n     list(1, 2) is " + new org.hamcrest.StringDescription().appendValue(_list).toString()
     + "\n     list(3, 4) is " + new org.hamcrest.StringDescription().appendValue(_list_1).toString()
     + "\n     #[1, 2, 3, 4] is " + new org.hamcrest.StringDescription().appendValue(Collections.<Integer>unmodifiableList(Lists.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4)))).toString() + "\n", this.<Integer>operator_doubleArrow(_plus, Collections.<Integer>unmodifiableList(Lists.<Integer>newArrayList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4)))));
    
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
  @Order(3)
  public void _conciseLambdaExpressions() throws Exception {
    final Function1<String, Integer> _function = new Function1<String, Integer>() {
      public Integer apply(final String it) {
        return Integer.valueOf(it.length());
      }
    };
    Function1<? super String, ? extends Integer> lambda = _function;
    Integer _apply = lambda.apply("hello");
    Assert.assertTrue("\nExpected lambda.apply(\"hello\") => 5 but"
     + "\n     lambda.apply(\"hello\") is " + new org.hamcrest.StringDescription().appendValue(_apply).toString()
     + "\n     lambda is " + new org.hamcrest.StringDescription().appendValue(lambda).toString() + "\n", Should.<Integer>operator_doubleArrow(_apply, Integer.valueOf(5)));
    
  }
  
  /**
   * Lambda expressions are especially useful when working with
   * collections. For example, when performing the same assertion on each element
   * in a collection, the implicit `forEach` extension method is a lot more readable than
   * a loop:
   */
  @Test
  @Named("Better loops")
  @Order(4)
  public void _betterLoops() throws Exception {
    List<Integer> _list = JnarioCollectionLiterals.<Integer>list(Integer.valueOf(11), Integer.valueOf(17), Integer.valueOf(19));
    final Procedure1<Integer> _function = new Procedure1<Integer>() {
      public void apply(final Integer it) {
        Assert.assertTrue("\nExpected it > 10 but"
         + "\n     it is " + new org.hamcrest.StringDescription().appendValue((it).intValue()).toString() + "\n", ((it).intValue() > 10));
        
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
  @Order(5)
  public void _filterIterablesByType() throws Exception {
    List<Object> _list = JnarioCollectionLiterals.<Object>list("a string", Integer.valueOf(42), Boolean.valueOf(true));
    Iterable<String> _filter = Iterables.<String>filter(_list, String.class);
    Assert.assertTrue("\nExpected list(\"a string\", 42, true).filter(typeof(String)) => #[\"a string\"] but"
     + "\n     list(\"a string\", 42, true).filter(typeof(String)) is " + new org.hamcrest.StringDescription().appendValue(_filter).toString()
     + "\n     list(\"a string\", 42, true) is " + new org.hamcrest.StringDescription().appendValue(_list).toString()
     + "\n     #[\"a string\"] is " + new org.hamcrest.StringDescription().appendValue(Collections.<String>unmodifiableList(Lists.<String>newArrayList("a string"))).toString() + "\n", this.<String>operator_doubleArrow(_filter, Collections.<String>unmodifiableList(Lists.<String>newArrayList("a string"))));
    
  }
  
  /**
   * In this case we provide a lambda expressions that returns true for the
   * elements we are interested in:
   */
  @Test
  @Named("... or via a custom predicate")
  @Order(6)
  public void _orViaACustomPredicate() throws Exception {
    List<String> _list = JnarioCollectionLiterals.<String>list("red", "blue", "green");
    final Function1<String, Boolean> _function = new Function1<String, Boolean>() {
      public Boolean apply(final String it) {
        return Boolean.valueOf(it.startsWith("b"));
      }
    };
    Iterable<String> _filter = IterableExtensions.<String>filter(_list, _function);
    List<String> _list_1 = JnarioCollectionLiterals.<String>list("blue");
    Assert.assertTrue("\nExpected list(\"red\", \"blue\", \"green\").filter[startsWith(\"b\")] => list(\"blue\") but"
     + "\n     list(\"red\", \"blue\", \"green\").filter[startsWith(\"b\")] is " + new org.hamcrest.StringDescription().appendValue(_filter).toString()
     + "\n     list(\"red\", \"blue\", \"green\") is " + new org.hamcrest.StringDescription().appendValue(_list).toString()
     + "\n     list(\"blue\") is " + new org.hamcrest.StringDescription().appendValue(_list_1).toString() + "\n", this.<String>operator_doubleArrow(_filter, _list_1));
    
  }
  
  /**
   * This examples demonstrates how you can realize complex operations by
   * reusing existing functions with lambda expressions. Here we are counting
   * all characters in a list of Strings using the `map` and `reduce` extension methods.
   */
  @Test
  @Named("Map/Reduce made easy")
  @Order(7)
  public void _mapReduceMadeEasy() throws Exception {
    final List<String> strings = JnarioCollectionLiterals.<String>list("red", "blue", "green");
    final Function1<String, Integer> _function = new Function1<String, Integer>() {
      public Integer apply(final String s) {
        return Integer.valueOf(s.length());
      }
    };
    List<Integer> _map = ListExtensions.<String, Integer>map(strings, _function);
    final Function2<Integer, Integer, Integer> _function_1 = new Function2<Integer, Integer, Integer>() {
      public Integer apply(final Integer sum, final Integer size) {
        return Integer.valueOf(((sum).intValue() + (size).intValue()));
      }
    };
    final Integer charCount = IterableExtensions.<Integer>reduce(_map, _function_1);
    Assert.assertTrue("\nExpected charCount => 12 but"
     + "\n     charCount is " + new org.hamcrest.StringDescription().appendValue(charCount).toString() + "\n", Should.<Integer>operator_doubleArrow(charCount, Integer.valueOf(12)));
    
  }
}
