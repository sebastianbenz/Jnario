package org.jnario.jnario.tests.unit.doc;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class RegexFilterSpecFilteringExamples extends ExampleTableRow {
  public RegexFilterSpecFilteringExamples(final List<String> cellNames, final String string, final String regex, final String result) {
    super(cellNames);
    this.string = string;
    this.regex = regex;
    this.result = result;
    
  }
  
  private String string;
  
  public String getString() {
    return this.string;
  }
  
  private String regex;
  
  public String getRegex() {
    return this.regex;
  }
  
  private String result;
  
  public String getResult() {
    return this.result;
  }
}
