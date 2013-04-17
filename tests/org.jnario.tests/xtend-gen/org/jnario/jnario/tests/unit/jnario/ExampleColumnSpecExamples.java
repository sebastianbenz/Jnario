package org.jnario.jnario.tests.unit.jnario;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class ExampleColumnSpecExamples extends ExampleTableRow {
  public ExampleColumnSpecExamples(final List<String> cellNames, final int columnIndex, final int cellIndex, final String value) {
    super(cellNames);
    this.columnIndex = columnIndex;
    this.cellIndex = cellIndex;
    this.value = value;
    
  }
  
  private int columnIndex;
  
  public int getColumnIndex() {
    return this.columnIndex;
  }
  
  private int cellIndex;
  
  public int getCellIndex() {
    return this.cellIndex;
  }
  
  private String value;
  
  public String getValue() {
    return this.value;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(toString(columnIndex) ,toString(cellIndex) ,toString(value));
  }
}
