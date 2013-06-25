package org.jnario.spec.tests.unit.naming;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class ExampleNameSpecExamples extends ExampleTableRow {
  public ExampleNameSpecExamples(final List<String> cellNames, final String example, final String name) {
    super(cellNames);
    this.example = example;
    this.name = name;
    
  }
  
  private String example;
  
  public String getExample() {
    return this.example;
  }
  
  private String name;
  
  public String getName() {
    return this.name;
  }
}
