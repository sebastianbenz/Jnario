package org.jnario.jnario.tests.unit.jnario;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

public class StringsTrailingWhitespaceSpecExamples extends ExampleTableRow {
  public StringsTrailingWhitespaceSpecExamples(final List<String> cellNames, final String string, final String result) {
    super(cellNames);
    this.string = string;
    this.result = result;
  }
  
  public String string;
  
  public String getString() {
    return string;
  }
  
  public String result;
  
  public String getResult() {
    return result;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(toString(string) ,toString(result));
  }
}
