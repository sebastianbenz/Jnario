package org.jnario.jnario.tests.integration;

import com.google.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.Executable;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.jnario.tests.integration.ParsingSpecResultsFromJUnitXMLReportsFeature;
import org.jnario.report.HashBasedSpec2ResultMapping;
import org.jnario.report.SpecResultParser;
import org.jnario.runner.CreateWith;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Matching successfull Spec Runs")
@CreateWith(SpecTestCreator.class)
@SuppressWarnings("all")
public class ParsingSpecResultsFromJUnitXMLReportsFeatureMatchingSuccessfullSpecRuns extends ParsingSpecResultsFromJUnitXMLReportsFeature {
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
  @Named("Given a specification")
  public void _givenASpecification() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field args is undefined for the type Scenario: Matching successfull Spec Runs\r\n"
      + "\nfirst cannot be resolved"
      + "\nparseSpec cannot be resolved"
      + "\nallContents cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nfirst cannot be resolved");
  }
  
  @Test
  @Order(1)
  @Named("And a test result xml file")
  public void _andATestResultXmlFile() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field args is undefined for the type Scenario: Matching successfull Spec Runs\r\n"
      + "\nfirst cannot be resolved"
      + "\ntrim cannot be resolved");
  }
  
  @Test
  @Order(2)
  @Named("Then the spec execution \\\"passed\\\"")
  public void _thenTheSpecExecutionPassed() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field args is undefined for the type Scenario: Matching successfull Spec Runs\r\n"
      + "\nfirst cannot be resolved"
      + "\n== cannot be resolved");
  }
}
