/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.unit;

import java.util.List;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.hamcrest.StringDescription;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.unit.SpecResolverSpec;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("evaluates regular expressions")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SpecResolverEvaluatesRegularExpressionsSpec extends SpecResolverSpec {
  @Test
  @Named("example 1")
  @Order(1)
  public void _example1() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package demo");
    _builder.newLine();
    _builder.append("import demo.*");
    _builder.newLine();
    _builder.append("#The Suite");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- \\demo\\.My.*\\");
    _builder.newLine();
    this.m.parseSuite(_builder);
    Suite _firstSuite = this.m.firstSuite();
    List<String> _resolvedSpecs = this.resolvedSpecs(_firstSuite);
    Set<String> _set = IterableExtensions.<String>toSet(_resolvedSpecs);
    Set<String> _set_1 = JnarioCollectionLiterals.<String>set("MySpecSpec", "MyFeatureFeature");
    boolean _doubleArrow = Should.operator_doubleArrow(_set, _set_1);
    Assert.assertTrue("\nExpected resolvedSpecs(m.firstSuite).toSet => set(\"MySpecSpec\", \"MyFeatureFeature\") but"
     + "\n     resolvedSpecs(m.firstSuite).toSet is " + new StringDescription().appendValue(_set).toString()
     + "\n     resolvedSpecs(m.firstSuite) is " + new StringDescription().appendValue(_resolvedSpecs).toString()
     + "\n     m.firstSuite is " + new StringDescription().appendValue(_firstSuite).toString()
     + "\n     m is " + new StringDescription().appendValue(this.m).toString()
     + "\n     set(\"MySpecSpec\", \"MyFeatureFeature\") is " + new StringDescription().appendValue(_set_1).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("example 2")
  @Order(2)
  public void _example2() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package demo");
    _builder.newLine();
    _builder.append("import demo.*");
    _builder.newLine();
    _builder.append("#My Suite");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- \\.*Spec\\");
    _builder.newLine();
    this.m.parseSuite(_builder);
    Suite _firstSuite = this.m.firstSuite();
    List<String> _resolvedSpecs = this.resolvedSpecs(_firstSuite);
    List<String> _list = JnarioCollectionLiterals.<String>list("MySpecSpec");
    boolean _doubleArrow = Should.operator_doubleArrow(_resolvedSpecs, _list);
    Assert.assertTrue("\nExpected resolvedSpecs(m.firstSuite) => list(\"MySpecSpec\") but"
     + "\n     resolvedSpecs(m.firstSuite) is " + new StringDescription().appendValue(_resolvedSpecs).toString()
     + "\n     m.firstSuite is " + new StringDescription().appendValue(_firstSuite).toString()
     + "\n     m is " + new StringDescription().appendValue(this.m).toString()
     + "\n     list(\"MySpecSpec\") is " + new StringDescription().appendValue(_list).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Ignore
  @Named("returns empty list on null input [PENDING]")
  @Order(3)
  public void _returnsEmptyListOnNullInput() throws Exception {
  }
  
  @Test
  @Named("ignores unresolved elements")
  @Order(4)
  public void _ignoresUnresolvedElements() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package demo");
    _builder.newLine();
    _builder.append("import demo.*");
    _builder.newLine();
    _builder.append("#My Suite");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- \\NonExistent\\");
    _builder.newLine();
    this.m.parseSuite(_builder);
  }
  
  @Test
  @Named("ignores containing suite")
  @Order(5)
  public void _ignoresContainingSuite() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package demo");
    _builder.newLine();
    _builder.append("import demo.*");
    _builder.newLine();
    _builder.append("#My Suite");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- \\.*\\");
    _builder.newLine();
    this.m.parseSuite(_builder);
    Suite _firstSuite = this.m.firstSuite();
    List<String> _resolvedSpecs = this.resolvedSpecs(_firstSuite);
    Set<String> _set = IterableExtensions.<String>toSet(_resolvedSpecs);
    Set<String> _set_1 = JnarioCollectionLiterals.<String>set("MySpecSpec", "MyFeatureFeature", "StringSpec");
    boolean _doubleArrow = Should.operator_doubleArrow(_set, _set_1);
    Assert.assertTrue("\nExpected resolvedSpecs(m.firstSuite).toSet => set(\"MySpecSpec\", \"MyFeatureFeature\", \"StringSpec\") but"
     + "\n     resolvedSpecs(m.firstSuite).toSet is " + new StringDescription().appendValue(_set).toString()
     + "\n     resolvedSpecs(m.firstSuite) is " + new StringDescription().appendValue(_resolvedSpecs).toString()
     + "\n     m.firstSuite is " + new StringDescription().appendValue(_firstSuite).toString()
     + "\n     m is " + new StringDescription().appendValue(this.m).toString()
     + "\n     set(\"MySpecSpec\", \"MyFeatureFeature\", \"StringSpec\") is " + new StringDescription().appendValue(_set_1).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("orders specs alphabetically")
  @Order(6)
  public void _ordersSpecsAlphabetically() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package demo");
    _builder.newLine();
    _builder.append("import demo.*");
    _builder.newLine();
    _builder.append("#My Suite");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- \\.*\\");
    _builder.newLine();
    this.m.parseSuite(_builder);
    Suite _firstSuite = this.m.firstSuite();
    List<String> _resolvedSpecs = this.resolvedSpecs(_firstSuite);
    List<String> _list = JnarioCollectionLiterals.<String>list("MyFeatureFeature", "MySpecSpec", "StringSpec");
    boolean _doubleArrow = Should.operator_doubleArrow(_resolvedSpecs, _list);
    Assert.assertTrue("\nExpected resolvedSpecs(m.firstSuite) => list(\"MyFeatureFeature\", \"MySpecSpec\", \"StringSpec\") but"
     + "\n     resolvedSpecs(m.firstSuite) is " + new StringDescription().appendValue(_resolvedSpecs).toString()
     + "\n     m.firstSuite is " + new StringDescription().appendValue(_firstSuite).toString()
     + "\n     m is " + new StringDescription().appendValue(this.m).toString()
     + "\n     list(\"MyFeatureFeature\", \"MySpecSpec\", \"StringSpec\") is " + new StringDescription().appendValue(_list).toString() + "\n", _doubleArrow);
    
  }
}
