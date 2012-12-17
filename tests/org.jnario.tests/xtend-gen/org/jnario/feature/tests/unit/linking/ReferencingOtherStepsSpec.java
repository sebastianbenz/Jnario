package org.jnario.feature.tests.unit.linking;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.hamcrest.StringDescription;
import org.jnario.feature.feature.Given;
import org.jnario.feature.feature.GivenReference;
import org.jnario.feature.feature.StepImplementation;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Scenario steps can reference other steps with an implementation. It is important
 * to note that these references are aware of the respective namespaces. If you want
 * to reference a step in a different package you need to add a corresponding import statement
 * (see last example).
 */
@SuppressWarnings("all")
@Named("Referencing other Steps")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = FeatureTestCreator.class)
public class ReferencingOtherStepsSpec {
  @Inject
  @Extension
  public ModelStore m;
  
  @Test
  @Named("Steps can reference steps in the same feature")
  @Order(1)
  public void _stepsCanReferenceStepsInTheSameFeature() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Feature: My Feature");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: Scenario 1");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Given a step");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("val x = \"an implementation\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: Scenario 2");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Given a step");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    this.m.parseScenario(_builder);
    GivenReference _first = this.m.<GivenReference>first(GivenReference.class);
    StepImplementation _reference = _first.getReference();
    Given _first_1 = this.m.<Given>first(Given.class);
    boolean _doubleArrow = Should.operator_doubleArrow(_reference, _first_1);
    Assert.assertTrue("\nExpected first(typeof(GivenReference)).reference => first(typeof(Given)) but"
     + "\n     first(typeof(GivenReference)).reference is " + new StringDescription().appendValue(_reference).toString()
     + "\n     first(typeof(GivenReference)) is " + new StringDescription().appendValue(_first).toString()
     + "\n     first(typeof(Given)) is " + new StringDescription().appendValue(_first_1).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("Steps ignore trailing whitespace when referencing steps")
  @Order(2)
  public void _stepsIgnoreTrailingWhitespaceWhenReferencingSteps() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Feature: My Feature");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: Scenario 1");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Given a step");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("val x = \"an implementation\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: Scenario 2");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Given a step\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//            ^ ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//   here is a whitespace");
    _builder.newLine();
    this.m.parseScenario(_builder);
    GivenReference _first = this.m.<GivenReference>first(GivenReference.class);
    StepImplementation _reference = _first.getReference();
    Given _first_1 = this.m.<Given>first(Given.class);
    boolean _doubleArrow = Should.operator_doubleArrow(_reference, _first_1);
    Assert.assertTrue("\nExpected first(typeof(GivenReference)).reference => first(typeof(Given)) but"
     + "\n     first(typeof(GivenReference)).reference is " + new StringDescription().appendValue(_reference).toString()
     + "\n     first(typeof(GivenReference)) is " + new StringDescription().appendValue(_first).toString()
     + "\n     first(typeof(Given)) is " + new StringDescription().appendValue(_first_1).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("Steps can reference steps in features in the same package")
  @Order(3)
  public void _stepsCanReferenceStepsInFeaturesInTheSamePackage() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Feature: My Feature 1");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: Scenario 1");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Given a step");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("val x = \"an implementation\"");
    _builder.newLine();
    this.m.parseScenario(_builder);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package test");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("Feature: My Feature 2");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("Scenario: Scenario 2");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("Given a step");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.newLine();
    this.m.parseScenario(_builder_1);
    GivenReference _first = this.m.<GivenReference>first(GivenReference.class);
    StepImplementation _reference = _first.getReference();
    Given _first_1 = this.m.<Given>first(Given.class);
    boolean _doubleArrow = Should.operator_doubleArrow(_reference, _first_1);
    Assert.assertTrue("\nExpected first(typeof(GivenReference)).reference => first(typeof(Given)) but"
     + "\n     first(typeof(GivenReference)).reference is " + new StringDescription().appendValue(_reference).toString()
     + "\n     first(typeof(GivenReference)) is " + new StringDescription().appendValue(_first).toString()
     + "\n     first(typeof(Given)) is " + new StringDescription().appendValue(_first_1).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("Referencing steps in a different package requires an import statement")
  @Order(4)
  public void _referencingStepsInADifferentPackageRequiresAnImportStatement() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test1");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Feature: My Feature 1");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: Scenario 1");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Given a step");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("val x = \"an implementation\"");
    _builder.newLine();
    this.m.parseScenario(_builder);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package test2");
    _builder_1.newLine();
    _builder_1.append("import test1.*");
    _builder_1.newLine();
    _builder_1.append("Feature: My Feature 2");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("Scenario: Scenario 2");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("Given a step");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.newLine();
    this.m.parseScenario(_builder_1);
    GivenReference _first = this.m.<GivenReference>first(GivenReference.class);
    StepImplementation _reference = _first.getReference();
    Given _first_1 = this.m.<Given>first(Given.class);
    boolean _doubleArrow = Should.operator_doubleArrow(_reference, _first_1);
    Assert.assertTrue("\nExpected first(typeof(GivenReference)).reference => first(typeof(Given)) but"
     + "\n     first(typeof(GivenReference)).reference is " + new StringDescription().appendValue(_reference).toString()
     + "\n     first(typeof(GivenReference)) is " + new StringDescription().appendValue(_first).toString()
     + "\n     first(typeof(Given)) is " + new StringDescription().appendValue(_first_1).toString() + "\n", _doubleArrow);
    
  }
}
