package org.jnario.jnario.tests.unit.doc;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class FilterExtractorSpecFilterExtractions extends ExampleTableRow {
  public FilterExtractorSpecFilterExtractions(final List<String> cellNames, final String input, final String resultString) {
    super(cellNames);
    this.input = input;
    this.resultString = resultString;
    
  }
  
  private String input;
  
  public String getInput() {
    return this.input;
  }
  
  private String resultString;
  
  public String getResultString() {
    return this.resultString;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(toString(input) ,toString(resultString));
  }
}
