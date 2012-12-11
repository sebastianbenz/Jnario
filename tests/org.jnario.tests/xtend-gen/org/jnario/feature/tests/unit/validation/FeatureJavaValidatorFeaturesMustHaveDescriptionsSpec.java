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
@Named("Features must have descriptions")
@RunWith(ExampleGroupRunner.class)
public class FeatureJavaValidatorFeaturesMustHaveDescriptionsSpec extends FeatureJavaValidatorSpec {
  @Test
  @Named("\\\'\\\'\\\' Feature: \\\'\\\'\\\'.select[typeof[Feature]].assertErrorContains[\\\"description\\\"]")
  @Order(2)
  public void _featureSelectTypeofFeatureAssertErrorContainsDescription() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: ");
    _builder.newLine();
    AssertableDiagnostics _select = this.select(_builder, Feature.class);
    _select.assertErrorContains("description");
  }
}
