package org.jnario.feature.tests.unit.naming;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.feature.tests.unit.naming.StepNameProviderRemoveKeywordsAndArgumentsStringSpecExamples;
import org.jnario.feature.tests.unit.naming.StepNameProviderSpec;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("removeKeywordsAndArguments[String]")
public class StepNameProviderRemoveKeywordsAndArgumentsStringSpec extends StepNameProviderSpec {
  @Before
  public void _initStepNameProviderRemoveKeywordsAndArgumentsStringSpecExamples() {
    examples = ExampleTable.create("examples", 
      java.util.Arrays.asList("step", "result"), 
      new StepNameProviderRemoveKeywordsAndArgumentsStringSpecExamples(  java.util.Arrays.asList("\'Given a step\'", "\'a step\'"), "Given a step", "a step"),
      new StepNameProviderRemoveKeywordsAndArgumentsStringSpecExamples(  java.util.Arrays.asList("\'Then a step\'", "\'a step\'"), "Then a step", "a step"),
      new StepNameProviderRemoveKeywordsAndArgumentsStringSpecExamples(  java.util.Arrays.asList("\'When a step\'", "\'a step\'"), "When a step", "a step"),
      new StepNameProviderRemoveKeywordsAndArgumentsStringSpecExamples(  java.util.Arrays.asList("\'And a step\'", "\'a step\'"), "And a step", "a step"),
      new StepNameProviderRemoveKeywordsAndArgumentsStringSpecExamples(  java.util.Arrays.asList("\'Given a \"value\"\'", "\'a \"\"\'"), "Given a \"value\"", "a \"\""),
      new StepNameProviderRemoveKeywordsAndArgumentsStringSpecExamples(  java.util.Arrays.asList("\'Given a \"value\" and \"anothervalue\"\'", "\'a \"\" and \"\"\'"), "Given a \"value\" and \"anothervalue\"", "a \"\" and \"\"")
    );
  }
  
  protected ExampleTable<StepNameProviderRemoveKeywordsAndArgumentsStringSpecExamples> examples;
  
  @Test
  @Named("examples do pass")
  @Order(99)
  public void examplesDoPass() throws Exception {
    final Procedure1<StepNameProviderRemoveKeywordsAndArgumentsStringSpecExamples> _function = new Procedure1<StepNameProviderRemoveKeywordsAndArgumentsStringSpecExamples>() {
        public void apply(final StepNameProviderRemoveKeywordsAndArgumentsStringSpecExamples it) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Scenario: scenario");
          _builder.newLine();
          _builder.append(it.step, "");
          _builder.newLineIfNotEmpty();
          StepNameProviderRemoveKeywordsAndArgumentsStringSpec.this.parseScenario(_builder);
          String _removeKeywordsAndArguments = StepNameProviderRemoveKeywordsAndArgumentsStringSpec.this.subject.removeKeywordsAndArguments(it.step);
          boolean _doubleArrow = ObjectExtensions.<String>operator_doubleArrow(_removeKeywordsAndArguments, it.result);
          Assert.assertTrue("\nExpected subject.removeKeywordsAndArguments(step) => result but"
           + "\n     subject.removeKeywordsAndArguments(step) is " + "\"" + _removeKeywordsAndArguments + "\""
           + "\n     subject is " + StepNameProviderRemoveKeywordsAndArgumentsStringSpec.this.subject
           + "\n     step is " + "\"" + it.step + "\""
           + "\n     result is " + "\"" + it.result + "\"" + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<StepNameProviderRemoveKeywordsAndArgumentsStringSpecExamples>forEach(this.examples, _function);
  }
}
