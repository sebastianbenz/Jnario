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
@Named("After")
public class AfterSpec {
  @Test
  @Named("should be executed after each test")
  @Order(99)
  public void shouldBeExecutedAfterEachTest() throws Exception {
    final String spec = "\r\n\t\t\tpackage bootstrap \r\n\t\t\t\r\n\t\t\timport org.jnario.runner.Order\r\n\t\t\t\r\n\t\t\tdescribe \"After\"{\r\n\t\t\t\t\r\n\t\t\t\tstatic int afterExecutionCount = 0\r\n\t\t\t\t\r\n\t\t\t\tfact \"should be executed after each test (1)\"{\r\n\t\t\t\t\tafterExecutionCount should be 0\r\n\t\t\t\t}\t\r\n\t\t\t\tfact \"should be executed after each test (2)\"{\r\n\t\t\t\t\tafterExecutionCount should be 1\r\n\t\t\t\t}\r\n\t\t\t\tfact \"should be executed after each test (3)\"{\r\n\t\t\t\t\tafterExecutionCount should be 2\r\n\t\t\t\t}\t\r\n\t\t\t\t\r\n\t\t\t\tafter{\r\n\t\t\t\t\tafterExecutionCount = afterExecutionCount + 1\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t";
    SpecExecutor.executesSuccessfully(spec);
  }
}
