package org.jnario.spec.tests.unit.naming;

import java.util.List;
import org.eclipse.xtext.xbase.XExpression;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class ExampleImplementationSpecExamples extends ExampleTableRow {
  public ExampleImplementationSpecExamples(final List<String> cellNames, final String example, final Class<? extends XExpression> type) {
    super(cellNames);
    this.example = example;
    this.type = type;
    
  }
  
  private String example;
  
  public String getExample() {
    return this.example;
  }
  
  private Class<? extends XExpression> type;
  
  public Class<? extends XExpression> getType() {
    return this.type;
  }
}
