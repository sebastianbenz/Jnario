package org.jnario.feature.tests.unit.naming;

import org.hamcrest.StringDescription;
import org.jnario.feature.feature.Scenario;
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
@Named("^describe[Scenario]")
@RunWith(ExampleGroupRunner.class)
public class StepNameProviderDescribeScenarioSpec extends StepNameProviderSpec {
  @Test
  @Named("scenario[\\\" With whitespace \\\"].desc =>  \\\"With whitespace\\\"")
  @Order(10)
  public void _scenarioWithWhitespaceDescWithWhitespace() throws Exception {
    Scenario _scenario = Features.scenario(" With whitespace ");
    String _desc = this.desc(_scenario);
    boolean _doubleArrow = Should.operator_doubleArrow(_desc, "With whitespace");
    Assert.assertTrue("\nExpected scenario(\" With whitespace \").desc =>  \"With whitespace\" but"
     + "\n     scenario(\" With whitespace \").desc is " + new StringDescription().appendValue(_desc).toString()
     + "\n     scenario(\" With whitespace \") is " + new StringDescription().appendValue(_scenario).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("scenario[\\\"With [parentheses]\\\"].desc =>  \\\"With [parentheses]\\\"")
  @Order(11)
  public void _scenarioWithParenthesesDescWithParentheses() throws Exception {
    Scenario _scenario = Features.scenario("With (parentheses)");
    String _desc = this.desc(_scenario);
    boolean _doubleArrow = Should.operator_doubleArrow(_desc, "With [parentheses]");
    Assert.assertTrue("\nExpected scenario(\"With (parentheses)\").desc =>  \"With [parentheses]\" but"
     + "\n     scenario(\"With (parentheses)\").desc is " + new StringDescription().appendValue(_desc).toString()
     + "\n     scenario(\"With (parentheses)\") is " + new StringDescription().appendValue(_scenario).toString() + "\n", _doubleArrow);
    
  }
}
