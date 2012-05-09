package org.jnario.feature.tests.unit.validation;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.validation.AssertableDiagnostics;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.tests.unit.validation.JnarioValidatorSpec;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Features must have descriptions")
public class JnarioValidatorFeaturesMustHaveDescriptionsSpec extends JnarioValidatorSpec {
  @Test
  @Named("\\\'\\\'\\\'\\r \t\t\tFeature: \\r \t\t\\\'\\\'\\\'.select[typeof[Feature]].assertErrorContains[\"description\"]")
  @Order(99)
  public void featureSelectTypeofFeatureAssertErrorContainsDescription() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: ");
    _builder.newLine();
    AssertableDiagnostics _select = this.select(_builder, Feature.class);
    _select.assertErrorContains("description");
  }
}
