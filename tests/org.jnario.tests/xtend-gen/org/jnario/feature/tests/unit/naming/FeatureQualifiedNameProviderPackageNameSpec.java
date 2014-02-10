package org.jnario.feature.tests.unit.naming;

import org.jnario.feature.tests.unit.naming.FeatureQualifiedNameProviderSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("Package name")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class FeatureQualifiedNameProviderPackageNameSpec extends FeatureQualifiedNameProviderSpec {
  @Test
  @Named("package name is prepended")
  @Order(1)
  public void _packageNameIsPrepended() throws Exception {
    String _stepName = this.stepName("Given a step", "myPackage");
    Assert.assertTrue("\nExpected stepName(\"Given a step\", \"myPackage\") should startWith(\"myPackage.\") but"
     + "\n     stepName(\"Given a step\", \"myPackage\") is " + new org.hamcrest.StringDescription().appendValue(_stepName).toString() + "\n", Should.should_startWith(_stepName, "myPackage."));
    
  }
  
  @Test
  @Named("package name is separated by \\\'.\\\'")
  @Order(2)
  public void _packageNameIsSeparatedBy() throws Exception {
    String _stepName = this.stepName("Given a step", "myPackage.subpackage");
    Assert.assertTrue("\nExpected stepName(\"Given a step\", \"myPackage.subpackage\") should startWith(\"myPackage.subpackage.\") but"
     + "\n     stepName(\"Given a step\", \"myPackage.subpackage\") is " + new org.hamcrest.StringDescription().appendValue(_stepName).toString() + "\n", Should.should_startWith(_stepName, "myPackage.subpackage."));
    
  }
  
  @Test
  @Named("default package name is \\\'features\\\'")
  @Order(3)
  public void _defaultPackageNameIsFeatures() throws Exception {
    String _stepName = this.stepName("Given a step", null);
    Assert.assertTrue("\nExpected stepName(\"Given a step\", null) should startWith(\"features.\") but"
     + "\n     stepName(\"Given a step\", null) is " + new org.hamcrest.StringDescription().appendValue(_stepName).toString() + "\n", Should.should_startWith(_stepName, "features."));
    
  }
}
