/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.tests.integration;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.google.common.collect.ImmutableSet;
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
    List<String> _xlistliteral = null;
    Builder<String> _builder = ImmutableList.builder();
    _builder.add("green");
    _builder.add("red");
    _xlistliteral = _builder.build();
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("green", "red");
    boolean _doubleArrow = Should.<List<String>>operator_doubleArrow(_xlistliteral, _newArrayList);
    Assert.assertTrue("\nExpected #[\"green\", \"red\"]         => newArrayList(\"green\", \"red\") but"
     + "\n     #[\"green\", \"red\"] is " + new StringDescription().appendValue(_xlistliteral).toString()
     + "\n     newArrayList(\"green\", \"red\") is " + new StringDescription().appendValue(_newArrayList).toString() + "\n", _doubleArrow);
    
    List<String> _xlistliteral_1 = null;
    Builder<String> _builder_1 = ImmutableList.builder();
    _builder_1.add("green");
    _xlistliteral_1 = _builder_1.build();
    List<String> _xlistliteral_2 = null;
    Builder<String> _builder_2 = ImmutableList.builder();
    _builder_2.add("red");
    _xlistliteral_2 = _builder_2.build();
    List<List<String>> _xlistliteral_3 = null;
    Builder<List<String>> _builder_3 = ImmutableList.builder();
    _builder_3.add(_xlistliteral_1);
    _builder_3.add(_xlistliteral_2);
    _xlistliteral_3 = _builder_3.build();
    ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList("green");
    ArrayList<String> _newArrayList_2 = CollectionLiterals.<String>newArrayList("red");
    ArrayList<ArrayList<String>> _newArrayList_3 = CollectionLiterals.<ArrayList<String>>newArrayList(_newArrayList_1, _newArrayList_2);
    boolean _doubleArrow_1 = Should.<List<? extends List<String>>>operator_doubleArrow(_xlistliteral_3, _newArrayList_3);
    Assert.assertTrue("\nExpected #[#[\"green\"], #[\"red\"]]   => newArrayList(newArrayList(\"green\"), newArrayList(\"red\")) but"
     + "\n     #[#[\"green\"], #[\"red\"]] is " + new StringDescription().appendValue(_xlistliteral_3).toString()
     + "\n     #[\"green\"] is " + new StringDescription().appendValue(_xlistliteral_1).toString()
     + "\n     #[\"red\"] is " + new StringDescription().appendValue(_xlistliteral_2).toString()
     + "\n     newArrayList(newArrayList(\"green\"), newArrayList(\"red\")) is " + new StringDescription().appendValue(_newArrayList_3).toString()
     + "\n     newArrayList(\"green\") is " + new StringDescription().appendValue(_newArrayList_1).toString()
     + "\n     newArrayList(\"red\") is " + new StringDescription().appendValue(_newArrayList_2).toString() + "\n", _doubleArrow_1);
    
  }
  
  @Test
  @Named("Set Literal")
  @Order(2)
  public void _setLiteral() throws Exception {
    Set<String> _xsetliteral = null;
    com.google.common.collect.ImmutableSet.Builder<String> _builder = ImmutableSet.builder();
    _builder.add("green");
    _builder.add("red");
    _xsetliteral = _builder.build();
    HashSet<String> _newHashSet = CollectionLiterals.<String>newHashSet("green", "red");
    boolean _doubleArrow = Should.<Set<String>>operator_doubleArrow(_xsetliteral, _newHashSet);
    Assert.assertTrue("\nExpected #{\"green\", \"red\"}         => newHashSet(\"green\", \"red\") but"
     + "\n     #{\"green\", \"red\"} is " + new StringDescription().appendValue(_xsetliteral).toString()
     + "\n     newHashSet(\"green\", \"red\") is " + new StringDescription().appendValue(_newHashSet).toString() + "\n", _doubleArrow);
    
    Set<Set<String>> _xsetliteral_1 = null;
    Set<String> _xsetliteral_2 = null;
    com.google.common.collect.ImmutableSet.Builder<String> _builder_1 = ImmutableSet.builder();
    _builder_1.add("green");
    _xsetliteral_2 = _builder_1.build();
    Set<String> _xsetliteral_3 = null;
    com.google.common.collect.ImmutableSet.Builder<String> _builder_2 = ImmutableSet.builder();
    _builder_2.add("red");
    _xsetliteral_3 = _builder_2.build();
    com.google.common.collect.ImmutableSet.Builder<Set<String>> _builder_3 = ImmutableSet.builder();
    _builder_3.add(_xsetliteral_2);
    _builder_3.add(_xsetliteral_3);
    _xsetliteral_1 = _builder_3.build();
    HashSet<String> _newHashSet_1 = CollectionLiterals.<String>newHashSet("green");
    HashSet<String> _newHashSet_2 = CollectionLiterals.<String>newHashSet("red");
    HashSet<HashSet<String>> _newHashSet_3 = CollectionLiterals.<HashSet<String>>newHashSet(_newHashSet_1, _newHashSet_2);
    boolean _doubleArrow_1 = Should.<Set<? extends Set<String>>>operator_doubleArrow(_xsetliteral_1, _newHashSet_3);
    Assert.assertTrue("\nExpected #{#{\"green\"}, #{\"red\"}}    => newHashSet(newHashSet(\"green\"), newHashSet(\"red\")) but"
     + "\n     #{#{\"green\"}, #{\"red\"}} is " + new StringDescription().appendValue(_xsetliteral_1).toString()
     + "\n     #{\"green\"} is " + new StringDescription().appendValue(_xsetliteral_2).toString()
     + "\n     #{\"red\"} is " + new StringDescription().appendValue(_xsetliteral_3).toString()
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
    boolean _doubleArrow = Should.<Map<String,String>>operator_doubleArrow(_map, _newHashMap);
    Assert.assertTrue("\nExpected map(\r\n\t\t    \"green\"  -> \"apple\",\r\n\t\t    \"yellow\" -> \"banana\",\r\n\t\t    \"red\"    -> \"tomato\"\r\n\t\t  ) => newHashMap(\r\n\t\t    \"green\"  -> \"apple\",\r\n\t\t    \"yellow\" -> \"banana\",\r\n\t\t    \"red\"    -> \"tomato\"\r\n\t\t  ) but"
     + "\n     map(\r\n\t\t    \"green\"  -> \"apple\",\r\n\t\t    \"yellow\" -> \"banana\",\r\n\t\t    \"red\"    -> \"tomato\"\r\n\t\t  ) is " + new StringDescription().appendValue(_map).toString()
     + "\n     \"green\"  -> \"apple\" is " + new StringDescription().appendValue(_mappedTo).toString()
     + "\n     \"yellow\" -> \"banana\" is " + new StringDescription().appendValue(_mappedTo_1).toString()
     + "\n     \"red\"    -> \"tomato\" is " + new StringDescription().appendValue(_mappedTo_2).toString()
     + "\n     newHashMap(\r\n\t\t    \"green\"  -> \"apple\",\r\n\t\t    \"yellow\" -> \"banana\",\r\n\t\t    \"red\"    -> \"tomato\"\r\n\t\t  ) is " + new StringDescription().appendValue(_newHashMap).toString() + "\n", _doubleArrow);
    
  }
}
