package org.jnario.jnario.tests.integration;

import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.jnario.tests.integration.ParsingSpecResultsFromJUnitXMLReportsFeature;
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
  @Test
  @Order(0)
  @Ignore
  @Named("Given a specification")
  public void _givenASpecification() {
    
  }
  
  @Test
  @Order(1)
  @Ignore
  @Named("And a test result xml file")
  public void _andATestResultXmlFile() {
    
  }
  
  @Test
  @Order(2)
  @Ignore
  @Named("Then the spec execution \\\"failed\\\" [PENDING]")
  public void _thenTheSpecExecutionFailed() {
    
  }
}
