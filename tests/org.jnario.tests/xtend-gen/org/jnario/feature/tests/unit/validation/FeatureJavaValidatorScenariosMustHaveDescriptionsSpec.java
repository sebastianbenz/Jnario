/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.unit.validation;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.validation.AssertableDiagnostics;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.tests.unit.validation.FeatureJavaValidatorSpec;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("Scenarios must have descriptions")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class FeatureJavaValidatorScenariosMustHaveDescriptionsSpec extends FeatureJavaValidatorSpec {
  @Test
  @Named("\\\'\\\'\\\' Feature: A Feature Scenario: \\\'\\\'\\\'.select[typeof[Scenario]].assertErrorContains[\\\"description\\\"]")
  @Order(1)
  public void _featureAFeatureScenarioSelectTypeofScenarioAssertErrorContainsDescription() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: A Feature");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario:");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    AssertableDiagnostics _select = this.select(_builder, Scenario.class);
    _select.assertErrorContains("description");
  }
}
