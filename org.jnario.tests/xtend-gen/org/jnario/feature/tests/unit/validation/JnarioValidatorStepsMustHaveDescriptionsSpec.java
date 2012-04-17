package org.jnario.feature.tests.unit.validation;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.validation.AssertableDiagnostics;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.feature.feature.Step;
import org.jnario.feature.tests.unit.validation.JnarioValidatorSpec;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Steps must have descriptions")
public class JnarioValidatorStepsMustHaveDescriptionsSpec extends JnarioValidatorSpec {
  @Test
  @Named("\\\'\\\'\\\'\\r; \t\t\tFeature: A feature\\r; \t\t\t\tScenario: A scenario\\r; \t\t\t\t \tGiven \\r; \t\t\t\t \tWhen \\r; \t\t\t\t \tThen \\r; \t\t\t\t \t\\r; \t\t\\\'\\\'\\\'.allOf[typeof[Step]][assertErrorContains[\"description\"]]")
  @Order(99)
  public void featureAFeatureScenarioAScenarioGivenWhenThenAllOfTypeofStepAssertErrorContainsDescription() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: A feature");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: A scenario");
    _builder.newLine();
    _builder.append("\t \t");
    _builder.append("Given ");
    _builder.newLine();
    _builder.append("\t \t");
    _builder.append("When ");
    _builder.newLine();
    _builder.append("\t \t");
    _builder.append("Then ");
    _builder.newLine();
    _builder.append("\t \t");
    _builder.newLine();
    final Procedure1<AssertableDiagnostics> _function = new Procedure1<AssertableDiagnostics>() {
        public void apply(final AssertableDiagnostics it) {
          it.assertErrorContains("description");
        }
      };
    this.allOf(_builder, Step.class, _function);
  }
}
