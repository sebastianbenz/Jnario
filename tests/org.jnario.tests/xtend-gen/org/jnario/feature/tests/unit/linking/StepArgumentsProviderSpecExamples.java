package org.jnario.feature.tests.unit.linking;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class StepArgumentsProviderSpecExamples extends ExampleTableRow {
  public StepArgumentsProviderSpecExamples(final List<String> cellNames, final String step, final List<? extends Object> expectedArgs) {
    super(cellNames);
    this.step = step;
    this.expectedArgs = expectedArgs;
    
  }
  
  private String step;
  
  public String getStep() {
    return this.step;
  }
  
  private List<? extends Object> expectedArgs;
  
  public List<? extends Object> getExpectedArgs() {
    return this.expectedArgs;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(toString(step) ,toString(expectedArgs));
  }
}
