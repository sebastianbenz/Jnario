package org.jnario.suite.unit;

import java.util.List;
import org.jnario.lib.ExampleTableRow;
import org.jnario.suite.suite.Suite;

public class SuiteNodeBuilderParentSpecExamples extends ExampleTableRow {
  public SuiteNodeBuilderParentSpecExamples(final List<String> cellNames, final List<Suite> suites, final int position, final String parent) {
    super(cellNames);
    this.suites = suites;
    this.position = position;
    this.parent = parent;
  }
  
  public List<Suite> suites;
  
  public List<Suite> getSuites() {
    return suites;
  }
  
  public int position;
  
  public int getPosition() {
    return position;
  }
  
  public String parent;
  
  public String getParent() {
    return parent;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(toString(suites) ,toString(position) ,toString(parent));
  }
}
