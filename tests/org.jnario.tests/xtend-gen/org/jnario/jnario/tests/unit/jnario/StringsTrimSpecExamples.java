package org.jnario.jnario.tests.unit.jnario;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class StringsTrimSpecExamples extends ExampleTableRow {
  public StringsTrimSpecExamples(final List<String> cellNames, final String string, final String result) {
    super(cellNames);
    this.string = string;
    this.result = result;
    
  }
  
  private String string;
  
  public String getString() {
    return this.string;
  }
  
  private String result;
  
  public String getResult() {
    return this.result;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(toString(string) ,toString(result));
  }
}
