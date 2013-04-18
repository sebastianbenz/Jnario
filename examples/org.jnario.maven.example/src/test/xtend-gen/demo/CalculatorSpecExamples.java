package demo;

import java.util.List;

@SuppressWarnings("all")
public class CalculatorSpecExamples {
  public CalculatorSpecExamples(final List<String> cellNames, final int a, final int b, final int sum) {
    throw new Error("Unresolved compilation problems:"
      + "\nCannot infer type");
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
  
  public List<String> getCells() {
    throw new Error("Unresolved compilation problems:"
      + "\nCannot infer type");
  }
}
