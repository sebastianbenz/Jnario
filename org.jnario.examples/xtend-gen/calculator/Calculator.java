package calculator;

import org.eclipse.xtext.xbase.lib.IntegerExtensions;

@SuppressWarnings("all")
public class Calculator {
  public int add(final int a, final int b) {
    return IntegerExtensions.operator_plus(a, b);
  }
  
  public int divide(final int a, final int b) {
    return IntegerExtensions.operator_divide(a, b);
  }
  
  public int substract(final int a, final int b) {
    return IntegerExtensions.operator_minus(a, b);
  }
  
  public String toString() {
    return "Calculator";
  }
  
  public Object enter(final String a) {
    return null;
  }
  
  public Object press(final String command) {
    return null;
  }
  
  public String result() {
    return "120";
  }
}
