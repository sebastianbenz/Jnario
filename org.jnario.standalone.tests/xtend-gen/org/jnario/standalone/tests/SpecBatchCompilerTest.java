package org.jnario.standalone.tests;

import java.io.File;
import java.util.List;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.Files;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.jnario.spec.SpecInjectorProvider;
import org.jnario.spec.compiler.batch.SpecBatchCompiler;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

@SuppressWarnings("all")
@RunWith(XtextRunner.class)
@InjectWith(SpecInjectorProvider.class)
public class SpecBatchCompilerTest {
  @Inject
  private SpecBatchCompiler batchCompiler;
  
  private static String OUTPUT_DIRECTORY_WITH_SPACES = "./test result";
  
  private static String OUTPUT_DIRECTORY = "./test-result";
  
  private static String XTEND_SRC_DIRECTORY = "./testdata";
  
  private static String TEMP_DIRECTORY = "./test-temp-dir";
  
  @Before
  public void onSetup() {
    try {
      this.batchCompiler.setSourcePath(SpecBatchCompilerTest.XTEND_SRC_DIRECTORY);
      this.batchCompiler.setOutputPath(SpecBatchCompilerTest.OUTPUT_DIRECTORY);
      this.batchCompiler.setDeleteTempDirectory(true);
      File _file = new File(SpecBatchCompilerTest.OUTPUT_DIRECTORY);
      _file.mkdir();
      File _file_1 = new File(SpecBatchCompilerTest.OUTPUT_DIRECTORY);
      Files.cleanFolder(_file_1, null, true, false);
      File _file_2 = new File(SpecBatchCompilerTest.OUTPUT_DIRECTORY_WITH_SPACES);
      _file_2.mkdir();
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @After
  public void onTearDown() {
    try {
      File _file = new File(SpecBatchCompilerTest.OUTPUT_DIRECTORY);
      Files.cleanFolder(_file, null, true, true);
      File _file_1 = new File(SpecBatchCompilerTest.OUTPUT_DIRECTORY_WITH_SPACES);
      Files.cleanFolder(_file_1, null, true, true);
      File _file_2 = new File(SpecBatchCompilerTest.TEMP_DIRECTORY);
      boolean _exists = _file_2.exists();
      if (_exists) {
        File _file_3 = new File(SpecBatchCompilerTest.TEMP_DIRECTORY);
        Files.cleanFolder(_file_3, null, true, true);
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCompileTestData() {
    this.batchCompiler.compile();
    String _plus = (SpecBatchCompilerTest.OUTPUT_DIRECTORY + "/test");
    File _file = new File(_plus);
    String[] _list = _file.list();
    int _size = ((List<String>)Conversions.doWrapArray(_list)).size();
    Assert.assertEquals(3, _size);
  }
}
