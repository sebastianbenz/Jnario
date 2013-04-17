package org.jnario.suite.unit;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class PatternValueConverterToValueStringINodeSpecExamples extends ExampleTableRow {
  public PatternValueConverterToValueStringINodeSpecExamples(final List<String> cellNames, final String input, final String result) {
    super(cellNames);
    this.input = input;
    this.result = result;
    
  }
  
  private String input;
  
  public String getInput() {
    return this.input;
  }
  
  private String result;
  
  public String getResult() {
    return this.result;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(toString(input) ,toString(result));
  }
}
