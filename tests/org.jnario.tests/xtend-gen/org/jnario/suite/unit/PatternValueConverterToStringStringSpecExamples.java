package org.jnario.suite.unit;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class PatternValueConverterToStringStringSpecExamples extends ExampleTableRow {
  public PatternValueConverterToStringStringSpecExamples(final List<String> cellNames, final String input, final String result) {
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
}
