package org.jnario.jnario.tests.unit.doc;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

public class FilterExtractorSpecFilterCreation extends ExampleTableRow {
  public FilterExtractorSpecFilterCreation(final List<String> cellNames, final String input, final List<String> resultingFilters) {
    super(cellNames);
    this.input = input;
    this.resultingFilters = resultingFilters;
  }
  
  public String input;
  
  public String getInput() {
    return input;
  }
  
  public List<String> resultingFilters;
  
  public List<String> getResultingFilters() {
    return resultingFilters;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(toString(input) ,toString(resultingFilters));
  }
}
