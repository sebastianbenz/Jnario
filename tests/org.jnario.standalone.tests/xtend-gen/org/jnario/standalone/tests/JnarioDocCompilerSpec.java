/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.standalone.tests;

import com.google.inject.Inject;
import java.io.File;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.hamcrest.Matcher;
import org.jnario.compiler.JnarioDocCompiler;
import org.jnario.lib.Should;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.standalone.tests.JnarioDocCompilerFeatureDocCompilerSpec;
import org.jnario.standalone.tests.JnarioDocCompilerSpecDocCompilerSpec;
import org.jnario.standalone.tests.JnarioDocCompilerSuiteDocCompilerSpec;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;

@Contains({ JnarioDocCompilerFeatureDocCompilerSpec.class, JnarioDocCompilerSpecDocCompilerSpec.class, JnarioDocCompilerSuiteDocCompilerSpec.class })
@Named("JnarioDocCompiler")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class JnarioDocCompilerSpec {
  @Inject
  @Rule
  public TemporaryFolder folder;
  
  @Inject
  JnarioDocCompiler compiler;
  
  @Before
  public void before() throws Exception {
    this.compiler.setSourcePath("./testdata");
    File _root = this.folder.getRoot();
    String _string = _root.toString();
    this.compiler.setOutputPath(_string);
    this.compiler.setDeleteTempDirectory(true);
    this.compiler.setUseCurrentClassLoaderAsParent(true);
    this.compiler.compile();
  }
  
  public Matcher<? super String> generated() {
    final Function1<String,Boolean> _function = new Function1<String,Boolean>() {
      public Boolean apply(final String it) {
        File _root = JnarioDocCompilerSpec.this.folder.getRoot();
        String _string = _root.toString();
        String _plus = (_string + "/");
        String _plus_1 = (_plus + it);
        File _file = new File(_plus_1);
        return Boolean.valueOf(_file.exists());
      }
    };
    return Should.<String>matches("generated", _function);
  }
}
