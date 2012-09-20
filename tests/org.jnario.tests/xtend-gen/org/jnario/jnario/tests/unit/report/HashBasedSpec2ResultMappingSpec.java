package org.jnario.jnario.tests.unit.report;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.hamcrest.StringDescription;
import org.jnario.Executable;
import org.jnario.feature.feature.Step;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.jnario.test.util.Specs;
import org.jnario.jnario.tests.unit.report.HashBasedSpec2ResultMappingExampleGroupSpec;
import org.jnario.jnario.tests.unit.report.HashBasedSpec2ResultMappingExampleSpec;
import org.jnario.jnario.tests.unit.report.HashBasedSpec2ResultMappingStepSpec;
import org.jnario.lib.Should;
import org.jnario.report.HashBasedSpec2ResultMapping;
import org.jnario.report.NotRun;
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
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@Contains({ HashBasedSpec2ResultMappingExampleSpec.class, HashBasedSpec2ResultMappingStepSpec.class, HashBasedSpec2ResultMappingExampleGroupSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("HashBasedSpec2ResultMapping")
@CreateWith(value = SpecTestCreator.class)
public class HashBasedSpec2ResultMappingSpec {
  @Subject
  public HashBasedSpec2ResultMapping subject;
  
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
  @Order(99)
  public void _returnsEmptyExecutionIfNoMatchingSpecExists() throws Exception {
    SpecExecution _result = this.subject.getResult(this.anyExecutable);
    boolean _doubleArrow = Should.operator_doubleArrow(_result, NotRun.class);
    Assert.assertTrue("\nExpected subject.getResult(anyExecutable) => typeof(NotRun) but"
     + "\n     subject.getResult(anyExecutable) is " + new StringDescription().appendValue(_result).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString()
     + "\n     anyExecutable is " + new StringDescription().appendValue(this.anyExecutable).toString() + "\n", _doubleArrow);
    
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
}
