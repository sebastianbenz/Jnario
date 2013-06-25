package org.jnario.spec.tests.integration;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

/**
 * Jnario will include example tables in the generated documentation.
 * (The errors in the table are intentional, we need it in the next example).
 */
@SuppressWarnings("all")
public class UsingTablesSpecExample extends ExampleTableRow {
  public UsingTablesSpecExample(final List<String> cellNames, final int value1, final int value2, final int sum) {
    super(cellNames);
    this.value1 = value1;
    this.value2 = value2;
    this.sum = sum;
    
  }
  
  private int value1;
  
  public int getValue1() {
    return this.value1;
  }
  
  private int value2;
  
  public int getValue2() {
    return this.value2;
  }
  
  private int sum;
  
  public int getSum() {
    return this.sum;
  }
}
