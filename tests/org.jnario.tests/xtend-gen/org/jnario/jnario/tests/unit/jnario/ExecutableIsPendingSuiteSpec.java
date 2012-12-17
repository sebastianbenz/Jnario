package org.jnario.jnario.tests.unit.jnario;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;
import org.hamcrest.StringDescription;
import org.jnario.jnario.test.util.Specs;
import org.jnario.jnario.test.util.SuiteTestCreator;
import org.jnario.jnario.test.util.Suites;
import org.jnario.jnario.tests.unit.jnario.ExecutableIsPendingSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.spec.Example;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.suite.suite.SpecReference;
import org.jnario.suite.suite.Suite;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("Suite")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = SuiteTestCreator.class)
public class ExecutableIsPendingSuiteSpec extends ExecutableIsPendingSpec {
  @Inject
  XtextResource resource;
  
  @Test
  @Named("suiteWith[\\\"A suite\\\", specReference[pendingExampleGroup]].isPending should be true")
  @Order(20)
  public void _suiteWithASuiteSpecReferencePendingExampleGroupIsPendingShouldBeTrue() throws Exception {
    ExampleGroup _pendingExampleGroup = Specs.pendingExampleGroup();
    SpecReference _specReference = Suites.specReference(_pendingExampleGroup);
    Suite _suiteWith = this.suiteWith("A suite", _specReference);
    boolean _isPending = _suiteWith.isPending();
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_isPending), true);
    Assert.assertTrue("\nExpected suiteWith(\"A suite\", specReference(pendingExampleGroup)).isPending should be true but"
     + "\n     suiteWith(\"A suite\", specReference(pendingExampleGroup)).isPending is " + new StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     suiteWith(\"A suite\", specReference(pendingExampleGroup)) is " + new StringDescription().appendValue(_suiteWith).toString()
     + "\n     specReference(pendingExampleGroup) is " + new StringDescription().appendValue(_specReference).toString()
     + "\n     pendingExampleGroup is " + new StringDescription().appendValue(_pendingExampleGroup).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("suiteWith[\\\"A suite\\\", specReference[exampleGroupWith[example[\\\"passing\\\"]]]].isPending should be false")
  @Order(21)
  public void _suiteWithASuiteSpecReferenceExampleGroupWithExamplePassingIsPendingShouldBeFalse() throws Exception {
    Example _example = Specs.example("passing");
    ExampleGroup _exampleGroupWith = Specs.exampleGroupWith(_example);
    SpecReference _specReference = Suites.specReference(_exampleGroupWith);
    Suite _suiteWith = this.suiteWith("A suite", _specReference);
    boolean _isPending = _suiteWith.isPending();
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_isPending), false);
    Assert.assertTrue("\nExpected suiteWith(\"A suite\", specReference(exampleGroupWith(example(\"passing\")))).isPending should be false but"
     + "\n     suiteWith(\"A suite\", specReference(exampleGroupWith(example(\"passing\")))).isPending is " + new StringDescription().appendValue(Boolean.valueOf(_isPending)).toString()
     + "\n     suiteWith(\"A suite\", specReference(exampleGroupWith(example(\"passing\")))) is " + new StringDescription().appendValue(_suiteWith).toString()
     + "\n     specReference(exampleGroupWith(example(\"passing\"))) is " + new StringDescription().appendValue(_specReference).toString()
     + "\n     exampleGroupWith(example(\"passing\")) is " + new StringDescription().appendValue(_exampleGroupWith).toString()
     + "\n     example(\"passing\") is " + new StringDescription().appendValue(_example).toString() + "\n", _should_be);
    
  }
  
  public Suite suiteWith(final String name, final SpecReference... references) {
    Suite _xblockexpression = null;
    {
      final Suite result = Suites.suiteWith(name, references);
      EList<EObject> _contents = this.resource.getContents();
      _contents.add(result);
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
}
