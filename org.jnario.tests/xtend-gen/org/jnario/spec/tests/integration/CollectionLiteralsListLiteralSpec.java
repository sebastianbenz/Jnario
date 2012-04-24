package org.jnario.spec.tests.integration;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtext.xbase.lib.CollectionLiterals;
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
@Named("List Literal")
public class CollectionLiteralsListLiteralSpec extends CollectionLiteralsSpec {
  @Test
  @Named("list[\"green\", \"red\"] => newArrayList[\"green\", \"red\"]")
  @Order(99)
  public void listGreenRedNewArrayListGreenRed() throws Exception {
    List<String> _list = JnarioCollectionLiterals.<String>list("green", "red");
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("green", "red");
    boolean _should_be = Should.should_be(_list, _newArrayList);Assert
    .assertTrue("\nExpected list(\"green\", \"red\") => newArrayList(\"green\", \"red\") but:"
     + "\n     list(\"green\", \"red\") is " + _list
     + "\n     newArrayList(\"green\", \"red\") is " + _newArrayList + "\n", _should_be);
    
  }
  
  @Test
  @Named("list[list[\"green\"], list[\"red\"]] => newArrayList[newArrayList[\"green\"], newArrayList[\"red\"]]")
  @Order(99)
  public void listListGreenListRedNewArrayListNewArrayListGreenNewArrayListRed() throws Exception {
    List<String> _list = JnarioCollectionLiterals.<String>list("green");
    List<String> _list_1 = JnarioCollectionLiterals.<String>list("red");
    List<List<String>> _list_2 = JnarioCollectionLiterals.<List<String>>list(_list, _list_1);
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("green");
    ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList("red");
    ArrayList<ArrayList<String>> _newArrayList_2 = CollectionLiterals.<ArrayList<String>>newArrayList(_newArrayList, _newArrayList_1);
    boolean _should_be = Should.should_be(_list_2, _newArrayList_2);Assert
    .assertTrue("\nExpected list(list(\"green\"), list(\"red\")) => newArrayList(newArrayList(\"green\"), newArrayList(\"red\")) but:"
     + "\n     list(list(\"green\"), list(\"red\")) is " + _list_2
     + "\n     list(\"green\") is " + _list
     + "\n     list(\"red\") is " + _list_1
     + "\n     newArrayList(newArrayList(\"green\"), newArrayList(\"red\")) is " + _newArrayList_2
     + "\n     newArrayList(\"green\") is " + _newArrayList
     + "\n     newArrayList(\"red\") is " + _newArrayList_1 + "\n", _should_be);
    
  }
}
