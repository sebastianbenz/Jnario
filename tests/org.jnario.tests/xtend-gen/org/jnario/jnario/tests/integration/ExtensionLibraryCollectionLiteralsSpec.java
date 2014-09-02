/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.tests.integration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pair;
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
 * Xtend has it's own collection literals which of course
 * work in Jnario as well.
 */
@Named("Collection Literals")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExtensionLibraryCollectionLiteralsSpec extends ExtensionLibrarySpec {
  @Test
  @Named("List Literal")
  @Order(1)
  public void _listLiteral() throws Exception {
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("green", "red");
    boolean _doubleArrow = Should.<List<String>>operator_doubleArrow(
      Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("green", "red")), _newArrayList);
    Assert.assertTrue("\nExpected #[\"green\", \"red\"]         => newArrayList(\"green\", \"red\") but"
     + "\n     #[\"green\", \"red\"] is " + new org.hamcrest.StringDescription().appendValue(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("green", "red"))).toString()
     + "\n     newArrayList(\"green\", \"red\") is " + new org.hamcrest.StringDescription().appendValue(_newArrayList).toString() + "\n", _doubleArrow);
    
    ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList("green");
    ArrayList<String> _newArrayList_2 = CollectionLiterals.<String>newArrayList("red");
    ArrayList<ArrayList<String>> _newArrayList_3 = CollectionLiterals.<ArrayList<String>>newArrayList(_newArrayList_1, _newArrayList_2);
    Assert.assertTrue("\nExpected #[#[\"green\"], #[\"red\"]]   => newArrayList(newArrayList(\"green\"), newArrayList(\"red\")) but"
     + "\n     #[#[\"green\"], #[\"red\"]] is " + new org.hamcrest.StringDescription().appendValue(Collections.<List<String>>unmodifiableList(CollectionLiterals.<List<String>>newArrayList(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("green")), Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("red"))))).toString()
     + "\n     #[\"green\"] is " + new org.hamcrest.StringDescription().appendValue(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("green"))).toString()
     + "\n     #[\"red\"] is " + new org.hamcrest.StringDescription().appendValue(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("red"))).toString()
     + "\n     newArrayList(newArrayList(\"green\"), newArrayList(\"red\")) is " + new org.hamcrest.StringDescription().appendValue(_newArrayList_3).toString()
     + "\n     newArrayList(\"green\") is " + new org.hamcrest.StringDescription().appendValue(_newArrayList_1).toString()
     + "\n     newArrayList(\"red\") is " + new org.hamcrest.StringDescription().appendValue(_newArrayList_2).toString() + "\n", Should.<List<? extends List<String>>>operator_doubleArrow(
      Collections.<List<String>>unmodifiableList(CollectionLiterals.<List<String>>newArrayList(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("green")), Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("red")))), _newArrayList_3));
    
  }
  
  @Test
  @Named("Set Literal")
  @Order(2)
  public void _setLiteral() throws Exception {
    HashSet<String> _newHashSet = CollectionLiterals.<String>newHashSet("green", "red");
    boolean _doubleArrow = Should.<Set<String>>operator_doubleArrow(
      Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("green", "red")), _newHashSet);
    Assert.assertTrue("\nExpected #{\"green\", \"red\"}         => newHashSet(\"green\", \"red\") but"
     + "\n     #{\"green\", \"red\"} is " + new org.hamcrest.StringDescription().appendValue(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("green", "red"))).toString()
     + "\n     newHashSet(\"green\", \"red\") is " + new org.hamcrest.StringDescription().appendValue(_newHashSet).toString() + "\n", _doubleArrow);
    
    HashSet<String> _newHashSet_1 = CollectionLiterals.<String>newHashSet("green");
    HashSet<String> _newHashSet_2 = CollectionLiterals.<String>newHashSet("red");
    HashSet<HashSet<String>> _newHashSet_3 = CollectionLiterals.<HashSet<String>>newHashSet(_newHashSet_1, _newHashSet_2);
    Assert.assertTrue("\nExpected #{#{\"green\"}, #{\"red\"}}    => newHashSet(newHashSet(\"green\"), newHashSet(\"red\")) but"
     + "\n     #{#{\"green\"}, #{\"red\"}} is " + new org.hamcrest.StringDescription().appendValue(Collections.<Set<String>>unmodifiableSet(CollectionLiterals.<Set<String>>newHashSet(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("green")), Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("red"))))).toString()
     + "\n     #{\"green\"} is " + new org.hamcrest.StringDescription().appendValue(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("green"))).toString()
     + "\n     #{\"red\"} is " + new org.hamcrest.StringDescription().appendValue(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("red"))).toString()
     + "\n     newHashSet(newHashSet(\"green\"), newHashSet(\"red\")) is " + new org.hamcrest.StringDescription().appendValue(_newHashSet_3).toString()
     + "\n     newHashSet(\"green\") is " + new org.hamcrest.StringDescription().appendValue(_newHashSet_1).toString()
     + "\n     newHashSet(\"red\") is " + new org.hamcrest.StringDescription().appendValue(_newHashSet_2).toString() + "\n", Should.<Set<? extends Set<String>>>operator_doubleArrow(
      Collections.<Set<String>>unmodifiableSet(CollectionLiterals.<Set<String>>newHashSet(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("green")), Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("red")))), _newHashSet_3));
    
  }
  
  @Test
  @Named("Map Literal")
  @Order(3)
  public void _mapLiteral() throws Exception {
    Pair<String, String> _mappedTo = Pair.<String, String>of("green", "apple");
    Pair<String, String> _mappedTo_1 = Pair.<String, String>of("yellow", "banana");
    Pair<String, String> _mappedTo_2 = Pair.<String, String>of("red", "tomato");
    Map<String, String> _map = JnarioCollectionLiterals.<String, String>map(_mappedTo, _mappedTo_1, _mappedTo_2);
    Pair<String, String> _mappedTo_3 = Pair.<String, String>of("green", "apple");
    Pair<String, String> _mappedTo_4 = Pair.<String, String>of("yellow", "banana");
    Pair<String, String> _mappedTo_5 = Pair.<String, String>of("red", "tomato");
    HashMap<String, String> _newHashMap = CollectionLiterals.<String, String>newHashMap(_mappedTo_3, _mappedTo_4, _mappedTo_5);
    Assert.assertTrue("\nExpected map(\r\n\t\t    \"green\"  -> \"apple\",\r\n\t\t    \"yellow\" -> \"banana\",\r\n\t\t    \"red\"    -> \"tomato\"\r\n\t\t  ) => newHashMap(\r\n\t\t    \"green\"  -> \"apple\",\r\n\t\t    \"yellow\" -> \"banana\",\r\n\t\t    \"red\"    -> \"tomato\"\r\n\t\t  ) but"
     + "\n     map(\r\n\t\t    \"green\"  -> \"apple\",\r\n\t\t    \"yellow\" -> \"banana\",\r\n\t\t    \"red\"    -> \"tomato\"\r\n\t\t  ) is " + new org.hamcrest.StringDescription().appendValue(_map).toString()
     + "\n     \"green\"  -> \"apple\" is " + new org.hamcrest.StringDescription().appendValue(_mappedTo).toString()
     + "\n     \"yellow\" -> \"banana\" is " + new org.hamcrest.StringDescription().appendValue(_mappedTo_1).toString()
     + "\n     \"red\"    -> \"tomato\" is " + new org.hamcrest.StringDescription().appendValue(_mappedTo_2).toString()
     + "\n     newHashMap(\r\n\t\t    \"green\"  -> \"apple\",\r\n\t\t    \"yellow\" -> \"banana\",\r\n\t\t    \"red\"    -> \"tomato\"\r\n\t\t  ) is " + new org.hamcrest.StringDescription().appendValue(_newHashMap).toString() + "\n", Should.<Map<String, String>>operator_doubleArrow(_map, _newHashMap));
    
  }
}
