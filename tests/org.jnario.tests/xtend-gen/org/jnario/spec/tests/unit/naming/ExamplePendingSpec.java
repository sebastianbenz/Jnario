package org.jnario.spec.tests.unit.naming;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.lib.Assert;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.tests.unit.naming.ExamplePendingSpecExamples;
import org.jnario.spec.tests.unit.naming.ExampleSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("Pending")
@RunWith(ExampleGroupRunner.class)
public class ExamplePendingSpec extends ExampleSpec {
  public ExampleTable<ExamplePendingSpecExamples> _initExamplePendingSpecExamples() {
    return ExampleTable.create("examples", 
      java.util.Arrays.asList("example", "expected"), 
      new ExamplePendingSpecExamples(  java.util.Arrays.asList("\"fact \'with description\'\"", "true"), "fact \'with description\'", true),
      new ExamplePendingSpecExamples(  java.util.Arrays.asList("\"fact \'with description and empty block\' {}\"", "true"), "fact \'with description and empty block\' {}", true),
      new ExamplePendingSpecExamples(  java.util.Arrays.asList("\"fact \'with description and code block\' {1 => 1}\"", "false"), "fact \'with description and code block\' {1 => 1}", false),
      new ExamplePendingSpecExamples(  java.util.Arrays.asList("\"fact 1 => 1\"", "false"), "fact 1 => 1", false),
      new ExamplePendingSpecExamples(  java.util.Arrays.asList("\"pending fact \'with description and code block\' {1 => 1}\"", "true"), "pending fact \'with description and code block\' {1 => 1}", true)
    );
  }
  
  protected ExampleTable<ExamplePendingSpecExamples> examples = _initExamplePendingSpecExamples();
  
  @Test
  @Named("examples.forEach[pendingStateOf[example] should be expected]")
  @Order(3)
  public void _examplesForEachPendingStateOfExampleShouldBeExpected() throws Exception {
    final Procedure1<ExamplePendingSpecExamples> _function = new Procedure1<ExamplePendingSpecExamples>() {
        public void apply(final ExamplePendingSpecExamples it) {
          boolean _pendingStateOf = ExamplePendingSpec.this.pendingStateOf(it.example);
          boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_pendingStateOf), it.expected);
          Assert.assertTrue("\nExpected pendingStateOf(example) should be expected but"
           + "\n     pendingStateOf(example) is " + new StringDescription().appendValue(Boolean.valueOf(_pendingStateOf)).toString()
           + "\n     example is " + new StringDescription().appendValue(it.example).toString()
           + "\n     expected is " + new StringDescription().appendValue(it.expected).toString() + "\n", _should_be);
          
        }
      };
    ExampleTableIterators.<ExamplePendingSpecExamples>forEach(this.examples, _function);
  }
}
