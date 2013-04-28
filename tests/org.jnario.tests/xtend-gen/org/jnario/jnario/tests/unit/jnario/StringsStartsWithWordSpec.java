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
import org.jnario.jnario.tests.unit.jnario.StringsStartsWithWordSpecExamples;
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

@Named("startsWithWord")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class StringsStartsWithWordSpec extends StringsSpec {
  public ExampleTable<StringsStartsWithWordSpecExamples> _initStringsStartsWithWordSpecExamples() {
    return ExampleTable.create("examples", 
      Arrays.asList("string", "word", "index"), 
      new StringsStartsWithWordSpecExamples(  Arrays.asList("\"\"", "\"hello\"", "-1"), _initStringsStartsWithWordSpecExamplesCell0(), _initStringsStartsWithWordSpecExamplesCell1(), _initStringsStartsWithWordSpecExamplesCell2()),
      new StringsStartsWithWordSpecExamples(  Arrays.asList("\"hello hi\"", "\"hello\"", "0"), _initStringsStartsWithWordSpecExamplesCell3(), _initStringsStartsWithWordSpecExamplesCell4(), _initStringsStartsWithWordSpecExamplesCell5()),
      new StringsStartsWithWordSpecExamples(  Arrays.asList("\" hello\"", "\"hello\"", "1"), _initStringsStartsWithWordSpecExamplesCell6(), _initStringsStartsWithWordSpecExamplesCell7(), _initStringsStartsWithWordSpecExamplesCell8()),
      new StringsStartsWithWordSpecExamples(  Arrays.asList("\"\\thello\"", "\"hello\"", "1"), _initStringsStartsWithWordSpecExamplesCell9(), _initStringsStartsWithWordSpecExamplesCell10(), _initStringsStartsWithWordSpecExamplesCell11()),
      new StringsStartsWithWordSpecExamples(  Arrays.asList("\"\\t hello\"", "\"hello\"", "2"), _initStringsStartsWithWordSpecExamplesCell12(), _initStringsStartsWithWordSpecExamplesCell13(), _initStringsStartsWithWordSpecExamplesCell14()),
      new StringsStartsWithWordSpecExamples(  Arrays.asList("\"\\t hell o\"", "\"hello\"", "-1"), _initStringsStartsWithWordSpecExamplesCell15(), _initStringsStartsWithWordSpecExamplesCell16(), _initStringsStartsWithWordSpecExamplesCell17())
    );
  }
  
  protected ExampleTable<StringsStartsWithWordSpecExamples> examples = _initStringsStartsWithWordSpecExamples();
  
  public String _initStringsStartsWithWordSpecExamplesCell0() {
    return "";
  }
  
  public String _initStringsStartsWithWordSpecExamplesCell1() {
    return "hello";
  }
  
  public int _initStringsStartsWithWordSpecExamplesCell2() {
    int _minus = (-1);
    return _minus;
  }
  
  public String _initStringsStartsWithWordSpecExamplesCell3() {
    return "hello hi";
  }
  
  public String _initStringsStartsWithWordSpecExamplesCell4() {
    return "hello";
  }
  
  public int _initStringsStartsWithWordSpecExamplesCell5() {
    return 0;
  }
  
  public String _initStringsStartsWithWordSpecExamplesCell6() {
    return " hello";
  }
  
  public String _initStringsStartsWithWordSpecExamplesCell7() {
    return "hello";
  }
  
  public int _initStringsStartsWithWordSpecExamplesCell8() {
    return 1;
  }
  
  public String _initStringsStartsWithWordSpecExamplesCell9() {
    return "\thello";
  }
  
  public String _initStringsStartsWithWordSpecExamplesCell10() {
    return "hello";
  }
  
  public int _initStringsStartsWithWordSpecExamplesCell11() {
    return 1;
  }
  
  public String _initStringsStartsWithWordSpecExamplesCell12() {
    return "\t hello";
  }
  
  public String _initStringsStartsWithWordSpecExamplesCell13() {
    return "hello";
  }
  
  public int _initStringsStartsWithWordSpecExamplesCell14() {
    return 2;
  }
  
  public String _initStringsStartsWithWordSpecExamplesCell15() {
    return "\t hell o";
  }
  
  public String _initStringsStartsWithWordSpecExamplesCell16() {
    return "hello";
  }
  
  public int _initStringsStartsWithWordSpecExamplesCell17() {
    int _minus = (-1);
    return _minus;
  }
  
  @Test
  @Named("examples.forEach[string.startsWithWord[word] => index]")
  @Order(1)
  public void _examplesForEachStringStartsWithWordWordIndex() throws Exception {
    final Procedure1<StringsStartsWithWordSpecExamples> _function = new Procedure1<StringsStartsWithWordSpecExamples>() {
        public void apply(final StringsStartsWithWordSpecExamples it) {
          String _string = it.getString();
          String _word = it.getWord();
          int _startsWithWord = Strings.startsWithWord(_string, _word);
          int _index = it.getIndex();
          boolean _doubleArrow = Should.<Integer>operator_doubleArrow(Integer.valueOf(_startsWithWord), Integer.valueOf(_index));
          Assert.assertTrue("\nExpected string.startsWithWord(word) => index but"
           + "\n     string.startsWithWord(word) is " + new StringDescription().appendValue(Integer.valueOf(_startsWithWord)).toString()
           + "\n     string is " + new StringDescription().appendValue(_string).toString()
           + "\n     word is " + new StringDescription().appendValue(_word).toString()
           + "\n     index is " + new StringDescription().appendValue(Integer.valueOf(_index)).toString() + "\n", _doubleArrow);
          
        }
      };
    Each.<StringsStartsWithWordSpecExamples>forEach(this.examples, _function);
  }
}
