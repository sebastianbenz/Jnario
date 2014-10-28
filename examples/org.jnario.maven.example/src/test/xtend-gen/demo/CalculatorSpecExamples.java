package demo;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class CalculatorSpecExamples extends ExampleTableRow {
  public CalculatorSpecExamples(final List<String> cellNames, final int a, final int b, final int sum) {
    super(cellNames);
    this.a = a;
    this.b = b;
    this.sum = sum;
    
  }
  
  private int a;
  
  public int getA() {
    return this.a;
  }
  
  private int b;
  
  public int getB() {
    return this.b;
  }
  
  private int sum;
  
  public int getSum() {
    return this.sum;
  }
}
