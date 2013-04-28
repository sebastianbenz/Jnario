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
import org.hamcrest.StringDescription;
import org.jnario.jnario.tests.unit.jnario.StringsSpec;
import org.jnario.jnario.tests.unit.jnario.StringsTrailingWhitespaceSpecExamples;
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

@Named("trailingWhitespace")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class StringsTrailingWhitespaceSpec extends StringsSpec {
  public ExampleTable<StringsTrailingWhitespaceSpecExamples> _initStringsTrailingWhitespaceSpecExamples() {
    return ExampleTable.create("examples", 
      Arrays.asList("string", "result"), 
      new StringsTrailingWhitespaceSpecExamples(  Arrays.asList("null", "\"\""), null, _initStringsTrailingWhitespaceSpecExamplesCell1()),
      new StringsTrailingWhitespaceSpecExamples(  Arrays.asList("\"\"", "\"\""), _initStringsTrailingWhitespaceSpecExamplesCell2(), _initStringsTrailingWhitespaceSpecExamplesCell3()),
      new StringsTrailingWhitespaceSpecExamples(  Arrays.asList("\"no whitespace\"", "\"\""), _initStringsTrailingWhitespaceSpecExamplesCell4(), _initStringsTrailingWhitespaceSpecExamplesCell5()),
      new StringsTrailingWhitespaceSpecExamples(  Arrays.asList("\"space at the end \"", "\" \""), _initStringsTrailingWhitespaceSpecExamplesCell6(), _initStringsTrailingWhitespaceSpecExamplesCell7()),
      new StringsTrailingWhitespaceSpecExamples(  Arrays.asList("\"tab at the end\\t\"", "\"\\t\""), _initStringsTrailingWhitespaceSpecExamplesCell8(), _initStringsTrailingWhitespaceSpecExamplesCell9()),
      new StringsTrailingWhitespaceSpecExamples(  Arrays.asList("\"new line at the end\\r\"", "\"\\r\""), _initStringsTrailingWhitespaceSpecExamplesCell10(), _initStringsTrailingWhitespaceSpecExamplesCell11()),
      new StringsTrailingWhitespaceSpecExamples(  Arrays.asList("\"new line at the end\\n\"", "\"\\n\""), _initStringsTrailingWhitespaceSpecExamplesCell12(), _initStringsTrailingWhitespaceSpecExamplesCell13()),
      new StringsTrailingWhitespaceSpecExamples(  Arrays.asList("\"multiple whitespaces\\t \\n\"", "\"\\t \\n\""), _initStringsTrailingWhitespaceSpecExamplesCell14(), _initStringsTrailingWhitespaceSpecExamplesCell15()),
      new StringsTrailingWhitespaceSpecExamples(  Arrays.asList("\"\\t \\n\"", "\"\\t \\n\""), _initStringsTrailingWhitespaceSpecExamplesCell16(), _initStringsTrailingWhitespaceSpecExamplesCell17())
    );
  }
  
  protected ExampleTable<StringsTrailingWhitespaceSpecExamples> examples = _initStringsTrailingWhitespaceSpecExamples();
  
  public Object _initStringsTrailingWhitespaceSpecExamplesCell0() {
    return null;
  }
  
  public String _initStringsTrailingWhitespaceSpecExamplesCell1() {
    return "";
  }
  
  public String _initStringsTrailingWhitespaceSpecExamplesCell2() {
    return "";
  }
  
  public String _initStringsTrailingWhitespaceSpecExamplesCell3() {
    return "";
  }
  
  public String _initStringsTrailingWhitespaceSpecExamplesCell4() {
    return "no whitespace";
  }
  
  public String _initStringsTrailingWhitespaceSpecExamplesCell5() {
    return "";
  }
  
  public String _initStringsTrailingWhitespaceSpecExamplesCell6() {
    return "space at the end ";
  }
  
  public String _initStringsTrailingWhitespaceSpecExamplesCell7() {
    return " ";
  }
  
  public String _initStringsTrailingWhitespaceSpecExamplesCell8() {
    return "tab at the end\t";
  }
  
  public String _initStringsTrailingWhitespaceSpecExamplesCell9() {
    return "\t";
  }
  
  public String _initStringsTrailingWhitespaceSpecExamplesCell10() {
    return "new line at the end\r";
  }
  
  public String _initStringsTrailingWhitespaceSpecExamplesCell11() {
    return "\r";
  }
  
  public String _initStringsTrailingWhitespaceSpecExamplesCell12() {
    return "new line at the end\n";
  }
  
  public String _initStringsTrailingWhitespaceSpecExamplesCell13() {
    return "\n";
  }
  
  public String _initStringsTrailingWhitespaceSpecExamplesCell14() {
    return "multiple whitespaces\t \n";
  }
  
  public String _initStringsTrailingWhitespaceSpecExamplesCell15() {
    return "\t \n";
  }
  
  public String _initStringsTrailingWhitespaceSpecExamplesCell16() {
    return "\t \n";
  }
  
  public String _initStringsTrailingWhitespaceSpecExamplesCell17() {
    return "\t \n";
  }
  
  @Test
  @Named("returns whitespaces at the end")
  @Order(1)
  public void _returnsWhitespacesAtTheEnd() throws Exception {
    final Procedure1<StringsTrailingWhitespaceSpecExamples> _function = new Procedure1<StringsTrailingWhitespaceSpecExamples>() {
        public void apply(final StringsTrailingWhitespaceSpecExamples it) {
          String _string = it.getString();
          String _trailingWhitespace = Strings.trailingWhitespace(_string);
          String _result = it.getResult();
          boolean _doubleArrow = Should.<String>operator_doubleArrow(_trailingWhitespace, _result);
          Assert.assertTrue("\nExpected string.trailingWhitespace => result but"
           + "\n     string.trailingWhitespace is " + new StringDescription().appendValue(_trailingWhitespace).toString()
           + "\n     string is " + new StringDescription().appendValue(_string).toString()
           + "\n     result is " + new StringDescription().appendValue(_result).toString() + "\n", _doubleArrow);
          
        }
      };
    Each.<StringsTrailingWhitespaceSpecExamples>forEach(this.examples, _function);
  }
}
