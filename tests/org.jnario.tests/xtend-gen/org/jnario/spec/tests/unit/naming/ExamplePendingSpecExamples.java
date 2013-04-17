package org.jnario.spec.tests.unit.naming;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class ExamplePendingSpecExamples extends ExampleTableRow {
  public ExamplePendingSpecExamples(final List<String> cellNames, final String example, final boolean expected) {
    super(cellNames);
    this.example = example;
    this.expected = expected;
    
  }
  
  private String example;
  
  public String getExample() {
    return this.example;
  }
  
  private boolean expected;
  
  public boolean getExpected() {
    return this.expected;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(toString(example) ,toString(expected));
  }
}
