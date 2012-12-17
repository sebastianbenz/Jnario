package org.jnario.jnario.tests.unit.report;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;
import org.jnario.jnario.tests.unit.report.HashBasedSpec2ResultMappingSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.report.Failed;
import org.jnario.report.NotRun;
import org.jnario.report.Passed;
import org.jnario.report.Pending;
import org.jnario.report.SpecExecution;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.spec.ExampleGroup;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("ExampleGroup")
@RunWith(ExampleGroupRunner.class)
public class HashBasedSpec2ResultMappingExampleGroupSpec extends HashBasedSpec2ResultMappingSpec {
  final static String CLASSNAME = "RootSpec";
  
  @Test
  @Named("returns Pending if children are not executed and have no implementation")
  @Order(5)
  public void _returnsPendingIfChildrenAreNotExecutedAndHaveNoImplementation() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Root\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"fact 1\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"fact 2\"");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.m.parseSpec(_builder);
    ExampleGroup _exampleGroup = this.m.exampleGroup("Root");
    SpecExecution _result = this.result(_exampleGroup);
    boolean _doubleArrow = Should.operator_doubleArrow(_result, Pending.class);
    Assert.assertTrue("\nExpected m.exampleGroup(\"Root\").result => typeof(Pending) but"
     + "\n     m.exampleGroup(\"Root\").result is " + new StringDescription().appendValue(_result).toString()
     + "\n     m.exampleGroup(\"Root\") is " + new StringDescription().appendValue(_exampleGroup).toString()
     + "\n     m is " + new StringDescription().appendValue(this.m).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("returns NotRun if children are not executed but have an implementation")
  @Order(6)
  public void _returnsNotRunIfChildrenAreNotExecutedButHaveAnImplementation() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Root\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"fact 1\"{ \"with implementation\" }");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"fact 2\"{ \"with implementation\" }");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.m.parseSpec(_builder);
    ExampleGroup _exampleGroup = this.m.exampleGroup("Root");
    SpecExecution _result = this.result(_exampleGroup);
    boolean _doubleArrow = Should.operator_doubleArrow(_result, NotRun.class);
    Assert.assertTrue("\nExpected m.exampleGroup(\"Root\").result => typeof(NotRun) but"
     + "\n     m.exampleGroup(\"Root\").result is " + new StringDescription().appendValue(_result).toString()
     + "\n     m.exampleGroup(\"Root\") is " + new StringDescription().appendValue(_exampleGroup).toString()
     + "\n     m is " + new StringDescription().appendValue(this.m).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("passes if all children pass")
  @Order(7)
  public void _passesIfAllChildrenPass() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Root\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"Example 1\"{ \"with implementation\" }");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"Example 2\"{ \"with implementation\" }");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.m.parseSpec(_builder);
    this.passes("Example 1", "Example 2");
    ExampleGroup _exampleGroup = this.m.exampleGroup("Root");
    SpecExecution _result = this.result(_exampleGroup);
    boolean _doubleArrow = Should.operator_doubleArrow(_result, Passed.class);
    Assert.assertTrue("\nExpected m.exampleGroup(\"Root\").result => typeof(Passed) but"
     + "\n     m.exampleGroup(\"Root\").result is " + new StringDescription().appendValue(_result).toString()
     + "\n     m.exampleGroup(\"Root\") is " + new StringDescription().appendValue(_exampleGroup).toString()
     + "\n     m is " + new StringDescription().appendValue(this.m).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("fails if one child has failed")
  @Order(8)
  public void _failsIfOneChildHasFailed() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Root\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"Example 1\"{ \"with implementation\" }");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"Example 2\"{ \"with implementation\" }");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.m.parseSpec(_builder);
    this.passes("Example 1");
    this.fails("Example 2");
    ExampleGroup _exampleGroup = this.m.exampleGroup("Root");
    SpecExecution _result = this.result(_exampleGroup);
    boolean _doubleArrow = Should.operator_doubleArrow(_result, Failed.class);
    Assert.assertTrue("\nExpected m.exampleGroup(\"Root\").result => typeof(Failed) but"
     + "\n     m.exampleGroup(\"Root\").result is " + new StringDescription().appendValue(_result).toString()
     + "\n     m.exampleGroup(\"Root\") is " + new StringDescription().appendValue(_exampleGroup).toString()
     + "\n     m is " + new StringDescription().appendValue(this.m).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("execution time is sum of all child examples")
  @Order(9)
  public void _executionTimeIsSumOfAllChildExamples() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Root\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"Example 1\"{ \"with implementation\" }");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"Example 2\"{ \"with implementation\" }");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.m.parseSpec(_builder);
    this.exampleExecutedIn("Example 1", 1.0);
    this.exampleExecutedIn("Example 2", 2.0);
    ExampleGroup _exampleGroup = this.m.exampleGroup("Root");
    SpecExecution _result = this.result(_exampleGroup);
    double _executionTimeInSeconds = _result.getExecutionTimeInSeconds();
    boolean _doubleArrow = Should.operator_doubleArrow(Double.valueOf(_executionTimeInSeconds), Double.valueOf(3.0));
    Assert.assertTrue("\nExpected m.exampleGroup(\"Root\").result.executionTimeInSeconds => 3.0 but"
     + "\n     m.exampleGroup(\"Root\").result.executionTimeInSeconds is " + new StringDescription().appendValue(Double.valueOf(_executionTimeInSeconds)).toString()
     + "\n     m.exampleGroup(\"Root\").result is " + new StringDescription().appendValue(_result).toString()
     + "\n     m.exampleGroup(\"Root\") is " + new StringDescription().appendValue(_exampleGroup).toString()
     + "\n     m is " + new StringDescription().appendValue(this.m).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("class name is from spec")
  @Order(10)
  public void _classNameIsFromSpec() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Root\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"Example 1\"{ \"with implementation\" }");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"Example 2\"{ \"with implementation\" }");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.m.parseSpec(_builder);
    this.passes("Example 1");
    ExampleGroup _exampleGroup = this.m.exampleGroup("Root");
    SpecExecution _result = this.result(_exampleGroup);
    String _className = _result.getClassName();
    boolean _doubleArrow = Should.operator_doubleArrow(_className, "RootSpec");
    Assert.assertTrue("\nExpected m.exampleGroup(\"Root\").result.className => \"RootSpec\" but"
     + "\n     m.exampleGroup(\"Root\").result.className is " + new StringDescription().appendValue(_className).toString()
     + "\n     m.exampleGroup(\"Root\").result is " + new StringDescription().appendValue(_result).toString()
     + "\n     m.exampleGroup(\"Root\") is " + new StringDescription().appendValue(_exampleGroup).toString()
     + "\n     m is " + new StringDescription().appendValue(this.m).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("name is from spec")
  @Order(11)
  public void _nameIsFromSpec() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Root\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"Example 1\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"Example 2\"");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.m.parseSpec(_builder);
    this.passes("Example 1");
    ExampleGroup _exampleGroup = this.m.exampleGroup("Root");
    SpecExecution _result = this.result(_exampleGroup);
    String _name = _result.getName();
    boolean _doubleArrow = Should.operator_doubleArrow(_name, "Root");
    Assert.assertTrue("\nExpected m.exampleGroup(\"Root\").result.name => \"Root\" but"
     + "\n     m.exampleGroup(\"Root\").result.name is " + new StringDescription().appendValue(_name).toString()
     + "\n     m.exampleGroup(\"Root\").result is " + new StringDescription().appendValue(_result).toString()
     + "\n     m.exampleGroup(\"Root\") is " + new StringDescription().appendValue(_exampleGroup).toString()
     + "\n     m is " + new StringDescription().appendValue(this.m).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("caches calculated results")
  @Order(12)
  public void _cachesCalculatedResults() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Root\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"Example 1\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"Example 2\"");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.m.parseSpec(_builder);
    this.passes("Example 1");
    final ExampleGroup exampleGroup = this.m.exampleGroup("Root");
    final SpecExecution first = this.result(exampleGroup);
    final SpecExecution second = this.result(exampleGroup);
    Matcher<SpecExecution> _sameInstance = CoreMatchers.<SpecExecution>sameInstance(second);
    boolean _doubleArrow = Should.operator_doubleArrow(first, _sameInstance);
    Assert.assertTrue("\nExpected first => sameInstance(second) but"
     + "\n     first is " + new StringDescription().appendValue(first).toString()
     + "\n     sameInstance(second) is " + new StringDescription().appendValue(_sameInstance).toString()
     + "\n     second is " + new StringDescription().appendValue(second).toString() + "\n", _doubleArrow);
    
  }
  
  public void exampleExecutedIn(final String name, final double time) {
    Passed _passingSpec = Passed.passingSpec(HashBasedSpec2ResultMappingExampleGroupSpec.CLASSNAME, name, time);
    this.subject.accept(_passingSpec);
  }
  
  public void fails(final String name) {
    Failed _failingSpec = Failed.failingSpec(HashBasedSpec2ResultMappingExampleGroupSpec.CLASSNAME, name, HashBasedSpec2ResultMappingSpec.anyExecutionTime, this.anyFailure);
    this.subject.accept(_failingSpec);
  }
  
  public void passes(final String... names) {
    final Procedure1<String> _function = new Procedure1<String>() {
        public void apply(final String it) {
          Passed _passingSpec = Passed.passingSpec(HashBasedSpec2ResultMappingExampleGroupSpec.CLASSNAME, it, HashBasedSpec2ResultMappingSpec.anyExecutionTime);
          HashBasedSpec2ResultMappingExampleGroupSpec.this.subject.accept(_passingSpec);
        }
      };
    IterableExtensions.<String>forEach(((Iterable<String>)Conversions.doWrapArray(names)), _function);
  }
}
