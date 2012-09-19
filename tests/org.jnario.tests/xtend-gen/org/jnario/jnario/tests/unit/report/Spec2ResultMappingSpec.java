package org.jnario.jnario.tests.unit.report;

import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.hamcrest.StringDescription;
import org.jnario.Specification;
import org.jnario.lib.Should;
import org.jnario.report.Executable2ResultMatcher;
import org.jnario.report.Spec2ResultMapping;
import org.jnario.report.SpecExecution;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Spec2ResultMapping")
public class Spec2ResultMappingSpec {
  public Spec2ResultMapping subject;
  
  final Executable2ResultMatcher isSpecPredicate = new Function0<Executable2ResultMatcher>() {
    public Executable2ResultMatcher apply() {
      Executable2ResultMatcher _mock = Mockito.<Executable2ResultMatcher>mock(Executable2ResultMatcher.class);
      return _mock;
    }
  }.apply();
  
  final SpecExecution matchingResult = new Function0<SpecExecution>() {
    public SpecExecution apply() {
      SpecExecution _mock = Mockito.<SpecExecution>mock(SpecExecution.class);
      return _mock;
    }
  }.apply();
  
  final SpecExecution notMatchingResult = new Function0<SpecExecution>() {
    public SpecExecution apply() {
      SpecExecution _mock = Mockito.<SpecExecution>mock(SpecExecution.class);
      return _mock;
    }
  }.apply();
  
  final Specification aSpec = new Function0<Specification>() {
    public Specification apply() {
      Specification _mock = Mockito.<Specification>mock(Specification.class);
      return _mock;
    }
  }.apply();
  
  @Before
  public void before() throws Exception {
    Spec2ResultMapping _spec2ResultMapping = new Spec2ResultMapping(this.isSpecPredicate);
    this.subject = _spec2ResultMapping;
  }
  
  @Test
  @Named("returns empty execution if no matching spec exists")
  @Order(99)
  public void _returnsEmptyExecutionIfNoMatchingSpecExists() throws Exception {
    SpecExecution _result = this.subject.getResult(this.aSpec);
    boolean _doubleArrow = Should.operator_doubleArrow(_result, SpecExecution.NO_EXECUTION);
    Assert.assertTrue("\nExpected subject.getResult(aSpec) => NO_EXECUTION but"
     + "\n     subject.getResult(aSpec) is " + new StringDescription().appendValue(_result).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString()
     + "\n     aSpec is " + new StringDescription().appendValue(this.aSpec).toString()
     + "\n     NO_EXECUTION is " + new StringDescription().appendValue(SpecExecution.NO_EXECUTION).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("returns execution result matching to spec")
  @Order(99)
  public void _returnsExecutionResultMatchingToSpec() throws Exception {
    boolean _matches = this.isSpecPredicate.matches(this.aSpec, this.matchingResult);
    OngoingStubbing<Boolean> _when = Mockito.<Boolean>when(Boolean.valueOf(_matches));
    _when.thenReturn(Boolean.valueOf(true));
    boolean _matches_1 = this.isSpecPredicate.matches(this.aSpec, this.notMatchingResult);
    OngoingStubbing<Boolean> _when_1 = Mockito.<Boolean>when(Boolean.valueOf(_matches_1));
    _when_1.thenReturn(Boolean.valueOf(false));
    this.subject.accept(this.notMatchingResult);
    this.subject.accept(this.matchingResult);
    SpecExecution _result = this.subject.getResult(this.aSpec);
    boolean _doubleArrow = Should.operator_doubleArrow(_result, this.matchingResult);
    Assert.assertTrue("\nExpected subject.getResult(aSpec) => matchingResult but"
     + "\n     subject.getResult(aSpec) is " + new StringDescription().appendValue(_result).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString()
     + "\n     aSpec is " + new StringDescription().appendValue(this.aSpec).toString()
     + "\n     matchingResult is " + new StringDescription().appendValue(this.matchingResult).toString() + "\n", _doubleArrow);
    
  }
}
