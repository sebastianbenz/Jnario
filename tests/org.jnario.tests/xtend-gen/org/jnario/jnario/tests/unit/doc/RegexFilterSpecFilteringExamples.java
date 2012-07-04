package org.jnario.jnario.tests.unit.doc;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

public class RegexFilterSpecFilteringExamples extends ExampleTableRow {
  public RegexFilterSpecFilteringExamples(final List<String> cellNames, final String string, final String regex, final String result) {
    super(cellNames);
    this.string = string;
    this.regex = regex;
    this.result = result;
  }
  
  public String string;
  
  public String getString() {
    return string;
  }
  
  public String regex;
  
  public String getRegex() {
    return regex;
  }
  
  public String result;
  
  public String getResult() {
    return result;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(String.valueOf(string) , String.valueOf(regex) , String.valueOf(result));
  }
}
