package org.jnario.jnario.tests.integration;

import java.util.Iterator;
import java.util.List;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.hamcrest.StringDescription;
import org.jnario.jnario.tests.integration.ExtensionLibrarySpec;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.JnarioIteratorExtensions;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Another common use case when writing specs is to access specific
 * elements collections, iterables or iterators. Jnario provides helper
 * methods to simplify accessing elements by index.
 */
@SuppressWarnings("all")
@Named("Iterable & Iterator Helpers")
@RunWith(ExampleGroupRunner.class)
public class ExtensionLibraryIterableIteratorHelpersSpec extends ExtensionLibrarySpec {
  /**
   * Accessing elements in iterables by index or type.
   * These extensions work also with lists and other collections.
   */
  @Test
  @Named("Iterables")
  @Order(4)
  public void _iterables() throws Exception {
    final List<Integer> values = JnarioCollectionLiterals.<Integer>list(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5));
    Integer _first = JnarioIterableExtensions.<Integer>first(values);
    boolean _doubleArrow = Should.operator_doubleArrow(_first, Integer.valueOf(1));
    Assert.assertTrue("\nExpected values.first  => 1 but"
     + "\n     values.first is " + new StringDescription().appendValue(_first).toString()
     + "\n     values is " + new StringDescription().appendValue(values).toString() + "\n", _doubleArrow);
    
    Integer _last = IterableExtensions.<Integer>last(values);
    boolean _doubleArrow_1 = Should.operator_doubleArrow(_last, Integer.valueOf(5));
    Assert.assertTrue("\nExpected values.last   => 5 but"
     + "\n     values.last is " + new StringDescription().appendValue(_last).toString()
     + "\n     values is " + new StringDescription().appendValue(values).toString() + "\n", _doubleArrow_1);
    
    Integer _second = JnarioIterableExtensions.<Integer>second(values);
    boolean _doubleArrow_2 = Should.operator_doubleArrow(_second, Integer.valueOf(2));
    Assert.assertTrue("\nExpected values.second => 2 but"
     + "\n     values.second is " + new StringDescription().appendValue(_second).toString()
     + "\n     values is " + new StringDescription().appendValue(values).toString() + "\n", _doubleArrow_2);
    
    Integer _third = JnarioIterableExtensions.<Integer>third(values);
    boolean _doubleArrow_3 = Should.operator_doubleArrow(_third, Integer.valueOf(3));
    Assert.assertTrue("\nExpected values.third  => 3 but"
     + "\n     values.third is " + new StringDescription().appendValue(_third).toString()
     + "\n     values is " + new StringDescription().appendValue(values).toString() + "\n", _doubleArrow_3);
    
    Integer _forth = JnarioIterableExtensions.<Integer>forth(values);
    boolean _doubleArrow_4 = Should.operator_doubleArrow(_forth, Integer.valueOf(4));
    Assert.assertTrue("\nExpected values.forth  => 4 but"
     + "\n     values.forth is " + new StringDescription().appendValue(_forth).toString()
     + "\n     values is " + new StringDescription().appendValue(values).toString() + "\n", _doubleArrow_4);
    
    Integer _fifth = JnarioIterableExtensions.<Integer>fifth(values);
    boolean _doubleArrow_5 = Should.operator_doubleArrow(_fifth, Integer.valueOf(5));
    Assert.assertTrue("\nExpected values.fifth  => 5 but"
     + "\n     values.fifth is " + new StringDescription().appendValue(_fifth).toString()
     + "\n     values is " + new StringDescription().appendValue(values).toString() + "\n", _doubleArrow_5);
    
    Integer _get = values.get(3);
    boolean _doubleArrow_6 = Should.operator_doubleArrow(_get, Integer.valueOf(4));
    Assert.assertTrue("\nExpected values.get(3) => 4 but"
     + "\n     values.get(3) is " + new StringDescription().appendValue(_get).toString()
     + "\n     values is " + new StringDescription().appendValue(values).toString() + "\n", _doubleArrow_6);
    
    final List<Object> objects = JnarioCollectionLiterals.<Object>list(Integer.valueOf(1), "string", Boolean.valueOf(true), "other string");
    String _first_1 = JnarioIterableExtensions.<String>first(objects, String.class);
    boolean _doubleArrow_7 = Should.operator_doubleArrow(_first_1, "string");
    Assert.assertTrue("\nExpected objects.first(typeof(String))  => \"string\" but"
     + "\n     objects.first(typeof(String)) is " + new StringDescription().appendValue(_first_1).toString()
     + "\n     objects is " + new StringDescription().appendValue(objects).toString() + "\n", _doubleArrow_7);
    
    String _second_1 = JnarioIterableExtensions.<String>second(objects, String.class);
    boolean _doubleArrow_8 = Should.operator_doubleArrow(_second_1, "other string");
    Assert.assertTrue("\nExpected objects.second(typeof(String)) => \"other string\" but"
     + "\n     objects.second(typeof(String)) is " + new StringDescription().appendValue(_second_1).toString()
     + "\n     objects is " + new StringDescription().appendValue(objects).toString() + "\n", _doubleArrow_8);
    
  }
  
  /**
   * These methods work also for iterators. Note
   * that calling one of these methods will consume
   * the iterator to the position of the returned element.
   */
  @Test
  @Named("Iterators")
  @Order(5)
  public void _iterators() throws Exception {
    final List<Integer> values = JnarioCollectionLiterals.<Integer>list(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5));
    Iterator<Integer> _iterator = values.iterator();
    Integer _first = JnarioIteratorExtensions.<Integer>first(_iterator);
    boolean _doubleArrow = Should.operator_doubleArrow(_first, Integer.valueOf(1));
    Assert.assertTrue("\nExpected values.iterator.first  => 1 but"
     + "\n     values.iterator.first is " + new StringDescription().appendValue(_first).toString()
     + "\n     values.iterator is " + new StringDescription().appendValue(_iterator).toString()
     + "\n     values is " + new StringDescription().appendValue(values).toString() + "\n", _doubleArrow);
    
    Iterator<Integer> _iterator_1 = values.iterator();
    Integer _last = IteratorExtensions.<Integer>last(_iterator_1);
    boolean _doubleArrow_1 = Should.operator_doubleArrow(_last, Integer.valueOf(5));
    Assert.assertTrue("\nExpected values.iterator.last   => 5 but"
     + "\n     values.iterator.last is " + new StringDescription().appendValue(_last).toString()
     + "\n     values.iterator is " + new StringDescription().appendValue(_iterator_1).toString()
     + "\n     values is " + new StringDescription().appendValue(values).toString() + "\n", _doubleArrow_1);
    
    Iterator<Integer> _iterator_2 = values.iterator();
    Integer _get = JnarioIteratorExtensions.<Integer>get(_iterator_2, 3);
    boolean _doubleArrow_2 = Should.operator_doubleArrow(_get, Integer.valueOf(4));
    Assert.assertTrue("\nExpected values.iterator.get(3) => 4 but"
     + "\n     values.iterator.get(3) is " + new StringDescription().appendValue(_get).toString()
     + "\n     values.iterator is " + new StringDescription().appendValue(_iterator_2).toString()
     + "\n     values is " + new StringDescription().appendValue(values).toString() + "\n", _doubleArrow_2);
    
    Iterator<Integer> _iterator_3 = values.iterator();
    Integer _second = JnarioIteratorExtensions.<Integer>second(_iterator_3);
    boolean _doubleArrow_3 = Should.operator_doubleArrow(_second, Integer.valueOf(2));
    Assert.assertTrue("\nExpected values.iterator.second => 2 but"
     + "\n     values.iterator.second is " + new StringDescription().appendValue(_second).toString()
     + "\n     values.iterator is " + new StringDescription().appendValue(_iterator_3).toString()
     + "\n     values is " + new StringDescription().appendValue(values).toString() + "\n", _doubleArrow_3);
    
    Iterator<Integer> _iterator_4 = values.iterator();
    Integer _third = JnarioIteratorExtensions.<Integer>third(_iterator_4);
    boolean _doubleArrow_4 = Should.operator_doubleArrow(_third, Integer.valueOf(3));
    Assert.assertTrue("\nExpected values.iterator.third  => 3 but"
     + "\n     values.iterator.third is " + new StringDescription().appendValue(_third).toString()
     + "\n     values.iterator is " + new StringDescription().appendValue(_iterator_4).toString()
     + "\n     values is " + new StringDescription().appendValue(values).toString() + "\n", _doubleArrow_4);
    
    Iterator<Integer> _iterator_5 = values.iterator();
    Integer _forth = JnarioIteratorExtensions.<Integer>forth(_iterator_5);
    boolean _doubleArrow_5 = Should.operator_doubleArrow(_forth, Integer.valueOf(4));
    Assert.assertTrue("\nExpected values.iterator.forth  => 4 but"
     + "\n     values.iterator.forth is " + new StringDescription().appendValue(_forth).toString()
     + "\n     values.iterator is " + new StringDescription().appendValue(_iterator_5).toString()
     + "\n     values is " + new StringDescription().appendValue(values).toString() + "\n", _doubleArrow_5);
    
    Iterator<Integer> _iterator_6 = values.iterator();
    Integer _fifth = JnarioIteratorExtensions.<Integer>fifth(_iterator_6);
    boolean _doubleArrow_6 = Should.operator_doubleArrow(_fifth, Integer.valueOf(5));
    Assert.assertTrue("\nExpected values.iterator.fifth  => 5 but"
     + "\n     values.iterator.fifth is " + new StringDescription().appendValue(_fifth).toString()
     + "\n     values.iterator is " + new StringDescription().appendValue(_iterator_6).toString()
     + "\n     values is " + new StringDescription().appendValue(values).toString() + "\n", _doubleArrow_6);
    
    final List<Object> objects = JnarioCollectionLiterals.<Object>list(Integer.valueOf(1), "string", Boolean.valueOf(true), "other string");
    Iterator<Object> _iterator_7 = objects.iterator();
    String _first_1 = JnarioIteratorExtensions.<String>first(_iterator_7, String.class);
    boolean _doubleArrow_7 = Should.operator_doubleArrow(_first_1, "string");
    Assert.assertTrue("\nExpected objects.iterator.first(typeof(String))  => \"string\" but"
     + "\n     objects.iterator.first(typeof(String)) is " + new StringDescription().appendValue(_first_1).toString()
     + "\n     objects.iterator is " + new StringDescription().appendValue(_iterator_7).toString()
     + "\n     objects is " + new StringDescription().appendValue(objects).toString() + "\n", _doubleArrow_7);
    
    Iterator<Object> _iterator_8 = objects.iterator();
    String _second_1 = JnarioIteratorExtensions.<String>second(_iterator_8, String.class);
    boolean _doubleArrow_8 = Should.operator_doubleArrow(_second_1, "other string");
    Assert.assertTrue("\nExpected objects.iterator.second(typeof(String)) => \"other string\" but"
     + "\n     objects.iterator.second(typeof(String)) is " + new StringDescription().appendValue(_second_1).toString()
     + "\n     objects.iterator is " + new StringDescription().appendValue(_iterator_8).toString()
     + "\n     objects is " + new StringDescription().appendValue(objects).toString() + "\n", _doubleArrow_8);
    
  }
}
