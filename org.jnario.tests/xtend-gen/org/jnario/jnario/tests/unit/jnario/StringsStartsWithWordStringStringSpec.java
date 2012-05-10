package org.jnario.jnario.tests.unit.jnario;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.jnario.tests.unit.jnario.StringsSpec;
import org.jnario.jnario.tests.unit.jnario.StringsStartsWithWordStringStringSpecExamples;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.util.Strings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("startsWithWord[String, String]")
public class StringsStartsWithWordStringStringSpec extends StringsSpec {
  @Before
  public void _initStringsStartsWithWordStringStringSpecExamples() {
    
    int _minus = (-1);
    int _minus_1 = (-1);examples = ExampleTable.create("examples", 
      java.util.Arrays.asList("string", "word", "index"), 
      new StringsStartsWithWordStringStringSpecExamples(  java.util.Arrays.asList("\"\"", "\"hello\"", "-1"), "", "hello", _minus),
      new StringsStartsWithWordStringStringSpecExamples(  java.util.Arrays.asList("\"hello hi\"", "\"hello\"", "0"), "hello hi", "hello", 0),
      new StringsStartsWithWordStringStringSpecExamples(  java.util.Arrays.asList("\" hello\"", "\"hello\"", "1"), " hello", "hello", 1),
      new StringsStartsWithWordStringStringSpecExamples(  java.util.Arrays.asList("\"\\thello\"", "\"hello\"", "1"), "\thello", "hello", 1),
      new StringsStartsWithWordStringStringSpecExamples(  java.util.Arrays.asList("\"\\t hello\"", "\"hello\"", "2"), "\t hello", "hello", 2),
      new StringsStartsWithWordStringStringSpecExamples(  java.util.Arrays.asList("\"\\t hell o\"", "\"hello\"", "-1"), "\t hell o", "hello", _minus_1)
    );
  }
  
  protected ExampleTable<StringsStartsWithWordStringStringSpecExamples> examples;
  
  @Test
  @Named("examples.forEach[string.startsWithWord[word] => index]")
  @Order(99)
  public void examplesForEachStringStartsWithWordWordIndex() throws Exception {
    final Procedure1<StringsStartsWithWordStringStringSpecExamples> _function = new Procedure1<StringsStartsWithWordStringStringSpecExamples>() {
        public void apply(final StringsStartsWithWordStringStringSpecExamples it) {
          int _startsWithWord = Strings.startsWithWord(it.string, it.word);
          boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_startsWithWord), Integer.valueOf(it.index));Assert
          .assertTrue("\nExpected string.startsWithWord(word) => index but"
           + "\n     string.startsWithWord(word) is " + Integer.valueOf(_startsWithWord)
           + "\n     string is " + "\"" + it.string + "\""
           + "\n     word is " + "\"" + it.word + "\""
           + "\n     index is " + Integer.valueOf(it.index) + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<StringsStartsWithWordStringStringSpecExamples>forEach(this.examples, _function);
  }
}
