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
@Named("StepReference")
@RunWith(ExampleGroupRunner.class)
public class FeatureQualifiedNameProviderStepReferenceSpec extends FeatureQualifiedNameProviderSpec {
  @Test
  @Named("strips keyword")
  @Order(7)
  public void _stripsKeyword() throws Exception {
    String _implementedStepName = this.implementedStepName("Given a step with implementation");
    boolean _doubleArrow = Should.operator_doubleArrow(_implementedStepName, "myPackage.a step with implementation");
    Assert.assertTrue("\nExpected \"Given a step with implementation\".implementedStepName => \"myPackage.a step with implementation\" but"
     + "\n     \"Given a step with implementation\".implementedStepName is " + new StringDescription().appendValue(_implementedStepName).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("strips dot at end")
  @Order(8)
  public void _stripsDotAtEnd() throws Exception {
    String _stepName = this.stepName("Given a step with implementation.");
    boolean _doubleArrow = Should.operator_doubleArrow(_stepName, "myPackage.a step with implementation");
    Assert.assertTrue("\nExpected \"Given a step with implementation.\".stepName => \"myPackage.a step with implementation\" but"
     + "\n     \"Given a step with implementation.\".stepName is " + new StringDescription().appendValue(_stepName).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("strips argument values")
  @Order(9)
  public void _stripsArgumentValues() throws Exception {
    String _stepName = this.stepName("Given a step with \"arg\".");
    boolean _doubleArrow = Should.operator_doubleArrow(_stepName, "myPackage.a step with \"\"");
    Assert.assertTrue("\nExpected \"Given a step with \\\"arg\\\".\".stepName => \'myPackage.a step with \"\"\' but"
     + "\n     \"Given a step with \\\"arg\\\".\".stepName is " + new StringDescription().appendValue(_stepName).toString() + "\n", _doubleArrow);
    
  }
}
