/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.integration;

import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.jnario.feature.tests.integration.FeatureExtensionsFeature;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.lib.StringConversions;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Referencing multiple extensions")
@SuppressWarnings("all")
public class FeatureExtensionsFeatureReferencingMultipleExtensions extends FeatureExtensionsFeature {
  List<String> list;
  
  @Test
  @Order(0)
  @Named("When sorting the colors \\\"yellow, red\\\"")
  public void _whenSortingTheColorsYellowRed() {
    StepArguments _stepArguments = new StepArguments("yellow, red");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    String[] _split = _first.split(",");
    final Function1<String,String> _function = new Function1<String,String>() {
      public String apply(final String it) {
        String _trim = it.trim();
        return _trim;
      }
    };
    List<String> _map = ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(_split)), _function);
    List<String> _sort = IterableExtensions.<String>sort(_map);
    this.list = _sort;
  }
  
  @Test
  @Order(1)
  @Named("Then they should be ordered \\\"red, yellow\\\"")
  public void _thenTheyShouldBeOrderedRedYellow() {
    StepArguments _stepArguments = new StepArguments("red, yellow");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    List<String> _list = StringConversions.toList(_first);
    boolean _doubleArrow = Should.<List<String>>operator_doubleArrow(this.list, _list);
    Assert.assertTrue("\nExpected list => args.first.toList but"
     + "\n     list is " + new org.hamcrest.StringDescription().appendValue(this.list).toString()
     + "\n     args.first.toList is " + new org.hamcrest.StringDescription().appendValue(_list).toString()
     + "\n     args.first is " + new org.hamcrest.StringDescription().appendValue(_first).toString()
     + "\n     args is " + new org.hamcrest.StringDescription().appendValue(args).toString() + "\n", _doubleArrow);
    
  }
}
