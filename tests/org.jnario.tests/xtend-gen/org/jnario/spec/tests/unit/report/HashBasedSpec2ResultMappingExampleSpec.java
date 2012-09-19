package org.jnario.spec.tests.unit.report;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.hamcrest.StringDescription;
import org.jnario.lib.Should;
import org.jnario.report.SpecExecution;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.spec.Example;
import org.jnario.spec.tests.unit.report.HashBasedSpec2ResultMappingSpec;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Example")
public class HashBasedSpec2ResultMappingExampleSpec extends HashBasedSpec2ResultMappingSpec {
  final Example anyExecutable = new Function0<Example>() {
    public Example apply() {
      Example _mock = Mockito.<Example>mock(Example.class);
      return _mock;
    }
  }.apply();
  
  final SpecExecution aResult = new Function0<SpecExecution>() {
    public SpecExecution apply() {
      SpecExecution _passingSpec = SpecExecution.passingSpec("example.SomethingSpec", "a fact", HashBasedSpec2ResultMappingSpec.anyExecutionTime);
      return _passingSpec;
    }
  }.apply();
  
  final SpecExecution aResultWithDifferentClassName = new Function0<SpecExecution>() {
    public SpecExecution apply() {
      SpecExecution _passingSpec = SpecExecution.passingSpec("example.DifferentSpec", "a fact", HashBasedSpec2ResultMappingSpec.anyExecutionTime);
      return _passingSpec;
    }
  }.apply();
  
  final SpecExecution aResultWithDifferentName = new Function0<SpecExecution>() {
    public SpecExecution apply() {
      SpecExecution _passingSpec = SpecExecution.passingSpec("example.SomethingSpec", "another fact", HashBasedSpec2ResultMappingSpec.anyExecutionTime);
      return _passingSpec;
    }
  }.apply();
  
  @Test
  @Named("returns empty execution for null")
  @Order(99)
  public void _returnsEmptyExecutionForNull() throws Exception {
    SpecExecution _result = this.subject.getResult(null);
    boolean _doubleArrow = Should.operator_doubleArrow(_result, SpecExecution.NO_EXECUTION);
    Assert.assertTrue("\nExpected subject.getResult(null) => NO_EXECUTION but"
     + "\n     subject.getResult(null) is " + new StringDescription().appendValue(_result).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString()
     + "\n     NO_EXECUTION is " + new StringDescription().appendValue(SpecExecution.NO_EXECUTION).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("returns empty execution if no matching spec exists")
  @Order(99)
  public void _returnsEmptyExecutionIfNoMatchingSpecExists() throws Exception {
    SpecExecution _result = this.subject.getResult(this.anyExecutable);
    boolean _doubleArrow = Should.operator_doubleArrow(_result, SpecExecution.NO_EXECUTION);
    Assert.assertTrue("\nExpected subject.getResult(anyExecutable) => NO_EXECUTION but"
     + "\n     subject.getResult(anyExecutable) is " + new StringDescription().appendValue(_result).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString()
     + "\n     anyExecutable is " + new StringDescription().appendValue(this.anyExecutable).toString()
     + "\n     NO_EXECUTION is " + new StringDescription().appendValue(SpecExecution.NO_EXECUTION).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("matches if classname and name are equal")
  @Order(99)
  public void _matchesIfClassnameAndNameAreEqual() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package example");
    _builder.newLine();
    _builder.append("describe \"Something\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"a fact\"{\"\"}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.m.parseSpec(_builder);
    this.subject.accept(this.aResult);
    Example _example = this.example();
    boolean _should_match = this.should_match(_example, this.aResult);
    Assert.assertTrue("\nExpected example should match aResult but"
     + "\n     example is " + new StringDescription().appendValue(_example).toString()
     + "\n     aResult is " + new StringDescription().appendValue(this.aResult).toString() + "\n", _should_match);
    
    Example _example_1 = this.example();
    boolean _should_match_1 = this.should_match(_example_1, this.aResultWithDifferentClassName);
    Assert.assertFalse("\nExpected example should not match aResultWithDifferentClassName but"
     + "\n     example is " + new StringDescription().appendValue(_example_1).toString()
     + "\n     aResultWithDifferentClassName is " + new StringDescription().appendValue(this.aResultWithDifferentClassName).toString() + "\n", _should_match_1);
    
    Example _example_2 = this.example();
    boolean _should_match_2 = this.should_match(_example_2, this.aResultWithDifferentName);
    Assert.assertFalse("\nExpected example should not match aResultWithDifferentName but"
     + "\n     example is " + new StringDescription().appendValue(_example_2).toString()
     + "\n     aResultWithDifferentName is " + new StringDescription().appendValue(this.aResultWithDifferentName).toString() + "\n", _should_match_2);
    
  }
  
  @Test
  @Named("includes pending state when matching")
  @Order(99)
  public void _includesPendingStateWhenMatching() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package example");
    _builder.newLine();
    _builder.append("describe \"Something\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"a fact\"");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.m.parseSpec(_builder);
    final SpecExecution pendingResult = SpecExecution.passingSpec("example.SomethingSpec", "a fact [PENDING]", HashBasedSpec2ResultMappingSpec.anyExecutionTime);
    this.subject.accept(pendingResult);
    Example _example = this.example();
    boolean _should_match = this.should_match(_example, pendingResult);
    Assert.assertTrue("\nExpected example should match pendingResult but"
     + "\n     example is " + new StringDescription().appendValue(_example).toString()
     + "\n     pendingResult is " + new StringDescription().appendValue(pendingResult).toString() + "\n", _should_match);
    
  }
  
  @Test
  @Named("handles escaped characters")
  @Order(99)
  public void _handlesEscapedCharacters() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package example");
    _builder.newLine();
    _builder.append("describe \"Something\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \'With special \"chars\" and uml\u00E4uts\'");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.m.parseSpec(_builder);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("With special \\&quot;chars\\&quot; and uml\\u00E4uts [PENDING]");
    _builder_1.newLine();
    String _string = _builder_1.toString();
    final String factName = _string.trim();
    final SpecExecution resultWithUnicodeChars = SpecExecution.passingSpec("example.SomethingSpec", factName, HashBasedSpec2ResultMappingSpec.anyExecutionTime);
    this.subject.accept(resultWithUnicodeChars);
    Example _example = this.example();
    boolean _should_match = this.should_match(_example, resultWithUnicodeChars);
    Assert.assertTrue("\nExpected example should match resultWithUnicodeChars but"
     + "\n     example is " + new StringDescription().appendValue(_example).toString()
     + "\n     resultWithUnicodeChars is " + new StringDescription().appendValue(resultWithUnicodeChars).toString() + "\n", _should_match);
    
  }
}
