package org.jnario.feature.tests.unit.naming;

import org.hamcrest.StringDescription;
import org.jnario.feature.tests.unit.naming.FeatureQualifiedNameProviderSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("StepImplementation")
@RunWith(ExampleGroupRunner.class)
public class FeatureQualifiedNameProviderStepImplementationSpec extends FeatureQualifiedNameProviderSpec {
  @Test
  @Named("strips keyword")
  @Order(4)
  public void _stripsKeyword() throws Exception {
    String _implementedStepName = this.implementedStepName("Given a step with implementation");
    boolean _doubleArrow = Should.operator_doubleArrow(_implementedStepName, "myPackage.a step with implementation");
    Assert.assertTrue("\nExpected \"Given a step with implementation\".implementedStepName => \"myPackage.a step with implementation\" but"
     + "\n     \"Given a step with implementation\".implementedStepName is " + new StringDescription().appendValue(_implementedStepName).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("strips dot at end")
  @Order(5)
  public void _stripsDotAtEnd() throws Exception {
    String _implementedStepName = this.implementedStepName("Given a step with implementation.");
    boolean _doubleArrow = Should.operator_doubleArrow(_implementedStepName, "myPackage.a step with implementation");
    Assert.assertTrue("\nExpected \"Given a step with implementation.\".implementedStepName => \"myPackage.a step with implementation\" but"
     + "\n     \"Given a step with implementation.\".implementedStepName is " + new StringDescription().appendValue(_implementedStepName).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("strips argument values")
  @Order(6)
  public void _stripsArgumentValues() throws Exception {
    String _implementedStepName = this.implementedStepName("Given a step with \"arg\".");
    boolean _doubleArrow = Should.operator_doubleArrow(_implementedStepName, "myPackage.a step with \"\"");
    Assert.assertTrue("\nExpected \"Given a step with \\\"arg\\\".\".implementedStepName => \'myPackage.a step with \"\"\' but"
     + "\n     \"Given a step with \\\"arg\\\".\".implementedStepName is " + new StringDescription().appendValue(_implementedStepName).toString() + "\n", _doubleArrow);
    
  }
}
