package org.jnario.suite.unit;

import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
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
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("toString[String]")
public class PatternValueConverterToStringStringSpec extends PatternValueConverterSpec {
  @Subject
  public PatternValueConverter subject;
  
  @Before
  public void _initPatternValueConverterToStringStringSpecExamples() {
    examples = ExampleTable.create("examples", 
      java.util.Arrays.asList("input", "result"), 
      new PatternValueConverterToStringStringSpecExamples(  java.util.Arrays.asList("null", "\"\\\\\\\\\""), null, "\\\\"),
      new PatternValueConverterToStringStringSpecExamples(  java.util.Arrays.asList("\"\"", "\"\\\\\\\\\""), "", "\\\\"),
      new PatternValueConverterToStringStringSpecExamples(  java.util.Arrays.asList("\"apattern\"", "\"\\\\apattern\\\\\""), "apattern", "\\apattern\\")
    );
  }
  
  protected ExampleTable<PatternValueConverterToStringStringSpecExamples> examples;
  
  @Test
  @Named("examples.forEach[subject.toString[input] => result + newLine]")
  @Order(99)
  public void examplesForEachSubjectToStringInputResultNewLine() throws Exception {
    final Procedure1<PatternValueConverterToStringStringSpecExamples> _function = new Procedure1<PatternValueConverterToStringStringSpecExamples>() {
        public void apply(final PatternValueConverterToStringStringSpecExamples it) {
          String _string = PatternValueConverterToStringStringSpec.this.subject.toString(it.input);
          String _newLine = Strings.newLine();
          String _plus = (it.result + _newLine);
          boolean _doubleArrow = Should.operator_doubleArrow(_string, _plus);
          Assert.assertTrue("\nExpected subject.toString(input) => result + newLine but"
           + "\n     subject.toString(input) is " + "\"" + _string + "\""
           + "\n     subject is " + PatternValueConverterToStringStringSpec.this.subject
           + "\n     input is " + "\"" + it.input + "\""
           + "\n     result + newLine is " + "\"" + _plus + "\""
           + "\n     result is " + "\"" + it.result + "\""
           + "\n     newLine is " + "\"" + _newLine + "\"" + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<PatternValueConverterToStringStringSpecExamples>forEach(this.examples, _function);
  }
}
