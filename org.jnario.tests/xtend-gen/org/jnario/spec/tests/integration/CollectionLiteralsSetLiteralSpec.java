package org.jnario.spec.tests.integration;

import java.util.HashSet;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.tests.integration.CollectionLiteralsSpec;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Set Literal")
public class CollectionLiteralsSetLiteralSpec extends CollectionLiteralsSpec {
  @Test
  @Named("set[\"green\", \"red\"] => newHashSet[\"green\", \"red\"]")
  @Order(99)
  public void setGreenRedNewHashSetGreenRed() throws Exception {
    Set<String> _set = JnarioCollectionLiterals.<String>set("green", "red");
    HashSet<String> _newHashSet = CollectionLiterals.<String>newHashSet("green", "red");
    boolean _should_be = Should.should_be(_set, _newHashSet);Assert
    .assertTrue("\nExpected set(\"green\", \"red\") => newHashSet(\"green\", \"red\") but:"
     + "\n     set(\"green\", \"red\") is " + _set
     + "\n     newHashSet(\"green\", \"red\") is " + _newHashSet + "\n", _should_be);
    
  }
  
  @Test
  @Named("set[set[\"green\"], set[\"red\"]] => newHashSet[newHashSet[\"green\"], newHashSet[\"red\"]]")
  @Order(99)
  public void setSetGreenSetRedNewHashSetNewHashSetGreenNewHashSetRed() throws Exception {
    Set<String> _set = JnarioCollectionLiterals.<String>set("green");
    Set<String> _set_1 = JnarioCollectionLiterals.<String>set("red");
    Set<Set<String>> _set_2 = JnarioCollectionLiterals.<Set<String>>set(_set, _set_1);
    HashSet<String> _newHashSet = CollectionLiterals.<String>newHashSet("green");
    HashSet<String> _newHashSet_1 = CollectionLiterals.<String>newHashSet("red");
    HashSet<HashSet<String>> _newHashSet_2 = CollectionLiterals.<HashSet<String>>newHashSet(_newHashSet, _newHashSet_1);
    boolean _should_be = Should.should_be(_set_2, _newHashSet_2);Assert
    .assertTrue("\nExpected set(set(\"green\"), set(\"red\")) => newHashSet(newHashSet(\"green\"), newHashSet(\"red\")) but:"
     + "\n     set(set(\"green\"), set(\"red\")) is " + _set_2
     + "\n     set(\"green\") is " + _set
     + "\n     set(\"red\") is " + _set_1
     + "\n     newHashSet(newHashSet(\"green\"), newHashSet(\"red\")) is " + _newHashSet_2
     + "\n     newHashSet(\"green\") is " + _newHashSet
     + "\n     newHashSet(\"red\") is " + _newHashSet_1 + "\n", _should_be);
    
  }
}
