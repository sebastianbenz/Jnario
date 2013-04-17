/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.documentation;

import java.util.Collections;
import java.util.List;
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

@Named("Some important differences")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class _20FactsAboutXtendSomeImportantDifferencesSpec extends _20FactsAboutXtendSpec {
  /**
   * Static class members are accessed via `::` and not `.` like in Java.
   * 
   * <span class="label label-warning">Important</span> This is probably the most
   * often asked question on the Xtend [mailing list](https://groups.google.com/forum/?fromgroups#!forum/xtend-lang).
   */
  @Test
  @Named("Accessing static members differs from Java")
  @Order(1)
  public void _accessingStaticMembersDiffersFromJava() throws Exception {
    final List<String> colors = JnarioCollectionLiterals.<String>list("red", "blue", "green");
    Collections.<String>sort(colors);
    List<String> _list = JnarioCollectionLiterals.<String>list("blue", "green", "red");
    boolean _doubleArrow = this.<String>operator_doubleArrow(colors, _list);
    Assert.assertTrue("\nExpected colors => list(\"blue\", \"green\", \"red\") but"
     + "\n     colors is " + new StringDescription().appendValue(colors).toString()
     + "\n     list(\"blue\", \"green\", \"red\") is " + new StringDescription().appendValue(_list).toString() + "\n", _doubleArrow);
    
  }
  
  /**
   * Accessing classes has also a different syntax in Xtend. Instead of writing
   * `String.class` like in Java, you need to write `typeof(String)` in Xtend.
   * 
   * <span class="label label-warning">Important</span> This is probably the second most
   * most often asked question on the Xtend mailing list.
   */
  @Test
  @Named("...as well as accessing types")
  @Order(2)
  public void _asWellAsAccessingTypes() throws Exception {
    String _name = String.class.getName();
    boolean _doubleArrow = Should.operator_doubleArrow(_name, "java.lang.String");
    Assert.assertTrue("\nExpected typeof(String).name => \"java.lang.String\" but"
     + "\n     typeof(String).name is " + new StringDescription().appendValue(_name).toString() + "\n", _doubleArrow);
    
  }
  
  /**
   * Type casts behave exactly like in Java, but have a slightly more
   * readable syntax:
   */
  @Test
  @Named("Casts have a different syntax")
  @Order(3)
  public void _castsHaveADifferentSyntax() throws Exception {
    final Object obj = "a string";
    final String s = ((String) obj);
  }
}
