package org.jnario.suite.unit;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class SuiteClassNameProviderToJavaClassNameSpecExamples extends ExampleTableRow {
  public SuiteClassNameProviderToJavaClassNameSpecExamples(final List<String> cellNames, final String name, final String expectedClassName) {
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
}
