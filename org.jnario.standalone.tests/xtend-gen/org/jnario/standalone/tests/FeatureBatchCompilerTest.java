package org.jnario.standalone.tests;

import com.google.inject.Inject;
import java.io.File;
import java.util.List;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.Files;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.jnario.feature.FeatureInjectorProvider;
import org.jnario.feature.compiler.batch.FeatureBatchCompiler;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(XtextRunner.class)
@InjectWith(FeatureInjectorProvider.class)
public class FeatureBatchCompilerTest {
  @Inject
  private FeatureBatchCompiler batchCompiler;
  
  private static String OUTPUT_DIRECTORY_WITH_SPACES = "./test result";
  
  private static String OUTPUT_DIRECTORY = "./test-result";
  
  private static String XTEND_SRC_DIRECTORY = "./testdata";
  
  private static String TEMP_DIRECTORY = "./test-temp-dir";
  
  @Before
  public void onSetup() {
    try {
      this.batchCompiler.setSourcePath(FeatureBatchCompilerTest.XTEND_SRC_DIRECTORY);
      this.batchCompiler.setOutputPath(FeatureBatchCompilerTest.OUTPUT_DIRECTORY);
      this.batchCompiler.setDeleteTempDirectory(true);
      File _file = new File(FeatureBatchCompilerTest.OUTPUT_DIRECTORY);
      _file.mkdir();
      File _file_1 = new File(FeatureBatchCompilerTest.OUTPUT_DIRECTORY);
      Files.cleanFolder(_file_1, null, true, false);
      File _file_2 = new File(FeatureBatchCompilerTest.OUTPUT_DIRECTORY_WITH_SPACES);
      _file_2.mkdir();
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @After
  public void onTearDown() {
    try {
      File _file = new File(FeatureBatchCompilerTest.OUTPUT_DIRECTORY);
      Files.cleanFolder(_file, null, true, true);
      File _file_1 = new File(FeatureBatchCompilerTest.OUTPUT_DIRECTORY_WITH_SPACES);
      Files.cleanFolder(_file_1, null, true, true);
      File _file_2 = new File(FeatureBatchCompilerTest.TEMP_DIRECTORY);
      boolean _exists = _file_2.exists();
      if (_exists) {
        File _file_3 = new File(FeatureBatchCompilerTest.TEMP_DIRECTORY);
        Files.cleanFolder(_file_3, null, true, true);
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCompileTestData() {
    this.batchCompiler.compile();
    String _plus = (FeatureBatchCompilerTest.OUTPUT_DIRECTORY + "/test");
    File _file = new File(_plus);
    String[] _list = _file.list();
    int _size = ((List<String>)Conversions.doWrapArray(_list)).size();
    Assert.assertEquals(6, _size);
  }
}