package org.jnario.suite.unit;

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
import org.jnario.suite.unit.PatternValueConverterToValueStringINodeSpecExamples;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("toValue[String, INode]")
@RunWith(ExampleGroupRunner.class)
public class PatternValueConverterToValueStringINodeSpec extends PatternValueConverterSpec {
  @Subject
  public PatternValueConverter subject;
  
  public ExampleTable<PatternValueConverterToValueStringINodeSpecExamples> _initPatternValueConverterToValueStringINodeSpecExamples() {
    return ExampleTable.create("examples", 
      java.util.Arrays.asList("input", "result"), 
      new PatternValueConverterToValueStringINodeSpecExamples(  java.util.Arrays.asList("null", "null"), null, null),
      new PatternValueConverterToValueStringINodeSpecExamples(  java.util.Arrays.asList("\"\"", "null"), "", null),
      new PatternValueConverterToValueStringINodeSpecExamples(  java.util.Arrays.asList("\"\\\\apattern\\\\\"", "\"apattern\""), "\\apattern\\", "apattern")
    );
  }
  
  protected ExampleTable<PatternValueConverterToValueStringINodeSpecExamples> examples = _initPatternValueConverterToValueStringINodeSpecExamples();
  
  @Test
  @Named("examples.forEach[subject.toValue[input, null] => result]")
  @Order(2)
  public void _examplesForEachSubjectToValueInputNullResult() throws Exception {
    final Procedure1<PatternValueConverterToValueStringINodeSpecExamples> _function = new Procedure1<PatternValueConverterToValueStringINodeSpecExamples>() {
        public void apply(final PatternValueConverterToValueStringINodeSpecExamples it) {
          String _value = PatternValueConverterToValueStringINodeSpec.this.subject.toValue(it.input, null);
          boolean _doubleArrow = Should.operator_doubleArrow(_value, it.result);
          Assert.assertTrue("\nExpected subject.toValue(input, null) => result but"
           + "\n     subject.toValue(input, null) is " + new StringDescription().appendValue(_value).toString()
           + "\n     subject is " + new StringDescription().appendValue(PatternValueConverterToValueStringINodeSpec.this.subject).toString()
           + "\n     input is " + new StringDescription().appendValue(it.input).toString()
           + "\n     result is " + new StringDescription().appendValue(it.result).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<PatternValueConverterToValueStringINodeSpecExamples>forEach(this.examples, _function);
  }
}
