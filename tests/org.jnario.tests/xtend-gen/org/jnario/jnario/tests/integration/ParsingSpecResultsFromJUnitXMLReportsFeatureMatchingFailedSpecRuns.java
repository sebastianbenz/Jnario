package org.jnario.jnario.tests.integration;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.hamcrest.StringDescription;
import org.jnario.Executable;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.jnario.tests.integration.ParsingSpecResultsFromJUnitXMLReportsFeature;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.report.Failed;
import org.jnario.report.HashBasedSpec2ResultMapping;
import org.jnario.report.Passed;
import org.jnario.report.SpecExecution;
import org.jnario.report.SpecResultParser;
import org.jnario.runner.CreateWith;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Matching failed Spec runs")
@CreateWith(SpecTestCreator.class)
@SuppressWarnings("all")
public class ParsingSpecResultsFromJUnitXMLReportsFeatureMatchingFailedSpecRuns extends ParsingSpecResultsFromJUnitXMLReportsFeature {
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public ModelStore _modelStore;
  
  @Inject
  HashBasedSpec2ResultMapping spec2ResultMapping;
  
  @Inject
  SpecResultParser resultParser;
  
  Executable specification;
  
  @Test
  @Order(0)
  @Ignore
  @Named("Given a specification")
  public void givenASpecification() {
    
  }
  
  @Test
  @Order(1)
  @Ignore
  @Named("And a test result xml file")
  public void andATestResultXmlFile() {
    
  }
  
  @Test
  @Order(2)
  @Ignore
  @Named("Then the spec execution \\\"failed\\\"")
  public void thenTheSpecExecutionFailed() {
    StepArguments _stepArguments = new StepArguments("failed");
    final StepArguments args = _stepArguments;
    final SpecExecution result = this.spec2ResultMapping.getResult(this.specification);
    String _first = JnarioIterableExtensions.<String>first(args);
    boolean _equals = Objects.equal(_first, "passed");
    if (_equals) {
      boolean _doubleArrow = Should.operator_doubleArrow(result, Passed.class);
      Assert.assertTrue("\nExpected result => typeof(Passed) but"
       + "\n     result is " + new StringDescription().appendValue(result).toString() + "\n", _doubleArrow);
      
    } else {
      boolean _doubleArrow_1 = Should.operator_doubleArrow(result, Failed.class);
      Assert.assertTrue("\nExpected result => typeof(Failed) but"
       + "\n     result is " + new StringDescription().appendValue(result).toString() + "\n", _doubleArrow_1);
      
    }
  }
}
