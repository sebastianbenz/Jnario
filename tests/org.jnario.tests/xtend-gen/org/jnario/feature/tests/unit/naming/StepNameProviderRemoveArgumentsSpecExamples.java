package org.jnario.feature.tests.unit.naming;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

public class StepNameProviderRemoveArgumentsSpecExamples extends ExampleTableRow {
  public StepNameProviderRemoveArgumentsSpecExamples(final List<String> cellNames, final String step, final String result) {
    super(cellNames);
    this.step = step;
    this.result = result;
  }
  
  public String step;
  
  public String getStep() {
    return step;
  }
  
  public String result;
  
  public String getResult() {
    return result;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(String.valueOf(step) , String.valueOf(result));
  }
}
