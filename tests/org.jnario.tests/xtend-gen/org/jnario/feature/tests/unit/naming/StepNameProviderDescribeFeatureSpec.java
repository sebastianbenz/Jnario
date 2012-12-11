package org.jnario.feature.tests.unit.naming;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.hamcrest.StringDescription;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.tests.unit.naming.StepNameProviderSpec;
import org.jnario.jnario.test.util.Features;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("^describe[Feature]")
@RunWith(ExampleGroupRunner.class)
public class StepNameProviderDescribeFeatureSpec extends StepNameProviderSpec {
  @Test
  @Named("removes multilines parameters")
  @Order(6)
  public void _removesMultilinesParameters() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Scenario: MyScenario 2");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Given a step with multiline parameter");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"the parameter\"");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("1 + 1 => 2");
    _builder.newLine();
    this.parseScenario(_builder);
    String _describeStep = this.describeStep();
    boolean _doubleArrow = Should.operator_doubleArrow(_describeStep, "Given a step with multiline parameter");
    Assert.assertTrue("\nExpected describeStep => \'Given a step with multiline parameter\' but"
     + "\n     describeStep is " + new StringDescription().appendValue(_describeStep).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("feature[\\\" With whitespace \\\"].desc =>  \\\"With whitespace\\\"")
  @Order(7)
  public void _featureWithWhitespaceDescWithWhitespace() throws Exception {
    Feature _feature = Features.feature(" With whitespace ");
    String _desc = this.desc(_feature);
    boolean _doubleArrow = Should.operator_doubleArrow(_desc, "With whitespace");
    Assert.assertTrue("\nExpected feature(\" With whitespace \").desc =>  \"With whitespace\" but"
     + "\n     feature(\" With whitespace \").desc is " + new StringDescription().appendValue(_desc).toString()
     + "\n     feature(\" With whitespace \") is " + new StringDescription().appendValue(_feature).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("feature[\\\"With [parentheses]\\\"].desc =>  \\\"With [parentheses]\\\"")
  @Order(8)
  public void _featureWithParenthesesDescWithParentheses() throws Exception {
    Feature _feature = Features.feature("With (parentheses)");
    String _desc = this.desc(_feature);
    boolean _doubleArrow = Should.operator_doubleArrow(_desc, "With [parentheses]");
    Assert.assertTrue("\nExpected feature(\"With (parentheses)\").desc =>  \"With [parentheses]\" but"
     + "\n     feature(\"With (parentheses)\").desc is " + new StringDescription().appendValue(_desc).toString()
     + "\n     feature(\"With (parentheses)\") is " + new StringDescription().appendValue(_feature).toString() + "\n", _doubleArrow);
    
  }
}
