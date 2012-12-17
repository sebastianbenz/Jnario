package org.jnario.feature.tests.unit.validation;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.validation.AssertableDiagnostics;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.tests.unit.validation.FeatureJavaValidatorSpec;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("Scenarios must have different names")
@RunWith(ExampleGroupRunner.class)
public class FeatureJavaValidatorScenariosMustHaveDifferentNamesSpec extends FeatureJavaValidatorSpec {
  @Test
  @Named("\\\'\\\'\\\' Feature: My Feature Scenario: Hallo Scenario: Hallo \\\'\\\'\\\'.select[typeof[Feature]].assertErrorContains[\\\"Duplicate scenario\\\"]")
  @Order(3)
  public void _featureMyFeatureScenarioHalloScenarioHalloSelectTypeofFeatureAssertErrorContainsDuplicateScenario() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: My Feature");
    _builder.newLine();
    _builder.append("Scenario: Hallo");
    _builder.newLine();
    _builder.append("Scenario: Hallo");
    _builder.newLine();
    AssertableDiagnostics _select = this.select(_builder, Feature.class);
    _select.assertErrorContains("Duplicate scenario");
  }
}
