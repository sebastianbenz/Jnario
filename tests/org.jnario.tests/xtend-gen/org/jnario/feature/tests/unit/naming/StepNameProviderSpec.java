/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.unit.naming;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeatureFactory;
import org.jnario.feature.feature.Given;
import org.jnario.feature.feature.GivenReference;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.naming.StepNameProvider;
import org.jnario.feature.tests.unit.naming.StepNameProviderDescribeFeatureSpec;
import org.jnario.feature.tests.unit.naming.StepNameProviderDescribeScenarioSpec;
import org.jnario.feature.tests.unit.naming.StepNameProviderNameOfSpec;
import org.jnario.feature.tests.unit.naming.StepNameProviderRemoveArgumentsSpec;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Query;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Subject;
import org.junit.runner.RunWith;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@Contains({ StepNameProviderNameOfSpec.class, StepNameProviderDescribeFeatureSpec.class, StepNameProviderRemoveArgumentsSpec.class, StepNameProviderDescribeScenarioSpec.class })
@Named("StepNameProvider")
@RunWith(ExampleGroupRunner.class)
@CreateWith(FeatureTestCreator.class)
@SuppressWarnings("all")
public class StepNameProviderSpec {
  @Subject
  public StepNameProvider subject;
  
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public ModelStore modelStore;
  
  public String desc(final Feature feature) {
    return this.subject.describe(feature);
  }
  
  public String desc(final Scenario scen) {
    return this.subject.describe(scen);
  }
  
  public Step firstStep() {
    Query _query = Query.query(this.modelStore);
    return _query.<Step>first(Step.class);
  }
  
  public String stepName() {
    Step _firstStep = this.firstStep();
    return this.subject.nameOf(_firstStep);
  }
  
  public String describeStep() {
    Step _firstStep = this.firstStep();
    return this.subject.describe(_firstStep);
  }
  
  public Given emptyStep() {
    return FeatureFactory.eINSTANCE.createGiven();
  }
  
  public GivenReference emptyRef() {
    return FeatureFactory.eINSTANCE.createGivenReference();
  }
  
  public Resource parseScenario(final CharSequence s) {
    Resource _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Feature: example");
      _builder.newLine();
      _builder.append(s, "");
      _builder.newLineIfNotEmpty();
      final String input = _builder.toString();
      _xblockexpression = this.modelStore.parseScenario(input);
    }
    return _xblockexpression;
  }
}
