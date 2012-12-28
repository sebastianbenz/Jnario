package org.jnario.jnario.tests.integration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pair;
import org.hamcrest.StringDescription;
import org.jnario.jnario.tests.integration.ExtensionLibrarySpec;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * When writing tests the concrete implementation of a collection usually doesn't matter
 * so much. Therefore, Jnario provides shorter versions of Xtend's collection literals.
 */
@SuppressWarnings("all")
@Named("Collection Literals")
@RunWith(ExampleGroupRunner.class)
public class ExtensionLibraryCollectionLiteralsSpec extends ExtensionLibrarySpec {
  @Test
  @Named("List Literal")
  @Order(1)
  public void _listLiteral() throws Exception {
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
  @Order(2)
  public void _setLiteral() throws Exception {
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
  @Order(3)
  public void _mapLiteral() throws Exception {
    Pair<String,String> _mappedTo = Pair.<String, String>of("green", "apple");
    Pair<String,String> _mappedTo_1 = Pair.<String, String>of("yellow", "banana");
    Pair<String,String> _mappedTo_2 = Pair.<String, String>of("red", "tomato");
    Map<String,String> _map = JnarioCollectionLiterals.<String, String>map(_mappedTo, _mappedTo_1, _mappedTo_2);
    Pair<String,String> _mappedTo_3 = Pair.<String, String>of("green", "apple");
    Pair<String,String> _mappedTo_4 = Pair.<String, String>of("yellow", "banana");
    Pair<String,String> _mappedTo_5 = Pair.<String, String>of("red", "tomato");
    HashMap<String,String> _newHashMap = CollectionLiterals.<String, String>newHashMap(_mappedTo_3, _mappedTo_4, _mappedTo_5);
    boolean _doubleArrow = Should.operator_doubleArrow(_map, _newHashMap);
    Assert.assertTrue("\nExpected map(\n\t\t    \"green\"  -> \"apple\",\n\t\t    \"yellow\" -> \"banana\",\n\t\t    \"red\"    -> \"tomato\"\n\t\t  ) => newHashMap(\n\t\t    \"green\"  -> \"apple\",\n\t\t    \"yellow\" -> \"banana\",\n\t\t    \"red\"    -> \"tomato\"\n\t\t  ) but"
     + "\n     map(\n\t\t    \"green\"  -> \"apple\",\n\t\t    \"yellow\" -> \"banana\",\n\t\t    \"red\"    -> \"tomato\"\n\t\t  ) is " + new StringDescription().appendValue(_map).toString()
     + "\n     \"green\"  -> \"apple\" is " + new StringDescription().appendValue(_mappedTo).toString()
     + "\n     \"yellow\" -> \"banana\" is " + new StringDescription().appendValue(_mappedTo_1).toString()
     + "\n     \"red\"    -> \"tomato\" is " + new StringDescription().appendValue(_mappedTo_2).toString()
     + "\n     newHashMap(\n\t\t    \"green\"  -> \"apple\",\n\t\t    \"yellow\" -> \"banana\",\n\t\t    \"red\"    -> \"tomato\"\n\t\t  ) is " + new StringDescription().appendValue(_newHashMap).toString() + "\n", _doubleArrow);
    
  }
}
