package org.jnario.spec.tests.integration;

import com.google.inject.Inject;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.ConsoleRecorder;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.spec.tests.integration.SetupTeardownAfterAllSpec;
import org.jnario.spec.tests.integration.SetupTeardownAfterSpec;
import org.jnario.spec.tests.integration.SetupTeardownBeforeAllSpec;
import org.jnario.spec.tests.integration.SetupTeardownBeforeSpec;
import org.jnario.spec.tests.integration.SetupTeardownNestingBeforeAfterSpec;
import org.junit.Assert;
import org.junit.runner.RunWith;

@Contains({ SetupTeardownBeforeAllSpec.class, SetupTeardownBeforeSpec.class, SetupTeardownAfterAllSpec.class, SetupTeardownAfterSpec.class, SetupTeardownNestingBeforeAfterSpec.class })
@SuppressWarnings("all")
@Named("Setup & Teardown")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = SpecTestCreator.class)
public class SetupTeardownSpec {
  @Inject
  @Extension
  public BehaviorExecutor _behaviorExecutor;
  
  public void prints(final CharSequence spec, final String expected) {
    final ConsoleRecorder recording = ConsoleRecorder.start();
    this._behaviorExecutor.executesSuccessfully(spec);
    final String actual = recording.stop();
    Assert.assertEquals(expected, actual);
  }
}
