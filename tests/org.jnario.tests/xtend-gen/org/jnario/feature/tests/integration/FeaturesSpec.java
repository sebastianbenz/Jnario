/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.integration;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.hamcrest.Matcher;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.test.util.ResultMatchers;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.RunWith;

@CreateWith(FeatureTestCreator.class)
@Named("Features")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class FeaturesSpec {
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("support anonymous class declaration")
  @Order(1)
  public void _supportAnonymousClassDeclaration() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.HashMap");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Feature: Test");
    _builder.newLine();
    _builder.append("Something");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Scenario: Something");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("When a");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("val test = new HashMap(){");
    _builder.newLine();
    _builder.append("      ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("override get(Object key) {");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("\"Hello World\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("test.get(null) => \"Hello World\"");
    _builder.newLine();
    _builder.append("Scenario: Something Els");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Given an empty string");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("When a");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    final String spec = _builder.toString();
    Result _execute = this._behaviorExecutor.execute(spec);
    Matcher<Result> _isSuccessful = ResultMatchers.isSuccessful();
    Assert.<Result>assertThat(_execute, _isSuccessful);
  }
}
