package org.jnario.spec.tests.unit.report;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.hamcrest.StringDescription;
import org.jnario.report.SpecExecution;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.spec.Example;
import org.jnario.spec.tests.unit.report.Spec2ResultMatcherSpec;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Example")
public class Spec2ResultMatcherExampleSpec extends Spec2ResultMatcherSpec {
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
    Example _example = this.example();
    SpecExecution _passingSpec = SpecExecution.passingSpec("example.SomethingSpec", "a fact", Spec2ResultMatcherSpec.anyExecutionTime);
    boolean _should_match = this.should_match(_example, _passingSpec);
    Assert.assertTrue("\nExpected example should match passingSpec(\"example.SomethingSpec\", \"a fact\", anyExecutionTime) but"
     + "\n     example is " + new StringDescription().appendValue(_example).toString()
     + "\n     passingSpec(\"example.SomethingSpec\", \"a fact\", anyExecutionTime) is " + new StringDescription().appendValue(_passingSpec).toString()
     + "\n     anyExecutionTime is " + new StringDescription().appendValue(Spec2ResultMatcherSpec.anyExecutionTime).toString() + "\n", _should_match);
    
    Example _example_1 = this.example();
    SpecExecution _passingSpec_1 = SpecExecution.passingSpec("example.DifferentSpec", "a fact", Spec2ResultMatcherSpec.anyExecutionTime);
    boolean _should_match_1 = this.should_match(_example_1, _passingSpec_1);
    Assert.assertFalse("\nExpected example should not match passingSpec(\"example.DifferentSpec\", \"a fact\", anyExecutionTime) but"
     + "\n     example is " + new StringDescription().appendValue(_example_1).toString()
     + "\n     passingSpec(\"example.DifferentSpec\", \"a fact\", anyExecutionTime) is " + new StringDescription().appendValue(_passingSpec_1).toString()
     + "\n     anyExecutionTime is " + new StringDescription().appendValue(Spec2ResultMatcherSpec.anyExecutionTime).toString() + "\n", _should_match_1);
    
    Example _example_2 = this.example();
    SpecExecution _passingSpec_2 = SpecExecution.passingSpec("example.SomethingSpec", "a different fact", Spec2ResultMatcherSpec.anyExecutionTime);
    boolean _should_match_2 = this.should_match(_example_2, _passingSpec_2);
    Assert.assertFalse("\nExpected example should not match passingSpec(\"example.SomethingSpec\", \"a different fact\", anyExecutionTime) but"
     + "\n     example is " + new StringDescription().appendValue(_example_2).toString()
     + "\n     passingSpec(\"example.SomethingSpec\", \"a different fact\", anyExecutionTime) is " + new StringDescription().appendValue(_passingSpec_2).toString()
     + "\n     anyExecutionTime is " + new StringDescription().appendValue(Spec2ResultMatcherSpec.anyExecutionTime).toString() + "\n", _should_match_2);
    
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
    Example _example = this.example();
    SpecExecution _passingSpec = SpecExecution.passingSpec("example.SomethingSpec", "a fact [PENDING]", Spec2ResultMatcherSpec.anyExecutionTime);
    boolean _should_match = this.should_match(_example, _passingSpec);
    Assert.assertTrue("\nExpected example should match passingSpec(\"example.SomethingSpec\", \"a fact [PENDING]\", anyExecutionTime) but"
     + "\n     example is " + new StringDescription().appendValue(_example).toString()
     + "\n     passingSpec(\"example.SomethingSpec\", \"a fact [PENDING]\", anyExecutionTime) is " + new StringDescription().appendValue(_passingSpec).toString()
     + "\n     anyExecutionTime is " + new StringDescription().appendValue(Spec2ResultMatcherSpec.anyExecutionTime).toString() + "\n", _should_match);
    
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
    Example _example = this.example();
    SpecExecution _passingSpec = SpecExecution.passingSpec("example.SomethingSpec", factName, Spec2ResultMatcherSpec.anyExecutionTime);
    boolean _should_match = this.should_match(_example, _passingSpec);
    Assert.assertTrue("\nExpected example should match passingSpec(\"example.SomethingSpec\", factName, anyExecutionTime) but"
     + "\n     example is " + new StringDescription().appendValue(_example).toString()
     + "\n     passingSpec(\"example.SomethingSpec\", factName, anyExecutionTime) is " + new StringDescription().appendValue(_passingSpec).toString()
     + "\n     factName is " + new StringDescription().appendValue(factName).toString()
     + "\n     anyExecutionTime is " + new StringDescription().appendValue(Spec2ResultMatcherSpec.anyExecutionTime).toString() + "\n", _should_match);
    
  }
}
