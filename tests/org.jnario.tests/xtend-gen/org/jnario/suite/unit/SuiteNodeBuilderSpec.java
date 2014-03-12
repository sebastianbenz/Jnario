/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.unit;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SuiteTestCreator;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuiteFactory;
import org.jnario.suite.unit.SuiteNodeBuilderLevelSpec;
import org.jnario.suite.unit.SuiteNodeBuilderParentSpec;
import org.junit.runner.RunWith;

@Contains({ SuiteNodeBuilderParentSpec.class, SuiteNodeBuilderLevelSpec.class })
@Named("SuiteNodeBuilder")
@RunWith(ExampleGroupRunner.class)
@CreateWith(SuiteTestCreator.class)
@SuppressWarnings("all")
public class SuiteNodeBuilderSpec {
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public ModelStore m;
  
  public Resource parseSuite(final CharSequence s) {
    Resource _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.newLine();
      _builder.append(s, "");
      _builder.newLineIfNotEmpty();
      final String input = _builder.toString();
      _xblockexpression = (this.m.parseSuite(input));
    }
    return _xblockexpression;
  }
  
  public List<Suite> suites(final String... names) {
    final Function1<String,Suite> _function = new Function1<String,Suite>() {
      public Suite apply(final String it) {
        return SuiteNodeBuilderSpec.this.suite(it);
      }
    };
    return ListExtensions.<String, Suite>map(((List<String>)Conversions.doWrapArray(names)), _function);
  }
  
  public Suite suite(final String name) {
    Suite _xblockexpression = null;
    {
      final Suite suite = SuiteFactory.eINSTANCE.createSuite();
      suite.setName(name);
      _xblockexpression = (suite);
    }
    return _xblockexpression;
  }
}
