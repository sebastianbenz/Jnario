package org.jnario.jnario.tests.unit.report;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.hamcrest.StringDescription;
import org.jnario.Executable;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.jnario.test.util.Specs;
import org.jnario.jnario.tests.unit.report.HashBasedSpec2ResultMappingBackgroundSpec;
import org.jnario.jnario.tests.unit.report.HashBasedSpec2ResultMappingExampleGroupSpec;
import org.jnario.jnario.tests.unit.report.HashBasedSpec2ResultMappingExampleSpec;
import org.jnario.jnario.tests.unit.report.HashBasedSpec2ResultMappingFeatureSpec;
import org.jnario.jnario.tests.unit.report.HashBasedSpec2ResultMappingScenarioSpec;
import org.jnario.jnario.tests.unit.report.HashBasedSpec2ResultMappingStepSpec;
import org.jnario.jnario.tests.unit.report.HashBasedSpec2ResultMappingSuiteSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.report.Failed;
import org.jnario.report.HashBasedSpec2ResultMapping;
import org.jnario.report.NotRun;
import org.jnario.report.Passed;
import org.jnario.report.SpecExecution;
import org.jnario.report.SpecFailure;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.spec.Example;
import org.junit.Test;
import org.junit.runner.RunWith;

@Contains({ HashBasedSpec2ResultMappingExampleSpec.class, HashBasedSpec2ResultMappingExampleGroupSpec.class, HashBasedSpec2ResultMappingStepSpec.class, HashBasedSpec2ResultMappingScenarioSpec.class, HashBasedSpec2ResultMappingFeatureSpec.class, HashBasedSpec2ResultMappingBackgroundSpec.class, HashBasedSpec2ResultMappingSuiteSpec.class })
@SuppressWarnings("all")
@Named("HashBasedSpec2ResultMapping")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = SpecTestCreator.class)
public class HashBasedSpec2ResultMappingSpec {
  @Subject
  public HashBasedSpec2ResultMapping subject;
  
  final static String SCENARIO_CLASSNAME = "test.MyFeatureFeatureMyScenario";
  
  final static String OTHER_SCENARIO_CLASSNAME = "test.MyFeatureFeatureMyOtherScenario";
  
  @Inject
  @Extension
  public ModelStore m;
  
  final static double anyExecutionTime = 0.0;
  
  final Example anyExecutable = new Function0<Example>() {
    public Example apply() {
      Example _example = Specs.example("");
      return _example;
    }
  }.apply();
  
  final SpecFailure anyFailure = new Function0<SpecFailure>() {
    public SpecFailure apply() {
      SpecFailure _specFailure = new SpecFailure("", "", "");
      return _specFailure;
    }
  }.apply();
  
  @Test
  @Named("returns empty execution if no matching spec exists")
  @Order(1)
  public void _returnsEmptyExecutionIfNoMatchingSpecExists() throws Exception {
    SpecExecution _result = this.subject.getResult(this.anyExecutable);
    boolean _doubleArrow = Should.operator_doubleArrow(_result, NotRun.class);
    Assert.assertTrue("\nExpected subject.getResult(anyExecutable) => typeof(NotRun) but"
     + "\n     subject.getResult(anyExecutable) is " + new StringDescription().appendValue(_result).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString()
     + "\n     anyExecutable is " + new StringDescription().appendValue(this.anyExecutable).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("returns empty execution if executable is null")
  @Order(2)
  public void _returnsEmptyExecutionIfExecutableIsNull() throws Exception {
    SpecExecution _result = this.subject.getResult(null);
    boolean _doubleArrow = Should.operator_doubleArrow(_result, NotRun.class);
    Assert.assertTrue("\nExpected subject.getResult(null) => typeof(NotRun) but"
     + "\n     subject.getResult(null) is " + new StringDescription().appendValue(_result).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _doubleArrow);
    
  }
  
  public boolean should_match(final Executable example, final SpecExecution execution) {
    SpecExecution _result = this.subject.getResult(example);
    boolean _equals = Objects.equal(_result, execution);
    return _equals;
  }
  
  public Example example() {
    Example _first = this.m.<Example>first(Example.class);
    return _first;
  }
  
  public Step step() {
    Step _first = this.m.<Step>first(Step.class);
    return _first;
  }
  
  public Feature feature() {
    Feature _first = this.m.<Feature>first(Feature.class);
    return _first;
  }
  
  public Background background() {
    Background _first = this.m.<Background>first(Background.class);
    return _first;
  }
  
  public Scenario scenario() {
    Scenario _first = this.m.<Scenario>first(Scenario.class);
    return _first;
  }
  
  public SpecExecution result(final Executable executable) {
    SpecExecution _result = this.subject.getResult(executable);
    return _result;
  }
  
  public void passedStep(final String name) {
    this.passedStep(HashBasedSpec2ResultMappingSpec.SCENARIO_CLASSNAME, name);
  }
  
  public void passedStep(final String className, final String name) {
    Passed _passingSpec = Passed.passingSpec(className, name, 0.0);
    this.subject.accept(_passingSpec);
  }
  
  public void failedStep(final String name) {
    this.failedStep(HashBasedSpec2ResultMappingSpec.SCENARIO_CLASSNAME, name);
  }
  
  public void failedStep(final String className, final String name) {
    Failed _failingSpec = Failed.failingSpec(className, name, 0.0, this.anyFailure);
    this.subject.accept(_failingSpec);
  }
}
