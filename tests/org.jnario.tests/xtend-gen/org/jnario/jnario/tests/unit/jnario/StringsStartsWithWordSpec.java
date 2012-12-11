package org.jnario.jnario.tests.unit.jnario;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.jnario.tests.unit.jnario.StringsSpec;
import org.jnario.jnario.tests.unit.jnario.StringsStartsWithWordSpecExamples;
import org.jnario.lib.Assert;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.util.Strings;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("startsWithWord")
@RunWith(ExampleGroupRunner.class)
public class StringsStartsWithWordSpec extends StringsSpec {
  public ExampleTable<StringsStartsWithWordSpecExamples> _initStringsStartsWithWordSpecExamples() {
    
    int _minus = (-1);
    int _minus_1 = (-1);return ExampleTable.create("examples", 
      java.util.Arrays.asList("string", "word", "index"), 
      new StringsStartsWithWordSpecExamples(  java.util.Arrays.asList("\"\"", "\"hello\"", "-1"), "", "hello", _minus),
      new StringsStartsWithWordSpecExamples(  java.util.Arrays.asList("\"hello hi\"", "\"hello\"", "0"), "hello hi", "hello", 0),
      new StringsStartsWithWordSpecExamples(  java.util.Arrays.asList("\" hello\"", "\"hello\"", "1"), " hello", "hello", 1),
      new StringsStartsWithWordSpecExamples(  java.util.Arrays.asList("\"\\thello\"", "\"hello\"", "1"), "\thello", "hello", 1),
      new StringsStartsWithWordSpecExamples(  java.util.Arrays.asList("\"\\t hello\"", "\"hello\"", "2"), "\t hello", "hello", 2),
      new StringsStartsWithWordSpecExamples(  java.util.Arrays.asList("\"\\t hell o\"", "\"hello\"", "-1"), "\t hell o", "hello", _minus_1)
    );
  }
  
  protected ExampleTable<StringsStartsWithWordSpecExamples> examples = _initStringsStartsWithWordSpecExamples();
  
  @Test
  @Named("examples.forEach[string.startsWithWord[word] => index]")
  @Order(1)
  public void _examplesForEachStringStartsWithWordWordIndex() throws Exception {
    final Procedure1<StringsStartsWithWordSpecExamples> _function = new Procedure1<StringsStartsWithWordSpecExamples>() {
        public void apply(final StringsStartsWithWordSpecExamples it) {
          int _startsWithWord = Strings.startsWithWord(it.string, it.word);
          boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_startsWithWord), Integer.valueOf(it.index));
          Assert.assertTrue("\nExpected string.startsWithWord(word) => index but"
           + "\n     string.startsWithWord(word) is " + new StringDescription().appendValue(Integer.valueOf(_startsWithWord)).toString()
           + "\n     string is " + new StringDescription().appendValue(it.string).toString()
           + "\n     word is " + new StringDescription().appendValue(it.word).toString()
           + "\n     index is " + new StringDescription().appendValue(Integer.valueOf(it.index)).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<StringsStartsWithWordSpecExamples>forEach(this.examples, _function);
  }
}
