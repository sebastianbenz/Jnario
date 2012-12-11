package org.jnario.feature.tests.unit.naming;

import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.hamcrest.StringDescription;
import org.jnario.feature.tests.unit.naming.FeatureScopeProviderSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("StepReference")
@RunWith(ExampleGroupRunner.class)
public class FeatureScopeProviderStepReferenceSpec extends FeatureScopeProviderSpec {
  @Test
  @Named("contains all implemented steps")
  @Order(1)
  public void _containsAllImplementedSteps() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package myPackage");
    _builder.newLine();
    _builder.append("Feature: MyFeature");
    _builder.newLine();
    _builder.append("Scenario: MyScenario");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Given a step");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val x = \"\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("And a step");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("And another step");
    _builder.newLine();
    this.e.parseFeature(_builder);
    Set<String> _targetOperationScope = this.targetOperationScope();
    boolean _should_contain = Should.<String>should_contain(_targetOperationScope, "myPackage.a step");
    Assert.assertTrue("\nExpected targetOperationScope should contain \"myPackage.a step\" but"
     + "\n     targetOperationScope is " + new StringDescription().appendValue(_targetOperationScope).toString() + "\n", _should_contain);
    
    Set<String> _targetOperationScope_1 = this.targetOperationScope();
    boolean _should_contain_1 = Should.<String>should_contain(_targetOperationScope_1, "myPackage.another step");
    Assert.assertFalse("\nExpected targetOperationScope should not contain \"myPackage.another step\" but"
     + "\n     targetOperationScope is " + new StringDescription().appendValue(_targetOperationScope_1).toString() + "\n", _should_contain_1);
    
  }
}
