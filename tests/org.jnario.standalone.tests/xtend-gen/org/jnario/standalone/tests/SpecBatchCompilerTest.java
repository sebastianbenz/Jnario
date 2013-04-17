package org.jnario.standalone.tests;

import com.google.inject.Inject;
import java.io.File;
import java.io.FilenameFilter;
import java.util.List;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.Files;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.jnario.jnario.test.util.ExtendedSpecInjectorProvider;
import org.jnario.spec.compiler.SpecBatchCompiler;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(value = XtextRunner.class)
@InjectWith(value = ExtendedSpecInjectorProvider.class)
@SuppressWarnings("all")
public class SpecBatchCompilerTest {
  @Inject
  private SpecBatchCompiler batchCompiler;
  
  private static String OUTPUT_DIRECTORY = "./test-result";
  
  private static String XTEND_SRC_DIRECTORY = "./testdata";
  
  private static String TEMP_DIRECTORY = "./test-temp-dir";
  
  @Before
  public void onSetup() {
    try {
      this.batchCompiler.setSourcePath(SpecBatchCompilerTest.XTEND_SRC_DIRECTORY);
      this.batchCompiler.setOutputPath(SpecBatchCompilerTest.OUTPUT_DIRECTORY);
      this.batchCompiler.setDeleteTempDirectory(true);
      this.batchCompiler.setUseCurrentClassLoaderAsParent(true);
      File _file = new File(SpecBatchCompilerTest.OUTPUT_DIRECTORY);
      _file.mkdir();
      File _file_1 = new File(SpecBatchCompilerTest.OUTPUT_DIRECTORY);
      Files.cleanFolder(_file_1, null, true, false);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @After
  public void onTearDown() {
    try {
      File _file = new File(SpecBatchCompilerTest.OUTPUT_DIRECTORY);
      Files.cleanFolder(_file, null, true, true);
      File _file_1 = new File(SpecBatchCompilerTest.TEMP_DIRECTORY);
      boolean _exists = _file_1.exists();
      if (_exists) {
        File _file_2 = new File(SpecBatchCompilerTest.TEMP_DIRECTORY);
        Files.cleanFolder(_file_2, null, true, true);
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
    final Function2<File,String,Boolean> _function = new Function2<File,String,Boolean>() {
        public Boolean apply(final File dir, final String name) {
          boolean _endsWith = name.endsWith(".java");
          return _endsWith;
        }
      };
    String[] _list = _file.list(new FilenameFilter() {
        public boolean accept(File dir,String name) {
          return _function.apply(dir,name);
        }
    });
    int _size = ((List<String>)Conversions.doWrapArray(_list)).size();
    Assert.assertEquals(3, _size);
  }
}
