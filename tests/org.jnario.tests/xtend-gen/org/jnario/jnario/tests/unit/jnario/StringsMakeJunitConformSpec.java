/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.tests.unit.jnario;

import java.util.Arrays;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.jnario.tests.unit.jnario.StringsMakeJunitConformSpecExamples;
import org.jnario.jnario.tests.unit.jnario.StringsSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Each;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.util.Strings;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("makeJunitConform")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class StringsMakeJunitConformSpec extends StringsSpec {
  public ExampleTable<StringsMakeJunitConformSpecExamples> _initStringsMakeJunitConformSpecExamples() {
    return ExampleTable.create("examples", 
      Arrays.asList("string", "result"), 
      new StringsMakeJunitConformSpecExamples(  Arrays.asList("null", "null"), null, null),
      new StringsMakeJunitConformSpecExamples(  Arrays.asList("\"hello\"", "\"hello\""), _initStringsMakeJunitConformSpecExamplesCell2(), _initStringsMakeJunitConformSpecExamplesCell3()),
      new StringsMakeJunitConformSpecExamples(  Arrays.asList("\"hello \"", "\"hello\""), _initStringsMakeJunitConformSpecExamplesCell4(), _initStringsMakeJunitConformSpecExamplesCell5()),
      new StringsMakeJunitConformSpecExamples(  Arrays.asList("\"hello\\n\\tworld\"", "\"hello world\""), _initStringsMakeJunitConformSpecExamplesCell6(), _initStringsMakeJunitConformSpecExamplesCell7()),
      new StringsMakeJunitConformSpecExamples(  Arrays.asList("\"hello(param)\"", "\"hello[param]\""), _initStringsMakeJunitConformSpecExamplesCell8(), _initStringsMakeJunitConformSpecExamplesCell9()),
      new StringsMakeJunitConformSpecExamples(  Arrays.asList("\"hello #world#\"", "\"hello -world-\""), _initStringsMakeJunitConformSpecExamplesCell10(), _initStringsMakeJunitConformSpecExamplesCell11())
    );
  }
  
  protected ExampleTable<StringsMakeJunitConformSpecExamples> examples = _initStringsMakeJunitConformSpecExamples();
  
  public Object _initStringsMakeJunitConformSpecExamplesCell0() {
    return null;
  }
  
  public Object _initStringsMakeJunitConformSpecExamplesCell1() {
    return null;
  }
  
  public String _initStringsMakeJunitConformSpecExamplesCell2() {
    return "hello";
  }
  
  public String _initStringsMakeJunitConformSpecExamplesCell3() {
    return "hello";
  }
  
  public String _initStringsMakeJunitConformSpecExamplesCell4() {
    return "hello ";
  }
  
  public String _initStringsMakeJunitConformSpecExamplesCell5() {
    return "hello";
  }
  
  public String _initStringsMakeJunitConformSpecExamplesCell6() {
    return "hello\n\tworld";
  }
  
  public String _initStringsMakeJunitConformSpecExamplesCell7() {
    return "hello world";
  }
  
  public String _initStringsMakeJunitConformSpecExamplesCell8() {
    return "hello(param)";
  }
  
  public String _initStringsMakeJunitConformSpecExamplesCell9() {
    return "hello[param]";
  }
  
  public String _initStringsMakeJunitConformSpecExamplesCell10() {
    return "hello #world#";
  }
  
  public String _initStringsMakeJunitConformSpecExamplesCell11() {
    return "hello -world-";
  }
  
  @Test
  @Named("examples.forEach[string.makeJunitConform => result]")
  @Order(1)
  public void _examplesForEachStringMakeJunitConformResult() throws Exception {
    final Procedure1<StringsMakeJunitConformSpecExamples> _function = new Procedure1<StringsMakeJunitConformSpecExamples>() {
        public void apply(final StringsMakeJunitConformSpecExamples it) {
          String _string = it.getString();
          String _makeJunitConform = Strings.makeJunitConform(_string);
          String _result = it.getResult();
          boolean _doubleArrow = Should.<String>operator_doubleArrow(_makeJunitConform, _result);
          Assert.assertTrue("\nExpected string.makeJunitConform => result but"
           + "\n     string.makeJunitConform is " + new org.hamcrest.StringDescription().appendValue(_makeJunitConform).toString()
           + "\n     string is " + new org.hamcrest.StringDescription().appendValue(_string).toString()
           + "\n     result is " + new org.hamcrest.StringDescription().appendValue(_result).toString() + "\n", _doubleArrow);
          
        }
      };
    Each.<StringsMakeJunitConformSpecExamples>forEach(this.examples, _function);
  }
}
