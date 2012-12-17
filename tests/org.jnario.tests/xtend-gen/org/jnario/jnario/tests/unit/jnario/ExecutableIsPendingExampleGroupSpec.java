package org.jnario.jnario.tests.unit.jnario;

import org.hamcrest.StringDescription;
import org.jnario.jnario.test.util.Specs;
import org.jnario.jnario.tests.unit.jnario.ExecutableIsPendingSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.spec.Example;
import org.jnario.spec.spec.ExampleGroup;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("ExampleGroup")
@RunWith(ExampleGroupRunner.class)
public class ExecutableIsPendingExampleGroupSpec extends ExecutableIsPendingSpec {
  @Test
  @Named("exampleGroupWith[pendingExample].isPending should be true")
  @Order(16)
  public void _exampleGroupWithPendingExampleIsPendingShouldBeTrue() throws Exception {
    Example _pendingExample = Specs.pendingExample();
    ExampleGroup _exampleGroupWith = Specs.exampleGroupWith(_pendingExample);
    boolean _isPending = _exampleGroupWith.isPending();
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_isPending), true);
    Assert.assertTrue("\nExpected exampleGroupWith(pendingExample).isPending should be true but"
     + "\n     exampleGroupWith(pendingExample).isPending is " + new StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     exampleGroupWith(pendingExample) is " + new StringDescription().appendValue(_exampleGroupWith).toString()
     + "\n     pendingExample is " + new StringDescription().appendValue(_pendingExample).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("exampleGroupWith[implementedExample].isPending should be false")
  @Order(17)
  public void _exampleGroupWithImplementedExampleIsPendingShouldBeFalse() throws Exception {
    Example _implementedExample = Specs.implementedExample();
    ExampleGroup _exampleGroupWith = Specs.exampleGroupWith(_implementedExample);
    boolean _isPending = _exampleGroupWith.isPending();
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_isPending), false);
    Assert.assertTrue("\nExpected exampleGroupWith(implementedExample).isPending should be false but"
     + "\n     exampleGroupWith(implementedExample).isPending is " + new StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     exampleGroupWith(implementedExample) is " + new StringDescription().appendValue(_exampleGroupWith).toString()
     + "\n     implementedExample is " + new StringDescription().appendValue(_implementedExample).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("exampleGroupWith[pendingExample, implementedExample].isPending should be true")
  @Order(18)
  public void _exampleGroupWithPendingExampleImplementedExampleIsPendingShouldBeTrue() throws Exception {
    Example _pendingExample = Specs.pendingExample();
    Example _implementedExample = Specs.implementedExample();
    ExampleGroup _exampleGroupWith = Specs.exampleGroupWith(_pendingExample, _implementedExample);
    boolean _isPending = _exampleGroupWith.isPending();
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_isPending), true);
    Assert.assertTrue("\nExpected exampleGroupWith(pendingExample, implementedExample).isPending should be true but"
     + "\n     exampleGroupWith(pendingExample, implementedExample).isPending is " + new StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     exampleGroupWith(pendingExample, implementedExample) is " + new StringDescription().appendValue(_exampleGroupWith).toString()
     + "\n     pendingExample is " + new StringDescription().appendValue(_pendingExample).toString()
     + "\n     implementedExample is " + new StringDescription().appendValue(_implementedExample).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("exampleGroupWith[pendingExampleGroup].isPending should be true")
  @Order(19)
  public void _exampleGroupWithPendingExampleGroupIsPendingShouldBeTrue() throws Exception {
    ExampleGroup _pendingExampleGroup = Specs.pendingExampleGroup();
    ExampleGroup _exampleGroupWith = Specs.exampleGroupWith(_pendingExampleGroup);
    boolean _isPending = _exampleGroupWith.isPending();
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_isPending), true);
    Assert.assertTrue("\nExpected exampleGroupWith(pendingExampleGroup).isPending should be true but"
     + "\n     exampleGroupWith(pendingExampleGroup).isPending is " + new StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     exampleGroupWith(pendingExampleGroup) is " + new StringDescription().appendValue(_exampleGroupWith).toString()
     + "\n     pendingExampleGroup is " + new StringDescription().appendValue(_pendingExampleGroup).toString() + "\n", _should_be);
    
  }
}
