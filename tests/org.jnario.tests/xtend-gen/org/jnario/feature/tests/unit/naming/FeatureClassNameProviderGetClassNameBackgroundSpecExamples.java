package org.jnario.feature.tests.unit.naming;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class FeatureClassNameProviderGetClassNameBackgroundSpecExamples extends ExampleTableRow {
  public FeatureClassNameProviderGetClassNameBackgroundSpecExamples(final List<String> cellNames, final String name, final String feature, final String expectedClassName) {
    super(cellNames);
    this.name = name;
    this.feature = feature;
    this.expectedClassName = expectedClassName;
    
  }
  
  private String name;
  
  public String getName() {
    return this.name;
  }
  
  private String feature;
  
  public String getFeature() {
    return this.feature;
  }
  
  private String expectedClassName;
  
  public String getExpectedClassName() {
    return this.expectedClassName;
  }
}
