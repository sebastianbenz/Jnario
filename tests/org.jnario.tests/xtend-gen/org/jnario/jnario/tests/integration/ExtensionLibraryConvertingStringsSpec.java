package org.jnario.jnario.tests.integration;

import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.hamcrest.StringDescription;
import org.jnario.jnario.tests.integration.ExtensionLibrarySpec;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.lib.StringConversions;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Arguments passed in from step definitions in Jnario Features
 * are always of type string. These extension methods simplify
 * converting these string parameters into other types or representations.
 */
@SuppressWarnings("all")
@Named("Converting Strings")
@RunWith(ExampleGroupRunner.class)
public class ExtensionLibraryConvertingStringsSpec extends ExtensionLibrarySpec {
  /**
   * Converting strings to other primitive types.
   */
  @Test
  @Named("Converting Strings to Primitives")
  @Order(6)
  public void _convertingStringsToPrimitives() throws Exception {
    boolean _bool = StringConversions.toBool("true");
    boolean _doubleArrow = Should.operator_doubleArrow(Boolean.valueOf(_bool), Boolean.valueOf(true));
    Assert.assertTrue("\nExpected \"true\".toBool  => true but"
     + "\n     \"true\".toBool is " + new StringDescription().appendValue(Boolean.valueOf(_bool)).toString() + "\n", _doubleArrow);
    
    int _int = StringConversions.toInt("5");
    boolean _doubleArrow_1 = Should.operator_doubleArrow(Integer.valueOf(_int), Integer.valueOf(5));
    Assert.assertTrue("\nExpected \"5\".toInt      => 5 but"
     + "\n     \"5\".toInt is " + new StringDescription().appendValue(Integer.valueOf(_int)).toString() + "\n", _doubleArrow_1);
    
    double _double = StringConversions.toDouble("5.5");
    boolean _doubleArrow_2 = Should.operator_doubleArrow(Double.valueOf(_double), Double.valueOf(5.5));
    Assert.assertTrue("\nExpected \"5.5\".toDouble => 5.5 but"
     + "\n     \"5.5\".toDouble is " + new StringDescription().appendValue(Double.valueOf(_double)).toString() + "\n", _doubleArrow_2);
    
    long _long = StringConversions.toLong("5");
    boolean _doubleArrow_3 = Should.operator_doubleArrow(Long.valueOf(_long), Long.valueOf(5l));
    Assert.assertTrue("\nExpected \"5\".toLong     => 5l but"
     + "\n     \"5\".toLong is " + new StringDescription().appendValue(Long.valueOf(_long)).toString() + "\n", _doubleArrow_3);
    
  }
  
  /**
   * Converting comma separated value strings into a list of strings.
   */
  @Test
  @Named("Converting Strings to Lists")
  @Order(7)
  public void _convertingStringsToLists() throws Exception {
    List<String> _list = StringConversions.toList("1,2,3");
    List<String> _list_1 = JnarioCollectionLiterals.<String>list("1", "2", "3");
    boolean _doubleArrow = Should.operator_doubleArrow(_list, _list_1);
    Assert.assertTrue("\nExpected \"1,2,3\".toList              => list(\"1\", \"2\", \"3\") but"
     + "\n     \"1,2,3\".toList is " + new StringDescription().appendValue(_list).toString()
     + "\n     list(\"1\", \"2\", \"3\") is " + new StringDescription().appendValue(_list_1).toString() + "\n", _doubleArrow);
    
    List<String> _list_2 = StringConversions.toList("1, 2, 3");
    List<String> _list_3 = JnarioCollectionLiterals.<String>list("1", "2", "3");
    boolean _doubleArrow_1 = Should.operator_doubleArrow(_list_2, _list_3);
    Assert.assertTrue("\nExpected \"1, 2, 3\".toList            => list(\"1\", \"2\", \"3\") but"
     + "\n     \"1, 2, 3\".toList is " + new StringDescription().appendValue(_list_2).toString()
     + "\n     list(\"1\", \"2\", \"3\") is " + new StringDescription().appendValue(_list_3).toString() + "\n", _doubleArrow_1);
    
    List<String> _list_4 = StringConversions.toList("1, 2, 3");
    final Function1<String,Integer> _function = new Function1<String,Integer>() {
        public Integer apply(final String it) {
          int _int = StringConversions.toInt(it);
          return Integer.valueOf(_int);
        }
      };
    List<Integer> _map = ListExtensions.<String, Integer>map(_list_4, _function);
    List<Integer> _list_5 = JnarioCollectionLiterals.<Integer>list(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3));
    boolean _doubleArrow_2 = Should.operator_doubleArrow(_map, _list_5);
    Assert.assertTrue("\nExpected \"1, 2, 3\".toList.map[toInt] => list(1, 2, 3) but"
     + "\n     \"1, 2, 3\".toList.map[toInt] is " + new StringDescription().appendValue(_map).toString()
     + "\n     \"1, 2, 3\".toList is " + new StringDescription().appendValue(_list_4).toString()
     + "\n     list(1, 2, 3) is " + new StringDescription().appendValue(_list_5).toString() + "\n", _doubleArrow_2);
    
  }
}
