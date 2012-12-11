package org.jnario.feature.tests.unit.naming;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
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
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Subject;
import org.junit.runner.RunWith;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@Contains({ StepNameProviderNameOfSpec.class, StepNameProviderDescribeFeatureSpec.class, StepNameProviderRemoveArgumentsSpec.class, StepNameProviderDescribeScenarioSpec.class })
@SuppressWarnings("all")
@Named("StepNameProvider")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = FeatureTestCreator.class)
public class StepNameProviderSpec {
  @Subject
  public StepNameProvider subject;
  
  @Inject
  @Extension
  public ModelStore modelStore;
  
  public String desc(final Feature feature) {
    String _describe = this.subject.describe(feature);
    return _describe;
  }
  
  public String desc(final Scenario scen) {
    String _describe = this.subject.describe(scen);
    return _describe;
  }
  
  public Step step() {
    Query _query = Query.query(this.modelStore);
    Step _first = _query.<Step>first(Step.class);
    return _first;
  }
  
  public String stepName() {
    Step _step = this.step();
    return this.subject.nameOf(_step);
  }
  
  public String describeStep() {
    Step _step = this.step();
    return this.subject.describe(_step);
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
      final CharSequence input = _builder;
      Resource _parseScenario = this.modelStore.parseScenario(input);
      _xblockexpression = (_parseScenario);
    }
    return _xblockexpression;
  }
}
