package org.jnario.suite.unit;

import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.lib.Assert;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.suite.conversion.PatternValueConverter;
import org.jnario.suite.unit.PatternValueConverterSpec;
import org.jnario.suite.unit.PatternValueConverterToStringStringSpecExamples;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("toString[String]")
@RunWith(ExampleGroupRunner.class)
public class PatternValueConverterToStringStringSpec extends PatternValueConverterSpec {
  @Subject
  public PatternValueConverter subject;
  
  public ExampleTable<PatternValueConverterToStringStringSpecExamples> _initPatternValueConverterToStringStringSpecExamples() {
    return ExampleTable.create("examples", 
      java.util.Arrays.asList("input", "result"), 
      new PatternValueConverterToStringStringSpecExamples(  java.util.Arrays.asList("null", "\"\\\\\\\\\""), null, "\\\\"),
      new PatternValueConverterToStringStringSpecExamples(  java.util.Arrays.asList("\"\"", "\"\\\\\\\\\""), "", "\\\\"),
      new PatternValueConverterToStringStringSpecExamples(  java.util.Arrays.asList("\"apattern\"", "\"\\\\apattern\\\\\""), "apattern", "\\apattern\\")
    );
  }
  
  protected ExampleTable<PatternValueConverterToStringStringSpecExamples> examples = _initPatternValueConverterToStringStringSpecExamples();
  
  @Test
  @Named("examples.forEach[subject.toString[input] => result + newLine]")
  @Order(1)
  public void _examplesForEachSubjectToStringInputResultNewLine() throws Exception {
    final Procedure1<PatternValueConverterToStringStringSpecExamples> _function = new Procedure1<PatternValueConverterToStringStringSpecExamples>() {
        public void apply(final PatternValueConverterToStringStringSpecExamples it) {
          String _string = PatternValueConverterToStringStringSpec.this.subject.toString(it.input);
          String _newLine = Strings.newLine();
          String _plus = (it.result + _newLine);
          boolean _doubleArrow = Should.operator_doubleArrow(_string, _plus);
          Assert.assertTrue("\nExpected subject.toString(input) => result + newLine but"
           + "\n     subject.toString(input) is " + new StringDescription().appendValue(_string).toString()
           + "\n     subject is " + new StringDescription().appendValue(PatternValueConverterToStringStringSpec.this.subject).toString()
           + "\n     input is " + new StringDescription().appendValue(it.input).toString()
           + "\n     result + newLine is " + new StringDescription().appendValue(_plus).toString()
           + "\n     result is " + new StringDescription().appendValue(it.result).toString()
           + "\n     newLine is " + new StringDescription().appendValue(_newLine).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<PatternValueConverterToStringStringSpecExamples>forEach(this.examples, _function);
  }
}
