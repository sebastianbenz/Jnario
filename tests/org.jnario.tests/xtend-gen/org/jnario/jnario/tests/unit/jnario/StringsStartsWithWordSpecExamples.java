package org.jnario.jnario.tests.unit.jnario;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class StringsStartsWithWordSpecExamples extends ExampleTableRow {
  public StringsStartsWithWordSpecExamples(final List<String> cellNames, final String string, final String word, final int index) {
    super(cellNames);
    this.string = string;
    this.word = word;
    this.index = index;
    
  }
  
  private String string;
  
  public String getString() {
    return this.string;
  }
  
  private String word;
  
  public String getWord() {
    return this.word;
  }
  
  private int index;
  
  public int getIndex() {
    return this.index;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(toString(string) ,toString(word) ,toString(index));
  }
}
