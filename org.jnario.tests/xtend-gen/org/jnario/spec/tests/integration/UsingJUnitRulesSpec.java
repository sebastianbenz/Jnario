package org.jnario.spec.tests.integration;

import java.io.File;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;

/**
 * JUnit rules work exactly as in JUnit. Just declare a public field with the rule annotation:
 * 
 * 	@Rule
 * 	public TemporaryFolder folder = new TemporaryFolder
 */
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Using JUnit Rules")
public class UsingJUnitRulesSpec {
  @Rule
  public TemporaryFolder folder = new Function0<TemporaryFolder>() {
    public TemporaryFolder apply() {
      TemporaryFolder _temporaryFolder = new TemporaryFolder();
      return _temporaryFolder;
    }
  }.apply();
  
  @Test
  @Named("folder.root should not be null")
  @Order(99)
  public void folderRootShouldNotBeNull() throws Exception {
    File _root = this.folder.getRoot();
    boolean _should_be = Should.<File>should_be(_root, null);
    Assert.assertFalse("\nExpected folder.root should not be null but"
     + "\n     folder.root is " + _root
     + "\n     folder is " + this.folder + "\n", _should_be);
    
  }
}
