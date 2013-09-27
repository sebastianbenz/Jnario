/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.tests.unit.doc;

import java.util.Arrays;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.doc.Filter;
import org.jnario.doc.RegexFilter;
import org.jnario.jnario.tests.unit.doc.RegexFilterSpecFilteringExamples;
import org.jnario.lib.Assert;
import org.jnario.lib.Each;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("RegexFilter")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class RegexFilterSpec {
  public ExampleTable<RegexFilterSpecFilteringExamples> _initRegexFilterSpecFilteringExamples() {
    return ExampleTable.create("filteringExamples", 
      Arrays.asList("string", "regex", "result"), 
      new RegexFilterSpecFilteringExamples(  Arrays.asList("\"hello\"", "\"e\"", "\"hllo\""), _initRegexFilterSpecFilteringExamplesCell0(), _initRegexFilterSpecFilteringExamplesCell1(), _initRegexFilterSpecFilteringExamplesCell2()),
      new RegexFilterSpecFilteringExamples(  Arrays.asList("\"aabbaa\"", "\"b*\"", "\"aaaa\""), _initRegexFilterSpecFilteringExamplesCell3(), _initRegexFilterSpecFilteringExamplesCell4(), _initRegexFilterSpecFilteringExamplesCell5()),
      new RegexFilterSpecFilteringExamples(  Arrays.asList("\"aa.aa\"", "\"\\\\.\"", "\"aaaa\""), _initRegexFilterSpecFilteringExamplesCell6(), _initRegexFilterSpecFilteringExamplesCell7(), _initRegexFilterSpecFilteringExamplesCell8()),
      new RegexFilterSpecFilteringExamples(  Arrays.asList("\"aa \'\'\'some code\'\'\' aa\"", "\"aa|\'\'\'\"", "\" some code \""), _initRegexFilterSpecFilteringExamplesCell9(), _initRegexFilterSpecFilteringExamplesCell10(), _initRegexFilterSpecFilteringExamplesCell11()),
      new RegexFilterSpecFilteringExamples(  Arrays.asList("\"\\n\'\'\'.methodCall\"", "\"\\\\.methodCall\"", "\"\\n\'\'\'\""), _initRegexFilterSpecFilteringExamplesCell12(), _initRegexFilterSpecFilteringExamplesCell13(), _initRegexFilterSpecFilteringExamplesCell14())
    );
  }
  
  protected ExampleTable<RegexFilterSpecFilteringExamples> filteringExamples = _initRegexFilterSpecFilteringExamples();
  
  public String _initRegexFilterSpecFilteringExamplesCell0() {
    return "hello";
  }
  
  public String _initRegexFilterSpecFilteringExamplesCell1() {
    return "e";
  }
  
  public String _initRegexFilterSpecFilteringExamplesCell2() {
    return "hllo";
  }
  
  public String _initRegexFilterSpecFilteringExamplesCell3() {
    return "aabbaa";
  }
  
  public String _initRegexFilterSpecFilteringExamplesCell4() {
    return "b*";
  }
  
  public String _initRegexFilterSpecFilteringExamplesCell5() {
    return "aaaa";
  }
  
  public String _initRegexFilterSpecFilteringExamplesCell6() {
    return "aa.aa";
  }
  
  public String _initRegexFilterSpecFilteringExamplesCell7() {
    return "\\.";
  }
  
  public String _initRegexFilterSpecFilteringExamplesCell8() {
    return "aaaa";
  }
  
  public String _initRegexFilterSpecFilteringExamplesCell9() {
    return "aa \'\'\'some code\'\'\' aa";
  }
  
  public String _initRegexFilterSpecFilteringExamplesCell10() {
    return "aa|\'\'\'";
  }
  
  public String _initRegexFilterSpecFilteringExamplesCell11() {
    return " some code ";
  }
  
  public String _initRegexFilterSpecFilteringExamplesCell12() {
    return "\n\'\'\'.methodCall";
  }
  
  public String _initRegexFilterSpecFilteringExamplesCell13() {
    return "\\.methodCall";
  }
  
  public String _initRegexFilterSpecFilteringExamplesCell14() {
    return "\n\'\'\'";
  }
  
  @Test
  @Named("removes all matched elements")
  @Order(1)
  public void _removesAllMatchedElements() throws Exception {
    final Procedure1<RegexFilterSpecFilteringExamples> _function = new Procedure1<RegexFilterSpecFilteringExamples>() {
      public void apply(final RegexFilterSpecFilteringExamples it) {
        String _regex = it.getRegex();
        final Filter filter = RegexFilter.create(_regex);
        String _string = it.getString();
        String _apply = filter.apply(_string);
        String _result = it.getResult();
        boolean _doubleArrow = Should.<String>operator_doubleArrow(_apply, _result);
        Assert.assertTrue("\nExpected filter.apply(string) => result but"
         + "\n     filter.apply(string) is " + new org.hamcrest.StringDescription().appendValue(_apply).toString()
         + "\n     filter is " + new org.hamcrest.StringDescription().appendValue(filter).toString()
         + "\n     string is " + new org.hamcrest.StringDescription().appendValue(_string).toString()
         + "\n     result is " + new org.hamcrest.StringDescription().appendValue(_result).toString() + "\n", _doubleArrow);
        
      }
    };
    Each.<RegexFilterSpecFilteringExamples>forEach(this.filteringExamples, _function);
  }
}
