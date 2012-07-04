package org.jnario.spec.tests.integration;

import org.jnario.jnario.test.util.SpecExecutor;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Before")
public class BeforeSpec {
  @Test
  @Named("should be executed before each test")
  @Order(99)
  public void shouldBeExecutedBeforeEachTest() throws Exception {
    final String spec = "\r\n\t\t\tpackage bootstrap\r\n\t\t\t \r\n\t\t\timport org.jnario.runner.Order\r\n\t\t\t\r\n\t\t\tdescribe \"Before\"{\r\n\t\t\t\t\r\n\t\t\t\tstatic int beforeExecutionCount = 0\r\n\t\t\t\t\r\n\t\t\t\tbefore{\r\n\t\t\t\t\tbeforeExecutionCount = beforeExecutionCount + 1\r\n\t\t\t\t}\r\n\r\n\t\t\t\tfact \"should be executed before each test (1)\"{\r\n\t\t\t\t\tbeforeExecutionCount should be 1\r\n\t\t\t\t}\t\r\n\r\n\t\t\t\tfact \"should be executed before each test (2)\"{\r\n\t\t\t\t\tbeforeExecutionCount should be 2\r\n\t\t\t\t}\t\r\n\t\t\t}\r\n\t\t";
    SpecExecutor.executesSuccessfully(spec);
  }
}
