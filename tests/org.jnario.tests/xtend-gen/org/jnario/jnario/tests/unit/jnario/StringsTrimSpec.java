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
import org.jnario.jnario.tests.unit.jnario.StringsSpec;
import org.jnario.jnario.tests.unit.jnario.StringsTrimSpecExamples;
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

@Named("trim")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class StringsTrimSpec extends StringsSpec {
  public ExampleTable<StringsTrimSpecExamples> _initStringsTrimSpecExamples() {
    return ExampleTable.create("examples", 
      Arrays.asList("string", "result"), 
      new StringsTrimSpecExamples(  Arrays.asList("null", "null"), null, null),
      new StringsTrimSpecExamples(  Arrays.asList("\"\"", "\"\""), _initStringsTrimSpecExamplesCell2(), _initStringsTrimSpecExamplesCell3()),
      new StringsTrimSpecExamples(  Arrays.asList("\"_hello\"", "\"hello\""), _initStringsTrimSpecExamplesCell4(), _initStringsTrimSpecExamplesCell5()),
      new StringsTrimSpecExamples(  Arrays.asList("\"hello_world_\"", "\"hello_world\""), _initStringsTrimSpecExamplesCell6(), _initStringsTrimSpecExamplesCell7()),
      new StringsTrimSpecExamples(  Arrays.asList("\"_hello_\"", "\"hello\""), _initStringsTrimSpecExamplesCell8(), _initStringsTrimSpecExamplesCell9()),
      new StringsTrimSpecExamples(  Arrays.asList("\"__hello__\"", "\"hello\""), _initStringsTrimSpecExamplesCell10(), _initStringsTrimSpecExamplesCell11()),
      new StringsTrimSpecExamples(  Arrays.asList("\"____\"", "\"\""), _initStringsTrimSpecExamplesCell12(), _initStringsTrimSpecExamplesCell13())
    );
  }
  
  protected ExampleTable<StringsTrimSpecExamples> examples = _initStringsTrimSpecExamples();
  
  public Object _initStringsTrimSpecExamplesCell0() {
    return null;
  }
  
  public Object _initStringsTrimSpecExamplesCell1() {
    return null;
  }
  
  public String _initStringsTrimSpecExamplesCell2() {
    return "";
  }
  
  public String _initStringsTrimSpecExamplesCell3() {
    return "";
  }
  
  public String _initStringsTrimSpecExamplesCell4() {
    return "_hello";
  }
  
  public String _initStringsTrimSpecExamplesCell5() {
    return "hello";
  }
  
  public String _initStringsTrimSpecExamplesCell6() {
    return "hello_world_";
  }
  
  public String _initStringsTrimSpecExamplesCell7() {
    return "hello_world";
  }
  
  public String _initStringsTrimSpecExamplesCell8() {
    return "_hello_";
  }
  
  public String _initStringsTrimSpecExamplesCell9() {
    return "hello";
  }
  
  public String _initStringsTrimSpecExamplesCell10() {
    return "__hello__";
  }
  
  public String _initStringsTrimSpecExamplesCell11() {
    return "hello";
  }
  
  public String _initStringsTrimSpecExamplesCell12() {
    return "____";
  }
  
  public String _initStringsTrimSpecExamplesCell13() {
    return "";
  }
  
  @Test
  @Named("removes the specified leading and trailing character")
  @Order(1)
  public void _removesTheSpecifiedLeadingAndTrailingCharacter() throws Exception {
    final Procedure1<StringsTrimSpecExamples> _function = new Procedure1<StringsTrimSpecExamples>() {
        public void apply(final StringsTrimSpecExamples it) {
          String _string = it.getString();
          char _charAt = "_".charAt(0);
          String _trim = Strings.trim(_string, _charAt);
          String _result = it.getResult();
          boolean _doubleArrow = Should.<String>operator_doubleArrow(_trim, _result);
          Assert.assertTrue("\nExpected string.trim(\'_\'.charAt(0)) => result but"
           + "\n     string.trim(\'_\'.charAt(0)) is " + new org.hamcrest.StringDescription().appendValue(_trim).toString()
           + "\n     string is " + new org.hamcrest.StringDescription().appendValue(_string).toString()
           + "\n     \'_\'.charAt(0) is " + new org.hamcrest.StringDescription().appendValue(_charAt).toString()
           + "\n     result is " + new org.hamcrest.StringDescription().appendValue(_result).toString() + "\n", _doubleArrow);
          
        }
      };
    Each.<StringsTrimSpecExamples>forEach(this.examples, _function);
  }
}
