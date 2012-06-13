package org.jnario.suite.unit;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

public class PatternValueConverterToStringStringSpecExamples extends ExampleTableRow {
  public PatternValueConverterToStringStringSpecExamples(final List<String> cellNames, final String input, final String result) {
    super(cellNames);
    this.input = input;
    this.result = result;
  }
  
  public String input;
  
  public String getInput() {
    return input;
  }
  
  public String result;
  
  public String getResult() {
    return result;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(String.valueOf(input) , String.valueOf(result));
  }
}
