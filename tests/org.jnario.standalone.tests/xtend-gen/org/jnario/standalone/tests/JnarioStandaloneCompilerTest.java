/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.standalone.tests;

import com.google.common.base.Charsets;
import com.google.inject.Inject;
import com.google.inject.Provider;
import java.io.File;
import java.io.FilenameFilter;
import java.util.List;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend.core.compiler.batch.XtendBatchCompiler;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.Files;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.compiler.JnarioStandaloneCompiler;
import org.jnario.jnario.test.util.ExtendedSuiteInjectorProvider;
import org.jnario.jnario.test.util.ModelStore;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ExtendedSuiteInjectorProvider.class)
@SuppressWarnings("all")
public class JnarioStandaloneCompilerTest {
  @Inject
  @Extension
  private ModelStore modelStore;
  
  private static String OUTPUT_DIRECTORY = "test-result";
  
  private static String XTEND_SRC_DIRECTORY = "testdata2";
  
  @Before
  public void onSetup() {
    try {
      final File dir = new File(JnarioStandaloneCompilerTest.OUTPUT_DIRECTORY);
      boolean _exists = dir.exists();
      if (_exists) {
        Files.cleanFolder(dir, null, true, false);
      }
      File _file = new File(JnarioStandaloneCompilerTest.OUTPUT_DIRECTORY);
      _file.mkdir();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void compile(final XtendBatchCompiler batchCompiler) {
    batchCompiler.setSourcePath(JnarioStandaloneCompilerTest.XTEND_SRC_DIRECTORY);
    batchCompiler.setOutputPath(JnarioStandaloneCompilerTest.OUTPUT_DIRECTORY);
    batchCompiler.setDeleteTempDirectory(true);
    batchCompiler.setUseCurrentClassLoaderAsParent(true);
    final Provider<ResourceSet> _function = new Provider<ResourceSet>() {
      public ResourceSet get() {
        XtextResourceSet _resourceSet = JnarioStandaloneCompilerTest.this.modelStore.getResourceSet();
        return ((ResourceSet) _resourceSet);
      }
    };
    batchCompiler.setResourceSetProvider(_function);
    batchCompiler.compile();
  }
  
  @After
  public void onTearDown() {
    try {
      File _file = new File(JnarioStandaloneCompilerTest.OUTPUT_DIRECTORY);
      Files.cleanFolder(_file, null, true, true);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCompileTestData() {
    try {
      final JnarioStandaloneCompiler compiler = JnarioStandaloneCompiler.create();
      this.compile(compiler);
      final File outputDir = new File((JnarioStandaloneCompilerTest.OUTPUT_DIRECTORY + "/linking"));
      final FilenameFilter _function = new FilenameFilter() {
        public boolean accept(final File dir, final String name) {
          return name.endsWith(".java");
        }
      };
      String[] _list = outputDir.list(_function);
      int _size = ((List<String>)Conversions.doWrapArray(_list)).size();
      Assert.assertEquals(7, _size);
      File _file = new File(outputDir, "ExampleSuiteSuite.java");
      final String fileContent = com.google.common.io.Files.toString(_file, Charsets.UTF_8);
      boolean _contains = fileContent.contains("@Contains(");
      Assert.assertTrue(("Expected to be to contain others specs, but was: \n\n" + fileContent), _contains);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
