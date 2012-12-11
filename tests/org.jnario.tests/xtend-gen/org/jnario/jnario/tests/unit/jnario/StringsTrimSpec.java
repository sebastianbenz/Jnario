package org.jnario.jnario.tests.unit.jnario;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.jnario.tests.unit.jnario.StringsSpec;
import org.jnario.jnario.tests.unit.jnario.StringsTrimSpecExamples;
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
@Named("trim")
@RunWith(ExampleGroupRunner.class)
public class StringsTrimSpec extends StringsSpec {
  public ExampleTable<StringsTrimSpecExamples> _initStringsTrimSpecExamples() {
    return ExampleTable.create("examples", 
      java.util.Arrays.asList("string", "result"), 
      new StringsTrimSpecExamples(  java.util.Arrays.asList("null", "null"), null, null),
      new StringsTrimSpecExamples(  java.util.Arrays.asList("\"\"", "\"\""), "", ""),
      new StringsTrimSpecExamples(  java.util.Arrays.asList("\"_hello\"", "\"hello\""), "_hello", "hello"),
      new StringsTrimSpecExamples(  java.util.Arrays.asList("\"hello_world_\"", "\"hello_world\""), "hello_world_", "hello_world"),
      new StringsTrimSpecExamples(  java.util.Arrays.asList("\"_hello_\"", "\"hello\""), "_hello_", "hello"),
      new StringsTrimSpecExamples(  java.util.Arrays.asList("\"__hello__\"", "\"hello\""), "__hello__", "hello"),
      new StringsTrimSpecExamples(  java.util.Arrays.asList("\"____\"", "\"\""), "____", "")
    );
  }
  
  protected ExampleTable<StringsTrimSpecExamples> examples = _initStringsTrimSpecExamples();
  
  @Test
  @Named("removes the specified leading and trailing character")
  @Order(3)
  public void _removesTheSpecifiedLeadingAndTrailingCharacter() throws Exception {
    final Procedure1<StringsTrimSpecExamples> _function = new Procedure1<StringsTrimSpecExamples>() {
        public void apply(final StringsTrimSpecExamples it) {
          char _charAt = "_".charAt(0);
          String _trim = Strings.trim(it.string, _charAt);
          boolean _doubleArrow = Should.operator_doubleArrow(_trim, it.result);
          Assert.assertTrue("\nExpected string.trim(\'_\'.charAt(0)) => result but"
           + "\n     string.trim(\'_\'.charAt(0)) is " + new StringDescription().appendValue(_trim).toString()
           + "\n     string is " + new StringDescription().appendValue(it.string).toString()
           + "\n     \'_\'.charAt(0) is " + new StringDescription().appendValue(_charAt).toString()
           + "\n     result is " + new StringDescription().appendValue(it.result).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<StringsTrimSpecExamples>forEach(this.examples, _function);
  }
}
