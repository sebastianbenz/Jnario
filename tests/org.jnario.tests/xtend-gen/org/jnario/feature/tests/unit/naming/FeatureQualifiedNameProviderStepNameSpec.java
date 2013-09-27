package org.jnario.feature.tests.unit.naming;

import java.util.Arrays;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.feature.tests.unit.naming.FeatureQualifiedNameProviderSpec;
import org.jnario.feature.tests.unit.naming.FeatureQualifiedNameProviderStepNameSpecExamples;
import org.jnario.lib.ExampleTable;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("Step Name")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class FeatureQualifiedNameProviderStepNameSpec extends FeatureQualifiedNameProviderSpec {
  public ExampleTable<FeatureQualifiedNameProviderStepNameSpecExamples> _initFeatureQualifiedNameProviderStepNameSpecExamples() {
    return ExampleTable.create("examples", 
      Arrays.asList("description", "name", "expected"), 
      new FeatureQualifiedNameProviderStepNameSpecExamples(  Arrays.asList("\"strips keyword\"", "\"Given a step with implementation\"", "\"myPackage.a step with implementation\""), _initFeatureQualifiedNameProviderStepNameSpecExamplesCell0(), _initFeatureQualifiedNameProviderStepNameSpecExamplesCell1(), _initFeatureQualifiedNameProviderStepNameSpecExamplesCell2()),
      new FeatureQualifiedNameProviderStepNameSpecExamples(  Arrays.asList("\"strips dot at end\"", "\"Given a step with implementation.\"", "\"myPackage.a step with implementation\""), _initFeatureQualifiedNameProviderStepNameSpecExamplesCell3(), _initFeatureQualifiedNameProviderStepNameSpecExamplesCell4(), _initFeatureQualifiedNameProviderStepNameSpecExamplesCell5()),
      new FeatureQualifiedNameProviderStepNameSpecExamples(  Arrays.asList("\"strips argument values\"", "\"Given a step with \\\"arg\\\".\"", "\'myPackage.a step with \"\"\'"), _initFeatureQualifiedNameProviderStepNameSpecExamplesCell6(), _initFeatureQualifiedNameProviderStepNameSpecExamplesCell7(), _initFeatureQualifiedNameProviderStepNameSpecExamplesCell8()),
      new FeatureQualifiedNameProviderStepNameSpecExamples(  Arrays.asList("\"removes double spaces\"", "\"Given  two spaces\"", "\"myPackage.two spaces\""), _initFeatureQualifiedNameProviderStepNameSpecExamplesCell9(), _initFeatureQualifiedNameProviderStepNameSpecExamplesCell10(), _initFeatureQualifiedNameProviderStepNameSpecExamplesCell11()),
      new FeatureQualifiedNameProviderStepNameSpecExamples(  Arrays.asList("\"removes double tabs\"", "\"Given a\t\ttwo tabs\"", "\"myPackage.a two tabs\""), _initFeatureQualifiedNameProviderStepNameSpecExamplesCell12(), _initFeatureQualifiedNameProviderStepNameSpecExamplesCell13(), _initFeatureQualifiedNameProviderStepNameSpecExamplesCell14()),
      new FeatureQualifiedNameProviderStepNameSpecExamples(  Arrays.asList("\"removes space after tab\"", "\"Given a\t space after tab\"", "\"myPackage.a space after tab\""), _initFeatureQualifiedNameProviderStepNameSpecExamplesCell15(), _initFeatureQualifiedNameProviderStepNameSpecExamplesCell16(), _initFeatureQualifiedNameProviderStepNameSpecExamplesCell17()),
      new FeatureQualifiedNameProviderStepNameSpecExamples(  Arrays.asList("\"removes space at end\"", "\"Given space at end \"", "\"myPackage.space at end\""), _initFeatureQualifiedNameProviderStepNameSpecExamplesCell18(), _initFeatureQualifiedNameProviderStepNameSpecExamplesCell19(), _initFeatureQualifiedNameProviderStepNameSpecExamplesCell20())
    );
  }
  
  protected ExampleTable<FeatureQualifiedNameProviderStepNameSpecExamples> examples = _initFeatureQualifiedNameProviderStepNameSpecExamples();
  
  public String _initFeatureQualifiedNameProviderStepNameSpecExamplesCell0() {
    return "strips keyword";
  }
  
  public String _initFeatureQualifiedNameProviderStepNameSpecExamplesCell1() {
    return "Given a step with implementation";
  }
  
  public String _initFeatureQualifiedNameProviderStepNameSpecExamplesCell2() {
    return "myPackage.a step with implementation";
  }
  
  public String _initFeatureQualifiedNameProviderStepNameSpecExamplesCell3() {
    return "strips dot at end";
  }
  
  public String _initFeatureQualifiedNameProviderStepNameSpecExamplesCell4() {
    return "Given a step with implementation.";
  }
  
  public String _initFeatureQualifiedNameProviderStepNameSpecExamplesCell5() {
    return "myPackage.a step with implementation";
  }
  
  public String _initFeatureQualifiedNameProviderStepNameSpecExamplesCell6() {
    return "strips argument values";
  }
  
  public String _initFeatureQualifiedNameProviderStepNameSpecExamplesCell7() {
    return "Given a step with \"arg\".";
  }
  
  public String _initFeatureQualifiedNameProviderStepNameSpecExamplesCell8() {
    return "myPackage.a step with \"\"";
  }
  
  public String _initFeatureQualifiedNameProviderStepNameSpecExamplesCell9() {
    return "removes double spaces";
  }
  
  public String _initFeatureQualifiedNameProviderStepNameSpecExamplesCell10() {
    return "Given  two spaces";
  }
  
  public String _initFeatureQualifiedNameProviderStepNameSpecExamplesCell11() {
    return "myPackage.two spaces";
  }
  
  public String _initFeatureQualifiedNameProviderStepNameSpecExamplesCell12() {
    return "removes double tabs";
  }
  
  public String _initFeatureQualifiedNameProviderStepNameSpecExamplesCell13() {
    return "Given a\t\ttwo tabs";
  }
  
  public String _initFeatureQualifiedNameProviderStepNameSpecExamplesCell14() {
    return "myPackage.a two tabs";
  }
  
  public String _initFeatureQualifiedNameProviderStepNameSpecExamplesCell15() {
    return "removes space after tab";
  }
  
  public String _initFeatureQualifiedNameProviderStepNameSpecExamplesCell16() {
    return "Given a\t space after tab";
  }
  
  public String _initFeatureQualifiedNameProviderStepNameSpecExamplesCell17() {
    return "myPackage.a space after tab";
  }
  
  public String _initFeatureQualifiedNameProviderStepNameSpecExamplesCell18() {
    return "removes space at end";
  }
  
  public String _initFeatureQualifiedNameProviderStepNameSpecExamplesCell19() {
    return "Given space at end ";
  }
  
  public String _initFeatureQualifiedNameProviderStepNameSpecExamplesCell20() {
    return "myPackage.space at end";
  }
  
  @Test
  @Named("StepImplementation")
  @Order(1)
  public void _stepImplementation() throws Exception {
    final Procedure1<FeatureQualifiedNameProviderStepNameSpecExamples> _function = new Procedure1<FeatureQualifiedNameProviderStepNameSpecExamples>() {
      public void apply(final FeatureQualifiedNameProviderStepNameSpecExamples it) {
        String _description = it.getDescription();
        String _expected = it.getExpected();
        String _name = it.getName();
        String _implementedStepName = FeatureQualifiedNameProviderStepNameSpec.this.implementedStepName(_name);
        Assert.assertEquals(_description, _expected, _implementedStepName);
        FeatureQualifiedNameProviderStepNameSpec.this._modelStore.clear();
      }
    };
    IterableExtensions.<FeatureQualifiedNameProviderStepNameSpecExamples>forEach(this.examples, _function);
  }
  
  @Test
  @Named("StepReference")
  @Order(2)
  public void _stepReference() throws Exception {
    final Procedure1<FeatureQualifiedNameProviderStepNameSpecExamples> _function = new Procedure1<FeatureQualifiedNameProviderStepNameSpecExamples>() {
      public void apply(final FeatureQualifiedNameProviderStepNameSpecExamples it) {
        String _description = it.getDescription();
        String _expected = it.getExpected();
        String _name = it.getName();
        String _stepName = FeatureQualifiedNameProviderStepNameSpec.this.stepName(_name);
        Assert.assertEquals(_description, _expected, _stepName);
        FeatureQualifiedNameProviderStepNameSpec.this._modelStore.clear();
      }
    };
    IterableExtensions.<FeatureQualifiedNameProviderStepNameSpecExamples>forEach(this.examples, _function);
  }
}
