package org.jnario.jnario.tests.unit;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

public class ExampleColumnSpecExamples extends ExampleTableRow {
  ExampleColumnSpecExamples(final List<String> cellNames, final int columnIndex, final int cellIndex, final String value) {
    super(cellNames);
    this.columnIndex = columnIndex;
    this.cellIndex = cellIndex;
    this.value = value;
  }
  
  public int columnIndex;
  
  public int getColumnIndex() {
    return columnIndex;
  }
  
  public int cellIndex;
  
  public int getCellIndex() {
    return cellIndex;
  }
  
  public String value;
  
  public String getValue() {
    return value;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(String.valueOf(columnIndex) , String.valueOf(cellIndex) , String.valueOf(value));
  }
}
