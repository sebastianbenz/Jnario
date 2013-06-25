package org.jnario.jnario.tests.unit.doc;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class FilterExtractorSpecFilterCreation extends ExampleTableRow {
  public FilterExtractorSpecFilterCreation(final List<String> cellNames, final String input, final List<String> resultingFilters) {
    super(cellNames);
    this.input = input;
    this.resultingFilters = resultingFilters;
    
  }
  
  private String input;
  
  public String getInput() {
    return this.input;
  }
  
  private List<String> resultingFilters;
  
  public List<String> getResultingFilters() {
    return this.resultingFilters;
  }
}
