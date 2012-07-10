package org.jnario.spec.tests.integration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pair;
import org.hamcrest.StringDescription;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Jnario provides shorter versions of the Xtend standard collection literals.
 */
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Collection Literals")
public class CollectionLiteralsSpec {
  @Test
  @Named("List Literal")
  @Order(99)
  public void listLiteral() throws Exception {
    List<String> _list = JnarioCollectionLiterals.<String>list("green", "red");
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("green", "red");
    boolean _doubleArrow = Should.operator_doubleArrow(_list, _newArrayList);
    Assert.assertTrue("\nExpected list(\"green\", \"red\")             => newArrayList(\"green\", \"red\") but"
     + "\n     list(\"green\", \"red\") is " + new StringDescription().appendValue(_list).toString()
     + "\n     newArrayList(\"green\", \"red\") is " + new StringDescription().appendValue(_newArrayList).toString() + "\n", _doubleArrow);
    
    List<String> _list_1 = JnarioCollectionLiterals.<String>list("green");
    List<String> _list_2 = JnarioCollectionLiterals.<String>list("red");
    List<List<String>> _list_3 = JnarioCollectionLiterals.<List<String>>list(_list_1, _list_2);
    ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList("green");
    ArrayList<String> _newArrayList_2 = CollectionLiterals.<String>newArrayList("red");
    ArrayList<ArrayList<String>> _newArrayList_3 = CollectionLiterals.<ArrayList<String>>newArrayList(_newArrayList_1, _newArrayList_2);
    boolean _doubleArrow_1 = Should.operator_doubleArrow(_list_3, _newArrayList_3);
    Assert.assertTrue("\nExpected list(list(\"green\"), list(\"red\")) => newArrayList(newArrayList(\"green\"), newArrayList(\"red\")) but"
     + "\n     list(list(\"green\"), list(\"red\")) is " + new StringDescription().appendValue(_list_3).toString()
     + "\n     list(\"green\") is " + new StringDescription().appendValue(_list_1).toString()
     + "\n     list(\"red\") is " + new StringDescription().appendValue(_list_2).toString()
     + "\n     newArrayList(newArrayList(\"green\"), newArrayList(\"red\")) is " + new StringDescription().appendValue(_newArrayList_3).toString()
     + "\n     newArrayList(\"green\") is " + new StringDescription().appendValue(_newArrayList_1).toString()
     + "\n     newArrayList(\"red\") is " + new StringDescription().appendValue(_newArrayList_2).toString() + "\n", _doubleArrow_1);
    
  }
  
  @Test
  @Named("Set Literal")
  @Order(99)
  public void setLiteral() throws Exception {
    Set<String> _set = JnarioCollectionLiterals.<String>set("green", "red");
    HashSet<String> _newHashSet = CollectionLiterals.<String>newHashSet("green", "red");
    boolean _doubleArrow = Should.operator_doubleArrow(_set, _newHashSet);
    Assert.assertTrue("\nExpected set(\"green\", \"red\")              => newHashSet(\"green\", \"red\") but"
     + "\n     set(\"green\", \"red\") is " + new StringDescription().appendValue(_set).toString()
     + "\n     newHashSet(\"green\", \"red\") is " + new StringDescription().appendValue(_newHashSet).toString() + "\n", _doubleArrow);
    
    Set<String> _set_1 = JnarioCollectionLiterals.<String>set("green");
    Set<String> _set_2 = JnarioCollectionLiterals.<String>set("red");
    Set<Set<String>> _set_3 = JnarioCollectionLiterals.<Set<String>>set(_set_1, _set_2);
    HashSet<String> _newHashSet_1 = CollectionLiterals.<String>newHashSet("green");
    HashSet<String> _newHashSet_2 = CollectionLiterals.<String>newHashSet("red");
    HashSet<HashSet<String>> _newHashSet_3 = CollectionLiterals.<HashSet<String>>newHashSet(_newHashSet_1, _newHashSet_2);
    boolean _doubleArrow_1 = Should.operator_doubleArrow(_set_3, _newHashSet_3);
    Assert.assertTrue("\nExpected set(set(\"green\"), set(\"red\"))    => newHashSet(newHashSet(\"green\"), newHashSet(\"red\")) but"
     + "\n     set(set(\"green\"), set(\"red\")) is " + new StringDescription().appendValue(_set_3).toString()
     + "\n     set(\"green\") is " + new StringDescription().appendValue(_set_1).toString()
     + "\n     set(\"red\") is " + new StringDescription().appendValue(_set_2).toString()
     + "\n     newHashSet(newHashSet(\"green\"), newHashSet(\"red\")) is " + new StringDescription().appendValue(_newHashSet_3).toString()
     + "\n     newHashSet(\"green\") is " + new StringDescription().appendValue(_newHashSet_1).toString()
     + "\n     newHashSet(\"red\") is " + new StringDescription().appendValue(_newHashSet_2).toString() + "\n", _doubleArrow_1);
    
  }
  
  @Test
  @Named("Map Literal")
  @Order(99)
  public void mapLiteral() throws Exception {
    Pair<String,String> _mappedTo = Pair.<String, String>of("green", "apple");
    Pair<String,String> _mappedTo_1 = Pair.<String, String>of("yellow", "banana");
    Pair<String,String> _mappedTo_2 = Pair.<String, String>of("red", "tomato");
    Map<String,String> _map = JnarioCollectionLiterals.<String, String>map(_mappedTo, _mappedTo_1, _mappedTo_2);
    Pair<String,String> _mappedTo_3 = Pair.<String, String>of("green", "apple");
    Pair<String,String> _mappedTo_4 = Pair.<String, String>of("yellow", "banana");
    Pair<String,String> _mappedTo_5 = Pair.<String, String>of("red", "tomato");
    HashMap<String,String> _newHashMap = CollectionLiterals.<String, String>newHashMap(_mappedTo_3, _mappedTo_4, _mappedTo_5);
    boolean _doubleArrow = Should.operator_doubleArrow(_map, _newHashMap);
    Assert.assertTrue("\nExpected map(\n\t    \"green\"  -> \"apple\",\n\t    \"yellow\" -> \"banana\",\n\t    \"red\"    -> \"tomato\"\n\t  ) => newHashMap(\n\t    \"green\"  -> \"apple\",\n\t    \"yellow\" -> \"banana\",\n\t    \"red\"    -> \"tomato\"\n\t  ) but"
     + "\n     map(\n\t    \"green\"  -> \"apple\",\n\t    \"yellow\" -> \"banana\",\n\t    \"red\"    -> \"tomato\"\n\t  ) is " + new StringDescription().appendValue(_map).toString()
     + "\n     \"green\"  -> \"apple\" is " + new StringDescription().appendValue(_mappedTo).toString()
     + "\n     \"yellow\" -> \"banana\" is " + new StringDescription().appendValue(_mappedTo_1).toString()
     + "\n     \"red\"    -> \"tomato\" is " + new StringDescription().appendValue(_mappedTo_2).toString()
     + "\n     newHashMap(\n\t    \"green\"  -> \"apple\",\n\t    \"yellow\" -> \"banana\",\n\t    \"red\"    -> \"tomato\"\n\t  ) is " + new StringDescription().appendValue(_newHashMap).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("Iterable & Iterator Helpers")
  @Order(99)
  public void iterableIteratorHelpers() throws Exception {
    final List<Integer> values = JnarioCollectionLiterals.<Integer>list(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5));
    Integer _first = JnarioIterableExtensions.<Integer>first(values);
    boolean _doubleArrow = Should.operator_doubleArrow(_first, Integer.valueOf(1));
    Assert.assertTrue("\nExpected values.first  => 1 but"
     + "\n     values.first is " + new StringDescription().appendValue(_first).toString()
     + "\n     values is " + new StringDescription().appendValue(values).toString() + "\n", _doubleArrow);
    
    Integer _second = JnarioIterableExtensions.<Integer>second(values);
    boolean _doubleArrow_1 = Should.operator_doubleArrow(_second, Integer.valueOf(2));
    Assert.assertTrue("\nExpected values.second => 2 but"
     + "\n     values.second is " + new StringDescription().appendValue(_second).toString()
     + "\n     values is " + new StringDescription().appendValue(values).toString() + "\n", _doubleArrow_1);
    
    Integer _third = JnarioIterableExtensions.<Integer>third(values);
    boolean _doubleArrow_2 = Should.operator_doubleArrow(_third, Integer.valueOf(3));
    Assert.assertTrue("\nExpected values.third  => 3 but"
     + "\n     values.third is " + new StringDescription().appendValue(_third).toString()
     + "\n     values is " + new StringDescription().appendValue(values).toString() + "\n", _doubleArrow_2);
    
    Integer _forth = JnarioIterableExtensions.<Integer>forth(values);
    boolean _doubleArrow_3 = Should.operator_doubleArrow(_forth, Integer.valueOf(4));
    Assert.assertTrue("\nExpected values.forth  => 4 but"
     + "\n     values.forth is " + new StringDescription().appendValue(_forth).toString()
     + "\n     values is " + new StringDescription().appendValue(values).toString() + "\n", _doubleArrow_3);
    
    Integer _fifth = JnarioIterableExtensions.<Integer>fifth(values);
    boolean _doubleArrow_4 = Should.operator_doubleArrow(_fifth, Integer.valueOf(5));
    Assert.assertTrue("\nExpected values.fifth  => 5 but"
     + "\n     values.fifth is " + new StringDescription().appendValue(_fifth).toString()
     + "\n     values is " + new StringDescription().appendValue(values).toString() + "\n", _doubleArrow_4);
    
    final List<Object> objects = JnarioCollectionLiterals.<Object>list(Integer.valueOf(1), "string", Boolean.valueOf(true), "other string");
    String _first_1 = JnarioIterableExtensions.<String>first(objects, String.class);
    boolean _doubleArrow_5 = Should.operator_doubleArrow(_first_1, "string");
    Assert.assertTrue("\nExpected objects.first(typeof(String))  => \"string\" but"
     + "\n     objects.first(typeof(String)) is " + new StringDescription().appendValue(_first_1).toString()
     + "\n     objects is " + new StringDescription().appendValue(objects).toString() + "\n", _doubleArrow_5);
    
    String _second_1 = JnarioIterableExtensions.<String>second(objects, String.class);
    boolean _doubleArrow_6 = Should.operator_doubleArrow(_second_1, "other string");
    Assert.assertTrue("\nExpected objects.second(typeof(String)) => \"other string\" but"
     + "\n     objects.second(typeof(String)) is " + new StringDescription().appendValue(_second_1).toString()
     + "\n     objects is " + new StringDescription().appendValue(objects).toString() + "\n", _doubleArrow_6);
    
  }
}
