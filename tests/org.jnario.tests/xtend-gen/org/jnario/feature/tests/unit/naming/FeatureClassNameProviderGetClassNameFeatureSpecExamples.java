package org.jnario.feature.tests.unit.naming;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class FeatureClassNameProviderGetClassNameFeatureSpecExamples extends ExampleTableRow {
  public FeatureClassNameProviderGetClassNameFeatureSpecExamples(final List<String> cellNames, final String name, final String expectedClassName) {
    super(cellNames);
    this.name = name;
    this.expectedClassName = expectedClassName;
    
  }
  
  private String name;
  
  public String getName() {
    return this.name;
  }
  
  private String expectedClassName;
  
  public String getExpectedClassName() {
    return this.expectedClassName;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(toString(name) ,toString(expectedClassName));
  }
}
