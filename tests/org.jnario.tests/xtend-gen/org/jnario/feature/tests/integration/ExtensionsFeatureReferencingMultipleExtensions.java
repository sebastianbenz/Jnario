/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.integration;

import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.hamcrest.StringDescription;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Referencing multiple extensions")
@SuppressWarnings("all")
public class ExtensionsFeatureReferencingMultipleExtensions {
  @Test
  @Order(0)
  @Named("When sorting the colors \"yellow, red\"")
  public void whenSortingTheColorsYellowRed() {
      StepArguments _stepArguments = new StepArguments("yellow, red");
      final StepArguments args = _stepArguments;
      this.list = IterableExtensions.<String>sort(new Function0<Iterable<String>>() {
        public Iterable<String> apply() {
          StepArguments _args = args;
          String _first = JnarioIterableExtensions.<String>first(_args);
          String[] _split = _first.split(",");
          final Function1<String,String> _function = new Function1<String,String>() {
              public String apply(final String it) {
                String _trim = it.trim();
                return _trim;
              }
            };
          List<String> _map = ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(_split)), _function);
          return _map;
        }
      }.apply());
  }
  
  @Test
  @Order(1)
  @Named("Then they should be ordered")
  public void thenTheyShouldBeOrdered() {
    List<String> _list = JnarioCollectionLiterals.<String>list("red", "yellow");
    boolean _doubleArrow = Should.operator_doubleArrow(this.list, _list);
    Assert.assertTrue("\nExpected list => list(\"red\",\"yellow\") but"
     + "\n     list is " + new StringDescription().appendValue(this.list).toString()
     + "\n     list(\"red\",\"yellow\") is " + new StringDescription().appendValue(_list).toString() + "\n", _doubleArrow);
    
  }
  
  List list;
}
