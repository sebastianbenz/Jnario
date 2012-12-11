package org.jnario.spec.tests.integration;

import com.google.inject.Inject;
import org.hamcrest.Matcher;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.ResultMatchers;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("Pending")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = SpecTestCreator.class)
public class PendingSpec {
  @Inject
  @Extension
  public BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("ignores empty examples during example runs")
  @Order(1)
  public void _ignoresEmptyExamplesDuringExampleRuns() throws Exception {
    final String spec = "\r\n\t\t\tpackage bootstrap\r\n\r\n\t\t\timport org.junit.*\r\n\r\n\t\t\tdescribe \"Pending\" {\r\n\r\n\t\t\t\tfact \"has no implementation in block expression\"{\r\n\t\t\t\t} \r\n\t\t\t\t\r\n\t\t\t\tfact \"has no body\"\r\n\t\t\t\t\t\t\r\n\t\t\t}\r\n\t\t";
    Result _execute = this._behaviorExecutor.execute(spec);
    Matcher<Result> _ignoreCountIs = ResultMatchers.ignoreCountIs(2);
    Assert.<Result>assertThat(_execute, _ignoreCountIs);
  }
}
