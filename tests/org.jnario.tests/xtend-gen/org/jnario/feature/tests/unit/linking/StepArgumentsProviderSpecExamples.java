package org.jnario.feature.tests.unit.linking;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

public class StepArgumentsProviderSpecExamples extends ExampleTableRow {
  public StepArgumentsProviderSpecExamples(final List<String> cellNames, final String step, final List<? extends Object> expectedArgs) {
    super(cellNames);
    this.step = step;
    this.expectedArgs = expectedArgs;
  }
  
  public String step;
  
  public String getStep() {
    return step;
  }
  
  public List<? extends Object> expectedArgs;
  
  public List<? extends Object> getExpectedArgs() {
    return expectedArgs;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(String.valueOf(step) , String.valueOf(expectedArgs));
  }
}
