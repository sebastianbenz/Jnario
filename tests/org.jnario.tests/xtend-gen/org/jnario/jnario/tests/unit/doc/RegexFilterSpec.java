package org.jnario.jnario.tests.unit.doc;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.doc.Filter;
import org.jnario.doc.RegexFilter;
import org.jnario.jnario.tests.unit.doc.RegexFilterSpecFilteringExamples;
import org.jnario.lib.Assert;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("RegexFilter")
@RunWith(ExampleGroupRunner.class)
public class RegexFilterSpec {
  public ExampleTable<RegexFilterSpecFilteringExamples> _initRegexFilterSpecFilteringExamples() {
    return ExampleTable.create("filteringExamples", 
      java.util.Arrays.asList("string", "regex", "result"), 
      new RegexFilterSpecFilteringExamples(  java.util.Arrays.asList("\"hello\"", "\"e\"", "\"hllo\""), "hello", "e", "hllo"),
      new RegexFilterSpecFilteringExamples(  java.util.Arrays.asList("\"aabbaa\"", "\"b*\"", "\"aaaa\""), "aabbaa", "b*", "aaaa"),
      new RegexFilterSpecFilteringExamples(  java.util.Arrays.asList("\"aa.aa\"", "\"\\\\.\"", "\"aaaa\""), "aa.aa", "\\.", "aaaa"),
      new RegexFilterSpecFilteringExamples(  java.util.Arrays.asList("\"aa \'\'\'some code\'\'\' aa\"", "\"aa|\'\'\'\"", "\" some code \""), "aa \'\'\'some code\'\'\' aa", "aa|\'\'\'", " some code "),
      new RegexFilterSpecFilteringExamples(  java.util.Arrays.asList("\"\\n\'\'\'.methodCall\"", "\"\\\\.methodCall\"", "\"\\n\'\'\'\""), "\n\'\'\'.methodCall", "\\.methodCall", "\n\'\'\'")
    );
  }
  
  protected ExampleTable<RegexFilterSpecFilteringExamples> filteringExamples = _initRegexFilterSpecFilteringExamples();
  
  @Test
  @Named("removes all matched elements")
  @Order(1)
  public void _removesAllMatchedElements() throws Exception {
    final Procedure1<RegexFilterSpecFilteringExamples> _function = new Procedure1<RegexFilterSpecFilteringExamples>() {
        public void apply(final RegexFilterSpecFilteringExamples it) {
          final Filter filter = RegexFilter.create(it.regex);
          String _apply = filter.apply(it.string);
          boolean _doubleArrow = Should.operator_doubleArrow(_apply, it.result);
          Assert.assertTrue("\nExpected filter.apply(string) => result but"
           + "\n     filter.apply(string) is " + new StringDescription().appendValue(_apply).toString()
           + "\n     filter is " + new StringDescription().appendValue(filter).toString()
           + "\n     string is " + new StringDescription().appendValue(it.string).toString()
           + "\n     result is " + new StringDescription().appendValue(it.result).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<RegexFilterSpecFilteringExamples>forEach(this.filteringExamples, _function);
  }
}
