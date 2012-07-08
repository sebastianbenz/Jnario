package org.jnario.jnario.tests.unit.jnario;

import org.hamcrest.StringDescription;
import org.jnario.jnario.test.util.Suites;
import org.jnario.jnario.tests.unit.jnario.ExecutableIsPendingSpec;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.suite.suite.Suite;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Suite")
public class ExecutableIsPendingSuiteSpec extends ExecutableIsPendingSpec {
  @Test
  @Named("Suites do not support isPending")
  @Order(99)
  public void suitesDoNotSupportIsPending() throws Exception {
    try{
      Suite _suite = Suites.suite("A suite");
      _suite.isPending();
      Assert.fail("Expected " + UnsupportedOperationException.class.getName() + " in \n     suite(\"A suite\").isPending\n with:"
       + "\n     suite(\"A suite\") is " + new StringDescription().appendValue(_suite).toString());
    }catch(UnsupportedOperationException e){
      // expected
    }
  }
}
