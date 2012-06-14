package org.jnario.jnario.tests.unit.doc;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

public class FilterExtractorSpecFilterExtractions extends ExampleTableRow {
  public FilterExtractorSpecFilterExtractions(final List<String> cellNames, final String input, final String resultString) {
    super(cellNames);
    this.input = input;
    this.resultString = resultString;
  }
  
  public String input;
  
  public String getInput() {
    return input;
  }
  
  public String resultString;
  
  public String getResultString() {
    return resultString;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(String.valueOf(input) , String.valueOf(resultString));
  }
}
