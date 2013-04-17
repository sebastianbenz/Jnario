/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.integration;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("StaticImports")
@RunWith(ExampleGroupRunner.class)
@CreateWith(SpecTestCreator.class)
@SuppressWarnings("all")
public class StaticImportsSpec {
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("should resolve static imports")
  @Order(1)
  public void _shouldResolveStaticImports() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import static org.junit.Assert.*");
    _builder.newLine();
    _builder.append("describe \"Example\" {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"should resolve static imports\"{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("assertTrue(true) ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder);
  }
}
