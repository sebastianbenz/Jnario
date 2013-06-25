package org.jnario.jnario.tests.unit.doc;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class WhiteSpaceNormalizerSpecExamples extends ExampleTableRow {
  public WhiteSpaceNormalizerSpecExamples(final List<String> cellNames, final String input, final String result) {
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
