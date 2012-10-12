package org.jnario.spec.tests.integration;

import com.google.inject.Inject;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("BeforeAll")
@CreateWith(value = SpecTestCreator.class)
public class BeforeAllSpec {
  @Inject
  @Extension
  public BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("should be executed before all tests")
  @Order(0)
  public void _shouldBeExecutedBeforeAllTests() throws Exception {
    final String spec = "\r\n\t\t\tpackage bootstrap \r\n\t\t\t\r\n\t\t\tdescribe \"BeforeAll\"{\r\n\t\t\t\t\r\n\t\t\t\tstatic int beforeExecutionCount = 0\r\n\t\t\t\t\r\n\t\t\t\tbefore all{\r\n\t\t\t\t\tbeforeExecutionCount = beforeExecutionCount + 1\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\tfact \"should be executed before all tests (1)\"{\r\n\t\t\t\t\tbeforeExecutionCount should be 1\r\n\t\t\t\t}\t\r\n\t\t\t\t\r\n\t\t\t\tfact \"should be executed before all tests (2)\"{\r\n\t\t\t\t\tbeforeExecutionCount should be 1\r\n\t\t\t\t}\t\r\n\t\t\t}\r\n\t\t";
    this._behaviorExecutor.executesSuccessfully(spec);
  }
}
