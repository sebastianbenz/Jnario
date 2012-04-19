package org.jnario.feature.tests.unit.naming;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

public class FeatureClassNameProviderGetClassNameExampleTableSpecExamples extends ExampleTableRow {
  public FeatureClassNameProviderGetClassNameExampleTableSpecExamples(final List<String> cellNames, final String name, final String scenario, final String feature, final String expectedClassName) {
    super(cellNames);
    this.name = name;
    this.scenario = scenario;
    this.feature = feature;
    this.expectedClassName = expectedClassName;
  }
  
  public String name;
  
  public String getName() {
    return name;
  }
  
  public String scenario;
  
  public String getScenario() {
    return scenario;
  }
  
  public String feature;
  
  public String getFeature() {
    return feature;
  }
  
  public String expectedClassName;
  
  public String getExpectedClassName() {
    return expectedClassName;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(String.valueOf(name) , String.valueOf(scenario) , String.valueOf(feature) , String.valueOf(expectedClassName));
  }
}
