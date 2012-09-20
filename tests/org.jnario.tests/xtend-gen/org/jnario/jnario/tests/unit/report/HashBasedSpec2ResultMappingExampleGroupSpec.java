package org.jnario.jnario.tests.unit.report;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;
import org.jnario.Executable;
import org.jnario.jnario.test.util.Specs;
import org.jnario.jnario.tests.unit.report.HashBasedSpec2ResultMappingSpec;
import org.jnario.lib.Should;
import org.jnario.report.Failed;
import org.jnario.report.NotRun;
import org.jnario.report.Passed;
import org.jnario.report.SpecExecution;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.spec.Example;
import org.jnario.spec.spec.ExampleGroup;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("ExampleGroup")
public class HashBasedSpec2ResultMappingExampleGroupSpec extends HashBasedSpec2ResultMappingSpec {
  final static String CLASSNAME = "ExampleGroupSpec";
  
  @Test
  @Named("returns NotRun if children are not executed")
  @Order(99)
  public void _returnsNotRunIfChildrenAreNotExecuted() throws Exception {
    Example _example = Specs.example("Example 1");
    Example _example_1 = Specs.example("Example 2");
    final ExampleGroup exampleGroup = Specs.exampleGroup("ExampleGroup", _example, _example_1);
    SpecExecution _result = this.result(exampleGroup);
    boolean _doubleArrow = Should.operator_doubleArrow(_result, NotRun.class);
    Assert.assertTrue("\nExpected exampleGroup.result => typeof(NotRun) but"
     + "\n     exampleGroup.result is " + new StringDescription().appendValue(_result).toString()
     + "\n     exampleGroup is " + new StringDescription().appendValue(exampleGroup).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("passes if all children pass")
  @Order(99)
  public void _passesIfAllChildrenPass() throws Exception {
    Example _passingExample = this.passingExample("Example 1");
    Example _passingExample_1 = this.passingExample("Example 2");
    final ExampleGroup exampleGroup = Specs.exampleGroup("ExampleGroup", _passingExample, _passingExample_1);
    SpecExecution _result = this.result(exampleGroup);
    boolean _doubleArrow = Should.operator_doubleArrow(_result, Passed.class);
    Assert.assertTrue("\nExpected exampleGroup.result => typeof(Passed) but"
     + "\n     exampleGroup.result is " + new StringDescription().appendValue(_result).toString()
     + "\n     exampleGroup is " + new StringDescription().appendValue(exampleGroup).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("fails if one child has failed")
  @Order(99)
  public void _failsIfOneChildHasFailed() throws Exception {
    Example _passingExample = this.passingExample("Example 1");
    Example _failingExample = this.failingExample("Example 2");
    final ExampleGroup exampleGroup = Specs.exampleGroup("ExampleGroup", _passingExample, _failingExample);
    SpecExecution _result = this.result(exampleGroup);
    boolean _doubleArrow = Should.operator_doubleArrow(_result, Failed.class);
    Assert.assertTrue("\nExpected exampleGroup.result => typeof(Failed) but"
     + "\n     exampleGroup.result is " + new StringDescription().appendValue(_result).toString()
     + "\n     exampleGroup is " + new StringDescription().appendValue(exampleGroup).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("execution time is sum of all child examples")
  @Order(99)
  public void _executionTimeIsSumOfAllChildExamples() throws Exception {
    Example _exampleExecutedIn = this.exampleExecutedIn("Example 1", 1.0);
    Example _exampleExecutedIn_1 = this.exampleExecutedIn("Example 2", 2.0);
    final ExampleGroup exampleGroup = Specs.exampleGroup("ExampleGroup", _exampleExecutedIn, _exampleExecutedIn_1);
    SpecExecution _result = this.result(exampleGroup);
    double _executionTimeInSeconds = _result.getExecutionTimeInSeconds();
    boolean _doubleArrow = Should.operator_doubleArrow(Double.valueOf(_executionTimeInSeconds), Double.valueOf(3.0));
    Assert.assertTrue("\nExpected exampleGroup.result.executionTimeInSeconds => 3.0 but"
     + "\n     exampleGroup.result.executionTimeInSeconds is " + new StringDescription().appendValue(Double.valueOf(_executionTimeInSeconds)).toString()
     + "\n     exampleGroup.result is " + new StringDescription().appendValue(_result).toString()
     + "\n     exampleGroup is " + new StringDescription().appendValue(exampleGroup).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("class name is from spec")
  @Order(99)
  public void _classNameIsFromSpec() throws Exception {
    Example _passingExample = this.passingExample("Example 1");
    final ExampleGroup exampleGroup = Specs.exampleGroup("ExampleGroup", _passingExample);
    SpecExecution _result = this.result(exampleGroup);
    String _className = _result.getClassName();
    boolean _doubleArrow = Should.operator_doubleArrow(_className, "ExampleGroupSpec");
    Assert.assertTrue("\nExpected exampleGroup.result.className => \"ExampleGroupSpec\" but"
     + "\n     exampleGroup.result.className is " + new StringDescription().appendValue(_className).toString()
     + "\n     exampleGroup.result is " + new StringDescription().appendValue(_result).toString()
     + "\n     exampleGroup is " + new StringDescription().appendValue(exampleGroup).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("name is from spec")
  @Order(99)
  public void _nameIsFromSpec() throws Exception {
    Example _passingExample = this.passingExample("Example 1");
    final ExampleGroup exampleGroup = Specs.exampleGroup("ExampleGroup", _passingExample);
    SpecExecution _result = this.result(exampleGroup);
    String _name = _result.getName();
    boolean _doubleArrow = Should.operator_doubleArrow(_name, "ExampleGroup");
    Assert.assertTrue("\nExpected exampleGroup.result.name => \"ExampleGroup\" but"
     + "\n     exampleGroup.result.name is " + new StringDescription().appendValue(_name).toString()
     + "\n     exampleGroup.result is " + new StringDescription().appendValue(_result).toString()
     + "\n     exampleGroup is " + new StringDescription().appendValue(exampleGroup).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("caches calculated results")
  @Order(99)
  public void _cachesCalculatedResults() throws Exception {
    Example _passingExample = this.passingExample("Example 1");
    final ExampleGroup exampleGroup = Specs.exampleGroup("ExampleGroup", _passingExample);
    final SpecExecution first = this.result(exampleGroup);
    final SpecExecution second = this.result(exampleGroup);
    Matcher<SpecExecution> _sameInstance = CoreMatchers.<SpecExecution>sameInstance(second);
    boolean _doubleArrow = Should.operator_doubleArrow(first, _sameInstance);
    Assert.assertTrue("\nExpected first => sameInstance(second) but"
     + "\n     first is " + new StringDescription().appendValue(first).toString()
     + "\n     sameInstance(second) is " + new StringDescription().appendValue(_sameInstance).toString()
     + "\n     second is " + new StringDescription().appendValue(second).toString() + "\n", _doubleArrow);
    
  }
  
  public SpecExecution result(final Executable executable) {
    SpecExecution _result = this.subject.getResult(executable);
    return _result;
  }
  
  public Example exampleExecutedIn(final String name, final double time) {
    Example _xblockexpression = null;
    {
      String _plus = (name + " [PENDING]");
      Passed _passingSpec = SpecExecution.passingSpec(HashBasedSpec2ResultMappingExampleGroupSpec.CLASSNAME, _plus, time);
      this.subject.accept(_passingSpec);
      Example _example = Specs.example(name);
      _xblockexpression = (_example);
    }
    return _xblockexpression;
  }
  
  public Example failingExample(final String name) {
    Example _xblockexpression = null;
    {
      String _plus = (name + " [PENDING]");
      Failed _failingSpec = SpecExecution.failingSpec(HashBasedSpec2ResultMappingExampleGroupSpec.CLASSNAME, _plus, HashBasedSpec2ResultMappingSpec.anyExecutionTime, this.anyFailure);
      this.subject.accept(_failingSpec);
      Example _example = Specs.example(name);
      _xblockexpression = (_example);
    }
    return _xblockexpression;
  }
  
  public Example passingExample(final String name) {
    Example _xblockexpression = null;
    {
      String _plus = (name + " [PENDING]");
      Passed _passingSpec = SpecExecution.passingSpec(HashBasedSpec2ResultMappingExampleGroupSpec.CLASSNAME, _plus, HashBasedSpec2ResultMappingSpec.anyExecutionTime);
      this.subject.accept(_passingSpec);
      Example _example = Specs.example(name);
      _xblockexpression = (_example);
    }
    return _xblockexpression;
  }
}
