/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.integration;

import com.google.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.ConsoleRecorder;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.spec.tests.integration.SetupTeardownAfterAllSpec;
import org.jnario.spec.tests.integration.SetupTeardownAfterSpec;
import org.jnario.spec.tests.integration.SetupTeardownBeforeAllSpec;
import org.jnario.spec.tests.integration.SetupTeardownBeforeSpec;
import org.jnario.spec.tests.integration.SetupTeardownNestingBeforeAfterSpec;
import org.junit.Assert;
import org.junit.runner.RunWith;

@Contains({ SetupTeardownBeforeAllSpec.class, SetupTeardownBeforeSpec.class, SetupTeardownAfterAllSpec.class, SetupTeardownAfterSpec.class, SetupTeardownNestingBeforeAfterSpec.class })
@CreateWith(SpecTestCreator.class)
@Named("Setup & Teardown")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SetupTeardownSpec {
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public BehaviorExecutor _behaviorExecutor;
  
  public void prints(final CharSequence spec, final String expected) {
    final ConsoleRecorder recording = ConsoleRecorder.start();
    this._behaviorExecutor.executesSuccessfully(spec);
    final String actual = recording.stop();
    Assert.assertEquals(expected, actual);
  }
}
