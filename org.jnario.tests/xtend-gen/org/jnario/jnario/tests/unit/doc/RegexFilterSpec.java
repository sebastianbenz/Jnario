package org.jnario.jnario.tests.unit.doc;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.doc.Filter;
import org.jnario.doc.RegexFilter;
import org.jnario.jnario.tests.unit.doc.RegexFilterSpecFilteringExamples;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("RegexFilter")
public class RegexFilterSpec {
  @Before
  public void _initRegexFilterSpecFilteringExamples() {
    filteringExamples = ExampleTable.create("filteringExamples", 
      java.util.Arrays.asList("string", "regex", "result"), 
      new RegexFilterSpecFilteringExamples(  java.util.Arrays.asList("\"hello\"", "\"e\"", "\"hllo\""), "hello", "e", "hllo"),
      new RegexFilterSpecFilteringExamples(  java.util.Arrays.asList("\"aabbaa\"", "\"b*\"", "\"aaaa\""), "aabbaa", "b*", "aaaa"),
      new RegexFilterSpecFilteringExamples(  java.util.Arrays.asList("\"aa.aa\"", "\"\\\\.\"", "\"aaaa\""), "aa.aa", "\\.", "aaaa"),
      new RegexFilterSpecFilteringExamples(  java.util.Arrays.asList("\"aa \'\'\'some code\'\'\' aa\"", "\"aa|\'\'\'\"", "\" some code \""), "aa \'\'\'some code\'\'\' aa", "aa|\'\'\'", " some code "),
      new RegexFilterSpecFilteringExamples(  java.util.Arrays.asList("\"\\n\'\'\'.methodCall\"", "\"\\\\.methodCall\"", "\"\\n\'\'\'\""), "\n\'\'\'.methodCall", "\\.methodCall", "\n\'\'\'")
    );
  }
  
  protected ExampleTable<RegexFilterSpecFilteringExamples> filteringExamples;
  
  @Test
  @Named("removes all matched elements")
  @Order(99)
  public void removesAllMatchedElements() throws Exception {
    final Procedure1<RegexFilterSpecFilteringExamples> _function = new Procedure1<RegexFilterSpecFilteringExamples>() {
        public void apply(final RegexFilterSpecFilteringExamples it) {
          final Filter filter = RegexFilter.create(it.regex);
          String _apply = filter.apply(it.string);
          boolean _doubleArrow = Should.operator_doubleArrow(_apply, it.result);
          Assert.assertTrue("\nExpected filter.apply(string) => result but"
           + "\n     filter.apply(string) is " + "\"" + _apply + "\""
           + "\n     filter is " + filter
           + "\n     string is " + "\"" + it.string + "\""
           + "\n     result is " + "\"" + it.result + "\"" + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<RegexFilterSpecFilteringExamples>forEach(this.filteringExamples, _function);
  }
}
