package org.jnario.feature.tests.unit.naming;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.feature.tests.unit.naming.StepNameProviderRemoveArgumentsSpecExamples;
import org.jnario.feature.tests.unit.naming.StepNameProviderSpec;
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
@Named("removeArguments")
@RunWith(ExampleGroupRunner.class)
public class StepNameProviderRemoveArgumentsSpec extends StepNameProviderSpec {
  public ExampleTable<StepNameProviderRemoveArgumentsSpecExamples> _initStepNameProviderRemoveArgumentsSpecExamples() {
    return ExampleTable.create("examples", 
      java.util.Arrays.asList("step", "result"), 
      new StepNameProviderRemoveArgumentsSpecExamples(  java.util.Arrays.asList("\'Given a \"value\"\'", "\'Given a \"\"\'"), "Given a \"value\"", "Given a \"\""),
      new StepNameProviderRemoveArgumentsSpecExamples(  java.util.Arrays.asList("\'Given a \"value\" and \"anothervalue\"\'", "\'Given a \"\" and \"\"\'"), "Given a \"value\" and \"anothervalue\"", "Given a \"\" and \"\"")
    );
  }
  
  protected ExampleTable<StepNameProviderRemoveArgumentsSpecExamples> examples = _initStepNameProviderRemoveArgumentsSpecExamples();
  
  @Test
  @Named("examples do pass")
  @Order(9)
  public void _examplesDoPass() throws Exception {
    final Procedure1<StepNameProviderRemoveArgumentsSpecExamples> _function = new Procedure1<StepNameProviderRemoveArgumentsSpecExamples>() {
        public void apply(final StepNameProviderRemoveArgumentsSpecExamples it) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Scenario: scenario");
          _builder.newLine();
          _builder.append(it.step, "");
          _builder.newLineIfNotEmpty();
          StepNameProviderRemoveArgumentsSpec.this.parseScenario(_builder);
          String _removeArguments = StepNameProviderRemoveArgumentsSpec.this.subject.removeArguments(it.step);
          boolean _doubleArrow = Should.operator_doubleArrow(_removeArguments, it.result);
          Assert.assertTrue("\nExpected subject.removeArguments(step) => result but"
           + "\n     subject.removeArguments(step) is " + new StringDescription().appendValue(_removeArguments).toString()
           + "\n     subject is " + new StringDescription().appendValue(StepNameProviderRemoveArgumentsSpec.this.subject).toString()
           + "\n     step is " + new StringDescription().appendValue(it.step).toString()
           + "\n     result is " + new StringDescription().appendValue(it.result).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<StepNameProviderRemoveArgumentsSpecExamples>forEach(this.examples, _function);
  }
}
