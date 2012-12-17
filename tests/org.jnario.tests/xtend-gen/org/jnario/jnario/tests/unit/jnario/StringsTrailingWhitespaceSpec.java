package org.jnario.jnario.tests.unit.jnario;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.jnario.tests.unit.jnario.StringsSpec;
import org.jnario.jnario.tests.unit.jnario.StringsTrailingWhitespaceSpecExamples;
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
@Named("trailingWhitespace")
@RunWith(ExampleGroupRunner.class)
public class StringsTrailingWhitespaceSpec extends StringsSpec {
  public ExampleTable<StringsTrailingWhitespaceSpecExamples> _initStringsTrailingWhitespaceSpecExamples() {
    return ExampleTable.create("examples", 
      java.util.Arrays.asList("string", "result"), 
      new StringsTrailingWhitespaceSpecExamples(  java.util.Arrays.asList("null", "\"\""), null, ""),
      new StringsTrailingWhitespaceSpecExamples(  java.util.Arrays.asList("\"\"", "\"\""), "", ""),
      new StringsTrailingWhitespaceSpecExamples(  java.util.Arrays.asList("\"no whitespace\"", "\"\""), "no whitespace", ""),
      new StringsTrailingWhitespaceSpecExamples(  java.util.Arrays.asList("\"space at the end \"", "\" \""), "space at the end ", " "),
      new StringsTrailingWhitespaceSpecExamples(  java.util.Arrays.asList("\"tab at the end\\t\"", "\"\\t\""), "tab at the end\t", "\t"),
      new StringsTrailingWhitespaceSpecExamples(  java.util.Arrays.asList("\"new line at the end\\r\"", "\"\\r\""), "new line at the end\r", "\r"),
      new StringsTrailingWhitespaceSpecExamples(  java.util.Arrays.asList("\"new line at the end\\n\"", "\"\\n\""), "new line at the end\n", "\n"),
      new StringsTrailingWhitespaceSpecExamples(  java.util.Arrays.asList("\"multiple whitespaces\\t \\n\"", "\"\\t \\n\""), "multiple whitespaces\t \n", "\t \n"),
      new StringsTrailingWhitespaceSpecExamples(  java.util.Arrays.asList("\"\\t \\n\"", "\"\\t \\n\""), "\t \n", "\t \n")
    );
  }
  
  protected ExampleTable<StringsTrailingWhitespaceSpecExamples> examples = _initStringsTrailingWhitespaceSpecExamples();
  
  @Test
  @Named("returns whitespaces at the end")
  @Order(4)
  public void _returnsWhitespacesAtTheEnd() throws Exception {
    final Procedure1<StringsTrailingWhitespaceSpecExamples> _function = new Procedure1<StringsTrailingWhitespaceSpecExamples>() {
        public void apply(final StringsTrailingWhitespaceSpecExamples it) {
          String _trailingWhitespace = Strings.trailingWhitespace(it.string);
          boolean _doubleArrow = Should.operator_doubleArrow(_trailingWhitespace, it.result);
          Assert.assertTrue("\nExpected string.trailingWhitespace => result but"
           + "\n     string.trailingWhitespace is " + new StringDescription().appendValue(_trailingWhitespace).toString()
           + "\n     string is " + new StringDescription().appendValue(it.string).toString()
           + "\n     result is " + new StringDescription().appendValue(it.result).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<StringsTrailingWhitespaceSpecExamples>forEach(this.examples, _function);
  }
}
