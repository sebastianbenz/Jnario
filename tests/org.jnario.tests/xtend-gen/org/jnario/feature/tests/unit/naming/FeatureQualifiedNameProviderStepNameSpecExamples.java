package org.jnario.feature.tests.unit.naming;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class FeatureQualifiedNameProviderStepNameSpecExamples extends ExampleTableRow {
  public FeatureQualifiedNameProviderStepNameSpecExamples(final List<String> cellNames, final String description, final String name, final String expected) {
    super(cellNames);
    this.description = description;
    this.name = name;
    this.expected = expected;
    
  }
  
  private String description;
  
  public String getDescription() {
    return this.description;
  }
  
  private String name;
  
  public String getName() {
    return this.name;
  }
  
  private String expected;
  
  public String getExpected() {
    return this.expected;
  }
}
