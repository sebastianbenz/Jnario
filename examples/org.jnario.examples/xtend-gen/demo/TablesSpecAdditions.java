package demo;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

public class TablesSpecAdditions extends ExampleTableRow {
  public TablesSpecAdditions(final List<String> cellNames, final int a, final int b, final int sum) {
    super(cellNames);
    this.a = a;
    this.b = b;
    this.sum = sum;
  }
  
  public int a;
  
  public int getA() {
    return a;
  }
  
  public int b;
  
  public int getB() {
    return b;
  }
  
  public int sum;
  
  public int getSum() {
    return sum;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(String.valueOf(a) , String.valueOf(b) , String.valueOf(sum));
  }
}
