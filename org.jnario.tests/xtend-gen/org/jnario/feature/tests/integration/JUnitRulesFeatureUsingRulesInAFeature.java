package org.jnario.feature.tests.integration;

import java.io.File;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.lib.Should;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Using rules in a Feature")
@SuppressWarnings("all")
public class JUnitRulesFeatureUsingRulesInAFeature {
  @Test
  @Order(0)
  @Ignore
  @Named("[PENDING] Given a feature with a rule")
  public void givenAFeatureWithARule() {
    throw new UnsupportedOperationException("givenAFeatureWithARuleis not implemented");
  }
  
  @Test
  @Order(1)
  @Named("Then the rule should be initialized")
  public void thenTheRuleShouldBeInitialized() {
    File _root = this.folder.getRoot();
    boolean _should_be = Should.<File>should_be(_root, null);Assert
    .assertFalse("\nExpected folder.root should not be null but:"
     + "\n     folder.root is " + _root
     + "\n     folder is " + this.folder + "\n", _should_be);
    
  }
  
  @Rule
  public TemporaryFolder folder = new Function0<TemporaryFolder>() {
    public TemporaryFolder apply() {
      TemporaryFolder _temporaryFolder = new TemporaryFolder();
      return _temporaryFolder;
    }
  }.apply();
}
