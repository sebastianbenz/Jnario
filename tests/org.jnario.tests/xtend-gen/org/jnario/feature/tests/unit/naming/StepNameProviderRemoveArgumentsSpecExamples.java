package org.jnario.feature.tests.unit.naming;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class StepNameProviderRemoveArgumentsSpecExamples extends ExampleTableRow {
  public StepNameProviderRemoveArgumentsSpecExamples(final List<String> cellNames, final String step, final String result) {
    super(cellNames);
    this.step = step;
    this.result = result;
    
  }
  
  private String step;
  
  public String getStep() {
    return this.step;
  }
  
  private String result;
  
  public String getResult() {
    return this.result;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(toString(step) ,toString(result));
  }
}
